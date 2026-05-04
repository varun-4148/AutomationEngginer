package genericutlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromPrperty(String key) throws IOException {
	FileInputStream fis = new FileInputStream("");
	Properties prop = new Properties();
	prop.load(fis);
	
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String pass = prop.getProperty("password");
	String Hightolow = prop.getProperty("Hightolow");
	return prop.getProperty(key);
	
	}
	
	
	
	
}
