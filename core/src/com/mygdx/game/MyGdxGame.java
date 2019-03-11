package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.RunnableAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends Game {
	@Override
	public void create() {
		this.setScreen(new GameScreen(this,"OKE1"));

	}

	@Override
	public void render() {
		super.render();
	}
	//	SpriteBatch batch;
//	Texture img;
//	private Stage stage;
//
//	@Override
//	public void create () {
//
//		stage = new Stage(new ScreenViewport());
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
//
//
////		Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));
////
////		Image image1 = new Image(texture);
////		image1.setPosition(Gdx.graphics.getWidth()/3-image1.getWidth()/2,Gdx.graphics.getHeight()*2/3-image1.getHeight()/2);
////		stage.addActor(image1);
////
////		Image image2 = new Image(texture);
////		image2.setPosition(Gdx.graphics.getWidth()*2/3-image2.getWidth()/2,Gdx.graphics.getHeight()*2/3-image2.getHeight()/2);
////		image2.setOrigin(image2.getWidth()/2,image2.getHeight()/2);
////		image2.rotateBy(45);
////		stage.addActor(image2);
////
////		Image image3 = new Image(texture);
////		image3.setSize(texture.getWidth()/2,texture.getHeight()/2);
////		image3.setPosition(Gdx.graphics.getWidth()/3-image3.getWidth()/2,Gdx.graphics.getHeight()/3-image3.getHeight());
////		stage.addActor(image3);
////
////		texture.setWrap(Texture.TextureWrap.MirroredRepeat, Texture.TextureWrap.MirroredRepeat);
////		TextureRegion textureRegion = new TextureRegion(texture);
////		textureRegion.setRegion(0,0,texture.getWidth()*8,texture.getHeight()*4);
////		Image image4 = new Image(textureRegion);
////		image4.setSize(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
////		image4.setPosition(Gdx.graphics.getWidth()*2/3-image4.getWidth()/2,Gdx.graphics.getHeight()/3-image4.getHeight());
////		stage.addActor(image4);
//
//		Label.LabelStyle label1Style = new Label.LabelStyle();
//		BitmapFont myFont = new BitmapFont(Gdx.files.internal("myfont.fnt"));
//		label1Style.font = myFont;
////		label1Style.font=
//		label1Style.fontColor = Color.RED;
//
//		int row_height = Gdx.graphics.getWidth() / 12;
//		int col_width = Gdx.graphics.getWidth() / 12;
//
////		Label label1 = new Label("Title (BitmapFont)");
//		Label label1 = new Label("OKE",label1Style);
//		label1.setSize(Gdx.graphics.getWidth(),row_height);
//		label1.setPosition(0,Gdx.graphics.getHeight()*0.5f);
//		label1.setAlignment(Align.bottom);
//		stage.addActor(label1);
//		label1.addAction(Actions.moveTo(0,0, 1));
//	}
//
//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 1, 1, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//		stage.act();
//		stage.draw();
//
//
//
//	}
//
//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
//private Stage stage;
//	private static int lapsCount;
//	private Label lapsLabel;
//	private Group lapsLabelContainer;
//
//	@Override
//	public void create () {
//
//		lapsCount = 3;
//		stage = new Stage(new ScreenViewport());
////		Skin skin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
//
//		Texture texture = new Texture(Gdx.files.absolute("badlogic.jpg"));
//
//		int X_left = Gdx.graphics.getWidth() / 3 - texture.getWidth() / 2;
//		int X_right = Gdx.graphics.getWidth() * 2 / 3 - texture.getWidth() / 2;
//		int Y_top = Gdx.graphics.getHeight() * 2 / 3 - texture.getHeight() / 2;
//		int Y_bottom = Gdx.graphics.getHeight() / 3 - texture.getHeight() / 2;
//
//		final Image image1 = new Image(texture);
//		image1.setPosition(X_left, Y_top);
//		image1.setOrigin(image1.getWidth() / 2, image1.getHeight() / 2);
//		stage.addActor(image1);
//
//		ParallelAction topLeftRightParallelAction = new ParallelAction();
//		topLeftRightParallelAction.addAction(Actions.moveTo(X_right, Y_top, 1, Interpolation.exp5Out));
//		topLeftRightParallelAction.addAction(Actions.scaleTo(2, 2, 1, Interpolation.exp5Out));
//
//		MoveToAction moveBottomRightAction = new MoveToAction();
//		moveBottomRightAction.setPosition(X_right, Y_bottom);
//		moveBottomRightAction.setDuration(1);
//		moveBottomRightAction.setInterpolation(Interpolation.smooth);
//
//		RunnableAction updateLapCountAction = new RunnableAction();
//		updateLapCountAction.setRunnable(new Runnable() {
//			@Override
//			public void run () {
//				updateLapsCount();
//			}
//		});
//
//		ParallelAction bottomLeftRightParallelAction = new ParallelAction();
//		bottomLeftRightParallelAction.addAction(Actions.moveTo(X_left, Y_bottom, 1, Interpolation.sineOut));
//		bottomLeftRightParallelAction.addAction(Actions.scaleTo(1, 1, 1));
//
//		ParallelAction leftBottomTopParallelAction = new ParallelAction();
//		leftBottomTopParallelAction.addAction(Actions.moveTo(X_left, Y_top, 1, Interpolation.swingOut));
//		leftBottomTopParallelAction.addAction(Actions.rotateBy(45, 1));
//
//		SequenceAction overallSequence = new SequenceAction();
//		overallSequence.addAction(updateLapCountAction);
//		overallSequence.addAction(topLeftRightParallelAction);
//		overallSequence.addAction(moveBottomRightAction);
//		overallSequence.addAction(bottomLeftRightParallelAction);
//		overallSequence.addAction(leftBottomTopParallelAction);
//
//		final RepeatAction loopNbrAction = new RepeatAction();
//		loopNbrAction.setCount(lapsCount);
//		loopNbrAction.setAction(overallSequence);
//
//		Label.LabelStyle label1Style = new Label.LabelStyle();
//		BitmapFont myFont = new BitmapFont(Gdx.files.internal("myfont.fnt"));
//		label1Style.font = myFont;
////		label1Style.font=
//		label1Style.fontColor = Color.RED;
//
//		lapsLabel = new Label("LLOOPP",label1Style);
//		lapsLabel.setPosition(0, 0);
//		lapsLabel.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//		lapsLabel.setAlignment(Align.center);
//
//		lapsLabelContainer = new Group();
//		lapsLabelContainer.addActor(lapsLabel);
//		lapsLabelContainer.setOrigin(lapsLabel.getWidth() / 2, lapsLabel.getHeight() / 2);
//
//		stage.addActor(lapsLabelContainer);
//
//		final RunnableAction completedAction = new RunnableAction();
//		completedAction.setRunnable(new Runnable() {
//			@Override
//			public void run () {
//				finished();
//			}
//		});
//
//		stage.addListener(new InputListener(){
//			@Override
//			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
//
////				image1.addAction(Actions.sequence(loopNbrAction, completedAction));
//
//				setScreen(new GameScreen());
////				stage.dispose();
//				return true;
//			};
//		});
//		Gdx.input.setInputProcessor(stage);
//
//	}
//
//	private void updateLapsCount () {
//		lapsCount--;
//		lapsLabelContainer.setScale(0);
//		SequenceAction FadingSequenceAction = new SequenceAction();
//		FadingSequenceAction.addAction(Actions.fadeIn(1));
//
//		ParallelAction parallelAction = new ParallelAction();
//
//		lapsLabel.setText(" Laps : " + (lapsCount + 1));
//		FadingSequenceAction.addAction(Actions.fadeOut(2));
//		parallelAction.addAction(Actions.scaleBy(5, 5, 4));
//
//		parallelAction.addAction(FadingSequenceAction);
//		lapsLabelContainer.addAction(parallelAction);
//	}
//
//	private void finished () {
//		lapsLabelContainer.setScale(0);
//		SequenceAction FadingSequenceAction = new SequenceAction();
//		FadingSequenceAction.addAction(Actions.fadeIn(1));
//
//		ParallelAction parallelAction = new ParallelAction();
//
//		lapsLabel.setText(" Finished!");
//// FadingSequenceAction.addAction(Actions.fadeOut(10));
//		parallelAction.addAction(Actions.rotateBy(360, 2));
//		parallelAction.addAction(Actions.scaleBy((float)1.2, (float)1.2, 3, Interpolation.bounce));
//
//		parallelAction.addAction(FadingSequenceAction);
//		lapsLabelContainer.addAction(parallelAction);
//	}
//
//	@Override
//	public void render () {
//		super.render();
//		Gdx.gl.glClearColor(1, 1, 1, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		stage.act();
//		stage.draw();
//
//	}
}
