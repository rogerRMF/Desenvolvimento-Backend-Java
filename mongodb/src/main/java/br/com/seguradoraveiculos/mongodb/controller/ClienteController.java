package br.com.seguradoraveiculos.mongodb.controller;

import br.com.seguradoraveiculos.mongodb.model.ClientesRequest;
import br.com.seguradoraveiculos.mongodb.model.ClientesResponse;
import br.com.seguradoraveiculos.mongodb.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ClienteController {

    @Autowired
    private ClientesService service;

    @PostMapping
    public ResponseEntity<ClientesResponse> create(@RequestBody ClientesRequest request){
        return ResponseEntity.ok(service.create(request));
    }
    @GetMapping
    public ResponseEntity<List<ClientesResponse>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
