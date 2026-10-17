package com.ulkaden.mahjonggame;

import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
 
public class GameObject {
	
	Animation ani;
	Actor actor;
	Image img;
	Sprite spr;
	TextureRegion keyframe;
	
	int id;
	int xp;
	int yp;
	int cell;
	int type;
	int dx;
	int dy;
	int countActive;
	int frame;
	int frames;
	int score;
	int number;
	int direction;
	int layer;
	int tile;
	
	float x;
	float y;
	float xStart;
	float yStart;
	float size;
	float width;
	float height;
	float speed;
	float angle;
	float dec;
	float slowdown;
	float mx;
	float my;
	
	boolean active;
	boolean start;
	boolean move;
	boolean checkDelete;
	boolean found;
	boolean pressed;
	boolean remove;
	boolean click;
	boolean visible;
	
	String name;
	String dir;
	String textPlace;
	String textUser;
	String textScores;
	   
	public GameObject()
	{
		
	     
	      
	}

}
