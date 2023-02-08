
package com.tienda_k.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
// mapear datos de una base de datos
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idCliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
}