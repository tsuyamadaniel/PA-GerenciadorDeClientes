package com.exerciciospa.gerenciadorclientes.repository;

import com.exerciciospa.gerenciadorclientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}