package com.orchestrator.orc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orchestrator.orc.model.Mission;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {
    // Puoi aggiungere eventuali query personalizzate qui se necessario
}
