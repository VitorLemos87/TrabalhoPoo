public class FuncionarioComissao
{
	//Variaveis
	String nomeFuncionario;
	String cargo;
	int salario;
	int comissao;
	String telefone;
	String endereço;
	//Construtor
	public FuncionarioComissao(String nomeFuncionario, String cargo, int salario, int comissao,String telefone, String endereço) {

		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.salario = salario;
		this.comissao = comissao;
		this.telefone = telefone;
		this.endereço = endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	//Metodo que retorna as informações para a Classe Principal
	@Override
	public String toString() {
		return "\n| Nome: "+nomeFuncionario+" \n| Cargo: "+cargo+" \n| Salario: EUR "+salario+"\n| Comissão Mensal: "+comissao+"\n| Telefone: "+telefone+"\n| Endereço: "+endereço;
	}
}