/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


/**
 *
 * @author Theilor
 */
public class InvestimentoService {
	public String GetService() throws UnirestException
    {
		
		String apiUrl = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

		JsonNode body = Unirest.get(apiUrl)
		                        .asJson()
		                        .getBody();
		
		return body.toString();
    }
}
