import static org.junit.Assert.*;

import org.junit.Test;

import Base.Driver;
import validations.SimuladorInvestimentoPoupancaFrontEndValidator;

public class SimuladorInvestimentoPoupancaFrontEndTest {
	SimuladorInvestimentoPoupancaFrontEndValidator validator = new SimuladorInvestimentoPoupancaFrontEndValidator();

	@Test
	public void SimulaInvestimentoPoupanca() throws InterruptedException {
		
        validator.ValidacaoPadrao();
	}
	
	@Test
	public void ValidacaoMenosQue20() throws InterruptedException
    {
		validator.ValidacaoMenosQue20();
    }

	@Test
    public void ValidacaoAnos() throws InterruptedException
    {
    	validator.ValidacaoAnos();
    }

}
