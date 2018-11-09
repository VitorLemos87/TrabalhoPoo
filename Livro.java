
public class Livro {
	//Variaveis
	String nome;
	int preco;
	String autor;
	//Construtor
	public Livro(String nome, int preco, String autor) {
		this.nome = nome;
		this.preco = preco;
		this.autor = autor;
	}
	//Getters And Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	//Metodo que retorna as informações para a Classe Principal
	@Override
	public String toString() {
		return "| Nome: "+nome+" \n| Preço: R$"+preco+" \n| Autor: "+autor;
	}
}