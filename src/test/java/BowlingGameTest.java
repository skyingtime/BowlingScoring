import com.BowlingGame;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yangliu on 17/01/2017.
 */
public class BowlingGameTest {

    @Test
    public void BowlingScoreNoSpareNoStrikeTest() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        Assert.assertEquals(50, bowlingGame.score());
    }

    @Test
    public void BowlingScoreWithSpareTest() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(5);
        bowlingGame.roll(5);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        Assert.assertEquals(60, bowlingGame.score());
    }

    @Test
    public void BowlingScoreWithStrikeTest() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(10);
        bowlingGame.roll(0);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(10);
        bowlingGame.roll(0);

        bowlingGame.roll(10);
        bowlingGame.roll(0);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        Assert.assertEquals(86, bowlingGame.score());
    }

    @Test
    public void BowlingScoreWithStrikeAtEndTest() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(10);
        bowlingGame.roll(0);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(1);
        bowlingGame.roll(2);

        bowlingGame.roll(10);
        bowlingGame.roll(0);

        bowlingGame.roll(3);
        bowlingGame.roll(4);

        bowlingGame.roll(10);
        bowlingGame.roll(0);

        bowlingGame.roll(10);
        bowlingGame.roll(10);

        Assert.assertEquals(93, bowlingGame.score());
    }
}
