package br.com.seguradoraveiculos.mongodb.service;

import br.com.seguradoraveiculos.mongodb.model.ClientesRequest;
import br.com.seguradoraveiculos.mongodb.model.ClientesResponse;

import java.util.List;

public interface ClientesService {

    ClientesResponse create(ClientesRequest request);

    List<ClientesResponse> getAll();
}
