package com.senai.cadastroendereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastroendereco.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
	// BUSCAR A PESSOA PELO EMAIL
	Pessoa findByEmail(String email);

}
