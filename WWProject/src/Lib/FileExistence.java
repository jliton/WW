package Lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class FileExistence
{
	private static  FileInputStream fs;

	public static  WebDriver driver;
	public static Properties Data;


	//File_Path
	public static void doesFileExist(String Path) {
	
		if(Path.equalsIgnoreCase("Path"))
		{
			try {
				fs = new FileInputStream(System.getProperty("user.dir") + "\\File.properties");
				System.out.println("doesFileExist = Yes");
				

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Data = new Properties();
			
			try {
				Data.load(fs);
			    

			
				System.out.println(" File  Details ="+ String.valueOf(Data));
			} catch (IOException e) {
			
				e.printStackTrace();
			
			}

		}
		
		

	}
}
	

