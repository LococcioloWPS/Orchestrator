package com.orchestrator.orc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orchestrator.orc.dao.MissionRepository;
import com.orchestrator.orc.model.Mission;

import java.util.List;

@Service
public class MissionService {

    @Autowired
    private MissionRepository missionRepository;

    public List<Mission> getAllMissions() {
        return missionRepository.findAll();
    }

    public Mission getMissionById(Long id) {
        return missionRepository.findById(id).orElse(null);
    }

    public Mission createMission(Mission mission) {
        return missionRepository.save(mission);
    }

    public Mission updateMission(Long id, Mission mission) {
        if (missionRepository.existsById(id)) {
            mission.setId(id);
            return missionRepository.save(mission);
        } else {
            return null; 
        }
    }

    public void deleteMission(Long id) {
        missionRepository.deleteById(id);
    }
}
