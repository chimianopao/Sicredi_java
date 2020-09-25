/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Base.Driver;

/**
 *
 * @author Theilor
 */
public class BasePageController {
	protected String url = "https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/";

    public BasePageController() { }

    public BasePageController(String url)
    {
        this.url = url;
    }

    protected void Navigate()
    {
        try
        {
            Driver.driver.navigate().to(url);
        }
        catch (Exception e)
        {
            new AssertionError("Erro ao acessar o site. Detalhes do erro: " + e.getMessage());
        }
    }
}
