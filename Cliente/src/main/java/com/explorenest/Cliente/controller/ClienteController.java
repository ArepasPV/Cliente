package com.explorenest.Cliente.controller;


import com.explorenest.Cliente.domain.Cliente;
import com.explorenest.Cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("list_client")
    public List<Cliente> getClients() {
        return clienteService.findAllClients();
    }

    @GetMapping("get_client_id")
    public Optional<Cliente> getClientById(int id) {
        return clienteService.findById(id);
    }

    @GetMapping("get_by_name")
    public Optional<Cliente> getClientByName(String name) {
        return Optional.ofNullable(clienteService.findClientByName(name));
    }

    @GetMapping("get_by_surname")
    public Optional<List<Cliente>> getClientBySurname(String surname) {
        return Optional.ofNullable(clienteService.findClientBySurname(surname));
    }
}
