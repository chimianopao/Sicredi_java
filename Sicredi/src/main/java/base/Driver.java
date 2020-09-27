/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Theilor
 */
public class Driver {
    public static WebDriver driver;
	
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/";
		driver.navigate().to(site);
	}
	
	public void stopDriver() {
		driver.quit();
	}
	
	public static void waitForLoad() throws InterruptedException {
		Thread.sleep(3000);
	}
}
