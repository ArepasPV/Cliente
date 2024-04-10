package com.explorenest.Cliente.service;


import com.explorenest.Cliente.domain.Cliente;
import com.explorenest.Cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;
    public List<Cliente> findAllClients() {
        return clienteRepository.findAll();
    }
    public Optional<Cliente> findById(int id) {
        return clienteRepository.findById(id);
    }

    public Cliente findClientByName(String name) {
        return clienteRepository.findOneByName(name);
    }

    public List<Cliente> findClientBySurname(String surname) {
        return clienteRepository.findBySurname(surname);
    }

}
