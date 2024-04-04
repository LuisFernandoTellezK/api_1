package com.evidencia.api_1.Services;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evidencia.api_1.Models.UsuarioModel;
import com.evidencia.api_1.Repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }
    public ArrayList<UsuarioModel>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }
    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    public boolean actualizarUsuario(UsuarioModel usuario){
        try{
            usuarioRepository.save(usuario);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    public ArrayList<UsuarioModel> obtenerPorNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }
    public ArrayList<UsuarioModel> obtenerPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }
    public ArrayList<UsuarioModel> obtenerPorRol(String rol){
        return usuarioRepository.findByRol(rol);
    }
    public ArrayList<UsuarioModel> obtenerPorFechaCreacion(Date fechaCreacion){
        return usuarioRepository.findByFechaCreacion(fechaCreacion);
    }
    public ArrayList<UsuarioModel> obtenerPorFechaActualizacion(Date fechaActualizacion){
        return usuarioRepository.findByFechaActualizacion(fechaActualizacion);
    }
}