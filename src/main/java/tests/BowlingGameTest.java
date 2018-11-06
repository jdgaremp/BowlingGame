package main.java.tests;
import junit.framework.TestCase;
import main.java.ressources.Game;

public class BowlingGameTest extends TestCase {
    private Game g;

    protected void setUp() throws Exception {
        g = new Game();
    }
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    public void testGutterGame() throws Exception {
        int finalScoreExpected = 0;

        rollMany(20,0);

        assertEquals(finalScoreExpected, g.score());
    }

    public void testAllOnes() throws Exception {
        int finalScoreExpected = 20;

        rollMany(20,1);

        assertEquals(finalScoreExpected,g.score());
    }

    public void testOneSpare() throws Exception {
        int finalScoreExpected = 16;

        g.roll(5);
        g.roll(5); // spare
        g.roll(3);
        rollMany(17,0);

        assertEquals(finalScoreExpected,g.score());
    }

    public void testOneStrike() throws Exception {
        int finalScoreExpected=26;

        g.roll(10); // strike
        g.roll(5);
        g.roll(3);
        rollMany(17,0);

        assertEquals(finalScoreExpected,g.score());
    }


}
