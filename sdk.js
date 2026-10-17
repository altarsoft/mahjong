window.GetLang = function() { 

	YaGames.init().then(ysdk => {
    
		window.ysdk = ysdk;		
		window.lang = ysdk.environment.i18n.lang;
		window.tld = ysdk.environment.i18n.tld;
		
		console.log("Yandex SDK initialized");
        console.log(window.lang);
		//console.log(window.tld);
				
	});

};

window.GameReady = function() { 

    YaGames.init().then((ysdk) => { ysdk.features.LoadingAPI?.ready() }).catch(console.error);

};

window.GameStart = function() { 

    YaGames.init().then((ysdk) => { ysdk.features.GameplayAPI?.start() });

};

window.GameStop = function() { 

    YaGames.init().then((ysdk) => { ysdk.features.GameplayAPI?.stop() });

};

window.ShowAds = function() { 

    YaGames.init().then(ysdk => ysdk.adv.showFullscreenAdv() );

};

window.ShowAdsRew = function () {
	
	ysdk.adv.showRewardedVideo({
    
	callbacks: {
        
		onOpen: () => { console.log('Video ad open.'); },
        
		onRewarded: () => { console.log('Rewarded!');
		
			//var coins = @com.ulkaden.bubbleburst::coins;
			//@com.ulkaden.bubbleburst::coins = coins += 1;
		  
        },
        
		onClose: () => { console.log('Video ad closed.'); },         
		onError: (e) => { console.log('Error while open video ad:', e); }
		
    }
	
	})

	
};

window.ShowAdsCG = function() {
    
	const callbacks = {
    adFinished: () => console.log("End midgame ad (callback)"),
    adError: (error, errorData) => console.log("Error midgame ad (callback)", error, errorData),
    adStarted: () => console.log("Start midgame ad (callback)"),
	};

	crazysdk.requestAd("midgame", callbacks);
	
};

window.ShowAdsGD = function() {

    if (typeof gdsdk !== 'undefined' && gdsdk.showAd !== 'undefined') { gdsdk.showAd(); }

};

window.ShowAdsGM = function() {

    if (typeof sdk !== 'undefined' && sdk.showBanner !== 'undefined') { sdk.showBanner(); }

};

window.ShowAdsGP = function() {

    GamePix.interstitialAd();

};

window.PokiInit = function() {

    PokiSDK.init().then(() => {
    console.log("Poki SDK successfully initialized");
   
		PokiSDK.commercialBreak(() => {
		// you can pause any background music or other audio here
		}).then(() => {
		console.log("Commercial break finished, proceeding to game");
		// if the audio was paused you can resume it here (keep in mind that the function above to pause it might not always get called)
		// continue your game here
		});
   
	}).catch(() => {
		console.log("Initialized, something went wrong, load you game anyway");
		// fire your function to continue to game
	});

	// fire loading function here
	PokiSDK.gameLoadingFinished();

};

window.PokiPlayStart = function() { PokiSDK.gameplayStart(); };
window.PokiPlayStop = function() { PokiSDK.gameplayStop(); };

window.PokiShowAds = function() {

	PokiSDK.commercialBreak(() => {
	  // you can pause any background music or other audio here
	}).then(() => {
	  console.log("Commercial break finished, proceeding to game");
	  // if the audio was paused you can resume it here (keep in mind that the function above to pause it might not always get called)
	  // continue your game here
	});

};

window.PokiShowRewarded = function() {

    // pause your game here if it isn't already
	PokiSDK.rewardedBreak(() => {
	  // you can pause any background music or other audio here
	}).then((success) => {
		if(success) {
			// video was displayed, give reward
		} else {
			// video not displayed, should not give reward
		}
		// if the audio was paused you can resume it here (keep in mind that the function above to pause it might not always get called)
		console.log("Rewarded break finished, proceeding to game");
		// continue your game here
	});

};

window.PokiInit = function() {

    PokiSDK.init().then(() => {
    console.log("Poki SDK successfully initialized");
   
		PokiSDK.commercialBreak(() => {
		// you can pause any background music or other audio here
		}).then(() => {
		console.log("Commercial break finished, proceeding to game");
		// if the audio was paused you can resume it here (keep in mind that the function above to pause it might not always get called)
		// continue your game here
		});
   
	}).catch(() => {
		console.log("Initialized, something went wrong, load you game anyway");
		// fire your function to continue to game
	});

	// fire loading function here
	PokiSDK.gameLoadingFinished();

};

window.PokiPlayStart = function() { PokiSDK.gameplayStart(); };
window.PokiPlayStop = function() { PokiSDK.gameplayStop(); };

window.PokiShowAds = function() {

	PokiSDK.commercialBreak(() => {
	  // you can pause any background music or other audio here
	}).then(() => {
	  console.log("Commercial break finished, proceeding to game");
	  // if the audio was paused you can resume it here (keep in mind that the function above to pause it might not always get called)
	  // continue your game here
	});

};

window.PokiShowRewarded = function() {

    // pause your game here if it isn't already
	PokiSDK.rewardedBreak(() => {
	  // you can pause any background music or other audio here
	}).then((success) => {
		if(success) {
			// video was displayed, give reward
		} else {
			// video not displayed, should not give reward
		}
		// if the audio was paused you can resume it here (keep in mind that the function above to pause it might not always get called)
		console.log("Rewarded break finished, proceeding to game");
		// continue your game here
	});

};