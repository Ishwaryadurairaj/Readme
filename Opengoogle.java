
public class Opengoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver_99.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		System.out.println("welcome");
		driver.quit();
	}

}
