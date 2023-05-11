package io.github.fourlastor.game.intro;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import javax.inject.Inject;

public class IntroScreen extends ScreenAdapter {

    public static final Color CLEAR_COLOR = Color.valueOf("000000");

    private final Stage stage;
    private final Viewport viewport;

    @Inject
    public IntroScreen() {
        viewport = new FitViewport(256, 144);
        stage = new Stage(viewport);
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(CLEAR_COLOR, true);
        stage.act(delta);
        stage.draw();
    }
}
