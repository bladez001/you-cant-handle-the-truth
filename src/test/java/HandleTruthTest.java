import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String msg = "in the beginning was the Word and the Word was with God and the Word was God";

        //"son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to";
        HandleTruth.wordCount(msg);
    }

    @Test
    public void realTest() {
        String[] msg = {
                "Hello I am the mail man",
                "therefore I say to you whatever things you ask when you pray believe that you receive them and you will have them",
                "in the beginning was the Word and the Word was with God and the Word was God",
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
        
        //Test case 1
        TreeMap<Integer, Set<String>> expected1 = new TreeMap<>();
        expected1.put(1, new HashSet<>(Arrays.asList("Hello", "I", "am", "the", "mail", "man")));
        testCases.add(expected1);

        //Test case 2
        TreeMap<Integer, Set<String>> expected2 = new TreeMap<>();
        expected2.put(5, new HashSet<>(Arrays.asList("you")));
        expected2.put(2, new HashSet<>(Arrays.asList("them")));
        expected2.put(1, new HashSet<>(Arrays.asList("receive", "will", "I", "say", "believe", "when", "whatever", "pray", "that", "and", "things", "ask", "have", "therefore", "to")));
        testCases.add(expected2);

        return testCases;
    }
}