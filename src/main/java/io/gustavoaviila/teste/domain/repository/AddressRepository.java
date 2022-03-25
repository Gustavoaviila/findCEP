package io.gustavoaviila.teste.domain.repository;

import io.gustavoaviila.teste.domain.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel, String>{

    AddressModel findByCep (String cep);

}
