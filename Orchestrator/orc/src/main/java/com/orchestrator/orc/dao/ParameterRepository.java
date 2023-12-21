package com.orchestrator.orc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orchestrator.orc.model.Parameter;

@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Long> {
    // Puoi aggiungere eventuali query personalizzate qui se necessario
}
