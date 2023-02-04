//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;

//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;

//��������� ����� ������������ ���������� c ����� ������
public final class TypeGUI extends JFrame{
	
	//������ ����� �� ���������� ����� ������ ������
	
	static String[] types = {"�������� ���...", "�����", "���������� �����", "������", "���"};
	public static int sofa = 0, foldSofa = 0, chair = 0 , puf = 0;
	
    static String typeOfFurniture;
	
	private JPanel panelTypeGUI; 
	private JLabel titleTypeGUI;
	private JComboBox typesBoxTypeGUI;
	public static String getTypeOfFurniture() {
		return typeOfFurniture;
	}
	//����������� ������
	public TypeGUI() {
		super();
		setTitle("��� ������");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		panelTypeGUI = new JPanel();
		panelTypeGUI.setLayout(null);
		panelTypeGUI.revalidate();
		add(panelTypeGUI);
		
		
		titleTypeGUI = new JLabel("�������� ��� ������");
		titleTypeGUI.setSize(210, 20);
		titleTypeGUI.setLocation(220, 10);
		panelTypeGUI.add(titleTypeGUI);
		
		
		typesBoxTypeGUI = new JComboBox(types);
		typesBoxTypeGUI.setSize(140, 25);
		typesBoxTypeGUI.setLocation(220, 90);
		panelTypeGUI.add(typesBoxTypeGUI);
		
		
		GeneralExitBtn exitBtnTypeGUI = new GeneralExitBtn();
		panelTypeGUI.add(exitBtnTypeGUI);
		
		
		GeneralForwardBtn forwardBtnTypeGUI = new GeneralForwardBtn();
		//��������� ��������� ������
		forwardBtnTypeGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				
				typeOfFurniture = typesBoxTypeGUI.getSelectedItem().toString();
				
				if (typesBoxTypeGUI.getSelectedItem().toString() == "�����") {
					sofa=1;
					//������������� �������, ������������ ����� � ��������� ���������
					dispose();
					SofaSizeGUI sofaSizeGUI = new SofaSizeGUI();
					
				} else if (typesBoxTypeGUI.getSelectedItem().toString() == "���������� �����") {
					foldSofa=1;
					//������������� �������, ������������ ����� � ��������� ���������
					dispose();
					FoldingSofaSizeGUI foldingSofaSizeGUI = new FoldingSofaSizeGUI();
					
				} else if (typesBoxTypeGUI.getSelectedItem().toString() == "������") {
					chair=1;
					//������������� �������, ������������ ����� � ��������� ���������
					dispose();
					ChairSizeGUI chairSizeGUI = new ChairSizeGUI();
					
				} else if (typesBoxTypeGUI.getSelectedItem().toString() == "���") {
					puf=1;
					//������������� �������, ������������ ����� � ��������� ���������
					dispose();
					MaterialsGUI materialsGUI = new MaterialsGUI();
				} else {JOptionPane.showMessageDialog(panelTypeGUI, "��� ����������� �������� �����");}
			}
		});
		panelTypeGUI.add(forwardBtnTypeGUI);
		 
		
		GeneralBackwardBtn backwardBtnTypeGUI = new GeneralBackwardBtn();
		backwardBtnTypeGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				
				//������������� �������, ������������ ����� � ��������� ���������
				dispose();
				
				//��������� ��������� ������ - GUI �����������
				InitialGUI initialGUI = new InitialGUI();
			}
		});
		panelTypeGUI.add(backwardBtnTypeGUI);
		
		setVisible(true);
	}
	
	public Object getcheckingLab1() {return titleTypeGUI;}

}
