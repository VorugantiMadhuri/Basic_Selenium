package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		// Step 1:Convert Physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
		
		//Step 2:Create an instance of properties class
		Properties property=new Properties();
		
		//step 3:Load all key-value pairs from fis property
		property.load(fis);
		
		//step 4:Read data from properties
		String browser=property.getProperty("browser");
		System.out.println(browser);
		
		String time=property.getProperty("time");
		System.out.println(time);
		
		

	}

}
