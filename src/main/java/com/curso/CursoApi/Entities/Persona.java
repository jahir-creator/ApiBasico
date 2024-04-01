package com.curso.CursoApi.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    @Column(name = "nombre", length = 20)
    @Pattern(regexp = "[a-zA-Z]+", message = "El nombre solo debe contener letras")
    private String nombre;
    @Column(name = "apellido", length = 60)
    @Pattern(regexp = "[a-zA-Z]+", message = "El apellido solo debe contener letras")
    private String apellido;
    @Column(name = "dni", length = 18)
    private int dni;

}
