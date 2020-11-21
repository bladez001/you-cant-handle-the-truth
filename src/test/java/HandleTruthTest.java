import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount();
    }

    @Test
    public void realTest() {
        TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount();
    }
}