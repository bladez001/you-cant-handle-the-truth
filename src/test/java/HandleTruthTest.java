import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String msg = "son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to";
        HandleTruth.wordCount(msg);
    }

    @Test
    public void realTest() {
        String[] msg = {
                "Hello I am the mail man",
                "Luke I am your father",
                "hello there hello how are you hello",
                "this is this and that is that",
                "no no no just no",
                "drift drift drift drift drift",
                "one two two two three two four two",
        };
        List<TreeMap<Integer, Set<String>>> testCases = getTestCases();

        for (int i = 0; i < testCases.size(); i++) {
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(msg[i]);
            TreeMap<Integer, Set<String>> expected = testCases.get(i);
            assertEquals(expected, actual);
        }
    }
    private static List<TreeMap<Integer, Set<String>>> getTestCases() {
        List<TreeMap<Integer, Set<String>>> testCases = new ArrayList<>();
        return testCases;
    }
}