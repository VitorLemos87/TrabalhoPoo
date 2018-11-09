
public class Funcionario
{
	//Variaveis
	String nomeFuncionario;
	String cargo;
	int salario;
	String telefone;
	String endere�o;
	//Construtor
	public Funcionario(String nomeFuncionario, String cargo, int salario, String telefone, String endere�o) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.salario = salario;
		this.telefone = telefone;
		this.endere�o = endere�o;
	}
	//Getter and Setters
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
	//Metodo que retorna as informa��es para a Classe Principal
	@Override
	public String toString() {
		return "| Nome: "+nomeFuncionario+" \n| Cargo: "+cargo+" \n| Salario: EUR "+salario+"\n| Telefone: "+telefone+"\n| Endere�o: "+endere�o;
	}	
}