package com.limatec.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_detalle_venta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle_venta;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private CabeceraVenta cabeceraVenta;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    private int cantidad;
    private double precio_unitario;
    private double subtotal;
}