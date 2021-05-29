package com.adacitin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties ps;
	public ConfigReader() throws IOException {
		File fi = new File("src\\test\\java\\com\\cucumber\\properties\\ConfigurationProperties");
		FileInputStream fis = new FileInputStream(fi);
		ps = new Properties();
		ps.load(fis);
	}
	 public String getbrowser() {
		 String br = ps.getProperty("browser");
		 return br;
	 }
   public String geturl() {
	   String url = ps.getProperty("url");
	   return url;
   }
}
