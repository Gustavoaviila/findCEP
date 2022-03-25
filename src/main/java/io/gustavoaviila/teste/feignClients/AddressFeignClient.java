package io.gustavoaviila.teste.feignClients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import io.gustavoaviila.teste.domain.model.AddressModel;

@Service
@FeignClient(name = "address", url = "https://ws.apicep.com")
public interface AddressFeignClient {

    @GetMapping(value = "/cep.[format]?code=13311390")
    ResponseEntity<AddressModel> findByCep(String cep);

}
