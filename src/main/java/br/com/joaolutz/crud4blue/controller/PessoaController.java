package br.com.joaolutz.crud4blue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaolutz.crud4blue.bo.PessoaBO;
import br.com.joaolutz.crud4blue.model.Pessoa;
import br.com.joaolutz.crud4blue.repository.PessoaRepository;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaBO pessoaBo;
	
	@GetMapping("/consultar")
	public List<Pessoa> findAll() {
		List<Pessoa> pessoas = pessoaRepository.findAll();
		pessoas.forEach(p -> p.setIdade(pessoaBo.calculaIdadePessoa(p.getDataNascimento())));
		return pessoaRepository.findAll();
	}
	
	@PostMapping("/salvar")
	public Pessoa save(@RequestBody Pessoa pessoa) { 
		return pessoaRepository.save(pessoa);
	}

	@PostMapping("/excluir")
	public String excluir(@RequestBody Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
		return "Pessoa excluída com sucesso!";
	}
	
}
