//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет классы, способные работать со строками 
import java.text.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;
//Библиотека, которая предоставляет классы и интерфейсы, работающие с 
//редактируемыми и нередактируемыми текстовыми компонентами
import javax.swing.text.*;

//Публичный класс графического интерфейса c данными доставки
public final class DataDeliveryGUI extends JFrame{
	
	private JPanel panelDataDeliveryGUI;
	private JLabel titleDataDeliveryGUI;
	private JLabel adressDataDeliveryGUI;
	private JLabel dateDataDeliveryGUI;
	private JLabel timeDataDeliveryGUI;
	private static JTextField textAdressDataDeliveryGUI;
	private JFormattedTextField textDateDataDeliveryGUI;
	private JComboBox comboTimeDataDeliveryGUI;
	
	private final String[] timeList = {"12:00 - 14:00",
									   "14:00 - 16:00",
									   "16:00 - 18:00",
									   "18:00 - 20:00"};
	
	private String adressDelivery;
	private String dateDelivery;
	private String timeDelivery;
	
	public static JTextField getTextAdressDataDeliveryGUI() {
		return textAdressDataDeliveryGUI;
	}
	//Конструктор класса
	public DataDeliveryGUI() {
		super();
		setTitle("Доставка");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		panelDataDeliveryGUI = new JPanel();
		panelDataDeliveryGUI.setLayout(null);
		panelDataDeliveryGUI.revalidate();
		add(panelDataDeliveryGUI);
		
		
		titleDataDeliveryGUI = new JLabel("Назначьте дату, время и адрес доставки");
		titleDataDeliveryGUI.setSize(240, 20);
		titleDataDeliveryGUI.setLocation(180, 10);
		panelDataDeliveryGUI.add(titleDataDeliveryGUI);
		
		adressDataDeliveryGUI = new JLabel("Адрес доставки:");
		adressDataDeliveryGUI.setSize(150, 20);
		adressDataDeliveryGUI.setLocation(100, 60);
		panelDataDeliveryGUI.add(adressDataDeliveryGUI);
		
		textAdressDataDeliveryGUI = new JTextField();
		textAdressDataDeliveryGUI.setSize(200, 30);
		textAdressDataDeliveryGUI.setLocation(210, 60);
		panelDataDeliveryGUI.add(textAdressDataDeliveryGUI);
		
		dateDataDeliveryGUI = new JLabel("Дата доставки:");
		dateDataDeliveryGUI.setSize(150, 20);
		dateDataDeliveryGUI.setLocation(100, 110);
		panelDataDeliveryGUI.add(dateDataDeliveryGUI);
		
		try {
			MaskFormatter dateFormat = new MaskFormatter("##/##/####");
			textDateDataDeliveryGUI = new JFormattedTextField(dateFormat);
			textDateDataDeliveryGUI.setSize(200, 30);
			textDateDataDeliveryGUI.setLocation(210, 110);
			panelDataDeliveryGUI.add(textDateDataDeliveryGUI);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		timeDataDeliveryGUI = new JLabel("Время доставки:");
		timeDataDeliveryGUI.setSize(150, 20);
		timeDataDeliveryGUI.setLocation(100, 160);
		panelDataDeliveryGUI.add(timeDataDeliveryGUI);
		
		comboTimeDataDeliveryGUI = new JComboBox(timeList);
		comboTimeDataDeliveryGUI.setSize(200, 30);
		comboTimeDataDeliveryGUI.setLocation(210, 160);
		panelDataDeliveryGUI.add(comboTimeDataDeliveryGUI);
		
		
		GeneralExitBtn exitBtnDataDeliveryGUI = new GeneralExitBtn();
		panelDataDeliveryGUI.add(exitBtnDataDeliveryGUI);
		
		GeneralForwardBtn forwardBtnDataDeliveryGUI = new GeneralForwardBtn();
		//Анонимный слушатель кнопки
		forwardBtnDataDeliveryGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				if ((textAdressDataDeliveryGUI.getText().equals("")) ||
					(textDateDataDeliveryGUI.getText().equals(""))) {
					JOptionPane.showMessageDialog(panelDataDeliveryGUI, "Все поля обязательны для заполнения");
				} else {
					dispose();
					DataPersonGUI dataPersonGUI = new DataPersonGUI();
				}
			}	
		});
		panelDataDeliveryGUI.add(forwardBtnDataDeliveryGUI);
		
		GeneralBackwardBtn backwardBtnDataDeliveryGUI = new GeneralBackwardBtn();
		backwardBtnDataDeliveryGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора варианта транспортировки
				TransportGUI materialsGUI = new TransportGUI();
			}
		});
		panelDataDeliveryGUI.add(backwardBtnDataDeliveryGUI);
		
		setVisible(true);
		
	}
}