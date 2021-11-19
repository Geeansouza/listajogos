package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.ConsolesEnum;
import br.senai.sp.jandira.model.Jogos;
import br.senai.sp.jandira.repository.JogosRepository;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;

public class Frame extends JFrame {
	private JTextField txtNome;
	private JTextField txtValorEstimado;
	private JTextField txtObservacoes;
	
	public Frame() {
		setAlwaysOnTop(true);
		setTitle("Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 600);
		getContentPane().setBackground(Color.WHITE);
		
		getContentPane().setLayout(null);
		JLabel lblLogoGames = new JLabel("");
		
		lblLogoGames.setIcon(new ImageIcon("C:\\Users\\21276338\\eclipse-workspace\\listajogos\\Img\\image 5.png"));
		lblLogoGames.setBounds(659, 11, 135, 56);
		getContentPane().add(lblLogoGames);
				
		txtNome = new JTextField();
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(27, 122, 172, 26);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNome.setBounds(27, 79, 66, 32);
		getContentPane().add(lblNome);
		
		JLabel lblNomefabricante = new JLabel("Nome do Fabricante:");
		lblNomefabricante.setForeground(Color.WHITE);
		lblNomefabricante.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNomefabricante.setBounds(27, 227, 219, 32);
		getContentPane().add(lblNomefabricante);
		
		JComboBox cbxNomeFabricante = new JComboBox();
		cbxNomeFabricante.setBounds(27, 259, 172, 26);
		getContentPane().add(cbxNomeFabricante);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Zerado");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(102, 0, 51));
		chckbxNewCheckBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(217, 122, 97, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Console:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(27, 157, 93, 32);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox cbxConsole = new JComboBox();
		cbxConsole.setModel(new DefaultComboBoxModel(ConsolesEnum.values()));
		cbxConsole.setBounds(27, 190, 172, 26);
		getContentPane().add(cbxConsole);
		
		JLabel lblValorEstimado = new JLabel("Valor Estimado:");
		lblValorEstimado.setForeground(Color.WHITE);
		lblValorEstimado.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblValorEstimado.setBounds(27, 286, 172, 32);
		getContentPane().add(lblValorEstimado);
		
		txtValorEstimado = new JTextField();
		txtValorEstimado.setColumns(10);
		txtValorEstimado.setBounds(27, 329, 172, 26);
		getContentPane().add(txtValorEstimado);
		
		JLabel lblObservcoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservcoes.setForeground(Color.WHITE);
		lblObservcoes.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblObservcoes.setBounds(27, 353, 156, 32);
		getContentPane().add(lblObservcoes);
		
		txtObservacoes = new JTextField();
		txtObservacoes.setColumns(10);
		txtObservacoes.setBounds(27, 396, 247, 106);
		getContentPane().add(txtObservacoes);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setForeground(Color.WHITE);
		lblMeusJogos.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblMeusJogos.setBounds(578, 79, 135, 32);
		getContentPane().add(lblMeusJogos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(535, 145, 225, 310);
		getContentPane().add(scrollPane);
		
		JList listMeusJogos = new JList();
		scrollPane.setViewportView(listMeusJogos);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(37, 513, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnEsqueda = new JButton("<");
		btnEsqueda.setBounds(535, 497, 89, 23);
		getContentPane().add(btnEsqueda);
		
		JButton btnDireita = new JButton(">");
		btnDireita.setBounds(671, 497, 89, 23);
		getContentPane().add(btnDireita);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\21276338\\eclipse-workspace\\listajogos\\Img\\purple-background-full-hd-1920x1080-405357.jpg"));
		lblBackground.setBounds(0, -57, 815, 692);
		getContentPane().add(lblBackground);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Jogos jogo = new Jogos();
				jogo.setTituloJogo(txtNome.getName());
				jogo.setConsole(determinarConsole(cbxConsole.getSelectedIndex()));
				
			}
		});
	}
		private ConsolesEnum determinarConsole(int consoleSelecionado) {

			if (consoleSelecionado == 0) {
				return ConsolesEnum.XBOX;
			} else if (consoleSelecionado == 1) {
				return ConsolesEnum.PLAYSTATION;
			}else if (consoleSelecionado == 1) {
					return ConsolesEnum.NINTENDO;
				
			} else {
				return ConsolesEnum.PC;
			}
		
}
}