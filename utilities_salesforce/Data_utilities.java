package utilities_salesforce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import configs.TestConstants;

public class Data_utilities {
	FileInputStream file;
	public String ReadAccounts(String provideKey ) {
	
			Properties prop = new Properties();
		
		try {
			 file = new FileInputStream(TestConstants.Accountpropertiespath);
				
				  try { 
					  prop.load(file);
					  }
				  catch (IOException e) {
					  e.printStackTrace();
					  }
				 
		} 
		
		catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
			return prop.getProperty(provideKey);

}
	public String ReadPath(String sclassname) {

		Properties prop = new Properties();
	
	try {
		 file = new FileInputStream(TestConstants.Reportpath+ sclassname +".html");
		
		  try {
			  prop.load(file); 
			  } 
		  catch (IOException e) {
			  e.printStackTrace(); 
			  }
		 
	} 
	

  catch (FileNotFoundException e) {
  
  e.printStackTrace(); }
 
	
		return prop.getProperty(sclassname);

	}
}
