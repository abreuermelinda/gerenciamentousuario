package com.fundecc.gerenciamentousuario.repository;

import com.fundecc.gerenciamentousuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
}
