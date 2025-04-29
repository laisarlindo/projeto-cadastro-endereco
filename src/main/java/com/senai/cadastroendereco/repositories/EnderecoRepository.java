package com.senai.cadastroendereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastroendereco.entities.Endereco;

public interface EnderecoRepository extends JpaRepository <Endereco, Long> {

}
