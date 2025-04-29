package com.senai.cadastroendereco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Endereco;
import com.senai.cadastroendereco.repositories.EnderecoRepository;

@Service
public class EnderecoService {
@Autowired
private EnderecoRepository enderecoRepository;

// SALVAR UM NOVO ENDEREÇO
public Endereco salvar(Endereco endereco) {
	return enderecoRepository.save(endereco);
}
//BUSCAR TODOS OS ENDEREÇOS
public List<Endereco> listarTodos(){
	return enderecoRepository.findAll();
}
//BUSCAR ENDEREÇO POR ID
public Optional<Endereco> buscarPorId(Long id){
	return enderecoRepository.findById(id);
}
//DELETAR UM ENDEREÇO POR ID
public void deletarPorId(Long id) {
	enderecoRepository.deleteById(id);
}
}