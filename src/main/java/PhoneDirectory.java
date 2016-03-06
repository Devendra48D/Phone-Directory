package main.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * 
 */

/**
 * @author devendra
 *
 */
public class PhoneDirectory {
	String num;
	/**
	 * @param name Name to be recorded
	 * @param number Phone number to be recorded
	 */
	public void addEntry(String name, String number) throws IOException{
		Properties contact = new Properties();
		OutputStream output = new FileOutputStream("src/main/resources/phone.properties", true); 

		contact.setProperty(name, number);
		contact.store(output, null);
		output.close();
		
	}
	
	/**
	 * @param name Name to be recorded
	 * @param number Phone number to be changed
	 */
	
    public void changeEntry(String name, String number) throws IOException{
		
		Properties contact = new Properties();
		InputStream input = new FileInputStream("src/main/resources/phone.properties");
		contact.load(input);
		contact.setProperty(name, number);
		input.close();
		OutputStream output = new FileOutputStream("src/main/resources/phone.properties"); 
		contact.store(output, null);
		output.close();
		
		
	}
    /**
	 * @param name Name of the contact whose number is to be deleted
	 */
    public void deleteEntry(String name) throws IOException{
	
	    Properties contact = new Properties();
	    InputStream input = new FileInputStream("src/main/resources/phone.properties");
	    contact.load(input);
	    contact.remove(name);
	    input.close();
	    OutputStream output = new FileOutputStream("src/main/resources/phone.properties"); 
	    contact.store(output, null);
	    output.close();
	
    }
    /**
	 * @param name Name of the contact whose number is to be returned
	 * @return num Phone number of the contact
	 */
    public String getNumber(String name) throws IOException{
		
		Properties contact = new Properties();
		InputStream input = new FileInputStream("src/main/resources/phone.properties");
		contact.load(input);
		num = contact.getProperty(name);
		input.close();
		return num;
		
		
	}

}
