package com.limatec.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_empleado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_empleado;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String fecha_contratacion;

    // Relación con CabeceraVenta
    @OneToMany(mappedBy = "empleado")
    private List<CabeceraVenta> cabeceraVentas;
}