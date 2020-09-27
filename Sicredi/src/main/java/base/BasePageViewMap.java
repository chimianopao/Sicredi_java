/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *
 * @author Theilor
 */
public class BasePageViewMap extends Driver{
	public BasePageViewMap(){ }
	
	protected WebElement WaitForVisibilityOfElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

    protected WebElement GetWebElementById(String id)
    {
        return driver.findElement(By.id(id));
    }

    protected WebElement GetWebElementByXPath(String xPath)
    {
        return driver.findElement(By.xpath(xPath));
    }
    
    protected WebElement GetWebElementByClassName(String className)
    {
        return driver.findElement(By.className(className));
    }
}
