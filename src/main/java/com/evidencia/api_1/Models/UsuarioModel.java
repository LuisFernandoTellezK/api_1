package com.evidencia.api_1.Models;
import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;
    private String rol;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    
    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    
    public Integer getPrioridad(){
        return prioridad;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getRol() {
        return rol;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }
}