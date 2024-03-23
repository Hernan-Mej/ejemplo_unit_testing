package com.example;

public class UsuarioDTO {
    private Long id;
    private String nombre;

    public UsuarioDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        UsuarioDTO c = (UsuarioDTO) obj;
        return c.id == this.id && c.nombre.equals(this.nombre);
    }
}