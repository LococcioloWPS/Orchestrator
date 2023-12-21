package com.orchestrator.orc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orchestrator.orc.dao.StepRepository;
import com.orchestrator.orc.model.Step;

import java.util.List;

@Service
public class StepService {

    @Autowired
    private StepRepository stepRepository;

    public List<Step> getAllSteps() {
        return stepRepository.findAll();
    }

    public Step getStepById(Long id) {
        return stepRepository.findById(id).orElse(null);
    }

    public Step createStep(Step step) {
        return stepRepository.save(step);
    }

    public Step updateStep(Long id, Step step) {
        if (stepRepository.existsById(id)) {
            step.setId(id);
            return stepRepository.save(step);
        } else {
            return null; // Puoi gestire diversamente se il passo non esiste
        }
    }

    public void deleteStep(Long id) {
        stepRepository.deleteById(id);
    }
}

