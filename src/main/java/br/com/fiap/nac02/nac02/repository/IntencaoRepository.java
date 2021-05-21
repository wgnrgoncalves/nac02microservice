package br.com.fiap.nac02.nac02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.nac02.nac02.entity.IntencaoEntity;

@Repository
public interface IntencaoRepository extends JpaRepository<IntencaoEntity, Long>{

}

