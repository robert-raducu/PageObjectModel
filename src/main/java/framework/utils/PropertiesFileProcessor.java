package framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	
	public static String readPropertiesFile(String key, String file) {
		try(InputStream inputStream = new FileInputStream(file)){
			Properties propFile = new Properties();
			propFile.load(inputStream);
			
			return propFile.getProperty(key);
			
		}catch(IOException e) {
			System.out.println("Cannot read properties file");
		}
		return key;
	}

}
