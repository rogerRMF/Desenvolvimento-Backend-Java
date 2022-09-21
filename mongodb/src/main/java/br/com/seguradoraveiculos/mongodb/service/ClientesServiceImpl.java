package br.com.seguradoraveiculos.mongodb.service;

import br.com.seguradoraveiculos.mongodb.model.ClientesRequest;
import br.com.seguradoraveiculos.mongodb.model.ClientesResponse;
import br.com.seguradoraveiculos.mongodb.persistence.entity.Clientes;
import br.com.seguradoraveiculos.mongodb.persistence.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientesServiceImpl implements ClientesService{

    @Autowired
    private ClientesRepository repository;

    @Override
    public ClientesResponse create(ClientesRequest request) {
        Clientes clientes = new Clientes();
        clientes.setNome(request.getNome());
        clientes.setCpf(request.getCpf());
        clientes.setCidade(request.getCidade());
        clientes.setUf(request.getUf());

        repository.save(clientes);

        return createResponse(clientes);
    }



    @Override
    public List<ClientesResponse> getAll() {
        List<ClientesResponse> responses = new ArrayList<>();

        List<Clientes> clientes = repository.findAll();

        if(!clientes.isEmpty()){
            clientes.forEach(cliente -> responses.add(createResponse(cliente)));
        }

        return responses;

        }

    private  ClientesResponse createResponse(Clientes clientes){
        ClientesResponse response = new ClientesResponse();
        response.setId(clientes.getId());
        response.setNome(clientes.getNome());
        response.setCpf(clientes.getCpf());
        response.setCidade(clientes.getCidade());
        response.setUf(clientes.getUf());

        return response;

    }
}
