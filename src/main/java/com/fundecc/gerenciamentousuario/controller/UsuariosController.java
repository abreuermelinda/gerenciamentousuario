package com.fundecc.gerenciamentousuario.controller;

import com.fundecc.gerenciamentousuario.entity.Usuario;
import com.fundecc.gerenciamentousuario.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuariosRepository.findAll();
    }

    @PostMapping("/usuarios")
    public void criarUsuario(@RequestBody Usuario usuario) {
        usuariosRepository.save(usuario);
    }

    @PutMapping("/usuarios")
    public void editarUsuario(@RequestBody Usuario usuario) {
        usuariosRepository.save(usuario);
    }
}
