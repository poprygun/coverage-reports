package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Properties;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(load(new File("/Users/ashumilov/Downloads/demo 11/src/main/resources/application.properties")));
//		try {
//			System.out.println(System.getProperty("foo"));
//			loadResource("/application.properties");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public static Properties load(File file) throws IOException {
		try (FileInputStream fis = new FileInputStream(file))
		{
			Properties props = new Properties();
			props.load(fis);
			return props;
		}
	}



	public static Properties loadResource(String resource) throws IOException
	{
		ClassLoader cl = Thread.currentThread().getContextClassLoader();

		Properties props = new Properties();
		try (InputStream is = cl.getResourceAsStream(resource))
		{
			if (is != null)
			{
				props.load(is);
			}
			else
			{
				System.out.println(resource + " file could not be found.");
			}
		}
		catch (IOException x)
		{
			System.out.println("Failed reading properties resource " + resource);
			throw x;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Failed loading properties resource " + resource);
		}
		return props;
	}
}
