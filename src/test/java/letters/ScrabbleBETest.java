package letters;

import org.junit.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleBETest {
    @Test
    public void calculateScore_returnScoreForSingleLetter_1() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 1;
        assertEquals(expected, testScarabble.calculateScore("a"));
    }
    @Test
    public void calculateScore_returnScoreForSingleLetter_e() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 2;
        assertEquals(expected, testScarabble.calculateScore("ae"));
    }
}