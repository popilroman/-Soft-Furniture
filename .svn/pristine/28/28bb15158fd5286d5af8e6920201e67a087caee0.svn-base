//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;

//Публичный класс графического интерфейса c варинтами транспортировки
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
	//Конструктор класса
	public TransportGUI() {
		super();
		setTitle("Транспортировка");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelTransportGUI = new JPanel();
		panelTransportGUI.setLayout(null);
		panelTransportGUI.revalidate();
		add(panelTransportGUI);
		
		
		titleTransportGUI = new JLabel("Варианты транспортировки");
		titleTransportGUI.setSize(210, 20);
		titleTransportGUI.setLocation(220, 10);
		panelTransportGUI.add(titleTransportGUI);
		
		deliveryTransportGUI = new JRadioButton();
		deliveryTransportGUI.setText("Доставка (+ сборка)");
		deliveryTransportGUI.setSize(210, 20);
		deliveryTransportGUI.setLocation(220, 80);
		panelTransportGUI.add(deliveryTransportGUI);
		
		pickUpTransportGUI = new JRadioButton();
		pickUpTransportGUI.setText("Самовывоз");
		pickUpTransportGUI.setSize(210, 20);
		pickUpTransportGUI.setLocation(220, 140);
		panelTransportGUI.add(pickUpTransportGUI);
		
		groupTransportGUI = new ButtonGroup();
		groupTransportGUI.add(pickUpTransportGUI);
		groupTransportGUI.add(deliveryTransportGUI);
		
		GeneralExitBtn exitBtnTransportGUI = new GeneralExitBtn();
		panelTransportGUI.add(exitBtnTransportGUI);
		
		GeneralForwardBtn forwardBtnTransportGUI = new GeneralForwardBtn();
		//Анонимный слушатель кнопки
		forwardBtnTransportGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				if (deliveryTransportGUI.isSelected() == true) {
					transportation = "Доставка";
					transportDecision = "Да";
					dispose();
					DataDeliveryGUI dataDeliveryGUI = new DataDeliveryGUI();
					
				} else if (pickUpTransportGUI.isSelected() == true) {
					transportDecision = "Нет";
					dispose();
					DataPersonGUI dataPersonGUI = new DataPersonGUI();
					
				} else {JOptionPane.showMessageDialog(panelTransportGUI, "Для продолжения сделайте выбор");}
				
			}	
		});
		panelTransportGUI.add(forwardBtnTransportGUI);
		
		GeneralBackwardBtn backwardBtnTransportGUI = new GeneralBackwardBtn();
		backwardBtnTransportGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора материала мебели
				MaterialsGUI materialsGUI = new MaterialsGUI();
			}
		});
		panelTransportGUI.add(backwardBtnTransportGUI);
		
		setVisible(true);

	}
}