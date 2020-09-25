package validations;

import Services.InvestimentoService;

public class SimuladorInvestimentoPoupancaBackEndValidator {
	public void ValidaServicoSimuladorPoupanca()
    {
        String dados = "{\"id\":1,\"meses\":[\"112\",\"124\",\"136\",\"148\"],\"valor\":[\"2.802\",\"3.174\",\"3.564\",\"3.971\"]}";

        InvestimentoService service = new InvestimentoService();
        var result = service.GetService().Content;
        Assert.AreEqual(result, dados,"O resultado difere do valor esperado.");
    }
}
