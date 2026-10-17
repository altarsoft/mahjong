package com.ulkaden.mahjonggame.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ulkaden.mahjonggame.Functions;
import com.ulkaden.mahjonggame.Mahjong;

public class DesktopLauncher {
	
	public static void main (String[] arg) {
		
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	     
		int W;
		int H;
		 
		//W = 480; H = 320;
		W = 800; H = 480;
		//W = 800; H = 600;
		W = 1280; H = 720;
		//W = 1920; H = 1080;
		
		cfg.title = "Mahjong";
		cfg.addIcon("icon.png", Files.FileType.Internal);
		//cfg.useGL20 = true;
		cfg.width = W;
		cfg.height = H;

		/*
		System.setProperty("org.lwjgl.opengl.Window.undecorated", "true");

		cfg.fullscreen = true;
		cfg.width = LwjglApplicationConfiguration.getDesktopDisplayMode().width;
		cfg.height = LwjglApplicationConfiguration.getDesktopDisplayMode().height;
		//*/
		  
		final Functions function = null;
		
		new LwjglApplication(new Mahjong((Functions) function), cfg);
	
	}
	
}
