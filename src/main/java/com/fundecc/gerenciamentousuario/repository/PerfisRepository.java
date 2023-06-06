package com.fundecc.gerenciamentousuario.repository;

import com.fundecc.gerenciamentousuario.entity.Perfis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfisRepository extends JpaRepository<Perfis, Long> {
}
