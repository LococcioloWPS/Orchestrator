package com.orchestrator.orc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orchestrator.orc.model.Step;
import com.orchestrator.orc.service.StepService;

@RestController
@RequestMapping("/steps")
public class StepController {

    @Autowired
    private StepService stepService;

    @GetMapping
    public List<Step> getAllSteps() {
        return stepService.getAllSteps();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Step> getStepById(@PathVariable Long id) {
        Step step = stepService.getStepById(id);
        return ResponseEntity.ok(step);
    }

    @PostMapping
    public ResponseEntity<Step> createStep(@RequestBody Step step) {
        Step createdStep = stepService.createStep(step);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStep);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Step> updateStep(@PathVariable Long id, @RequestBody Step step) {
        Step updatedStep = stepService.updateStep(id, step);
        return ResponseEntity.ok(updatedStep);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStep(@PathVariable Long id) {
        stepService.deleteStep(id);
        return ResponseEntity.noContent().build();
    }
}

