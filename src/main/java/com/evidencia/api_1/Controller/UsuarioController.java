package com.evidencia.api_1.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.evidencia.api_1.Models.UsuarioModel;
import com.evidencia.api_1.Services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/ruta")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }

    @PutMapping(path = "/{id}")
    public boolean actualizarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.actualizarUsuario(usuario);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorNombre(@PathVariable("nombre") String nombre) {
        return this.usuarioService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "/email/{email}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorEmail(@PathVariable("email") String email) {
        return this.usuarioService.obtenerPorEmail(email);
    }

    @GetMapping(path = "/rol/{rol}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorRol(@PathVariable("rol") String rol) {
        return this.usuarioService.obtenerPorRol(rol);
    }

    @GetMapping(path = "/fechaCreacion/{fechaCreacion}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorFechaCreacion(@PathVariable("fechaCreacion") Date fechaCreacion) {
        return this.usuarioService.obtenerPorFechaCreacion(fechaCreacion);
    }

    @GetMapping(path = "/fechaActualizacion/{fechaActualizacion}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorFechaActualizacion(
            @PathVariable("fechaActualizacion") Date fechaActualizacion) {
        return this.usuarioService.obtenerPorFechaActualizacion(fechaActualizacion);
    }
}
