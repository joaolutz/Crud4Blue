package br.com.joaolutz.crud4blue.bo;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class PessoaBO {
	
	public String calculaIdadePessoa(Date dataNascimento) {
		LocalDate birthday = dataNascimento.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
		Period periodo = Period.between(birthday, LocalDate.now());
		return String.format("%d anos, %d meses e %d dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());
	}

}
