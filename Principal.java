//Faz a importação
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//Classe Principal | Realiza todas as funções do Programa
public class Principal {

	//Metodo Main | Executa o Programa
	public static void main(String[] args) {

		List<Livro> livros= LerLivro("livros.txt");	
		List<Funcionario> funcionario= LerFichaFuncionario("funcionario.txt");
		List<FuncionarioComissao> funcionarioComissao= LerFichaFuncionarioComissao("funcionarioComissao.txt");

		//Objeto | Tela Inicial
		TelaInicial inicio = new TelaInicial(0, 0);
		int result = 0;

		//Inicia o Menu Principal
		inicio.Menu();
		//Sistema Decisão Para Abrir Novos Menus
		while(result==0)
		{result = inicio.getValue();
		System.out.print("");
		if(result==1)
		{
			new TelaLista(livros);
			inicio.setValue(0);
			result=0;
		} 
		else if(result==2)	
		{
			new TelaLista2(funcionario);
			inicio.setValue(0);
			result=0;
		}
		else if(result==3)	
		{
			new TelaLista3(funcionarioComissao);
			inicio.setValue(0);
			result=0;
		}
		}
	}
	//Criação Lista Dos Produtos | Livros
	private static List<Livro> LerLivro(String nomeArquivo) {

		// metodo para ler arquivo csv e retornar lista de livros
		List<Livro> livros= new ArrayList<>();
		Path caminhoDoArquivo=Paths.get(nomeArquivo);
		try (BufferedReader br=Files.newBufferedReader(caminhoDoArquivo,StandardCharsets.ISO_8859_1)) 
		{

			String linha=br.readLine();

			while(linha!=null) {

				String[] campos=linha.split(",");

				String nome=campos[0];
				int valor=Integer.parseInt(campos[1]);
				String autor=campos[2];

				Livro li=new Livro(nome,valor,autor);
				livros.add(li);
				linha=br.readLine();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return livros;
	}

	//Criação Lista Dos Funcionários sem comissão
	private static List<Funcionario> LerFichaFuncionario(String nomeArquivo) 

	{

		//Metodo para ler arquivo CSV e retornar a lista de funcionarios.

		List<Funcionario> funcionario= new ArrayList<>();

		Path caminhoDoArquivo=Paths.get(nomeArquivo);

		try (BufferedReader br=Files.newBufferedReader(caminhoDoArquivo,StandardCharsets.ISO_8859_1))
		{

			String linha=br.readLine();
			//Ler uma linha
			while(linha!=null)
			{
				//Coloca virgulas no Vetor
				String[] campos=linha.split(",");

				String nome=campos[0];
				String cargo=campos[1];
				int salario=Integer.parseInt(campos[2]);
				String telefone=campos[3];
				String endereço=campos[4];

				Funcionario fu=new Funcionario(nome,cargo,salario,telefone,endereço);
				funcionario.add(fu);

				linha=br.readLine();
			}

		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		return funcionario;
	}
	//Criação Lista Dos Funcionários com comissão

	//Criação Lista Dos Produtos | Livros
	private static List<FuncionarioComissao> LerFichaFuncionarioComissao(String nomeArquivo) 
	{

		//Metodo para ler arquivo CSV e retornar a lista de funcionarios.

		List<FuncionarioComissao> funcionarioComissao= new ArrayList<>();

		Path caminhoDoArquivo=Paths.get(nomeArquivo);

		try (BufferedReader br=Files.newBufferedReader(caminhoDoArquivo))
		{

			String linha=br.readLine();
			//Ler uma linha
			while(linha!=null)
			{
				//Coloca virgulas no Vetor
				String[] campos=linha.split(",");

				String nome=campos[0];
				String cargo=campos[1];
				int salario=Integer.parseInt(campos[2]);
				int comissao=Integer.parseInt(campos[3]);
				String telefone=campos[4];
				String endereço=campos[5];

				FuncionarioComissao co=new FuncionarioComissao(nome,cargo,salario,comissao,telefone,endereço);
				funcionarioComissao.add(co);

				linha=br.readLine();
			}

		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		return funcionarioComissao;
	}
}
//Fim Do Programa