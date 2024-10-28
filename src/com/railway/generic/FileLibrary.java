package com.railway.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLibrary {

	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./input/RailwayData.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}
