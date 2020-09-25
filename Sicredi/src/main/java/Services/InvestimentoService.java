/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author Theilor
 */
public class InvestimentoService {
	public IRestResponse GetService()
    {
        var client = new RestClient("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador");
        var RSrequest = new RestRequest(Method.GET) { RequestFormat = DataFormat.Json };

        return client.Execute(RSrequest);
    }
}
