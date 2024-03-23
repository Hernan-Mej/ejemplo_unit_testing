package com.example;

import java.util.HashMap;
import java.util.Map;

public class UsuarioService {
    private final Map<Long, UsuarioDTO> usuarios = new HashMap<>();

    public UsuarioDTO crearUsuario(Long id, String nombre){
        usuarios.put(id, new UsuarioDTO(id, nombre));
        return usuarios.get(id);
    }

    public UsuarioDTO obtenerUsuario(Long id){
        return usuarios.get(id);
    }

    public UsuarioDTO actualizarUsuario(Long id, String nombre){
        usuarios.put(id, new UsuarioDTO(id, nombre));
        return usuarios.get(id);
    }

    public UsuarioDTO eliminarUsuario(Long id){
        return usuarios.remove(id);
    }
}
