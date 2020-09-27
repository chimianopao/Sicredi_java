package validations;

import base.Driver;
import controllers.SimuladorInvestimentoPoupancaController;
import controllers.SimuladorInvestimentoPoupancaController.Tempo;

public class SimuladorInvestimentoPoupancaFrontEndValidator {
	
	Driver driver = new Driver();
	SimuladorInvestimentoPoupancaController controller = new SimuladorInvestimentoPoupancaController();
	
	public void ValidacaoPadrao() throws InterruptedException
    {
		driver.startDriver();
        
        controller.FazSimulacao(400.00, 20.00, 12, Tempo.Meses);

        driver.stopDriver();
    }
	
	public void ValidacaoMenosQue20() throws InterruptedException
    {
		driver.startDriver();

        controller.FazSimulacao(5.00, 10.00, 12, Tempo.Meses);

        driver.stopDriver();
    }

    public void ValidacaoAnos() throws InterruptedException
    {
    	driver.startDriver();

        controller.FazSimulacao(400.00, 20.00, 1, Tempo.Anos);

        driver.stopDriver();
    }

}
