package com.adacitin.helper;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
		
	}
public static ConfigReader getcr() throws IOException {
	ConfigReader cr = new ConfigReader();
	return cr;
	
}
public static FileReaderManager getmanager() {
	FileReaderManager frm = new FileReaderManager();
	return frm;
	
}
}
