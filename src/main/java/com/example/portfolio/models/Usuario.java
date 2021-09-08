package com.example.portfolio.models;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name="apellido", nullable = false, length = 30)
    private String apellido;

    @Column(name="dni", nullable = false, length = 9)
    private String Dni;

    @Column(name="email", nullable = false, length = 255)
    private String email;

    @Column(name="password", nullable = false, length = 30)
    private String password;

///==================================================================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        this.Dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}


