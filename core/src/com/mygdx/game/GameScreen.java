package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GameScreen implements Screen {
    private Stage stage;
    private Game game;
    private String a;
    public GameScreen(final Game game, String a){
        this.game =game;
        this.a=a;

//        Gdx.gl.glClearColor(1, 0, 0, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage = new Stage(new ScreenViewport());
//
//        stage.act();
//        stage.draw();
        Label.LabelStyle label1Style = new Label.LabelStyle();
		BitmapFont myFont = new BitmapFont(Gdx.files.internal("myfont.fnt"));
		label1Style.font = myFont;
////		label1Style.font=
		label1Style.fontColor = Color.RED;
        Label title = new Label(a,label1Style);
        title.setAlignment(Align.center);
        title.setY(Gdx.graphics.getHeight()*2/3);
        title.setWidth(Gdx.graphics.getWidth());
        stage.addActor(title);
        stage.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new GameScreen(game,"OKE2"));
                dispose();
                return super.touchDown(event, x, y, pointer, button);
            }
        });

    }

    @Override
    public void show() {

        Gdx.app.log("MainScreen","show"+a);
        Gdx.input.setInputProcessor(stage);

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

        Gdx.app.log("MainScreen","dispose"+a);
    }
}
