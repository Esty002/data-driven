package utils;

import java.io.InputStream;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadFile {
	
	public HashMap<String, Object> readYamlFile(String fileName) {
		Yaml yaml = new Yaml();
		InputStream inputStream = this.getClass()
		  .getClassLoader()
		  .getResourceAsStream(fileName);
		HashMap<String, Object> map = yaml.load(inputStream);
		return map;
	}
}
