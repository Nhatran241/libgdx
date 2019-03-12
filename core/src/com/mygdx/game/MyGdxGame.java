package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Stage stage;
	
	@Override
	public void create () {

		stage = new Stage(new ScreenViewport());
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");


//		Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));
//
//		Image image1 = new Image(texture);
//		image1.setPosition(Gdx.graphics.getWidth()/3-image1.getWidth()/2,Gdx.graphics.getHeight()*2/3-image1.getHeight()/2);
//		stage.addActor(image1);
//
//		Image image2 = new Image(texture);
//		image2.setPosition(Gdx.graphics.getWidth()*2/3-image2.getWidth()/2,Gdx.graphics.getHeight()*2/3-image2.getHeight()/2);
//		image2.setOrigin(image2.getWidth()/2,image2.getHeight()/2);
//		image2.rotateBy(45);
//		stage.addActor(image2);
//
//		Image image3 = new Image(texture);
//		image3.setSize(texture.getWidth()/2,texture.getHeight()/2);
//		image3.setPosition(Gdx.graphics.getWidth()/3-image3.getWidth()/2,Gdx.graphics.getHeight()/3-image3.getHeight());
//		stage.addActor(image3);
//
//		texture.setWrap(Texture.TextureWrap.MirroredRepeat, Texture.TextureWrap.MirroredRepeat);
//		TextureRegion textureRegion = new TextureRegion(texture);
//		textureRegion.setRegion(0,0,texture.getWidth()*8,texture.getHeight()*4);
//		Image image4 = new Image(textureRegion);
//		image4.setSize(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
//		image4.setPosition(Gdx.graphics.getWidth()*2/3-image4.getWidth()/2,Gdx.graphics.getHeight()/3-image4.getHeight());
//		stage.addActor(image4);

		Label.LabelStyle label1Style = new Label.LabelStyle();
		BitmapFont myFont = new BitmapFont(Gdx.files.internal("myfont.fnt"));
		label1Style.font = myFont;
//		label1Style.font=
		label1Style.fontColor = Color.RED;

		int row_height = Gdx.graphics.getWidth() / 12;
		int col_width = Gdx.graphics.getWidth() / 12;

//		Label label1 = new Label("Title (BitmapFont)");
		Label label1 = new Label("OKE",label1Style);
		label1.setSize(Gdx.graphics.getWidth(),row_height);
		label1.setPosition(0,Gdx.graphics.getHeight()-row_height*2);
		label1.setAlignment(Align.center);
		stage.addActor(label1);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act();
		stage.draw();



	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
