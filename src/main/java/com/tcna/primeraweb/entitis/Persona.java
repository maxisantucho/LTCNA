package com.tcna.primeraweb.entitis;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tbl_personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;

}
