package io.github.fourlastor.game.level;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import javax.inject.Inject;

public class LevelScreen extends ScreenAdapter {

    private final Viewport viewport;

    @Inject
    public LevelScreen() {
        viewport = new FitViewport(16, 9);
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void render(float delta) {
        // game logic!
    }
}
