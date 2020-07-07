package br.com.joaolutz.crud4blue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joaolutz.crud4blue.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {	
	
}
