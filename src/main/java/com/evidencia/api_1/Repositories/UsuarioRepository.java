package com.evidencia.api_1.Repositories;
import java.sql.Date;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evidencia.api_1.Models.UsuarioModel;
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    public abstract ArrayList<UsuarioModel> findByNombre(String nombre);
    public abstract ArrayList<UsuarioModel> findByEmail(String email);
    public abstract ArrayList<UsuarioModel> findByRol(String rol);
    public abstract ArrayList<UsuarioModel> findByFechaCreacion(Date fechaCreacion);
    public abstract ArrayList<UsuarioModel> findByFechaActualizacion(Date fechaActualizacion);
}