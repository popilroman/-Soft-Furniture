package gui;

import javax.swing.*;
import java.awt.event.*;

public final class DeviceGUI {
	public static String mesanism;
	
	private JFrame frameDeviceGUI;
	private JPanel panelDeviceGUI;
	
	private JLabel titleDeviceGUI;
	
	private JComboBox comboBoxDeviceGUI;
	private String[] listOfDevice = {"Выберите механизм...", "Аккордеон", "Выкатной", "Пантограф"};
	
	private GeneralBackwardBtn backwardBtnDeviceGUI;
	private GeneralForwardBtn forwardBtnDeviceGUI;
	private GeneralExitBtn exitBtnDeviceGUI;
	
	public DeviceGUI() {
		frameDeviceGUI = new JFrame();
		frameDeviceGUI.setTitle("Механизм раскладного дивана");
		frameDeviceGUI.setSize(600, 300);
		frameDeviceGUI.setResizable(false);
		frameDeviceGUI.setLocationRelativeTo(null);
		
		panelDeviceGUI = new JPanel();
		panelDeviceGUI.setLayout(null);
		panelDeviceGUI.revalidate();
		frameDeviceGUI.add(panelDeviceGUI);
		
		titleDeviceGUI = new JLabel("Выберите механизм раскладного дивана");
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
				
				if (comboBoxDeviceGUI.getSelectedItem().toString() == "Выберите механизм...") {
					JOptionPane.showMessageDialog(frameDeviceGUI, "Для продолжения выберите механизм");
				} else {
					if (comboBoxDeviceGUI.getSelectedItem().toString() == "Аккордеон") {
						mesanism = "Аккордеон";
					}
					else if (comboBoxDeviceGUI.getSelectedItem().toString() == "Выкатной") {
						mesanism = "Выкатной";
					}
					else {
						mesanism = "Пантограф";
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
