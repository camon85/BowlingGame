package test.java.bowling;

import main.java.bowling.Game;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2014-10-20.
 */
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
}
