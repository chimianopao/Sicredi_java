/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewMaps;

import org.openqa.selenium.WebElement;

import Base.BasePageViewMap;

/**
 *
 * @author Theilor
 */
public class SimuladorInvestimentoPoupancaViewMap extends BasePageViewMap {
	//busca
        public WebElement InputValorAplicacao() {
    		return GetWebElementById("valorAplicar");
        }
        public WebElement InputValorPorMes() {
    		return GetWebElementById("valorInvestir");
        }
        public WebElement InputTempo() {
    		return GetWebElementById("tempo");
        }
        public void DropDownTempo(String tempo)
        {
            GetWebElementByXPath("//*[@id='formInvestimento']/div[4]/div[2]/div[2]/a").click();
            WaitForVisibilityOfElement("//*[@id='formInvestimento']/div[4]/div[2]/div[2]/ul/li//a[contains(text(), '"+tempo+"')]").click();
        }
        public WebElement ButtonSimular() {
    		return GetWebElementByClassName("simular");
        }
        
        //erros
        public WebElement TxtErroValorAplicacao() {
    		return GetWebElementById("valorAplicar-error");
        }
        public WebElement TxtErroValorPorMes() {
    		return GetWebElementById("valorInvestir-error");
        }
        
        //resultado
        public WebElement TxtTextoResultado() {
        	return GetWebElementByXPath("/html/body/div[3]/div/div/div[1]/div/div[2]/span[1]");
        }
        public WebElement TxtValorResultado() {
        	return GetWebElementByXPath("/html/body/div[3]/div/div/div[1]/div/div[2]/span[2]");
        }
        public WebElement Txt1Tempo() {
        	return GetWebElementByXPath("//table/tbody/tr[1]/td[1]");
        }
        public WebElement Txt1Valor() {
        	return GetWebElementByXPath("//table/tbody/tr[1]/td[2]");
        }
        public WebElement Txt2Tempo() {
        	return GetWebElementByXPath("//table/tbody/tr[2]/td[1]");
        }
        public WebElement Txt2Valor() {
        	return GetWebElementByXPath("//table/tbody/tr[2]/td[2]");
        }
        public WebElement Txt3Tempo() {
        	return GetWebElementByXPath("//table/tbody/tr[3]/td[1]");
        }
        public WebElement Txt3Valor() {
        	return GetWebElementByXPath("//table/tbody/tr[3]/td[2]");
        }
        public WebElement Txt4Tempo() {
        	return GetWebElementByXPath("//table/tbody/tr[4]/td[1]");
        }
        public WebElement Txt4Valor() {
        	return GetWebElementByXPath("//table/tbody/tr[4]/td[2]");
        
        }
        
        
        
        
}
