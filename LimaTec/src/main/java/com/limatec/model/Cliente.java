package com.limatec.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;

    // Relación con CabeceraVenta
    @OneToMany(mappedBy = "cliente")
    private List<CabeceraVenta> cabeceraVentas;
}