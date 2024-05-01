package com.limatec.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_cabecera_venta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CabeceraVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    private Date fecha_venta;
    private double monto_total;

    // Relación con DetalleVenta
    @OneToMany(mappedBy = "cabeceraVenta")
    private List<DetalleVenta> detalleVentas;
}