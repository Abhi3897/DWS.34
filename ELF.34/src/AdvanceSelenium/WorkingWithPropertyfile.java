package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingWithPropertyfile {
public static String readProperties(String key) throws IOException {
	
	FileInputStream fis=new FileInputStream("./TestData/config.properties");
	Properties property=new Properties();
	property.load(fis);
	return property.getProperty(key);
}
}
