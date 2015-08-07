package br.com.vote.livro.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Votacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int votacaoKey;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "livro_key")
	private Livro livroKey;
	private int voto;
	
	public Votacao(int votacaoKey) {
		this.votacaoKey = votacaoKey;
	}
	
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public int getVotacaoKey() {
		return votacaoKey;
	}
	public void setVotacaoKey(int votacaoKey) {
		this.votacaoKey = votacaoKey;
	}

	public Livro getLivroKey() {
		return livroKey;
	}

	public void setLivroKey(Livro livroKey) {
		this.livroKey = livroKey;
	}
	
}
