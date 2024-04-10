package com.explorenest.Cliente.repository;

import com.explorenest.Cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findOneByName(String name);
    List<Cliente> findBySurname(String surname);
}
