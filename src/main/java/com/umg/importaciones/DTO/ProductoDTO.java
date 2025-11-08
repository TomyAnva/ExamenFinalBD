package com.umg.importaciones.DTO;

import lombok.Data;

@Data
public class ProductoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer cantidadDisponible;
    private Double precioUnitario;
    private String proveedorNombre;
    private String bodegaUbicacion;
}
