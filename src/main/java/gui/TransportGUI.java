//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;

//��������� ����� ������������ ���������� c ��������� ���������������
public final class TransportGUI extends JFrame{
	
	public static String transportDecision;
	
	 static String transportation;
	 
	 private JPanel panelTransportGUI;
	 private JLabel titleTransportGUI;
	 private JRadioButton deliveryTransportGUI;
	 private JRadioButton pickUpTransportGUI;
	 private ButtonGroup groupTransportGUI;
	 
	 
	 public static String getTransportDecision() {
		 return transportDecision;
	 }
	//����������� ������
	public TransportGUI() {
		super();
		setTitle("���������������");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelTransportGUI = new JPanel();
		panelTransportGUI.setLayout(null);
		panelTransportGUI.revalidate();
		add(panelTransportGUI);
		
		
		titleTransportGUI = new JLabel("�������� ���������������");
		titleTransportGUI.setSize(210, 20);
		titleTransportGUI.setLocation(220, 10);
		panelTransportGUI.add(titleTransportGUI);
		
		deliveryTransportGUI = new JRadioButton();
		deliveryTransportGUI.setText("�������� (+ ������)");
		deliveryTransportGUI.setSize(210, 20);
		deliveryTransportGUI.setLocation(220, 80);
		panelTransportGUI.add(deliveryTransportGUI);
		
		pickUpTransportGUI = new JRadioButton();
		pickUpTransportGUI.setText("���������");
		pickUpTransportGUI.setSize(210, 20);
		pickUpTransportGUI.setLocation(220, 140);
		panelTransportGUI.add(pickUpTransportGUI);
		
		groupTransportGUI = new ButtonGroup();
		groupTransportGUI.add(pickUpTransportGUI);
		groupTransportGUI.add(deliveryTransportGUI);
		
		GeneralExitBtn exitBtnTransportGUI = new GeneralExitBtn();
		panelTransportGUI.add(exitBtnTransportGUI);
		
		GeneralForwardBtn forwardBtnTransportGUI = new GeneralForwardBtn();
		//��������� ��������� ������
		forwardBtnTransportGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				
				if (deliveryTransportGUI.isSelected() == true) {
					transportation = "��������";
					transportDecision = "��";
					dispose();
					DataDeliveryGUI dataDeliveryGUI = new DataDeliveryGUI();
					
				} else if (pickUpTransportGUI.isSelected() == true) {
					transportDecision = "���";
					dispose();
					DataPersonGUI dataPersonGUI = new DataPersonGUI();
					
				} else {JOptionPane.showMessageDialog(panelTransportGUI, "��� ����������� �������� �����");}
				
			}	
		});
		panelTransportGUI.add(forwardBtnTransportGUI);
		
		GeneralBackwardBtn backwardBtnTransportGUI = new GeneralBackwardBtn();
		backwardBtnTransportGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				
				//������������� �������, ������������ ����� � ��������� ���������
				dispose();
				
				//��������� ��������� ������ - GUI ������ ��������� ������
				MaterialsGUI materialsGUI = new MaterialsGUI();
			}
		});
		panelTransportGUI.add(backwardBtnTransportGUI);
		
		setVisible(true);

	}
}