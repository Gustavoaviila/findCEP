package io.gustavoaviila.teste.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class AddressModel {

    @Id
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String endereco;

}
