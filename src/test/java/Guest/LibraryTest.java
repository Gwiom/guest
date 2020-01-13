/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Guest;

import org.junit.Test;

import Guest.Library;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testAlphabetSoup() {
        Library classUnderTest = new Library();
		String buf = "coderbyte";        
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.AlphabetSoup2(buf).equals("bcdeeorty"));
		buf = "love";
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.AlphabetSoup2(buf).equals("elov"));
		buf = "yoop";
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.AlphabetSoup2(buf).equals("oopy"));
    }    
    @Test public void testAlphabetSoup2() {
        Library classUnderTest = new Library();
		String buf = "coderbyte";        
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.AlphabetSoup2(buf).equals("bcdeeorty"));
		buf = "love";
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.AlphabetSoup2(buf).equals("elov"));
		buf = "yoop";
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.AlphabetSoup2(buf).equals("oopy"));
    }
    
    @Test public void testLongestWord() {
        Library classUnderTest = new Library();
		assertTrue(" should return 'true'", classUnderTest.LongestWord(null).equals(""));
		String buf = "checking the longest word there is!";
		assertTrue(" should return 'true'", classUnderTest.LongestWord(buf).equals("checking"));
		buf = "";
		assertTrue(" should return 'true'", classUnderTest.LongestWord(buf).equals(""));
		buf = "one twoo three fouuur five";
		assertTrue(" should return 'true'", classUnderTest.LongestWord(buf).equals("fouuur"));
		buf = "one twoo three fouuur";
		assertTrue(" should return 'true'", classUnderTest.LongestWord(buf).equals("fouuur"));
    }

    
    @Test public void testLongestWord2() {
        Library classUnderTest = new Library();
		assertTrue(" should return 'true'", classUnderTest.LongestWord2(null).equals(""));
		String buf = "checking the longest word there is!";
		assertTrue(" should return 'true'", classUnderTest.LongestWord2(buf).equals("checking"));
		buf = "";
		assertTrue(" should return 'true'", classUnderTest.LongestWord2(buf).equals(""));
		buf = "one twoo three fouuur five";
		assertTrue(" should return 'true'", classUnderTest.LongestWord2(buf).equals("fouuur"));
		buf = "one twoo three fouuur";
		assertTrue(" should return 'true'", classUnderTest.LongestWord2(buf).equals("fouuur"));
    }
}
