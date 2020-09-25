/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BasePageViewMap;
import Base.Driver;
import ViewMaps.SimuladorInvestimentoPoupancaViewMap;


/**
 *
 * @author Theilor
 */
public class SimuladorInvestimentoPoupancaController extends BasePageController {
    public enum Tempo { Meses, Anos };

    SimuladorInvestimentoPoupancaViewMap map = new SimuladorInvestimentoPoupancaViewMap();
    public void FazSimulacao(Double valorAplicacao, double valorPorMes, int valorTempo, Tempo unidadeTempo) throws InterruptedException
    {
    	super.Navigate();
    	map.esperando();
        map.InputValorAplicacao().sendKeys(String.format("%.2f", valorAplicacao));
        map.InputValorPorMes().sendKeys(String.format("%.2f", valorPorMes));
        map.InputTempo().sendKeys(String.valueOf(valorTempo));
        
        if (unidadeTempo == Tempo.Anos) { 
            map.DropDownTempo(unidadeTempo.toString());
            valorTempo *= 12;
        }

        map.ButtonSimular().click();

        //Driver.driver.wait(3000);

        if (valorAplicacao < 20)
            assert(map.TxtErroValorAplicacao().getText().equals("Valor mínimo de 20.00"));

        else if (valorPorMes < 20)
        	assert(map.TxtErroValorPorMes().getText().equals("Valor mínimo de 20.00"));

        else
        {
        	assert(map.TxtTextoResultado().getText().equals("Em {valorTempo} meses você terá guardado")):"Tempo em meses não bate com o informado.";
        	assert(map.TxtValorResultado().getText().equals("R$ 647")):"Cálculo de rendimento incorreto";
        	assert(VerificaResultado(valorAplicacao, valorPorMes, valorTempo)):"Cálculo dos próximos 4 anos incorreto";
        }
    }

    private boolean VerificaResultado(double valorAplicacao, double valorPorMes, double valorTempo)
    {
        boolean result = true;
        if (!map.Txt1Tempo().getText().equals("24"))
            result = false;
        if (!map.Txt1Valor().getText().equals("R$ 898"))
            result = false;
        if (!map.Txt2Tempo().getText().equals("36"))
            result = false;
        if (!map.Txt2Valor().getText().equals("R$ 1.152"))
            result = false;
        if (!map.Txt3Tempo().getText().equals("48"))
            result = false;
        if (!map.Txt3Valor().getText().equals("R$ 1.409"))
            result = false;
        if (!map.Txt4Tempo().getText().equals("60"))
            result = false;
        if (!map.Txt4Valor().getText().equals("R$ 1.671"))
            result = false;

        return result;
    }
}