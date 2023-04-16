package io.github.fourlastor.game.level.di;

import com.badlogic.gdx.ai.msg.MessageDispatcher;
import dagger.Module;
import dagger.Provides;
import io.github.fourlastor.game.di.ScreenScoped;

@Module
public class LevelModule {

    @Provides
    @ScreenScoped
    public MessageDispatcher messageDispatcher() {
        return new MessageDispatcher();
    }
}
