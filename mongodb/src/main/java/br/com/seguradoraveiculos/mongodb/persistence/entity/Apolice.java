package br.com.seguradoraveiculos.mongodb.persistence.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Apolice {

    @Id
    private String id;
    private int numero;
    private LocalDateTime inicioVigencia;
    private LocalDateTime fimVigencia;
    private String placaVeiculo;
    private double valor;

    private Clientes cliente;




}
