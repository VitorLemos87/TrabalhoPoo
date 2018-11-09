import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Window; 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame
{	
	int value;
	int voltar;
	public TelaInicial(int valor, int voltar) {
		this.value=valor;
		this.voltar=voltar;
	}

	// Desenvolve a Parte Grafica | JFrame | Produtos
	public int Menu() 
	{
		JLabel etiqueta=new JLabel("Olá, Escolha Uma Das Opções Abaixo:");
		etiqueta.setBounds(80,0,500,50);
		this.add(etiqueta);
		etiqueta.setFont(new Font("Dialog", Font.PLAIN, 14));

		JButton botaoprodutos=new JButton("Produtos");
		botaoprodutos.setBounds(25,50,350,100);

		JButton botaofuncionarios=new JButton("Funcionários sem Comissão");
		botaofuncionarios.setBounds(25,150,350,100);

		JButton botaofuncionarioscomissao=new JButton("Funcionários Com Comissão");
		botaofuncionarioscomissao.setBounds(25,250,350,100);

		JButton botaofechar=new JButton("Fechar o Programa");
		botaofechar.setBounds(25,350,350,100);

		this.add(botaoprodutos);

		botaoprodutos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				setValue(1);
			}
		});

		this.add(botaofuncionarios);
		botaofuncionarios.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ev) 
			{
				setValue(2);
			}
		});

		this.add(botaofuncionarioscomissao);

		botaofuncionarioscomissao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setValue(3);
			}
		});

		this.add(botaofechar);

		botaofechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});

		JLabel etiquetanome=new JLabel("SyncWorker Definitive Edition | Wayne Tech | Todos Os Direitos Reservados | 2018");
		etiquetanome.setBounds(10,450,500,50);
		this.add(etiquetanome);
		etiquetanome.setFont(new Font("Dialog", Font.PLAIN, 10));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Cor Botões
		botaoprodutos.setForeground(Color.WHITE);
		botaoprodutos.setBackground(Color.BLACK);

		botaofuncionarios.setForeground(Color.WHITE);
		botaofuncionarios.setBackground(Color.BLACK);

		botaofuncionarioscomissao.setForeground(Color.WHITE);
		botaofuncionarioscomissao.setBackground(Color.BLACK);

		botaofechar.setForeground(Color.GRAY);
		botaofechar.setBackground(Color.BLACK);

		//Background
		setSize(425,530);
		setTitle("SyncWorker");
		setLayout(null);
		setVisible(true);
		return value;
	}

	public int getVoltar()
	{
		return voltar;
	}
	public void setValue(int valor) 
	{
		this.value=valor;
	}
	public int getValue() 
	{
		return value;
	}
}