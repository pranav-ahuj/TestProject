package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
public class Question1 {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://now.gg/apps/perfect-world/7724/perfect-world-mobile.html");
	System.out.println("Navigated to URL");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//button[@lang='en'])[2]")).click();
	System.out.println("Clicked on Play in Browser");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
	String TestFile = "D:\\temp.txt";
	  File FC = new File(TestFile);
	  FC.createNewFile();
	  System.out.println("New file is created");
	  FileWriter FW = new FileWriter(TestFile);
	  BufferedWriter BW = new BufferedWriter(FW);
	  BW.write("This is data related to the Game Control Window."); 
	  Thread.sleep(5000);
	  BW.newLine();
	  String str1 = driver.findElement(By.xpath("//div[@class='sidebar-wrap']")).getText();
	  BW.write(str1);
	  BW.close();
	  System.out.println("Text written to file, Test case passed");
	  
}
}