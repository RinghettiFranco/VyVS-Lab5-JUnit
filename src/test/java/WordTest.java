
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    private Word word = new Word();

    @Test
    public void concatenateTest(){
        String result = word.concatenate("ho","la");
        assertEquals("hola",result);
    }

    @Test
    public void subStringFromTest(){
        String result = word.subStringFrom(1,"hola");
        assertEquals("ola",result);
    }

    @Test
    public void evenWordPairityTest(){
        String result = word.wordPairity("hola");
        assertEquals("Par",result);
    }

    @Test
    public void oddWordPairityTest(){
        String result = word.wordPairity("holanda");
        assertEquals("Impar",result);
    }

    @Test
    public void upperCasedWordAllCapsTest(){
        assertTrue(word.allCaps("HOLA"));
    }

    @Test
    public void lowerCasedWordAllCapsTest(){
        assertFalse(word.allCaps("hola"));
    }

    @Test
    public void mixedCasedWordAllCapsTest(){
        assertFalse(word.allCaps("HoLa"));
    }
}
