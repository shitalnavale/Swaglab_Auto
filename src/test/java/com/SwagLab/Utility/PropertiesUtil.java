package com.SwagLab.Utility;
 import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

	public class PropertiesUtil
	{ 
		//private WebDriver driver;
		public Properties p1;

		public PropertiesUtil()
		{
			//this.driver=driver;  
			p1=new Properties();
			 //file path
			  File f1=new File(System.getProperty("user.dir")+"//config//config.properties");
			  
			  //Read a file in a Stream
			  FileInputStream fs;
			try {
				fs = new FileInputStream(f1);
				//load the file data
				  p1.load(fs);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  	  
			  
			  
			  
		}
		
		
		
		public String getData(String key)
		{
			return p1.getProperty(key);
		}
	}


