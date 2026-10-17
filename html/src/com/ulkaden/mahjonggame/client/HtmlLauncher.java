package com.ulkaden.mahjonggame.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.ulkaden.mahjonggame.Functions;
import com.ulkaden.mahjonggame.Mahjong;

public class HtmlLauncher extends GwtApplication
{

        GwtApplicationConfiguration cfg;

        @Override
        public GwtApplicationConfiguration getConfig () {

                cfg = new GwtApplicationConfiguration(true);
                //cfg =  new GwtApplicationConfiguration(1280, 720);

                cfg.padHorizontal = 0;
                cfg.padVertical = 0;

                return cfg;

        }

        @Override
        public ApplicationListener createApplicationListener () {

                final Functions function = null;

                //Window.Location.getHostName();

                return new Mahjong(function);

        }

}