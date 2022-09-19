package br.com.seguradoraveiculos.mongodb.persistence.repository;

import br.com.seguradoraveiculos.mongodb.persistence.entity.Clientes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends MongoRepository <Clientes, String> {
}


