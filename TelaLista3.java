import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLista3 extends JFrame{
	// Desenvolve a Parte Grafica | JFrame | Funcionários com comissão
	public TelaLista3(List<FuncionarioComissao> funcionarioComissao) {

		DefaultListModel<String> listaModeloDados= new DefaultListModel<>();

		for(FuncionarioComissao l:funcionarioComissao) {
			listaModeloDados.addElement(l.getNomeFuncionario());
		}

		JList<String> listaGrafica=new JList<>(listaModeloDados);

		listaGrafica.setBounds(50,50,400,200);

		JLabel etiqueta=new JLabel("Lista dos Funcionarios com comissão mensal:");
		etiqueta.setBounds(100,0,300,50);
		this.add(etiqueta);
		etiqueta.setFont(new Font("Dialog", Font.PLAIN, 14));

		add(listaGrafica);



		JButton botao=new JButton("Detalhes");
		botao.setBounds(50,260,150,100);

		this.add(botao);



		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(listaGrafica.getSelectedIndex()!=-1) {
					int i=listaGrafica.getSelectedIndex();

					JOptionPane.showMessageDialog(null, funcionarioComissao.get(i).toString());	
				}
			}
		});

		JButton botaofechamento =new JButton("Voltar");
		botaofechamento.setBounds(300,260,150,100);

		this.add(botaofechamento);



		botaofechamento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JButton botaoeditarnome=new JButton("Mudar o Nome");
		botaoeditarnome.setBounds(50,370,150,100);

		this.add(botaoeditarnome);

		botaoeditarnome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(listaGrafica.getSelectedIndex()!=-1) {
					int i=listaGrafica.getSelectedIndex();

					funcionarioComissao.get(i).nomeFuncionario=JOptionPane.showInputDialog("“Por Favor, defina um novo nome:”");

				}
			}
		});

		JButton botaoeditarsalario=new JButton("Mudar o Salário");
		botaoeditarsalario.setBounds(300,370,150,100);

		this.add(botaoeditarsalario);

		botaoeditarsalario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(listaGrafica.getSelectedIndex()!=-1) {
					int i=listaGrafica.getSelectedIndex();

					funcionarioComissao.get(i).salario=Integer.parseInt(JOptionPane.showInputDialog("“Por Favor, defina um novo Salário:”"));

				}
			}
		});

		JLabel etiquetanome=new JLabel("SyncWorker Definitive Edition | Wayne Tech | Todos Os Direitos Reservados | 2018");
		etiquetanome.setBounds(53,470,500,50);
		this.add(etiquetanome);
		etiquetanome.setFont(new Font("Dialog", Font.PLAIN, 10));

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//Cor Botões
		botao.setForeground(Color.WHITE);
		botao.setBackground(Color.BLACK);

		botaofechamento.setForeground(Color.WHITE);
		botaofechamento.setBackground(Color.BLACK);

		botaoeditarnome.setForeground(Color.WHITE);
		botaoeditarnome.setBackground(Color.BLACK);

		botaoeditarsalario.setForeground(Color.WHITE);
		botaoeditarsalario.setBackground(Color.BLACK);
		//Cor Fundo
		listaGrafica.setForeground(Color.GRAY);
		listaGrafica.setBackground(Color.WHITE);

		setSize(500,550);
		setTitle("SyncWorker");
		setLayout(null);
		setVisible(true);

	}	
}