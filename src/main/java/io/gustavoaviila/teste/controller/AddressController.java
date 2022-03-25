package io.gustavoaviila.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.gustavoaviila.teste.domain.model.AddressModel;
import io.gustavoaviila.teste.domain.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;
    

    @GetMapping("/cep.[format]?code=13311390")
    public AddressModel findAddress(@PathVariable String cep){
        return addressService.findbyCep(cep);
    }
}
