package PropertyUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;

	public static void loadConfig(String fileName) {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\ADMIN\\eclipse-workspace\\Wattmonk_automation\\src\\main\\java\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			System.out.println("Could not load config file: " + e.getMessage());
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
