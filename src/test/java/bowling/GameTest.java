package test.java.bowling;

import main.java.bowling.Game;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void canRoll() throws Exception {
        game.roll(0);
    }

    @Test
    public void gutterGame() throws Exception {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        assertThat(game.getScore(), is(0));
    }

    @Test
    public void allOnes() throws Exception {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }

        assertThat(game.getScore(), is(20));
    }
}
