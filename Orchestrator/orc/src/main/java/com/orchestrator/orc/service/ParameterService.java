package com.orchestrator.orc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orchestrator.orc.dao.ParameterRepository;
import com.orchestrator.orc.model.Parameter;

import java.util.List;

@Service
public class ParameterService {

    @Autowired
    private ParameterRepository parameterRepository;

    public List<Parameter> getAllParameters() {
        return parameterRepository.findAll();
    }

    public Parameter getParameterById(Long id) {
        return parameterRepository.findById(id).orElse(null);
    }

    public Parameter createParameter(Parameter parameter) {
        return parameterRepository.save(parameter);
    }

    public Parameter updateParameter(Long id, Parameter parameter) {
        if (parameterRepository.existsById(id)) {
            parameter.setId(id);
            return parameterRepository.save(parameter);
        } else {
            return null; // Puoi gestire diversamente se il parametro non esiste
        }
    }

    public void deleteParameter(Long id) {
        parameterRepository.deleteById(id);
    }
}
