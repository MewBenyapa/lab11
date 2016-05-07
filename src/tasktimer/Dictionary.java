package tasktimer;

/**
 * Get information from worklist.txt
 */

import java.io.InputStream;

public class Dictionary {
	
	
	/**
	 * Create an attribute
	 */
	 private static String DICTIONARY = "wordlist.txt";
	
	 
	 /**
	  * 
	  * @return return instream
	  */
	public static InputStream getWordsAsStream() {
		InputStream instream = Dictionary.class.getClassLoader().getResourceAsStream(DICTIONARY);
		return instream;
	}

}
