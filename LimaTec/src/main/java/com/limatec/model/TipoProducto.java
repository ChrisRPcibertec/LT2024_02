package com.limatec.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_tipo_producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_producto;

    private String nombre;
    // Otros atributos relevantes

    // Relación con Producto
    @OneToMany(mappedBy = "tipoProducto")
    private List<Producto> productos;
}