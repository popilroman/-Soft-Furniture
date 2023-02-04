//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;

//��������� ����� ������������ ���������� c ����� ������
public final class MaterialsGUI extends JFrame {
	
	//������ ����� �� ���������� ����������
	
	static String[] carcass = {"�������� ������", "������", "���", "���", "������"};
	static String[] softElement = {"�������� �������", "��������� - ������-�������", "������� - ������", "�������� - ������", "�������� - ������", "������� ����� - �������"};
	static String[] cladding = {"�������� �������", "����������", "�����", "���. ����", "������. ����", "�����"};
	
	//��� ���������� ��������� ������
	public static String typeCarcass;
	public static String typeSoft;
	public static String typeCladding;
	
	private JPanel panelMaterialsGUI;
	private JLabel titleMaterialsGUI;
	private JComboBox carcassBoxMaterialsGUI;
	private JComboBox softElementBoxMaterialsGUI;
	private JComboBox claddingBoxMaterialsGUI;
	
	public static String getTypeCarcass() {
		return typeCarcass;
	}
	public static String getTypeSoft() {
		return typeSoft;
	}
	public static String getTypeCladding() {
		return typeCladding;
	}
	//����������� ������
	public MaterialsGUI() {
		
		super();
		setTitle("��������� ������");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		panelMaterialsGUI = new JPanel();
		panelMaterialsGUI.setLayout(null);
		panelMaterialsGUI.revalidate();
		add(panelMaterialsGUI);
		
		
		titleMaterialsGUI = new JLabel("�������� ��������� ������");
		titleMaterialsGUI.setSize(210, 20);
		titleMaterialsGUI.setLocation(220, 10);
		panelMaterialsGUI.add(titleMaterialsGUI);
		
		
		carcassBoxMaterialsGUI = new JComboBox(carcass);
		carcassBoxMaterialsGUI.setSize(150, 25);
		carcassBoxMaterialsGUI.setLocation(220, 60);
		panelMaterialsGUI.add(carcassBoxMaterialsGUI);
		
		softElementBoxMaterialsGUI = new JComboBox(softElement);
		softElementBoxMaterialsGUI.setSize(200, 25);
		softElementBoxMaterialsGUI.setLocation(195, 90);
		panelMaterialsGUI.add(softElementBoxMaterialsGUI);
		
		claddingBoxMaterialsGUI = new JComboBox(cladding);
		claddingBoxMaterialsGUI.setSize(150, 25);
		claddingBoxMaterialsGUI.setLocation(220, 120);
		panelMaterialsGUI.add(claddingBoxMaterialsGUI);
		
		GeneralExitBtn exitBtnMaterialsGUI = new GeneralExitBtn();
		panelMaterialsGUI.add(exitBtnMaterialsGUI);
		
		GeneralForwardBtn forwardBtnMaterialsGUI = new GeneralForwardBtn();
		//��������� ��������� ������
		forwardBtnMaterialsGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				
				if ((carcassBoxMaterialsGUI.getSelectedItem().toString() == "�������� ������") ||
					(softElementBoxMaterialsGUI.getSelectedItem().toString() == "�������� �������") ||
					(claddingBoxMaterialsGUI.getSelectedItem().toString() == "�������� �������")) {
					JOptionPane.showMessageDialog(panelMaterialsGUI, "��� ����������� �������� ���������");
				} else {
					typeCarcass = (String)carcassBoxMaterialsGUI.getSelectedItem(); //��������� �������� ����������� � ���������� 
					typeSoft = (String)softElementBoxMaterialsGUI.getSelectedItem();
					typeCladding = (String)claddingBoxMaterialsGUI.getSelectedItem();
	
					dispose();
					if (TypeGUI.puf == 0) {
						TransportGUI transportGUI = new TransportGUI();
					}
					else {
						DataPersonGUI dataPersonGUI = new DataPersonGUI();
					}
				}
			}	
		});
		panelMaterialsGUI.add(forwardBtnMaterialsGUI);
		
		GeneralBackwardBtn backwardBtnMaterialsGUI = new GeneralBackwardBtn();
		backwardBtnMaterialsGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				
				//������������� �������, ������������ ����� � ��������� ���������
				dispose();
				
				//��������� ��������� ������ - GUI ������ ���� ������
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelMaterialsGUI.add(backwardBtnMaterialsGUI);
		
		setVisible(true);
	}

}