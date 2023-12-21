package com.orchestrator.orc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orchestrator.orc.model.Step;

@Repository
public interface StepRepository extends JpaRepository<Step, Long> {
    // Puoi aggiungere eventuali query personalizzate qui se necessario
}
