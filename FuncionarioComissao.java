public class FuncionarioComissao
{
	//Variaveis
	String nomeFuncionario;
	String cargo;
	int salario;
	int comissao;
	String telefone;
	String endere�o;
	//Construtor
	public FuncionarioComissao(String nomeFuncionario, String cargo, int salario, int comissao,String telefone, String endere�o) {

		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.salario = salario;
		this.comissao = comissao;
		this.telefone = telefone;
		this.endere�o = endere�o;
	}
	//Getters And Setters
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	//Metodo que retorna as informa��es para a Classe Principal
	@Override
	public String toString() {
		return "\n| Nome: "+nomeFuncionario+" \n| Cargo: "+cargo+" \n| Salario: EUR "+salario+"\n| Comiss�o Mensal: "+comissao+"\n| Telefone: "+telefone+"\n| Endere�o: "+endere�o;
	}
}