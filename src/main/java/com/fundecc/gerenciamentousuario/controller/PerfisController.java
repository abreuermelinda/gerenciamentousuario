package com.fundecc.gerenciamentousuario.controller;

import com.fundecc.gerenciamentousuario.entity.Perfis;
import com.fundecc.gerenciamentousuario.repository.PerfisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerfisController {

    @Autowired
    private PerfisRepository perfisRepository;

    @GetMapping("/perfis")
    public List<Perfis> getPerfis() {
        return (List<Perfis>) perfisRepository.findAll();
    }

    @PostMapping("/perfis")
    public void criarPerfil(@RequestBody Perfis perfil) {
        perfisRepository.save(perfil);
    }

    @PutMapping("/perfis")
    public void editarPerfil(@RequestBody Perfis perfil) {
        perfisRepository.save(perfil);
    }

    @DeleteMapping("/perfis/{id}")
    public void deletarPerfil(@PathVariable("id") long id) {
        perfisRepository.deleteById(id);
    }
}
