package validations;

import com.mashape.unirest.http.exceptions.UnirestException;

import services.InvestimentoService;

public class SimuladorInvestimentoPoupancaBackEndValidator {
	public void ValidaServicoSimuladorPoupanca() throws UnirestException
    {
        String dados = "{\"meses\":[\"112\",\"124\",\"136\",\"148\"],\"valor\":[\"2.802\",\"3.174\",\"3.564\",\"3.971\"],\"id\":1}";

        InvestimentoService service = new InvestimentoService();
        String result = service.GetService();
        assert(result.equals(dados)) :"O resultado difere do valor esperado.\nEsperado: "+dados+"\nRecebido: "+result;
    }
}
