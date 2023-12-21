package com.orchestrator.orc.model;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;

    private String name;
    private String type; // "Lettura" o "Scrittura"

    @ManyToOne
    @JoinColumn(name = "protocol_id")
    private Protocol protocol;

    @OneToMany(mappedBy = "step", cascade = CascadeType.ALL)
    private List<Parameter> parameters;

    // costruttori, getter, setter e altri metodi
}


