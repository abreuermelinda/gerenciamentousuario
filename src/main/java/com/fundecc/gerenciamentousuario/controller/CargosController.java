package com.fundecc.gerenciamentousuario.controller;

import com.fundecc.gerenciamentousuario.entity.Cargos;
import com.fundecc.gerenciamentousuario.repository.CargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
public class CargosController {

    @Autowired
    private CargosRepository cargosRepository;

    @GetMapping("/cargos")
    public List<Cargos> getCargos() {
        return (List<Cargos>) cargosRepository.findAll();
    }

    @PostMapping("/cargos")
    public void criarCargo(@RequestBody Cargos cargo) {
      cargosRepository.save(cargo);
    }



    @PutMapping("/cargos")
    public void editarCargo(@RequestBody Cargos cargo) {
        Optional<Cargos> cargoExistente = cargosRepository.findById(cargo.getId());

        if (cargoExistente.isPresent()) {
            Cargos cargoAtual = cargoExistente.get();


            cargoAtual.setNome(cargo.getNome());

            cargosRepository.save(cargoAtual);

        } else {
            throw new EntityNotFoundException("Cargo não encontrado.");
        }
    }



}
