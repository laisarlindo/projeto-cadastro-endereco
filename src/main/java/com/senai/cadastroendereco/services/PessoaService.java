package com.senai.cadastroendereco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Pessoa;
import com.senai.cadastroendereco.repositories.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	//CRIAR UMA NOVA PESSOA
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	//BUSCAR PESSOA PELO ID
	public Pessoa buscarPorId(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}
	//LISTAR TODAS AS PESSOAS
	public List<Pessoa> listarTodas(){
		return pessoaRepository.findAll();
	}
	//EXCLUIR UMA PESSOA
	public void deletarPorId(Long id) {
		pessoaRepository.deleteById(id);
	}
	// BUSCAR PESSOA POR EMAIL
	public Pessoa buscarPorEmail(String email) {
		return pessoaRepository.findByEmail(email);
	}
	// VERIFICAR EMAIL E SENHA DURANTE O PROCESSO DE LOGIN
	public Pessoa autenticarPessoa(String email, String senha) {
		//VERIFICAR A EXISTÊNCIA DO EMAIL
		Pessoa pessoa = pessoaRepository.findByEmail(email);
		
		if(pessoa  != null && pessoa.getSenha().equals(senha)) {
			return pessoa;
		}else {
			return null;
		}
	}
}