package com.limatec.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_proveedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proveedor;

    private String nombre;
    // Otros atributos relevantes

    // Relación con Producto
    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos;
}
