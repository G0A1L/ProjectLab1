package Test;

import com.ua.PI201.Matyukhin.PalindromeFinder;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeFinderTest {

    @org.junit.jupiter.api.Test
    void palindromeIsDoing() {
        PalindromeFinder testing=new PalindromeFinder("Дед наказал меня");
        String expected= testing.palindromeIsDoing();
        String actual="дед";
        assertEquals(expected, actual);
    }
}