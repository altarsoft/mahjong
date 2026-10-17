package com.ulkaden.mahjonggame;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AndroidLauncher extends AndroidApplication implements OnClickListener, Functions
{

	// Рекламные блоки РСЯ (partner.yandex.ru -> Мобильная медиа-реклама).
	// Для отладки заменить на demo-interstitial-yandex / demo-banner-yandex / demo-rewarded-yandex.
	private static final String INTERSTITIAL_ID = "R-M-20236119-2";
	private static final String BANNER_ID = "R-M-20236119-1";
	private static final String REWARDED_ID = "R-M-20236119-3";

	int W;
	int H;

	RelativeLayout layout;

	BannerAdView banner;

	private InterstitialAdLoader interLoader;
	private InterstitialAd inter;

	private final int HIDE_ADS = 0;
	private final int SHOW_ADS = 1;
	private final int SHOW_INTER = 2;
	private final int LOAD_INTER = 3;

	protected Handler handler = new Handler()
	{
		public void handleMessage(Message msg) {

			switch(msg.what) {

				case HIDE_ADS:
				{
					if (banner != null) { banner.setVisibility(View.GONE); }
					break;

				}

				case SHOW_ADS:
				{
					if (banner != null) { banner.setVisibility(View.VISIBLE); }
					break;

				}

			case SHOW_INTER:
				{
					showInterstitial();
					break;

				}

			case LOAD_INTER:
				{
					LoadAdInter();
					break;

				}

			}

		}

	};

	public void openURL(String url) {

		Uri marketUri = Uri.parse(url);
		Intent intent = new Intent(Intent.ACTION_VIEW, marketUri);
		startActivity(intent);

	}

	public void onCreate (Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

		layout = new RelativeLayout(this);

		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
		layout.setLayoutParams(params);

		View gameView = initializeForView(new Mahjong(this));

		RelativeLayout.LayoutParams gameViewParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
		gameView.setLayoutParams(gameViewParams);

		layout.addView(gameView);

		setContentView(layout);

		MobileAds.initialize(this, new InitializationListener() {
			@Override
			public void onInitializationCompleted() {
				AddBanner();
				LoadAdInter();
			}
		});

	}

	public void AddBanner()
	{

		Resources res = getResources();
		DisplayMetrics dm = res.getDisplayMetrics();
		int adWidthDp = Math.round(dm.widthPixels / dm.density);

		banner = new BannerAdView(this);
		banner.setAdSize(BannerAdSize.stickySize(this, adWidthDp));
		banner.setAdUnitId(BANNER_ID);

		RelativeLayout.LayoutParams adParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		adParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
		adParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);

		layout.addView(banner, adParams);

		banner.loadAd(new AdRequest.Builder().build());

	}

	public void LoadAdInter()
	{

		if (interLoader == null) {

			interLoader = new InterstitialAdLoader(this);
			interLoader.setAdLoadListener(new InterstitialAdLoadListener() {
				@Override
				public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
					inter = interstitialAd;
					Gdx.app.log("MahjongAds", "Interstitial loaded");
				}

				@Override
				public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
					inter = null;
					Gdx.app.log("MahjongAds", "Interstitial failed to load: " + adRequestError.getDescription());
				}
			});

		}

		interLoader.loadAd(new AdRequestConfiguration.Builder(INTERSTITIAL_ID).build());

	}

	public void showInterstitial()
	{

		if (inter != null) {

			inter.setAdEventListener(new InterstitialAdEventListener() {
				@Override
				public void onAdShown() { }

				@Override
				public void onAdFailedToShow(@NonNull AdError adError) { ReleaseInter(); }

				@Override
				public void onAdDismissed() { ReleaseInter(); }

				@Override
				public void onAdClicked() { }

				@Override
				public void onAdImpression(@Nullable ImpressionData impressionData) { }
			});

			inter.show(this);

		}

	}

	public void ReleaseInter()
	{

		if (inter != null) {
			inter.setAdEventListener(null);
			inter = null;
		}

		LoadAdInter();

	}

	public void ShowAds(boolean show) { handler.sendEmptyMessage(show ? SHOW_ADS : HIDE_ADS); }
	public void ShowAdsInter() { handler.sendEmptyMessage(SHOW_INTER); }
	public void LoadAdsInter() { handler.sendEmptyMessage(LOAD_INTER); }

	public void onConfigurationChanged(android.content.res.Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}

	public void log(int input) { Gdx.app.log("LOG", Integer.toString(input)); }
	public void log(float input) { Gdx.app.log("LOG", Float.toString(input)); }
	public void log(String input) {	Gdx.app.log("LOG", input); }


}
