import org.junit.Test;

import com.mashape.unirest.http.exceptions.UnirestException;

import validations.SimuladorInvestimentoPoupancaBackEndValidator;

public class SimuladorInvestimentoPoupancaBackEndTest {
	@Test
	public void SimulaInvestimentoPoupanca() throws InterruptedException, UnirestException {
		
		SimuladorInvestimentoPoupancaBackEndValidator validator = new SimuladorInvestimentoPoupancaBackEndValidator();
        validator.ValidaServicoSimuladorPoupanca();
	}
}
