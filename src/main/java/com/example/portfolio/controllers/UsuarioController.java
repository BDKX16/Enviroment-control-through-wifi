package com.example.portfolio.controllers;

import com.example.portfolio.models.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    /*
    public ResponseEntity<List<Usuario>> getUser(){

        return ResponseEntity.ok(user);
    }*/



    @RequestMapping(value = "prueba/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario user = new Usuario();
        user.setId(id);
        user.setNombre("Xavier");
        user.setApellido("Galarreta");
        user.setEmail("xaveeg@gmail.com");
        user.setPassword("pepegrillo99");
        user.setDni("42416494");

        return user;
    }


    @RequestMapping(value = "pruebam", method = RequestMethod.PUT)
    public Usuario modificarUsuario(){
        Usuario user = new Usuario();
        user.setNombre("Xavier");
        user.setApellido("Galarreta");
        user.setEmail("xaveeg@gmail.com");
        user.setPassword("pepegrillo99");
        user.setDni("42416494");

        return user;
    }


    @RequestMapping(value = "pruebae", method = RequestMethod.DELETE)
    public Usuario eliminarUsuario(){
        Usuario user = new Usuario();
        user.setNombre("Xavier");
        user.setApellido("Galarreta");
        user.setEmail("xaveeg@gmail.com");
        user.setPassword("pepegrillo99");
        user.setDni("42416494");

        return user;
    }


    @RequestMapping(value = "pruebab", method = RequestMethod.TRACE)
    public Usuario buscarUsuario(){
        Usuario user = new Usuario();
        user.setNombre("Xavier");
        user.setApellido("Galarreta");
        user.setEmail("xaveeg@gmail.com");
        user.setPassword("pepegrillo99");
        user.setDni("42416494");

        return user;
    }
}
