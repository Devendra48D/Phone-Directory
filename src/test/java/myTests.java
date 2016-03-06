/**
 * 
 */
package test.java;
import java.io.IOException;

import main.java.PhoneDirectory;

/**
 * @author devendra
 *
 */
public class myTests {
	public static void main (String[] args) throws IOException{ 
		
		PhoneDirectory directory = new PhoneDirectory();
		directory.addEntry("Devendra", "2027306608");
		directory.addEntry("Samman", "5622932435");
		directory.addEntry("Anik", "2032342239");
		directory.addEntry("Tom", "72351");
		String myNum = directory.getNumber("Devendra");
		String an = directory.getNumber("Anik");
		directory.addEntry("Harry", "21241231435");
		System.out.println(myNum);
		System.out.println(an);
		directory.deleteEntry("Tom");
		directory.changeEntry("Samman", "7jb8id999s");
		directory.addEntry("Manish", "9813788852");
		directory.addEntry("Jaya", "9841215686");
		directory.deleteEntry("Harry");
		System.out.println(directory.getNumber("Manish"));
				
		
	}
}

