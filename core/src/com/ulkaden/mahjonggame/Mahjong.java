package com.ulkaden.mahjonggame;
  
import com.badlogic.gdx.*;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.audio.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.*;
import com.badlogic.gdx.utils.viewport.StretchViewport;

import com.ulkaden.mahjonggame.Functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Mahjong implements ApplicationListener, GestureListener, InputProcessor
{   
	    
	Stage stage;
	Stage stage2;
	Stage stageBG;
	
	Actor actor;
	
	Actor actBGStats;
	
	Image btn;
	Image btnClose;
	Image btnMusic;
	Image btnPause;
	Image btnShoot;
	Image btnSound;
	Image btnZoomIn;
	Image btnZoomOut;
	
	Group grp;
	Group grpBG;
	Group grpField;
	Group grpGame;
	Group grpSplash;
	
	Image img;
	
	Label lbl;
	Label lblClose;
	Label lblFPS;
	Label lblLevel;
	Label lblTiles;
	Label lblScore;
	Label lblTime;
	
	LabelStyle style;
	LabelStyle styleBig;
	LabelStyle styleSmall;
	
	Level1 gameLevel1 = new Level1();
	Level2 gameLevel2 = new Level2();
	Level3 gameLevel3 = new Level3();
	Level4 gameLevel4 = new Level4();
	Level5 gameLevel5 = new Level5();
	Level6 gameLevel6 = new Level6();
	Level7 gameLevel7 = new Level7();
	Level8 gameLevel8 = new Level8();
	Level9 gameLevel9 = new Level9();
	Level10 gameLevel10 = new Level10();
	Level11 gameLevel11 = new Level11();
	Level12 gameLevel12 = new Level12();
	Level13 gameLevel13 = new Level13();
	Level14 gameLevel14 = new Level14();
	Level15 gameLevel15 = new Level15();
	Level16 gameLevel16 = new Level16();
	Level17 gameLevel17 = new Level17();
	Level18 gameLevel18 = new Level18();
	Level19 gameLevel19 = new Level19();
	Level20 gameLevel20 = new Level20();
	Level21 gameLevel21 = new Level21();
	Level22 gameLevel22 = new Level22();
	Level23 gameLevel23 = new Level23();
	Level24 gameLevel24 = new Level24();
	Level25 gameLevel25 = new Level25();
	Level26 gameLevel26 = new Level26();
	Level27 gameLevel27 = new Level27();
	Level28 gameLevel28 = new Level28();
	Level29 gameLevel29 = new Level29();
	Level30 gameLevel30 = new Level30();
	Level31 gameLevel31 = new Level31();
	Level32 gameLevel32 = new Level32();
	Level33 gameLevel33 = new Level33();
	Level34 gameLevel34 = new Level34();
	Level35 gameLevel35 = new Level35();
	Level36 gameLevel36 = new Level36();
	Level37 gameLevel37 = new Level37();
	Level38 gameLevel38 = new Level38();
	Level39 gameLevel39 = new Level39();
	Level40 gameLevel40 = new Level40();
	Level41 gameLevel41 = new Level41();
	Level42 gameLevel42 = new Level42();
	Level43 gameLevel43 = new Level43();
	Level44 gameLevel44 = new Level44();
	Level45 gameLevel45 = new Level45();
	Level46 gameLevel46 = new Level46();
	Level47 gameLevel47 = new Level47();
	Level48 gameLevel48 = new Level48();
	Level49 gameLevel49 = new Level49();
	Level50 gameLevel50 = new Level50();
	Level51 gameLevel51 = new Level51();
	Level52 gameLevel52 = new Level52();
	Level53 gameLevel53 = new Level53();
	Level54 gameLevel54 = new Level54();
	Level55 gameLevel55 = new Level55();
	Level56 gameLevel56 = new Level56();
	Level57 gameLevel57 = new Level57();
	Level58 gameLevel58 = new Level58();
	Level59 gameLevel59 = new Level59();
	Level60 gameLevel60 = new Level60();
	Level61 gameLevel61 = new Level61();
	Level62 gameLevel62 = new Level62();
	Level63 gameLevel63 = new Level63();
	Level64 gameLevel64 = new Level64();
	Level65 gameLevel65 = new Level65();
	Level66 gameLevel66 = new Level66();
	Level67 gameLevel67 = new Level67();
	Level68 gameLevel68 = new Level68();
	Level69 gameLevel69 = new Level69();
	Level70 gameLevel70 = new Level70();
	Level71 gameLevel71 = new Level71();
	Level72 gameLevel72 = new Level72();
	Level73 gameLevel73 = new Level73();
	Level74 gameLevel74 = new Level74();
	Level75 gameLevel75 = new Level75();
	Level76 gameLevel76 = new Level76();
	Level77 gameLevel77 = new Level77();
	Level78 gameLevel78 = new Level78();
	Level79 gameLevel79 = new Level79();
	Level80 gameLevel80 = new Level80();
	Level81 gameLevel81 = new Level81();
	Level82 gameLevel82 = new Level82();
	Level83 gameLevel83 = new Level83();
	Level84 gameLevel84 = new Level84();
	Level85 gameLevel85 = new Level85();
	Level86 gameLevel86 = new Level86();
	Level87 gameLevel87 = new Level87();
	Level88 gameLevel88 = new Level88();
	Level89 gameLevel89 = new Level89();
	Level90 gameLevel90 = new Level90();
	Level91 gameLevel91 = new Level91();
	Level92 gameLevel92 = new Level92();
	Level93 gameLevel93 = new Level93();
	Level94 gameLevel94 = new Level94();
	Level95 gameLevel95 = new Level95();
	Level96 gameLevel96 = new Level96();
	Level97 gameLevel97 = new Level97();
	Level98 gameLevel98 = new Level98();
	Level99 gameLevel99 = new Level99();
	Level100 gameLevel100 = new Level100();
	
	Array <Integer> mas = new Array <Integer> ();
	Array <GameObject> masScores = new Array <GameObject> ();
	Array <GameObject> masShadows = new Array <GameObject> ();
	Array <GameObject> masTiles = new Array <GameObject> ();
	Array <String> masHelp = new Array<String>();
	Array <String> masMenu = new Array <String>();

	
	int [][] masLevel;
	int [] masField;
	
	Preferences prefs;
	
	float curFrame;
	float curFrameTime;
	float curFrameHint;
	 
	GL20 gl;
	
	GameObject obj;
	GameObject obj2;

	GameObject objField = new GameObject();
	GameObject objMouse = new GameObject();
	GameObject objShadow = new GameObject();
	GameObject objShadow2 = new GameObject();
	GameObject objTile = new GameObject();
	GameObject objTile2 = new GameObject();
	GameObject objTileTemp = new GameObject();
	
	OrthographicCamera cam;
	
	Input input;
	InputProcessor inputProc;
	
	TextInputListener textListener;
		
	SpriteBatch batch;

	TextureRegion rect;
	TextureRegion rect2;
	
	Texture tex;
	Texture imgBGGame;
	Texture imgBGMenu;
	Texture imgBGOptions;
	Texture imgLevel;
	Texture imgBorderSide;
	Texture imgBorderTop;
	Texture imgButtonBG;
	Texture imgButtonMenu;
	Texture imgButtonMusic;
	Texture imgButtonPause;
	Texture imgButtonSound;
	Texture imgButtonZoomIn;
	Texture imgButtonZoomOut;
	Texture imgLevelPic;
	Texture imgSet;
	Texture imgShadow;
	Texture imgSplash;
	Texture imgTiles;
	Texture imgTilesSel;
	Texture imgTitle;
	Texture imgFlags;

	Music music; 
	
	Sound SoundClick;
	Sound SoundMenuSelect;
	Sound SoundMenuEnter;
	Sound SoundRemove;
	Sound SoundSplash;
	
	BitmapFont font;
	BitmapFont fontSmall;
	BitmapFont fontBig;
	
	Vector2[] points;
	Vector2 gravity = new Vector2(0.0f, -10);
	Vector2 point = new Vector2();
	Vector2 posPre = new Vector2();
	
	FPSLogger fps = new FPSLogger();
	
	ParticleEffect parEffect;
	ParticleEmitter parEmitter;

	static int coins;
		
	int maxImages = 42; 
	int maxLevel = 100;
	int maxSet = 7;
	int maxTiles = 144;
	int fw = 36;                 
	int fh = 16;   
	
	int W;
	int H;
	int WC = 800;
	int HC = 480;
	
	int c,k,n;
	int id;
	int buttonWidth;
	int buttonHeight;
	int BLevelWidth;
	int BLevelHeight;
	int bw;
	int bh;
	int countGoals;
	int countPower;
	int menuItems;
	int menuWidth;
	int menuHeight;
	int menuSpace;
	int level;
	int levelX; 
	int levelY;
	int levelStartX;
	int levelStartY;
	int levelNum;
	int levelNumPre;
	int levelSpaceX;
	int levelSpaceY;
	int levelGroup;
	int menuX; 
	int menuY;
	int menuStartX;
	int menuStartY;
	int menuNum;
	int menuNumPre;
	int mouseX;
	int mouseY;
	int numGoals;
	int rnd;
	int score;
	int scoreLevel;
	int xPos;
	int yPos;
	int colsLevels = 5;
	int rowsLevels = 5;
	int xGun;
	int xGunPre;
	int dist;
	int distX;
	int distY;
	int levelSaved;
	int scoreHigh;
	int camShiftX;
	int camShiftY;
	int num;
	int wallNum = 2;
	int moves;
	int layer;
	int shift;
	int cell;
	int cellPre;
	int stones;
	int set = 0;
	int count;   
	int countSec;
	int countMin;
	int countHour;
	int cellW;
	int cellH;
	int idTile;
	int idHint;
	int idHint2;
	int bgNum;
	
	float dt;
	float ss;
	float cellSize;
	float sx;
	float sy;
	float angle;
	float zoom = 1.0f;
	float frameEnd;
	float frameExit;
	float frameLoad;
	float frameLoadSec;
	float xStart;
	float yStart;
	
	boolean android = false;
	boolean html = false;
	boolean poki = false;
	boolean showAds;
	boolean found;
	boolean pause; 
	boolean splash;
	boolean soundPlay = true;
	boolean buttonOver;
	boolean mouseDown;
	boolean drawDebug;
	boolean musicPlay = true;
	boolean rotate;
	boolean scoreSaved;
	boolean start;
	boolean touched;
	boolean hintActive;
	boolean click;
	boolean selectFirst;
	boolean shuffle;
	boolean inputScore;
	boolean timerEnd;
	boolean timerExit;
	boolean timerLoad;
	boolean test;

	//String platform = "android";
	String platform = "pc";

	String gameFolder = "mahjonggame";
	String message;
	String playerName = "PLAYER";
	String str;
	String status;
	String GameTime;
	String GameTimeSec;
	String GameTimeMin;
	String GameTimeHour;
	String ButtonId;
	String gameResult;

	String Lang = "";
	String LangDef = "ru";
	static String lang = "";

	String StringClose;
    String StringCredits;
	String StringCustomize;
    String StringEnterName;
    String StringExit;
    String StringHelp;
    String StringHint;
    String StringLevel;
    String StringLevels;
    String StringMenu;
    String StringNext;
    String StringOptions;
    String StringPlay;
    String StringPlayer;
    String StringScore;
    String StringScores;
    String StringShuffle;
    String StringTiles;
    String StringTime;
    String StringTotal;

	private Functions function;

    public Mahjong(Functions handler) {
        function = handler;
    }

	public void create() {

		// Единая веб-сборка для всех порталов: какой SDK использовать, решает portal.js ($wnd.portal)
		if (Gdx.app.getType() == Application.ApplicationType.WebGL) {
			html = true;
			test = false;
			platform = "html";
			poki = getPortal().equals("poki");
		}

		if (Gdx.app.getType() == Application.ApplicationType.Android) {
			android = true;
		}

		if (poki) { PokiInit(); }

		if (platform.equals("html")) { status = "load"; } else { status = "menu"; }
		
		if (android) { platform = "android"; }
		if (platform.equals("html")) { musicPlay = false; }

		W = Gdx.graphics.getWidth();
		H = Gdx.graphics.getHeight();
			
		ss = (float)H / (float)HC;
		
		bw = (int) (40 * ss);
		bh = (int) (40 * ss);
		buttonWidth = (int) (100 * ss);
		buttonHeight = (int) (32 * ss);
			
		level = 1;
		
		cellSize = (float)H / (float)(fh) * 1.2f;
		
		cellW = (int) cellSize;
		cellH = (int) (cellSize * 1.25);
		
		sx = cellW * 1.5f;
		sy = cellH - 24 * ss; 
		
		shift = (int) (5 * ss);
	    
		gl = Gdx.graphics.getGL20();   
			 
	    stage = new Stage(new StretchViewport(W,H));
	    stageBG = new Stage(new StretchViewport(W,H));
	    stage2 = new Stage(new StretchViewport(W,H));
	    
	    cam = new OrthographicCamera(W,H);
        cam.position.set(W/2,H/2,0);
        cam.zoom = 1;
       
	    stage2.getViewport().setCamera(cam);
        
	    grpBG = new Group();
	    grpBG.setX(camShiftX);
	    grpBG.setY(camShiftY);
	    
	    grpField = new Group();
	    grpField.setX(camShiftX);
	    grpField.setY(camShiftY);
	    
	    grpGame = new Group();
	    grpGame.setX(camShiftX);
	    grpGame.setY(camShiftY);
	    	    
	    InputMultiplexer multi = new InputMultiplexer();
        GestureDetector gesture = new GestureDetector(this);
   
        multi.addProcessor(gesture);
        multi.addProcessor(this);
     
        input = Gdx.app.getInput();
        input.setInputProcessor(multi);
        input.setCatchKey(Keys.BACK,true);
	    
	    prefs = Gdx.app.getPreferences(gameFolder);
	    prefs.flush();
       
	    font = new BitmapFont(Gdx.files.internal("font.fnt"), false);
	    fontSmall = new BitmapFont(Gdx.files.internal("font.fnt"), false);
	    fontBig = new BitmapFont(Gdx.files.internal("font.fnt"), false);
	    
	    font.getData().setScale(ss * 0.3f);
	    fontBig.getData().setScale(ss * 0.4f);
	    fontSmall.getData().setScale(ss * 0.25f);
	    
	    style = new Label.LabelStyle(font, font.getColor());
	    styleBig = new Label.LabelStyle(fontBig, fontBig.getColor());
	    styleSmall = new Label.LabelStyle(fontSmall, fontSmall.getColor());
		
		obj = new GameObject();
		 
		imgBGGame = LoadTex("bgGame.jpg");
	    imgBGMenu = LoadTex("bgMenu.jpg");
		imgBGOptions = LoadTex("bgOptions.jpg");
		imgFlags = LoadTex("flags.jpg");
		imgLevel = LoadTex("BLevel.png");
		imgLevelPic = LoadTex("levels.png");
		imgBorderSide = LoadTex("borderSide.png");
		imgBorderTop = LoadTex("borderTop.png");
		imgButtonBG = LoadTex("buttonBG.png");
		imgButtonMenu = LoadTex("ButtonMenu.png");
		imgButtonMusic = LoadTex("ButtonMusic.png");
		imgButtonPause = LoadTex("ButtonPause.png");
		imgButtonSound = LoadTex("ButtonSound.png");
		imgButtonZoomIn = LoadTex("ButtonZoomIn.png");
		imgButtonZoomOut = LoadTex("ButtonZoomOut.png");
		imgSet = LoadTex("set.png");
		imgShadow = LoadTex("shadow.png");
		imgSplash = LoadTex("splash.png");
		imgTiles = LoadTex("tiles.png");
		imgTilesSel = LoadTex("tiles_sel.png");
		imgTitle = LoadTex("title.png");

		batch = new SpriteBatch();

		LoadInfo();

		Init();
		InitAudio();
		InitScreen();
				 
	}

	public Texture LoadTex(String str)
	{
		
		tex = new Texture(Gdx.files.internal("img/" + str));
		tex.setFilter(TextureFilter.Linear, TextureFilter.Linear); 
		
		return tex;
		
	}
	
	public void dispose () 
	{

		font.dispose();
		fontSmall.dispose();
		fontBig.dispose();
		
		imgBGMenu.dispose();
		imgBGOptions.dispose();
		imgLevel.dispose();
		imgLevelPic.dispose();
		imgBorderSide.dispose();
		imgBorderTop.dispose();
		imgButtonBG.dispose();
		imgButtonMenu.dispose();
		imgButtonMusic.dispose();
		imgButtonPause.dispose();
		imgButtonSound.dispose();
		imgButtonZoomIn.dispose();
		imgButtonZoomOut.dispose();
		imgSet.dispose();
		imgShadow.dispose();
		imgSplash.dispose();
		imgTiles.dispose();
		imgTilesSel.dispose();
		imgTitle.dispose();
		imgFlags.dispose();

		music.dispose();
	    
		SoundClick.dispose();
		SoundMenuEnter.dispose();
		SoundMenuSelect.dispose();
		SoundRemove.dispose();
		SoundSplash.dispose();

	} 
	
	public void Init()
	{ 

		//Lang = "en";
		 
		if (Lang.equals("en")) {

			StringClose = "CLOSE";
			StringCredits = "CREDITS";
			StringCustomize = "CUSTOMIZE";
			StringEnterName = "enter your name";
			StringExit = "EXIT";
			StringHelp = "HELP";
			StringLevel = "Level";
			StringLevels = "LEVELS";
			StringMenu = "MENU";
			StringNext = "NEXT";
			StringOptions = "OPTIONS";
			StringPlay = "PLAY";
			StringPlayer = "Player";
			StringScore = "Score";
		    StringScores = "SCORES";
		    StringTime = "Time";
		    StringTotal = "Total";
		    
		    StringHint = "HINT";
		    StringShuffle = "SHUFFLE";
		    StringTiles = "Tiles";

			masHelp.clear();
			masHelp.add("You have to match tiles in pairs until all of tiles are gone.");
			masHelp.add("Once two tiles have been matched, they will disappear.");
			masHelp.add("When you click on a tile - it becomes highlighted.");
			masHelp.add("You can select a tile, when it has at least one side edge free.");
			masHelp.add("(no other tiles touching it, and cannot have any tiles on top of it)");

		}
		
		if (Lang.equals("ru")) {

			StringClose = "ЗАКРЫТЬ";
			StringCredits = "АВТОРЫ";
			StringCustomize = "НАСТРОИТЬ";
			StringEnterName = "введите ваше имя";
			StringExit = "ВЫХОД";
			StringHelp = "ПОМОЩЬ";
			StringLevel = "Уровень";
			StringLevels = "УРОВНИ";
			StringMenu = "МЕНЮ";
			StringNext = "ДАЛЬШЕ";
			StringOptions = "ОПЦИИ";
			StringPlay = "СТАРТ";
			StringPlayer = "Игрок";
			StringScore = "Очки";
		    StringScores = "ОЧКИ";
			StringTime = "Время";
			StringTotal = "Всего";
			
			StringHint = "ПОМОЩЬ";
		    StringShuffle = "ПОМЕНЯТЬ";
		    StringTiles = "Плитки";

			masHelp.clear();
			masHelp.add("Цель игры - убрать с поля все плитки.");
			masHelp.add("Для того, чтобы убрать пару одинаковых плиток,");
			masHelp.add("нужно поочередно коснуться их.");
			masHelp.add("Выделять таким образом можно только те плитки,");
			masHelp.add("которые хотя бы одной боковой стороной не граничат с другими.");

		}

		if (Lang.equals("tr")) {

			StringClose = "KAPAT";
			StringCredits = "YAZARLAR";
			StringCustomize = "ÖZEL";
			StringEnterName = "adınızı girin";
			StringExit = "ÇIKIŞ";
			StringHelp = "YARDIM";
			StringLevel = "Seviye";
			StringLevels = "SEVİYELER";
			StringMenu = "MENÜ";
			StringNext = "SONRAKİ";
			StringOptions = "SEÇENEKLER";
			StringPlay = "BAŞLAT";
			StringPlayer = "Oyuncu";
			StringScore = "Puan";
			StringScores = "NOKTALAR";
			StringTime = "Zaman";
			StringTotal = "Toplam";

			StringHint = "YARDIM";
			StringShuffle = "ANAHTAR";
			StringTiles = "Döşemeler";

			masHelp.clear();
			masHelp.add("Oyunun amacı sahadaki tüm taşları kaldırmaktır.");
			masHelp.add("Bir çift özdeş döşemeyi kaldırmak için.");
			masHelp.add("bunlara tek tek dokunmanız gerekiyor.");
			masHelp.add("Bu şekilde yalnızca bu döşemeler seçilebilir.");
			masHelp.add("en az bir tarafın diğer tarafa sınırı yoktur.");

		}
		
		masMenu.clear();
		masMenu.add(StringPlay);	
		masMenu.add(StringCustomize);
		masMenu.add(StringScores);
		masMenu.add(StringHelp);	
	    
	    menuItems = masMenu.size;
		
	}
	
	public void InitScreen()
	{
		
		stage.clear();
		stage2.clear();
		stageBG.clear();
		
		grpGame.clear();
		grpField.clear();

		if (status.equals("load")) {

			InitBG(imgBGMenu);

			//str = "LOADING ...";
			str = "";

			lbl = new Label(str, styleBig);
			lbl.setAlignment(Align.center);
			lbl.setX((W - lbl.getWidth()) / 2);
			lbl.setY((H - fontBig.getCapHeight())/2);
			grpGame.addActor(lbl);

			timerLoad = true;

		} else if (status.equals("menu")) {

			InitBG(imgBGMenu);

			//if (!platform.equals("html")) { InitTitle(); }

			InitMenu();
			InitFlags();
			
			playerName = StringPlayer;

		} 
		
		
		else if (status.equals("select")) {
			
			InitBG(bgNum);
			InitSelectBG();
			
		}
		
		else if (status.equals("levels")) {
			
			InitBG(bgNum);
			InitLevels();
			
		}
		 
		else if (status.equals("game")) { InitScreenGame(); }
		
		else {
			
			InitBG(bgNum);			
			
			if (status.equals("scores")) { InitTextScores(); }
			if (status.equals("info")) 		{ InitTextInfo(); }
			
		}
		
		if (!status.equals("load") && !status.equals("menu") && !status.equals("levels")) { InitButtonMenu(); }
		
		stageBG.addActor(grpBG);
		stage2.addActor(grpField);
		stage.addActor(grpGame);
		
	}
	
	public void InitScreenGame()
	{
		
		InitBG(bgNum);
		
		InitTiles();
		InitText();	
		//InitParticles(1);
		
		InitButtonsSet();
		InitButtonShuffle();
		InitButtonHint();
		InitButtonPause();

		if (!platform.equals("html")) { InitButtonMusic(); }

		InitButtonSound();
		InitButtonZoomIn();
		InitButtonZoomOut();
		
		StartUp();
		CreateNewGame(); 
		
		//ShowSplash("win");
		
	}

	public void InitFlags() {

		num = 3;

		float w = 64 * ss;
		float h = 32 * ss;
		float space = 8 * ss;

		xStart = (W - num * (w + space) + space)/2;

		for (int i = 0; i < num; i++) {

			rect = new TextureRegion(imgFlags, i * 256, 0, 256, 128);

			if (i == 0) { str = "en"; }
			if (i == 1) { str = "ru"; }
			if (i == 2) { str = "tr"; }

			img = new Image(rect);
			img.setName(str);
			img.setWidth(w);
			img.setHeight(h);
			img.setX(xStart + i * (w + space));
			img.setY(H - img.getHeight() - 8 * ss);

			img.addListener(

					new ClickListener() {

						public void clicked(InputEvent e, float x, float y) {

							str = e.getTarget().getName();

							if (soundPlay) { SoundMenuSelect.play(); }

							Lang = str;

							SaveInfo();

							Init();
							InitScreen();

						}

					}

			);

			grpGame.addActor(img);

		}

	}
	
	public void InitText()
	{
		
		lblLevel = new Label(StringLevel + ": ", style);
	    lblLevel.setX(5 * (bw + 4 * ss));
	    lblLevel.setY(4 * ss);
	    grpGame.addActor(lblLevel);

	    lblTiles = new Label(StringTiles + ": ", style);
	    lblTiles.setX(lblLevel.getX() + lblLevel.getWidth() + 64 * ss);
	    lblTiles.setY(lblLevel.getY());
	    grpGame.addActor(lblTiles);

	    lblScore = new Label(StringScore + ": ", style);
	    lblScore.setX(lblTiles.getX() + lblTiles.getWidth() + 96 * ss);
	    lblScore.setY(lblLevel.getY());
	    grpGame.addActor(lblScore);
	    
	    lblTime = new Label("00:00", style);
	    lblTime.setX(W - bw - lblScore.getWidth() - 16 * ss);
	    lblTime.setY(H - (bh + 4 * ss + lblTime.getHeight())/2);
	    grpGame.addActor(lblTime);
	    
	    lblFPS = new Label("", style);
	    lblFPS.setX(12 * ss);
	    lblFPS.setY(H - 24 * ss);
	    //grpGame.addActor(lblFPS);
		
	}
	
	public void InitMenu() 
	{ 
		
		menuWidth = (int) (160 * ss);
		menuHeight = (int) (40 * ss);
		menuSpace = (int) (8 * ss);
			
	    menuStartX = (W - menuWidth) / 2;
	    menuStartY = (H - menuItems * (menuHeight + menuSpace) + menuSpace) / 2;
	    
		n = 0;
		
		for (int i = 0; i < menuItems; i++) {
			
			//if (i != 2) {
			
			menuX = menuStartX;
			menuY = menuStartY + n * (menuHeight + menuSpace) + menuHeight;
				
			rect = new TextureRegion(imgButtonBG, 0, 0, imgButtonBG.getWidth()/2, imgButtonBG.getHeight());
		    rect2 = new TextureRegion(imgButtonBG, imgButtonBG.getWidth()/2, 0, imgButtonBG.getWidth()/2, imgButtonBG.getHeight());

		    img = new Image(rect);
		    img.setName("bMenu" + n);
		    img.setWidth(menuWidth);
		    img.setHeight(menuHeight);
		    img.setX(menuX);
		    img.setY(H - menuY);
		    
		    //*
		    img.addListener(
		    		
		    		new ClickListener(){
		    	    	
		  	          public void clicked(InputEvent e, float x, float y) {
		  	        	  
		  	        	  str = e.getTarget().getName();

						if (soundPlay) { SoundMenuSelect.play(); }
						
						if (str.equals("bMenu0")) { status = "levels"; }
						if (str.equals("bMenu1")) { status = "select"; }
						if (str.equals("bMenu2")) { status = "scores"; }
						if (str.equals("bMenu3")) { status = "info"; }
						
						if (android) { function.ShowAds(false); }
						
						if (status.equals("levels") && poki) { PokiPlayStart(); }
						
						InitScreen();
					
					}
					
		    	}
		    	
		    );
		  
		    grpGame.addActor(img);
			    
		    lbl = new Label(masMenu.get(i), style);
		    lbl.setX((img.getX() + (img.getWidth() - lbl.getWidth()) / 2));
		    lbl.setY((img.getY() + (img.getHeight() - lbl.getHeight()) / 2));
		    lbl.setTouchable(Touchable.disabled);

		    grpGame.addActor(lbl);
			
			n++;
			
			//}
	
		}        

	}
	
	public void InitTiles()
	{
		
		n = 0;
		layer = -1;

		int a = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		
		masTiles.clear();
		masShadows.clear();
		
		if (level == 1) { masLevel = gameLevel1.masLevels[0]; }
		if (level == 2) { masLevel = gameLevel2.masLevels[0]; }
		if (level == 3) { masLevel = gameLevel3.masLevels[0]; }
		if (level == 4) { masLevel = gameLevel4.masLevels[0]; }
		if (level == 5) { masLevel = gameLevel5.masLevels[0]; }
		if (level == 6) { masLevel = gameLevel6.masLevels[0]; }
		if (level == 7) { masLevel = gameLevel7.masLevels[0]; }
		if (level == 8) { masLevel = gameLevel8.masLevels[0]; }
		if (level == 9) { masLevel = gameLevel9.masLevels[0]; }
		if (level == 10) { masLevel = gameLevel10.masLevels[0]; }

		if (level == 11) { masLevel = gameLevel11.masLevels[0]; }
		if (level == 12) { masLevel = gameLevel12.masLevels[0]; }
		if (level == 13) { masLevel = gameLevel13.masLevels[0]; }
		if (level == 14) { masLevel = gameLevel14.masLevels[0]; }
		if (level == 15) { masLevel = gameLevel15.masLevels[0]; }
		if (level == 16) { masLevel = gameLevel16.masLevels[0]; }
		if (level == 17) { masLevel = gameLevel17.masLevels[0]; }
		if (level == 18) { masLevel = gameLevel18.masLevels[0]; }
		if (level == 19) { masLevel = gameLevel19.masLevels[0]; }
		if (level == 20) { masLevel = gameLevel20.masLevels[0]; }

		if (level == 21) { masLevel = gameLevel21.masLevels[0]; }
		if (level == 22) { masLevel = gameLevel22.masLevels[0]; }
		if (level == 23) { masLevel = gameLevel23.masLevels[0]; }
		if (level == 24) { masLevel = gameLevel24.masLevels[0]; }
		if (level == 25) { masLevel = gameLevel25.masLevels[0]; }
		if (level == 26) { masLevel = gameLevel26.masLevels[0]; }
		if (level == 27) { masLevel = gameLevel27.masLevels[0]; }
		if (level == 28) { masLevel = gameLevel28.masLevels[0]; }
		if (level == 29) { masLevel = gameLevel29.masLevels[0]; }
		if (level == 30) { masLevel = gameLevel30.masLevels[0]; }

		if (level == 31) { masLevel = gameLevel31.masLevels[0]; }
		if (level == 32) { masLevel = gameLevel32.masLevels[0]; }
		if (level == 33) { masLevel = gameLevel33.masLevels[0]; }
		if (level == 34) { masLevel = gameLevel34.masLevels[0]; }
		if (level == 35) { masLevel = gameLevel35.masLevels[0]; }
		if (level == 36) { masLevel = gameLevel36.masLevels[0]; }
		if (level == 37) { masLevel = gameLevel37.masLevels[0]; }
		if (level == 38) { masLevel = gameLevel38.masLevels[0]; }
		if (level == 39) { masLevel = gameLevel39.masLevels[0]; }
		if (level == 40) { masLevel = gameLevel40.masLevels[0]; }

		if (level == 41) { masLevel = gameLevel41.masLevels[0]; }
		if (level == 42) { masLevel = gameLevel42.masLevels[0]; }
		if (level == 43) { masLevel = gameLevel43.masLevels[0]; }
		if (level == 44) { masLevel = gameLevel44.masLevels[0]; }
		if (level == 45) { masLevel = gameLevel45.masLevels[0]; }
		if (level == 46) { masLevel = gameLevel46.masLevels[0]; }
		if (level == 47) { masLevel = gameLevel47.masLevels[0]; }
		if (level == 48) { masLevel = gameLevel48.masLevels[0]; }
		if (level == 49) { masLevel = gameLevel49.masLevels[0]; }
		if (level == 50) { masLevel = gameLevel50.masLevels[0]; }
		
		if (level == 51) { masLevel = gameLevel51.masLevels[0]; }
		if (level == 52) { masLevel = gameLevel52.masLevels[0]; }
		if (level == 53) { masLevel = gameLevel53.masLevels[0]; }
		if (level == 54) { masLevel = gameLevel54.masLevels[0]; }
		if (level == 55) { masLevel = gameLevel55.masLevels[0]; }
		if (level == 56) { masLevel = gameLevel56.masLevels[0]; }
		if (level == 57) { masLevel = gameLevel57.masLevels[0]; }
		if (level == 58) { masLevel = gameLevel58.masLevels[0]; }
		if (level == 59) { masLevel = gameLevel59.masLevels[0]; }
		if (level == 60) { masLevel = gameLevel60.masLevels[0]; }
		
		if (level == 61) { masLevel = gameLevel61.masLevels[0]; }
		if (level == 62) { masLevel = gameLevel62.masLevels[0]; }
		if (level == 63) { masLevel = gameLevel63.masLevels[0]; }
		if (level == 64) { masLevel = gameLevel64.masLevels[0]; }
		if (level == 65) { masLevel = gameLevel65.masLevels[0]; }
		if (level == 66) { masLevel = gameLevel66.masLevels[0]; }
		if (level == 67) { masLevel = gameLevel67.masLevels[0]; }
		if (level == 68) { masLevel = gameLevel68.masLevels[0]; }
		if (level == 69) { masLevel = gameLevel69.masLevels[0]; }
		if (level == 70) { masLevel = gameLevel70.masLevels[0]; }
		
		if (level == 71) { masLevel = gameLevel71.masLevels[0]; }
		if (level == 72) { masLevel = gameLevel72.masLevels[0]; }
		if (level == 73) { masLevel = gameLevel73.masLevels[0]; }
		if (level == 74) { masLevel = gameLevel74.masLevels[0]; }
		if (level == 75) { masLevel = gameLevel75.masLevels[0]; }
		if (level == 76) { masLevel = gameLevel76.masLevels[0]; }
		if (level == 77) { masLevel = gameLevel77.masLevels[0]; }
		if (level == 78) { masLevel = gameLevel78.masLevels[0]; }
		if (level == 79) { masLevel = gameLevel79.masLevels[0]; }
		if (level == 80) { masLevel = gameLevel80.masLevels[0]; }
		
		if (level == 81) { masLevel = gameLevel81.masLevels[0]; }
		if (level == 82) { masLevel = gameLevel82.masLevels[0]; }
		if (level == 83) { masLevel = gameLevel83.masLevels[0]; }
		if (level == 84) { masLevel = gameLevel84.masLevels[0]; }
		if (level == 85) { masLevel = gameLevel85.masLevels[0]; }
		if (level == 86) { masLevel = gameLevel86.masLevels[0]; }
		if (level == 87) { masLevel = gameLevel87.masLevels[0]; }
		if (level == 88) { masLevel = gameLevel88.masLevels[0]; }
		if (level == 89) { masLevel = gameLevel89.masLevels[0]; }
		if (level == 90) { masLevel = gameLevel90.masLevels[0]; }
		
		if (level == 91) { masLevel = gameLevel91.masLevels[0]; }
		if (level == 92) { masLevel = gameLevel92.masLevels[0]; }
		if (level == 93) { masLevel = gameLevel93.masLevels[0]; }
		if (level == 94) { masLevel = gameLevel94.masLevels[0]; }
		if (level == 95) { masLevel = gameLevel95.masLevels[0]; }
		if (level == 96) { masLevel = gameLevel96.masLevels[0]; }
		if (level == 97) { masLevel = gameLevel97.masLevels[0]; }
		if (level == 98) { masLevel = gameLevel98.masLevels[0]; }
		if (level == 99) { masLevel = gameLevel99.masLevels[0]; }
		if (level == 100) { masLevel = gameLevel100.masLevels[0]; }
		
		for (int p = 0; p < masLevel.length; p++) { 
				
			layer++;
			masField = masLevel[p];
				
			for (int y = 0; y < fh; y++) {
				
				for (int x = 0; x < fw; x++) {
				
					if (masField[y * fw + x] == 1) {
					
						k++;
						
						if (k == 3) { k = 1; m++;
							if (m == maxImages) { m = 0; }
						}
						
						if (m >= 34 && m <= 37) { a = 35; k++; }
							
						else {
							if (m >= 38 && m <= 41) { a = 36; k++; } else { a = m + 1; }
						}
						  
						objTile = new GameObject();
						objTile.id = n;
						objTile.name = "tile" + n;
						objTile.width = cellW;
						objTile.height = cellH;
						objTile.x = sx + (x + 1) * objTile.width / 2 - layer * shift;
						objTile.y = sy + (y + 1) * objTile.height / 2 + layer * shift;
						objTile.xp = x;
						objTile.yp = y;
						objTile.layer = layer;
						objTile.tile = a;
						objTile.visible = true;
						objTile.click = false;
							 	 									
						masTiles.add(objTile);
						
						objShadow = new GameObject();
						objShadow.id = n;
						objShadow.name = "shadow" + n;
						objShadow.width = cellW + 5 * ss;
						objShadow.height = cellH + 5 * ss;
						objShadow.x = objTile.x;
						objShadow.y = objTile.y - 5 * ss;
						objShadow.xp = x;
						objShadow.yp = y;
						objShadow.layer = layer;
						objShadow.tile = a;
						objShadow.visible = true;
						
						masShadows.add(objShadow);
						
						n++;
					
					}
					
				}
				
			}
				
		}
		
	}
	
	public void TouchTile(Image img)
	{
		
		idTile = Integer.valueOf(img.getName().substring(4, img.getName().length()));
		
		objTile = masTiles.get(idTile);
		objShadow = masShadows.get(objTile.id);
		
		objTile.active = CheckFree(objTile);
		
		if (objTile.active) {
				
				if (!objTile.click) {
					
					if (objTile.id != cellPre) {
					
					if (soundPlay) { SoundClick.play(); }
					
					if (!selectFirst) { 
						
						click = true;
						selectFirst = true;
						objTile.click = true;
						cellPre = objTile.id;
						
						SetTiles();
						
					}
					
					if (selectFirst && !click) { click = true;
						
						objTile2 = masTiles.get(cellPre);
						objShadow2 = masShadows.get(cellPre);
						
						if (objTile.tile == objTile2.tile) {
							
							stones -= 2;
							score += level * 10;
							
							if (soundPlay) { SoundRemove.play(); }
							
							objTile.visible = false; 
							objTile.click = false; 
							
							objTile2.visible = false;
							objTile2.click = false; 
							
							objShadow.visible = false;
							objShadow2.visible = false;
							
							//parEffect.setPosition(objTile.x, objTile.y);
						    //parEffect.start();
						      
						    grpField.removeActor(objTile.img);
							grpField.removeActor(objTile2.img);
							
							grpField.removeActor(objShadow.img);
							grpField.removeActor(objShadow2.img);
							
							selectFirst = false;
							
							if (stones == 0) { 
								
								score += level * 100;
								
								EndGame("win");
								
							}
							
						}
							
						else {
							
							cellPre = objTile.id; 
							
							click = true;
							selectFirst = true;
							
							objTile.click = true;
							objTile2.click = false;							
							
							SetTiles();
														
						}
						
					}
					
					}
					
				}
				
				click = false;
				
		}
		
	} 
	
	public void EndGame(String result) {

		if (html) { GameStop(); }
		if (poki) { PokiPlayStop(); }
		
		gameResult = result;
		
		pause = true;
		splash = true;
		timerEnd = true;

		if (level < maxLevel) { level++; SaveInfo(); SaveScores(); level--; }
		
		ShowSplash("win");

	}

	public boolean CheckFree(GameObject objTileCheck)
	{
		
		boolean result = false;
	
		if (objTileCheck.visible) {
			
			GameObject objTileCheck2 = new GameObject();
		
			boolean upFree;
			boolean leftFree;
			boolean rightFree;
			
			//picFocus.visible = false;
		
			upFree = true;
			leftFree = true;
			rightFree = true;			
			result = true;
			
			//System.out.println(objTileCheck.xp + " " + objTileCheck.yp);
	
			for (int k = objTileCheck.id + 1; k < masTiles.size; k++) {
				
				objTileCheck2 = masTiles.get(k);
				
				if (objTileCheck2.visible) {
					if (objTileCheck.xp == objTileCheck2.xp && objTileCheck.yp == objTileCheck2.yp) { upFree = false; }
					if (Math.abs(objTileCheck.xp - objTileCheck2.xp) < 2 && Math.abs(objTileCheck.yp - objTileCheck2.yp) < 2) { upFree = false; }
				}	
				
			}
	
			for (k = 0; k < masTiles.size; k++) {
				
				objTileCheck2 = masTiles.get(k);
				
				if (objTileCheck2.visible) {
					
					if (objTileCheck.xp - 2 == objTileCheck2.xp && Math.abs(objTileCheck.yp - objTileCheck2.yp) < 2 &&
						objTileCheck.layer == objTileCheck2.layer) { leftFree = false; }
					
					if (objTileCheck.xp + 2 == objTileCheck2.xp && Math.abs(objTileCheck.yp - objTileCheck2.yp) < 2 &&
						objTileCheck.layer == objTileCheck2.layer) { rightFree = false; }
					
				} 
				
			}
		
			if (!upFree) { result = false; }
			if (!leftFree && !rightFree) { result = false; }
		
		}
		
		return result;			
	
}
	
	public void CreateNewGame()
	{
		
		int m;
		int t;
		
		grpField.clear();
	   
		for (int n = 0; n < masTiles.size; n++) {
		 
			m = (int) (Math.random() * masTiles.size);
			
			objTile = masTiles.get(n);
			objTile2 = masTiles.get(m);
			
			t = objTile.tile;
			objTile.tile = objTile2.tile;
			objTile2.tile = t;
			
		}
		
		CreateTiles();
		
	}
	
	public void CreateTiles()
	{
		
		CreateTilesLayer(0);
		CreateTilesLayer(1);
		CreateTilesLayer(2);
		CreateTilesLayer(3);
		CreateTilesLayer(4);
		CreateTilesLayer(5);
		CreateTilesLayer(6);
		CreateTilesLayer(7); 
		CreateTilesLayer(8);
		CreateTilesLayer(9);
		
	}
		
	public void CreateTilesLayer(int layer)
	{
		
		for (int n = 0; n < masShadows.size; n++) {

			objShadow = masShadows.get(n);	
			 
			if (objShadow.visible && objShadow.layer == layer) { CreateShadow(objShadow); }
			
		}
		
		for (n = 0; n < masTiles.size; n++) {

			objTile = masTiles.get(n);
							
			if (objTile.visible && objTile.layer == layer) { CreateTile(objTile); }
				
		}
				
	}
	
	public void CreateShadow(GameObject objShadow)
	{
		
		rect = new TextureRegion(imgShadow, 0, 0, 37, 45);
		
		objShadow.img = new Image(rect);
		objShadow.img.setName(objShadow.name);
		objShadow.img.setWidth(objShadow.width);
		objShadow.img.setHeight(objShadow.height);
		objShadow.img.setX(objShadow.x);
		objShadow.img.setY(objShadow.y);
		
		grpField.addActor(objShadow.img);
			
	}
	
	public void CreateTile(GameObject objTile)
	{
		
		rect = new TextureRegion(imgTiles, objTile.tile * 48, set * 60, 48, 60);
		
		objTile.img = new Image(rect);
		objTile.img.setName(objTile.name);
		objTile.img.setWidth(cellW);
		objTile.img.setHeight(cellH);
		objTile.img.setX(objTile.x);
		objTile.img.setY(objTile.y);
		
		objTile.img.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
					
					img = (Image) e.getTarget();
					
					if (!splash && !pause) {
	          	
						TouchTile(img);
					
					}
				
				}
	         
	    	}
	    	
	    );
		
		grpField.addActor(objTile.img);	
		
	}
	
	public void SetTiles()
	{
		
		SetTilesLayer(0);
		SetTilesLayer(1);
		SetTilesLayer(2);
		SetTilesLayer(3);
		SetTilesLayer(4);
		SetTilesLayer(5);
		SetTilesLayer(6);
		SetTilesLayer(7); 
		SetTilesLayer(8);
		SetTilesLayer(9);
		
	}
		
	public void SetTilesLayer(int layer)
	{
		
		for (int n = 0; n < masShadows.size; n++) {

			objShadow = masShadows.get(n);	
			 
			if (objShadow.visible && objShadow.layer == layer) { SetShadow(objShadow); }
			
		}
		
		for (n = 0; n < masTiles.size; n++) {

			objTile = masTiles.get(n);
							
			if (objTile.visible && objTile.layer == layer) { SetTile(objTile); }
				
		}
				
	}
	
	public void SetShadow(GameObject objShadow)
	{
		
		rect = new TextureRegion(imgShadow, 0, 0, 37, 45);
		
		objShadow.img.setDrawable(new TextureRegionDrawable(new TextureRegion(rect)));
			
	}
	
	public void SetTile(GameObject objTile)
	{
		
		if (!objTile.click) { rect = new TextureRegion(imgTiles, objTile.tile * 48, set * 60, 48, 60); }
		else { rect = new TextureRegion(imgTilesSel, objTile.tile * 48, set * 60, 48, 60); }
		
		objTile.img.setDrawable(new TextureRegionDrawable(new TextureRegion(rect)));
		
	}
	
	public void Shuffle()
	{
		
		int m;
		int t;
		
		for (int n = 0; n < masTiles.size; n++) {
			 
			m = (int) (Math.random() * masTiles.size);
			
			objTile = masTiles.get(n);
			objTile2 = masTiles.get(m);
			
			if (objTile.visible && objTile2.visible) {
				
				t = objTile.tile;
				objTile.tile = objTile2.tile;
				objTile2.tile = t;	
				
			}
		
		}
		
		SetTiles();
				
	}
	 
	public void Hint()
	{
		
		int countActive = 0;
		
		for (int i = 0; i < masTiles.size - 1; i++) {
			
			objTile = masTiles.get(i); 
			
			objTile.active = CheckFree(objTile);
			
			if (objTile.active) { 
			
			for (int k = i+1; k < masTiles.size; k++) {
				
				objTile2 = masTiles.get(k);
				 
				if (objTile.tile == objTile2.tile) { 
			
					objTile2.active = CheckFree(objTile2);
									
					if (objTile2.active && countActive < 1) { 
						
						countActive++;
						
						objTile.click = true;
						objTile2.click = true;
						
						idHint = objTile.id;
						idHint2 = objTile2.id;
						
						SetTiles();
						
						//break;
					
					}
				
				}
					
			}
				
			}
			
		}
		
	}
	
	public void LoadInfo() 
	{

		if (prefs.contains("lang")) { Lang = prefs.getString("lang"); } else {

			if (platform.equals("html")) { Lang = ""; if (!html) { Lang = "ru"; } }
			else { Lang = "ru"; }

		}

		if (prefs.contains("bg")) { bgNum = prefs.getInteger("bg"); } else { bgNum = 0; }
		if (prefs.contains("level")) { levelSaved = prefs.getInteger("level"); } else { levelSaved = 1; }
		if (prefs.contains("name")) { playerName = prefs.getString("name"); }

		level = levelSaved;
		//level = 79;

		levelGroup = (level - 1) / (colsLevels * rowsLevels);

		LoadScores();
		
	}
	
	public void LoadScores() {
		
		masScores.clear();
		
		for (int i = 1; i <= 10; i++) {
			
			obj = new GameObject();
			obj.score = prefs.getInteger("scores" + i);
			obj.textPlace = Integer.toString(i);
			obj.textUser = prefs.getString("player" + i);
			obj.textScores = Integer.toString(obj.score);
		
			masScores.add(obj); 
		
		}
				
	}
	
	public void SaveInfo()
	{

		prefs.putString("lang", Lang);
		prefs.putString("name", playerName);
		
		if (level > levelSaved) { levelSaved = level; prefs.putInteger("level", levelSaved); }

		prefs.flush();

	}
	
	public void SaveScores() {
		
		for (int i = 0; i < masScores.size; i++) {
			
			obj = masScores.get(i);
			
			if (score > 0 && score >= obj.score) { 
				
				obj2 = new GameObject();
				obj2.score = score;
				obj2.textPlace = Integer.toString(i + 1);
				obj2.textUser = playerName;
				obj2.textScores = Integer.toString(score);
				 
				masScores.insert(i, obj2); 
				masScores.pop(); 
				
				break;
				
			} 
			
		}
		
		for (int i = 0; i < masScores.size; i++) {
			
			obj = masScores.get(i);
		
			prefs.putInteger("scores" + (i+1), obj.score);
		
		}
		
		prefs.flush();
		
	}
	
	public void InitTextScores() {
		
		for (int i = 0; i < masScores.size; i++) {
			
			obj = masScores.get(i);
			
			Label lblNum = new Label(Integer.toString(i+1) + ".", style);
		    lblNum.setX((W - 260 * ss) / 2);
		    lblNum.setY((H + fontBig.getLineHeight() * 9) / 2 - fontBig.getLineHeight() * i);
		    lblNum.setTouchable(Touchable.disabled);
		    
		    grpGame.addActor(lblNum);
		    
		    Label lblName = new Label(StringPlayer, style);
		    lblName.setX(lblNum.getX() + 60 * ss);
		    lblName.setY((H + fontBig.getLineHeight() * 9) / 2 - fontBig.getLineHeight() * i);
		    lblName.setTouchable(Touchable.disabled);

		    grpGame.addActor(lblName);
		    
		    Label lblScore = new Label(obj.textScores, style);
		    lblScore.setX(lblNum.getX() + 260 * ss);
		    lblScore.setY((H + fontBig.getLineHeight() * 9) / 2 - fontBig.getLineHeight() * i);
		    lblScore.setTouchable(Touchable.disabled);

		    grpGame.addActor(lblScore);
			
		}
		
	}

	public void InitLevels()
	{

		int col;
		int row;

		int step = levelGroup * colsLevels * rowsLevels;
		int levelWidth = (int) (90 * ss);
		int levelHeight = (int) (60 * ss);
		int levelX;
		int levelY;
		int levelStartX;
		int levelStartY;
		int levelSpaceX = (int) (4 * ss);
		int levelSpaceY = (int) (4 * ss);

		levelStartX = (W - colsLevels * (levelWidth + levelSpaceX) + levelSpaceX) / 2;
		levelStartY = (H - (rowsLevels - 2) * (levelHeight + levelSpaceY) - levelSpaceY) / 2;

		for (int y = 0; y < rowsLevels; y++) {
			for (int x = 0; x < colsLevels; x++) {

				n = step + y * colsLevels + x + 1;

				levelX = levelStartX + x * (levelWidth + levelSpaceX);
				levelY = levelStartY + y * (levelHeight + levelSpaceY);

				rect2 = new TextureRegion(imgLevel, 64, 0, 64, 64);

				if (n > levelSaved) { rect = new TextureRegion(imgLevel, 0, 0, 64, 64);} else { rect = rect2; }

				btn = new Image(rect);
				btn.setName(String.valueOf(n));
				btn.setWidth(levelWidth);
				btn.setHeight(levelHeight);
				btn.setX(levelX);
				btn.setY(H - levelY);

				if (n > levelSaved) { btn.setTouchable(Touchable.disabled); }

				btn.addListener(

						new ClickListener(){

							public void clicked(InputEvent e, float x, float y) {

								str = e.getTarget().getName();

								PlaySound(SoundMenuSelect);

								level = Integer.parseInt(str);

								status = "game";

								InitScreen();

							}

						}

				);

				grpGame.addActor(btn);

				if (n <= levelSaved) {

					row = (n-1)/10;
					col = (n-1) - row * 10;

					rect = new TextureRegion(imgLevelPic, col * 128, row * 128, 128, 128);

					img = new Image(rect);
					img.setName("imgLevel" + String.valueOf(n));
					img.setWidth(levelWidth - 18 * ss);
					img.setHeight(levelHeight - 8 * ss);
					img.setX(btn.getX() + 8 * ss);
					img.setY(btn.getY() + 4 * ss);
					img.setTouchable(Touchable.disabled);

					grpGame.addActor(img);

				}

				lbl = new Label(n + "", styleSmall);
				lbl.setX(btn.getX() + btn.getWidth() - lbl.getWidth() - 2 * ss);
				lbl.setY(btn.getY());
				lbl.setTouchable(Touchable.disabled);

				if (n > levelSaved) {

					lbl.setX((btn.getX() + (btn.getWidth() - lbl.getWidth()) / 2));
					lbl.setY((btn.getY() + (btn.getHeight() - lbl.getHeight()) / 2));

				}

				grpGame.addActor(lbl);

			}

		}

		int groupItems = maxLevel / (colsLevels * rowsLevels);

		int groupWidth = (int) (80 * ss);
		int groupHeight = (int) (32 * ss);
		int groupSpace = (int) (8 * ss);
		int groupX = (int) ((W - groupItems * (groupWidth + groupSpace) - groupSpace) / 2);

		for (int i = 0; i < groupItems; i++) {

			if (i == levelGroup) { rect = new TextureRegion(imgButtonBG, 128, 0, 128, 32); }
			else { rect = new TextureRegion(imgButtonBG, 0, 0, 128, 32); }

			img = new Image(rect);
			img.setName("group" + i);
			img.setWidth(groupWidth);
			img.setHeight(groupHeight);
			img.setX(groupX + i * (groupWidth + groupSpace) + groupSpace);
			img.setY(24 * ss);

			img.addListener(

					new ClickListener(){

						public void clicked(InputEvent e, float x, float y) {

							str = e.getTarget().getName();

							PlaySound(SoundMenuSelect);

							levelGroup = Integer.parseInt(str.substring(5));

							InitScreen();

						}

					}

			);

			grpGame.addActor(img);

			str = (i * colsLevels * rowsLevels + 1) + " - " + (i+1) * colsLevels * rowsLevels;

			lbl = new Label(str, styleSmall);
			lbl.setX((img.getX() + (img.getWidth() - lbl.getWidth()) / 2));
			lbl.setY((img.getY() + (img.getHeight() - lbl.getHeight()) / 2));
			lbl.setTouchable(Touchable.disabled);

			grpGame.addActor(lbl);

		}

	}

	public void PlaySound(Sound snd) { if (soundPlay) { snd.play(); } }

	public void InitButtonMenu()
	{
	
		rect = new TextureRegion(imgButtonMenu, 64, 0, 64, 64);
	    
	    btn = new Image(rect);
	    btn.setWidth(bw);
	    btn.setHeight(bh);
	    btn.setX(W - bw - 4 * ss);
	    btn.setY(H - bh - 4 * ss);
	    
	    btn.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
	        	
			        	if (!pause && !splash) {
			        	
			        		if (soundPlay) { SoundMenuSelect.play(); }
						
			        		ExitToMenu();
			        		
			        	}
				
					}
	         
			    }
			    
	    );
	    
	    grpGame.addActor(btn);
   
	}
	
	public void ExitToMenu()
	{

		if (status.equals("game") && poki) { PokiPlayStop(); }
		
		music.stop();
		
		status = "menu";
        InitScreen();
    	
        if (android) { function.ShowAds(true); }
		
	}
	
	public void InitButtonPause()
	{
	    
		if (pause) { rect = new TextureRegion(imgButtonPause, 0, 0, 64, 64); } 
	    else { rect = new TextureRegion(imgButtonPause, 64, 0, 64, 64); }
	    
	    btnPause = new Image(rect);
	      
	    btnPause.setWidth(bw);
	    btnPause.setHeight(bh);
	    btnPause.setX(4 * ss);
	    btnPause.setY(H - btnPause.getHeight() - 4 * ss);
	    
	    grpGame.addActor(btnPause);
		
	    btnPause.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
						
						if (!splash) {
		        	
				        	if (soundPlay) { SoundMenuSelect.play(); }
				        	
			        	pause = !pause;

				if (pause) { if (poki) { PokiPlayStop(); } } else { if (poki) { PokiPlayStart(); } }	
				        	
				        	if (pause) {
								
				        		if (musicPlay) { music.pause(); }
								
							} 
								
							else { 
								
								if (musicPlay) { music.play(); }
								
							}
				         		
				    	    if (pause) { rect = new TextureRegion(imgButtonPause, 0, 0, 64, 64); } 
				    	    else { rect = new TextureRegion(imgButtonPause, 64, 0, 64, 64); }
				    	    
				    	    btnPause.setDrawable(new TextureRegionDrawable(new TextureRegion(rect)));
			        	
						}
		        	
					}
						
		    	}
		         
		    );
	    
	}
	
	public void InitButtonMusic()
	{
	     
	    if (soundPlay) { rect = new TextureRegion(imgButtonMusic, 0, 0, 64, 64); } 
	    else { rect = new TextureRegion(imgButtonMusic, 64, 0, 64, 64); }
	    
	    btnMusic = new Image(rect);
	    
	    btnMusic.setWidth(bw);
	    btnMusic.setHeight(bh);
	    btnMusic.setX(btnPause.getX());
	    btnMusic.setY(btnPause.getY() - 2 * (btnPause.getHeight() + 4 * ss));
	    
	    grpGame.addActor(btnMusic);
	    
	    btnMusic.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
					
					if (!splash && !pause) {
	        	
						if (soundPlay) { SoundMenuSelect.play(); }
		        	
						musicPlay = !musicPlay; 
			        	
			        	if (!musicPlay) { music.stop(); } else { music.play(); }
			        	
			    	    if (musicPlay) { rect = new TextureRegion(imgButtonMusic, 0, 0, 64, 64); } 
			    	    else { rect = new TextureRegion(imgButtonMusic, 64, 0, 64, 64); }
			    	    
			    	    btnMusic.setDrawable(new TextureRegionDrawable(new TextureRegion(rect)));
		        	
		        	}
				
				}
	        
	    	}
	         
	    );
	    
	}
	
	public void InitButtonSound()
	{
	     
	    if (soundPlay) { rect = new TextureRegion(imgButtonSound, 0, 0, 64, 64); } 
	    else { rect = new TextureRegion(imgButtonSound, 64, 0, 64, 64); }
	    
	    btnSound = new Image(rect);
	    
	    btnSound.setWidth(bw);
	    btnSound.setHeight(bh);
	    btnSound.setX(btnPause.getX());
	    btnSound.setY(btnPause.getY() - 3 * (btnPause.getHeight() + 4 * ss));
	    
	    grpGame.addActor(btnSound);
	    
	    btnSound.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
					
					if (!splash && !pause) {
	        	
						if (soundPlay) { SoundMenuSelect.play(); }
		        	
			        	soundPlay = !soundPlay;
			        	
			    	    if (soundPlay) { rect = new TextureRegion(imgButtonSound, 0, 0, 64, 64); } 
			    	    else { rect = new TextureRegion(imgButtonSound, 64, 0, 64, 64); }
			    	    
			    	    btnSound.setDrawable(new TextureRegionDrawable(new TextureRegion(rect)));
		        	
		        	}
				
				}
	        
	    	}
	         
	    );
	     
	}
	
	public void InitButtonZoomIn()
	{
	     
		rect = new TextureRegion(imgButtonZoomIn, 64, 0, 64, 64);
	    
	    btnZoomIn = new Image(rect);
	    
	    btnZoomIn.setWidth(bw);
	    btnZoomIn.setHeight(bh);
	    btnZoomIn.setX(W - bw - 4 * ss);
	    btnZoomIn.setY(H - 3 * (bh + 4 * ss));
	    
	    grpGame.addActor(btnZoomIn);
	    
	    btnZoomIn.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
	        	
			        	if (!pause && !splash) {
			        	
			        		if (soundPlay) { SoundMenuSelect.play(); }
			        		
				        	if (zoom < 2) { zoom *= 1.2; cam.zoom = 1/zoom; }
				        	
			        	}
				
					}
	         
		    	}
		    	
		);
	       
	}
	
	public void InitButtonZoomOut()
	{
	     
		rect = new TextureRegion(imgButtonZoomOut, 64, 0, 64, 64);
	    
	    btnZoomOut = new Image(rect);
	    
	    btnZoomOut.setWidth(bw);
	    btnZoomOut.setHeight(bh);
	    btnZoomOut.setX(btnZoomIn.getX());
	    btnZoomOut.setY(btnZoomIn.getY() - bh - 4 * ss);
	    
	    grpGame.addActor(btnZoomOut);
	    
	    btnZoomOut.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
	        	
			        	if (!pause && !splash) {
			        	
			        		if (soundPlay) { SoundMenuSelect.play(); }
			        	
			        		if (zoom > 0.5) { zoom /= 1.2; cam.zoom = 1/zoom; } 
				        	
			        	}
				
					}
	         
		    	}
		    	
	    );
	       
	}
	
	public void InitButtonShuffle() 
	{
	    
		rect = new TextureRegion(imgButtonBG, 0, 0, 128, 32);
		
	    btn = new Image(rect);
	    btn.setWidth(buttonWidth);
	    btn.setHeight(buttonHeight);
	    btn.setX(4 * ss);
	    btn.setY(5 * ss);
	    
	    btn.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
	        	
			        	if (!pause && !splash) {
			        	
				        	if (soundPlay) { SoundMenuSelect.play(); }
				            
				        	Shuffle();
			        	
			        	}
				
					}
	         
		    	}
		    	
		);
	    
	    grpGame.addActor(btn);
	    
	    str = StringShuffle;
	    
	    lbl = new Label(str, styleSmall);
	    lbl.setX((btn.getX() + (btn.getWidth() - lbl.getWidth()) / 2));
	    lbl.setY((btn.getY() + (btn.getHeight() - lbl.getHeight()) / 2));
	    lbl.setTouchable(Touchable.disabled);

	    grpGame.addActor(lbl);
		
	}
	
	public void InitButtonHint() 
	{
	    
		rect = new TextureRegion(imgButtonBG, 0, 0, 128, 32);
		
	    btn = new Image(rect);
	    btn.setWidth(buttonWidth);
	    btn.setHeight(buttonHeight);
	    btn.setX(W - (btn.getWidth() + 4 * ss));
	    btn.setY(5 * ss);
	    
	    btn.addListener(
	    		
	    		new ClickListener(){
	    	    	
	  	          public void clicked(InputEvent e, float x, float y) {
	  	        	  
	  	        	  str = e.getTarget().getName();
	        	
			        	if (!pause && !splash) {
			        	
				        	if (soundPlay) { SoundMenuSelect.play(); }
			
				        	if (!hintActive) { hintActive = true; Hint(); }
			        	
			        	}
				
					}
	         
		    	}
		    	
		);
	    
	    grpGame.addActor(btn);

	    xPos = (int)(btn.getX() + ((float)buttonWidth - lbl.getWidth()) / 2);
		yPos = (int)(btn.getY() + ((float)buttonHeight + lbl.getHeight()) / 2 + (float)4);
	    
	    lbl = new Label(StringHint, styleSmall);
	    lbl.setX((btn.getX() + (btn.getWidth() - lbl.getWidth()) / 2));
	    lbl.setY((btn.getY() + (btn.getHeight() - lbl.getHeight()) / 2));
	    lbl.setTouchable(Touchable.disabled);

	    grpGame.addActor(lbl);
		
	}
	
	public void InitButtonsSet() 
	{   
		
		for (int i = 0; i < maxSet; i++) { 
		 
			rect = new TextureRegion(imgSet, 0, i * 64, 64, 64);
		     
		    btn = new Image(rect);
		    btn.setName("BSet" + Integer.toString(i));
		    btn.setWidth(32 * ss);
		    btn.setHeight(32 * ss);
		    btn.setX((W - (btn.getWidth() + btn.getHeight()/2) * maxSet) / 2 + i * (btn.getWidth() + 16 * ss));
		    btn.setY(H - btn.getHeight() - 10 * ss);
		    
		    btn.addListener(
		    		
		    		new ClickListener(){
		    	    	
		  	          public void clicked(InputEvent e, float x, float y) {
		  	        	  
		  	        	  str = e.getTarget().getName();
		        	
				        	if (!pause && !splash) {
				        	
					        	if (soundPlay) { SoundMenuSelect.play(); }
					        	
					        	if (str.equals("BSet0")) { set = 0; }
					        	if (str.equals("BSet1")) { set = 1; }
					        	if (str.equals("BSet2")) { set = 2; }
					        	if (str.equals("BSet3")) { set = 3; }
					        	if (str.equals("BSet4")) { set = 4; }
					        	if (str.equals("BSet5")) { set = 5; }
					        	if (str.equals("BSet6")) { set = 6; }
					        	
								SetTiles();
					
				        	}
					
						}
		         
			    	}
			    	
			);
		    
		    grpGame.addActor(btn);

		}

	}
		
	public void InitParticles(int type)
	{
		 
		parEffect = new ParticleEffect();
	    parEffect.load(Gdx.files.internal("par/par1"), Gdx.files.internal("par"));
	    		
	}  
	
	public void InitAudio()
	{ 
	 
		music = NewMusic("music.ogg");
		music.setLooping(true);
		 
		SoundClick = NewSound("snd/click.wav");
		SoundMenuEnter = NewSound("snd/menuEnter.wav");
		SoundMenuSelect = NewSound("snd/menuSelect.wav");
		SoundRemove = NewSound("snd/remove.wav");
		SoundSplash = NewSound("snd/click.wav");
		  
	}
	
	public Music NewMusic(String file)
	{
		
		return Gdx.audio.newMusic(Gdx.files.getFileHandle(file, FileType.Internal));
	      
	}
	
	public Sound NewSound(String file)
	{
		
		return Gdx.audio.newSound(Gdx.files.getFileHandle(file, FileType.Internal));
	      
	}
	
	public void InitSelectBG() 
	{
		
		int bgRows = 4;
		int bgCols = 2;
		
		int bgWidth = (int) (200 * ss);
		int bgHeight = (int) (100 * ss);
		int bgSpaceX = (int) (4 * ss);
		int bgSpaceY = (int) (4 * ss);
		
		float bgX;
		float bgY;
	
		int bgStartX = (W - bgCols * (bgWidth + bgSpaceX) + bgSpaceX) / 2;
		int bgStartY = (H - (bgRows - 2) * (bgHeight + bgSpaceY) - bgSpaceY) / 2;
 
		for (int y = 0; y < bgRows; y++) {
		for (int x = 0; x < bgCols; x++) {
			
			id = y * bgCols + x;
			
			bgX = bgStartX + x * (bgWidth + bgSpaceX);
			bgY = bgStartY + y * (bgHeight + bgSpaceY);

			SetBG(id);
		   
		    img = new Image(rect);
		    img.setName("bg" + String.valueOf(id));
		    img.setWidth(bgWidth);
		    img.setHeight(bgHeight);
		    img.setX(bgX);
		    img.setY(H - bgY);
		    
		    img.addListener(
		    		
		    		new ClickListener(){
		    	    	
		  	          public void clicked(InputEvent e, float x, float y) {
		  	        	  
		  	        	  str = e.getTarget().getName();
			        	
							if (soundPlay) { SoundMenuSelect.play(); }
				        	
							bgNum = Integer.parseInt(str.substring(2));
							
							prefs.putInteger("bg", bgNum);
							prefs.flush();
							
				        	status = "menu";
							
							InitScreen();
						
						}
			     
			    	}
			    
			);

		    grpGame.addActor(img);
	
		}    
		
		}

	}
 	 
	public void StartUp() {

		if (html) { GameStart(); }
			
		 	count = 0;   
			countSec = 0;
			countMin = 0;
			countHour = 0;
			cellPre = -1;
			
			stones = masTiles.size;
			//stones = 2;
			
			start = false;
			click = false;
			selectFirst = false;
			inputScore = false;
			
			GameTime = "00:00";
			
			if (musicPlay) { music.play(); }

			//EndGame("win");
			//ShowSplash("win");

	}	 
	
	public void InitBG(Texture img)
	{

		actor = new Image(img);
		actor.setWidth(W);
		actor.setHeight(H);
		
		grpBG.addActor(actor);
	  
	}
	
	public void InitBG(int id)
	{
			
		SetBG(id);
		
		img = new Image(rect);
		img.setWidth(W);
		img.setHeight(H);
		
		grpBG.clear();
		grpBG.addActor(img);
	  
	}
	
	public void SetBG(int id)
	{
		
		yPos = id/2;
		xPos = id - yPos * 2;
		
		rect = new TextureRegion(imgBGGame, xPos * 1024, yPos * 512, 1024, 512);
		
	}
	
	 public void InitBorders()
	 {
		 
		 img = new Image(imgBorderTop);
		 img.setWidth(actBGStats.getWidth());
		 img.setHeight(imgBorderTop.getHeight() * ss);
		 img.setX(0);
		 img.setY(H - img.getHeight());
			
		 grpGame.addActor(img);
		 
		 img = new Image(imgBorderTop);
		 img.setWidth(actBGStats.getWidth());
		 img.setHeight(imgBorderTop.getHeight() * ss);
		 img.setX(0);
		 img.setY(0);
			
		 grpGame.addActor(img);
		 
		 img = new Image(imgBorderSide);
		 img.setWidth(imgBorderSide.getWidth() * ss);
		 img.setHeight(H);
		 img.setX(0);
		 img.setY(0);
			
		 grpGame.addActor(img);
		 
		 img = new Image(imgBorderSide);
		 img.setWidth(imgBorderSide.getWidth() * ss);
		 img.setHeight(H);
		 img.setX(W - img.getWidth());
		 img.setY(0);
			
		 grpGame.addActor(img);

	 }
	 
	public void InitTitle()
	{
		
		int row = 0;
		  
		if (Lang.equals("en")) { row = 0; }
		if (Lang.equals("ru")) { row = 1; }
	 
		rect = new TextureRegion(imgTitle, 0, row * 128, 1024, 128);
		 
		actor = new Image(rect);
		actor.setWidth(W * 0.9f);
		actor.setHeight(128 / (1024 / (float)W));
		actor.setX((W - actor.getWidth()) / 2);
		actor.setY(H - actor.getHeight() * 1.1f);
		
		grpGame.addActor(actor);
	   
	}

	 public void render() {
		
		dt = Gdx.graphics.getDeltaTime();
		
		curFrame += dt;
		curFrameTime += dt;
		
		if (hintActive) { curFrameHint += dt; }

		gl = Gdx.graphics.getGL20();      
	    gl.glClear(GL20.GL_COLOR_BUFFER_BIT); 
		
		cam.update();
	  
	    batch.getProjectionMatrix().set(cam.combined); 
	    batch.begin();
		
		if (status.equals("load")) { CountTimeLoad(); }
		else if (status.equals("game")) { DrawScreenGame(); }

		batch.end();
		
		stageBG.act(dt);
		stageBG.draw();
		
		stage2.act(dt);
		stage2.draw();
		
		stage.act(dt);
		stage.draw(); 
		
	} 

	public void DrawScreenGame()
	{
		
		CheckControls();
		CountTimeEnd();
		
		if (!pause) {
			
			CountTime();
			CountTimeHint();

		}
		
		DrawText(); 
		
	}
	
	public void DrawText()
	{
	
		lblLevel.setText(StringLevel + ": " + Integer.toString(level));
		lblTiles.setText(StringTiles + ": " + Integer.toString(stones));
		lblScore.setText(StringScore + ": " + Integer.toString(score));
		lblTime.setText(GameTime);
		
		lblFPS.setText(Integer.toString(Gdx.graphics.getFramesPerSecond()));
		
	}

	public void InitTextInfo()
	{

		for (int i = 0; i < masHelp.size; i++) { 
			
			str = masHelp.get(i);
			
			float ys = masHelp.size * font.getLineHeight()/2;
		    
		    lbl = new Label(str, new Label.LabelStyle(font, font.getColor()));
		    lbl.setX((W - lbl.getWidth()) / 2);
		    lbl.setY(ys + (H - lbl.getHeight() - i * font.getLineHeight() * 2) / 2);
		    lbl.setTouchable(Touchable.disabled);
	
		    grpGame.addActor(lbl);
	    
		}
		
		////InitTextCredits();
	
	}
	
	public void InitTextCredits()
	{
		
		Array <String> masCredits = new Array<String>();
		 
		masCredits.add("Aleksey Taranov (c) 2011");
		masCredits.add("www.ulkaden.com");
		 
		for (int i = 0; i < masCredits.size; i++) { 
			
			str = masCredits.get(i);
		
			float ys = (int) (masCredits.size * font.getLineHeight()/2);
		    
		    lbl = new Label(str, new Label.LabelStyle(font, font.getColor()));
		    lbl.setX((W - lbl.getWidth()) / 2);
		    lbl.setY(ys + (lbl.getHeight() - i * lbl.getHeight() * 2) / 2);
		    lbl.setTouchable(Touchable.disabled);
		    
		    grpGame.addActor(lbl);
		    
		}
	
	}
	
	public void CountTime() 
	{
		
		if (curFrame >= 1) { curFrame = 0;
		
			countSec++;
			
			if (countSec == 60) { countSec = 0; countMin++; }
			if (countMin == 60) { countMin = 0; countHour++; }
			
			if (countSec < 10) { GameTimeSec = "0" + countSec; } else { GameTimeSec = Integer.toString(countSec); }
			if (countMin < 10) { GameTimeMin = "0" + countMin; } else { GameTimeMin = Integer.toString(countMin); }
			if (countHour < 10) { GameTimeHour = "0" + countHour; } else { GameTimeHour = Integer.toString(countHour); }
			
			GameTime = GameTimeMin + ":" + GameTimeSec; 
		
		}
		
	}

	public void CountTimeLoad() {

		if (timerLoad) {

			frameLoad += dt;
			frameLoadSec += dt;

			if (frameLoadSec >= 0.1f) { frameLoadSec = 0;

				if (html) { GetLang(); }

				if (lang != null && !lang.equals("") && !lang.equals("undefined")) {

					if (Lang.equals("")) {

						if (lang.equals("ru") || lang.equals("be") || lang.equals("kk") ||
								lang.equals("uk") || lang.equals("uz")) { Lang = "ru"; }

						else if (lang.equals("tr")) { Lang = "tr"; }
						else { Lang = "en"; }

					}

					LoadEnd();

				} else if (frameLoad >= 2) { Lang = LangDef; LoadEnd(); }

			}

		}

	}

	public void LoadEnd() {

		timerLoad = false;
		status = "menu";

		Init();
		InitScreen();

	}

	
	public void CountTimeEnd()
	{
			
		if (timerEnd) {
			
			frameEnd += dt;
			
			if (frameEnd >= 1 && !showAds) { showAds = true;

				if (android) { function.ShowAdsInter(); }
				if (android) { function.LoadAdsInter(); }

				if (platform.equals("html") && html && !poki) { ShowAds(); }
				//if (platform.equals("html") && html) { ShowAdsCG(); }
				//if (platform.equals("html") && html) { ShowAdsGD(); }
				//if (platform.equals("html") && html) { ShowAdsGM(); }
				//if (platform.equals("html") && html) { ShowAdsGP(); }
				if (platform.equals("html") && html && poki) { PokiShowAds(); }
				
			}

			if (frameEnd >= 2) {

				frameEnd = 0;
				timerEnd = false;
				showAds = false;

				btnClose.setVisible(true);
				lblClose.setVisible(true);

			}
			
		}
		
	}
	
	public void CountTimeHint()
	{
		
		if (curFrameHint >= 0.5) { 
			
			curFrameHint = 0;
		
			hintActive = false;
			
			objTile = masTiles.get(idHint);
			objTile.click = false;
			
			objTile2 = masTiles.get(idHint2);
			objTile2.click = false;
			
			SetTiles();
		
		}
		
	}	
	 
	public void CheckControls()
	{

		if (input.isKeyJustPressed(Keys.GRAVE)) {

			found = false;

			if (Lang.equals("en") && !found) { Lang = "ru"; found = true; Init(); }
			if (Lang.equals("ru") && !found) { Lang = "tr"; found = true; Init(); }
			if (Lang.equals("tr") && !found) { Lang = "en"; found = true; Init(); }

		}

		if (input.isKeyJustPressed(Keys.BACKSLASH)) { test = !test; }

		if (test) {

			if (input.isKeyJustPressed(Keys.NUMPAD_ADD)) {
				if (level < maxLevel) { level++; InitScreen(); }
			}

			if (input.isKeyJustPressed(Keys.NUMPAD_SUBTRACT)) {
				if (level > 1) { level--; InitScreen(); }
			}

			if (input.isKeyJustPressed(Keys.E)) { EndGame("win"); }
			if (input.isKeyJustPressed(Keys.R)) { InitScreen(); }

		}

		mouseX = input.getX() - camShiftX;
		mouseY = input.getY() - camShiftY;

		objMouse.x = mouseX;
		objMouse.y = mouseY;
				 	
		objMouse.xp = (int) ((objMouse.x - sx) / cellSize);
		objMouse.yp = (int) ((objMouse.y - sy) / cellSize);
		objMouse.cell = objMouse.yp * fw + objMouse.xp;
			
		if (!pause) { 
		 	
			if (input.justTouched()) { touched = true; }
				 	
			if (input.isTouched()) { 
					
				if (touched) { 
					
						
				    
				}
					
			} 
			
			else { 
				
				if (touched) { touched = false; }
					
			}
			
		}
		 
	}
	
	public void ShowSplash(String result)
	{
		
		if (soundPlay) { SoundSplash.play(); }
		
		grpSplash = new Group();
		
		pause = true;
		splash = true;
		
		img = new Image(imgSplash);
		img.setWidth(200 * ss);
		img.setHeight(160 * ss); 
		img.setX((W - img.getWidth()) / 2);
		img.setY((H - img.getHeight()) / 2);
		
		grpSplash.addActor(img);

	    lbl = new Label(StringScore + ": " + score, style);
	    lbl.setX(img.getX() + (img.getWidth() - lbl.getWidth()) / 2);
	    lbl.setY(img.getY() + img.getHeight() - 2.5f * lbl.getHeight());
	    lbl.setTouchable(Touchable.disabled);

	    grpSplash.addActor(lbl);

		rect = new TextureRegion(imgButtonBG, 0, 0, imgButtonBG.getWidth()/2, imgButtonBG.getHeight());
		rect2 = new TextureRegion(imgButtonBG, imgButtonBG.getWidth()/2, 0, imgButtonBG.getWidth()/2, imgButtonBG.getHeight());

		btnClose = new Image(rect);
		btnClose.setWidth(buttonWidth);
		btnClose.setHeight(buttonHeight);
		btnClose.setX(img.getX() + (img.getWidth() - btnClose.getWidth()) / 2);
		btnClose.setY(img.getY() + btnClose.getHeight());
		btnClose.setVisible(false);

		btnClose.addListener(

				new ClickListener(){

					public void clicked(InputEvent e, float x, float y) {

						str = e.getTarget().getName();

						if (soundPlay) { SoundMenuSelect.play(); }

						CloseSplash();

					}

				}

		);

		grpSplash.addActor(btnClose);

		lblClose = new Label(StringClose, styleSmall);
		lblClose.setX((btnClose.getX() + (btnClose.getWidth() - lblClose.getWidth()) / 2));
		lblClose.setY((btnClose.getY() + (btnClose.getHeight() - lblClose.getHeight()) / 2));
		lblClose.setTouchable(Touchable.disabled);
		lblClose.setVisible(false);

		grpSplash.addActor(lblClose);

		grpGame.addActor(grpSplash);
	    
	    if (android) { function.ShowAds(true); }
		
	}
	
	public void CloseSplash()
	{
		
		pause = false;
		splash = false;
		
		grpGame.removeActor(grpSplash);
		
		if (level < maxLevel) { level++; } else { status = "scores"; }	
		
		SaveInfo(); 
		SaveScores(); 
		
		if (android) { function.ShowAds(false); }
		
		InitScreen();
		
	}
	
	public void log(int input) { Gdx.app.log("", Integer.toString(input)); }
	public void log(float input) { Gdx.app.log("", Float.toString(input)); }
	public void log(String input) { Gdx.app.log("", input); }
	   
	public boolean touchDown(int x, int y, int pointer, int button) {
		
		if (stage.touchDown(x, y, pointer, button)) { 
				
				
				
		}
		
		if (stage2.touchDown(x, y, pointer, button)) { 
			
			
			
		}
			
		return false;
			      
	}
		
		public boolean touchUp (int x, int y, int pointer, int button) 
		{
        
			if (stage.touchUp(x, y, pointer, button)) {
				
	        }
			
			if (stage2.touchUp(x, y, pointer, button)) {
				
	        }
			
	        return false;
	        
		}

		public boolean touchDragged (int x, int y, int pointer) 
		{
			
			if (stage.touchDragged(x, y, pointer)) { 
				
				

			}
			
			if (stage2.touchDragged(x, y, pointer)) { 
				
				

			}
		        
		        return false;
		        
		}
		
		public boolean scrolled (int amount) 
		{
		        return false;
		}

	public void resize (int width, int height) 
	{

		batch.getProjectionMatrix().setToOrtho2D(0, 0, width, height);

		stageBG.getViewport().update(width, height, true);
		stage.getViewport().update(width, height, true);
		stage2.getViewport().update(width, height, true);
		
	}

	public void pause() {

		if (html) { GameStop(); }
		
	}

	public void resume() {

		if (html) { GameStart(); }

	}

	public boolean keyDown(int key) {
		
		if(key == Keys.BACK || key == Keys.ESCAPE){
			
			if (!status.equals("menu")) { ExitToMenu(); } else { Gdx.app.exit(); }
		    
	    }
		
		return false;
	}

	public boolean keyTyped(char arg0) {
		
		return false;
	}

	@Override
	public boolean pinch(Vector2 arg0, Vector2 arg1, Vector2 arg2, Vector2 arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean touchDown(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public boolean keyUp(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean zoom(float originalDistance, float currentDistance) 
	{
		
		if (status.equals("game")) { 
			
			if (currentDistance < originalDistance) { 
				
				if (zoom > 0.5f) { zoom /= 1.01f; cam.zoom = 1/zoom; }
				
			}
			
			else { 
				
				if (zoom < 3) { zoom *= 1.01f; cam.zoom = 1/zoom; }
				
			}
		
		}

	    return false;
		
	}

	@Override
	public boolean mouseMoved(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}

	@Override
	public boolean fling(float arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean longPress(float arg0, float arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean pan(float x, float y, float deltaX, float deltaY) 
	{
		
		if (status.equals("game")) { 

			if (deltaX > 0 && cam.position.x > 128 * ss) { cam.position.x -= deltaX * cam.zoom; }
			if (deltaX < 0 && cam.position.x < W - 128 * ss) { cam.position.x -= deltaX * cam.zoom; }

			if (deltaY > 0 && cam.position.y < H - 64 * ss) { cam.position.y += deltaY * cam.zoom; }
			if (deltaY < 0 && cam.position.y > 64 * ss) { cam.position.y += deltaY * cam.zoom; }

		}
		
		return false;
		
	}

	@Override
	public boolean panStop(float arg0, float arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tap(float arg0, float arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(float arg0, float arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pinchStop() {
		// TODO Auto-generated method stub
		
	}

	public static native void GetLang() /*-{ //$wnd.GetLang();
	@com.ulkaden.mahjonggame.Mahjong::lang = $wnd.lang;
	}-*/;

	public static native String getPortal() /*-{ return $wnd.portal || "generic"; }-*/;

	public static native void GameReady() /*-{ $wnd.GameReady(); }-*/;
	public static native void GameStart() /*-{ $wnd.GameStart(); }-*/;
	public static native void GameStop() /*-{ $wnd.GameStop(); }-*/;

	public static native void ShowAds() /*-{ $wnd.ShowAds(); }-*/;	
	public static native void ShowAdsCG() /*-{ $wnd.ShowAdsCG(); }-*/;
	public static native void ShowAdsGD() /*-{ $wnd.ShowAdsGD(); }-*/;
	public static native void ShowAdsGM() /*-{ $wnd.ShowAdsGM(); }-*/;
	public static native void ShowAdsGP() /*-{ $wnd.ShowAdsGP(); }-*/;

	public static native void PokiInit() /*-{ $wnd.PokiInit(); }-*/;
	public static native void PokiPlayStart() /*-{ $wnd.PokiPlayStart(); }-*/;
	public static native void PokiPlayStop() /*-{ $wnd.PokiPlayStop(); }-*/;
	public static native void PokiShowAds() /*-{ $wnd.PokiShowAds(); }-*/;
	public static native void PokiShowRewarded() /*-{ $wnd.PokiShowRewarded(); }-*/;

	//*
	public static native void ShowAdsRew() /*-{ $wnd.ShowAdsRew();

		var coins = @com.ulkaden.mahjonggame.Mahjong::coins;
		@com.ulkaden.mahjonggame.Mahjong::coins = coins + 1;

	 }-*/;
	//*/

}
