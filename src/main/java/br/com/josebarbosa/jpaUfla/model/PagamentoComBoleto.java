package br.com.josebarbosa.jpaUfla.model;

import java.sql.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PagamentoComBoleto extends Pagamento{
	
	private Date dataVencimento;
	private Date dataPagamento; 

}
