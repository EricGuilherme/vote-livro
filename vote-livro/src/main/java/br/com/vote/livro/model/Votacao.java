package br.com.vote.livro.model;


public class Votacao {
	
	private int votacaoKey;
	private Livro livro;
	private int voto;
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
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
	
}
