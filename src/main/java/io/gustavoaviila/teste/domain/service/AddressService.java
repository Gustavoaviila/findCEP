package io.gustavoaviila.teste.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.gustavoaviila.teste.domain.model.AddressModel;
import io.gustavoaviila.teste.feignClients.AddressFeignClient;

@Service
public class AddressService {    

    @Autowired
    private AddressFeignClient addressFeignClient;

    public AddressModel findbyCep(String cep) {
    	
    	if (cep.isEmpty()) {
    		return new AddressModel();
    	}
    	
    	addressFeignClient.findByCep(cep);
    	
    	AddressModel addressModel = new AddressModel();    	
    	addressModel.setCep(cep);
    	
        return addressModel;
    }




}
