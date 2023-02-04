package gui;

import javax.swing.*;
import java.awt.event.*;

public final class DeviceGUI {
	public static String mesanism;
	
	private JFrame frameDeviceGUI;
	private JPanel panelDeviceGUI;
	
	private JLabel titleDeviceGUI;
	
	private JComboBox comboBoxDeviceGUI;
	private String[] listOfDevice = {"�������� ��������...", "���������", "��������", "���������"};
	
	private GeneralBackwardBtn backwardBtnDeviceGUI;
	private GeneralForwardBtn forwardBtnDeviceGUI;
	private GeneralExitBtn exitBtnDeviceGUI;
	
	public DeviceGUI() {
		frameDeviceGUI = new JFrame();
		frameDeviceGUI.setTitle("�������� ����������� ������");
		frameDeviceGUI.setSize(600, 300);
		frameDeviceGUI.setResizable(false);
		frameDeviceGUI.setLocationRelativeTo(null);
		
		panelDeviceGUI = new JPanel();
		panelDeviceGUI.setLayout(null);
		panelDeviceGUI.revalidate();
		frameDeviceGUI.add(panelDeviceGUI);
		
		titleDeviceGUI = new JLabel("�������� �������� ����������� ������");
		titleDeviceGUI.setSize(250, 40);
		titleDeviceGUI.setLocation(170, 10);
		panelDeviceGUI.add(titleDeviceGUI);
		
		comboBoxDeviceGUI = new JComboBox(listOfDevice);
		comboBoxDeviceGUI.setSize(155, 25);
		comboBoxDeviceGUI.setLocation(220, 90);
		panelDeviceGUI.add(comboBoxDeviceGUI);
		
		backwardBtnDeviceGUI = new GeneralBackwardBtn();
		backwardBtnDeviceGUI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameDeviceGUI.dispose();
				FoldingSofaSizeGUI foldingSofaSizeGUI = new FoldingSofaSizeGUI();
			}
		});
		panelDeviceGUI.add(backwardBtnDeviceGUI);
		
		forwardBtnDeviceGUI = new GeneralForwardBtn();
		forwardBtnDeviceGUI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (comboBoxDeviceGUI.getSelectedItem().toString() == "�������� ��������...") {
					JOptionPane.showMessageDialog(frameDeviceGUI, "��� ����������� �������� ��������");
				} else {
					if (comboBoxDeviceGUI.getSelectedItem().toString() == "���������") {
						mesanism = "���������";
					}
					else if (comboBoxDeviceGUI.getSelectedItem().toString() == "��������") {
						mesanism = "��������";
					}
					else {
						mesanism = "���������";
					}
					frameDeviceGUI.dispose();
					MaterialsGUI materialsGUI = new MaterialsGUI();
				}
			}
		});
		panelDeviceGUI.add(forwardBtnDeviceGUI);
		
		exitBtnDeviceGUI = new GeneralExitBtn();
		panelDeviceGUI.add(exitBtnDeviceGUI);
		
		frameDeviceGUI.setVisible(true);
	}
	
	public static String getTypeDevice() {return mesanism;}
}
