package br.com.vote.livro.model;


public class Livro {
	
	private int livroKey;
	private String nome;
	private String imagem;
	
	public Livro(int livroKey) {
		this.livroKey = livroKey;
	}

	public int getLivroKey() {
		return livroKey;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
 

}
