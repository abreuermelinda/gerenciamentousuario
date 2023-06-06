package com.fundecc.gerenciamentousuario.repository;

import com.fundecc.gerenciamentousuario.entity.Cargos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargosRepository extends JpaRepository<Cargos, Long> {
}
