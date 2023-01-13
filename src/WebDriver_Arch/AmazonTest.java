package WebDriver_Arch;

public class AmazonTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//ChromeDriver driver= new ChromeDriver();
		
		String browser= "firefox";
	
		/*if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("safari")) {
			driver= new SafariDriver();
		}
		else 
			System.out.println("Browser not availble please check");
		*/
		
		//Switch case
		
		switch(browser.toLowerCase()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
			
		case "firefox":
			driver= new FirefoxDriver();
			break;
			
		case "Safari":
			driver= new SafariDriver();
			break;
			
		default:
			System.out.println("please check the browser"+ browser);
			break;
		
		}
		
		driver.getUrl("https://www.amazon.com");
		
		driver.findElement();
		driver.finedElements();
		driver.sendkeys("test@gmail.com", "test@123");
		driver.click("login");
		driver.getText("welcome test");
		driver.quit();
		

	}

}
