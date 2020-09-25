import org.junit.Test;

import validations.SimuladorInvestimentoPoupancaBackEndValidator;

public class SimuladorInvestimentoPoupancaBackEndTest {
	@Test
	public void SimulaInvestimentoPoupanca() throws InterruptedException {
		
		SimuladorInvestimentoPoupancaBackEndValidator validator = new SimuladorInvestimentoPoupancaBackEndValidator();
        validator.ValidaServicoSimuladorPoupanca();
	}
}
