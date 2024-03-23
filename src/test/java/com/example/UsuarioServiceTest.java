package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioServiceTest {
    private UsuarioService service;

    @BeforeEach
    public void setUp() {
        service = new UsuarioService();
        service.crearUsuario(0L, "Juan");
        service.crearUsuario(1L, "Pedro");
        service.crearUsuario(2L, "Ana");
    }

    @Test
    public void testCrearUsuario() {
        UsuarioDTO actual = new UsuarioDTO(3L, "Maria");
        UsuarioDTO esperado = service.crearUsuario(3L, "Maria");
        assertEquals(esperado, actual);
    }

    @Test
    public void testObtenerUsuario() {
        UsuarioDTO actual = new UsuarioDTO(1L, "Pedro");
        UsuarioDTO esperado = service.obtenerUsuario(1L);
        assertEquals(esperado, actual);
    }

    @Test
    public void testActualizarUsuario() {
        UsuarioDTO actual = new UsuarioDTO(1L, "javier");
        UsuarioDTO esperado = service.actualizarUsuario(1L, "javier");
        assertEquals(esperado, actual);
    }

    @Test
    public void testEliminarUsuario() {
        UsuarioDTO actual = new UsuarioDTO(1L, "Pedro");
        UsuarioDTO esperado = service.eliminarUsuario(1L);
        assertEquals(esperado, actual);
    }
}