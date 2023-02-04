package gui;

//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;
//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//BufferedReader ����������� ������ ���� ������ Reader, 
//������� ������������� ��������� ������ �� ��������� (��������, �����) 
//� ��������� �� �buffer�(�����) BufferedReader
import java.io.BufferedReader;
//����� File ������ java.io ������������ ��� ���������� ����������� � ������ � ���������.
import java.io.File;
//������������� � ������� ������� ����, ������� �� ���������� ���� �����������
import java.io.FileNotFoundException;
//����� FileReader ������������ ��� ������ ������� ��������
import java.io.FileReader;
//������� � ���, ��� ��������� �����-�� ���������� �����-������. 
//���� ����� � ��� ����� ����� ����������, ����������� ����� ��� ���������� �������� �����-������
import java.io.IOException;

public final class GroupInformation extends JFrame{
	
	private JPanel panelGroupInformation;
	private JLabel titleGroupInformation;
	private JLabel teamLeadGroupInformation;
	private JLabel firstDevGroupInformation;
	private JLabel secondDevGroupInformation;
	private JLabel thirdDevGroupInformation;
	
	public GroupInformation() {
		
		super();
		setTitle("���������� � ������");
		setResizable(false);
		setSize(600, 300);
		setLocationRelativeTo(null);
		
		panelGroupInformation = new JPanel();
		panelGroupInformation.setLayout(null);
		panelGroupInformation.revalidate();
		add(panelGroupInformation);
		
		titleGroupInformation = new JLabel("������ ������:");
		titleGroupInformation.setSize(210, 20);
		titleGroupInformation.setLocation(240, 10);
		panelGroupInformation.add(titleGroupInformation);
		
		teamLeadGroupInformation = new JLabel("���������: ������ �.� - �21130210");
		teamLeadGroupInformation.setSize(240, 20);
		teamLeadGroupInformation.setLocation(190, 40);
		panelGroupInformation.add(teamLeadGroupInformation);
		
		firstDevGroupInformation = new JLabel("����������� 1: �������� �.� - �21130424");
		firstDevGroupInformation.setSize(260, 20);
		firstDevGroupInformation.setLocation(180, 80);
		panelGroupInformation.add(firstDevGroupInformation);
		
		secondDevGroupInformation = new JLabel("����������� 2: ��������� �.� - �21130751");
		secondDevGroupInformation.setSize(260, 20);
		secondDevGroupInformation.setLocation(180, 120);
		panelGroupInformation.add(secondDevGroupInformation);
		
		thirdDevGroupInformation = new JLabel("����������� 3: ������ �.� - �21130095");
		thirdDevGroupInformation.setSize(240, 20);
		thirdDevGroupInformation.setLocation(190, 160);
		panelGroupInformation.add(thirdDevGroupInformation);
		
		GeneralBackwardBtn backwardBtnGroupInformation = new GeneralBackwardBtn();
		backwardBtnGroupInformation.setLocation(20, 210);
		backwardBtnGroupInformation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				InitialGUI initialGUI = new InitialGUI();
			}
		});
		panelGroupInformation.add(backwardBtnGroupInformation);
		
		setVisible(true);
		
	}
}
