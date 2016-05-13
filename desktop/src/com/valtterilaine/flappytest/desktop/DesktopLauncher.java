package com.valtterilaine.flappytest.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.valtterilaine.flappytest.flappyTest;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = flappyTest.WIDTH;
		config.height = flappyTest.HEIGHT;
		config.title = flappyTest.TITLE;
		new LwjglApplication(new flappyTest(), config);
	}
}
