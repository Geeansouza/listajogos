package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.ConsolesEnum;

public class Frame extends JFrame {
	private JTextField textField;
	public Frame() {
		setAlwaysOnTop(true);
		getContentPane().setBackground(new Color(244, 164, 96));
		setForeground(UIManager.getColor("CheckBoxMenuItem.background"));
		getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\21276338\\Downloads\\jogos 1.png"));
		lblNewLabel.setBounds(555, 0, 213, 56);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\21276338\\Downloads\\among-us-blue-egg-hat-png-01 1.png"));
		lblNewLabel_2.setBounds(0, 360, 93, 119);
		getContentPane().add(lblNewLabel_2);
				
		textField = new JTextField();
		textField.setBounds(27, 43, 172, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(27, 11, 66, 32);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome do Fabricante:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(27, 79, 219, 32);
		getContentPane().add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(27, 122, 172, 26);
		getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Zerado");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(147, 112, 219));
		chckbxNewCheckBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(229, 43, 97, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Console:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(27, 159, 93, 32);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(ConsolesEnum.values()));
		comboBox_1.setBounds(27, 201, 172, 26);
		getContentPane().add(comboBox_1);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\21276338\\Downloads\\5585.jpg"));
		lblBackground.setBounds(0, 0, 768, 479);
		getContentPane().add(lblBackground);
	

	}
}
