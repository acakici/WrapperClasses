package propertypractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoaderLogin {
	
	static Properties pro;
	
	static {
		pro=new Properties();
		try {
			FileInputStream fl= new FileInputStream("config.properties");
			pro.load(fl);
			
		} catch (IOException e) {
		
			
			e.printStackTrace();
		}
	}
		public static String getMyValue(String key) {
			
			return pro.getProperty(key);
			
			
		}
		
		

	}


