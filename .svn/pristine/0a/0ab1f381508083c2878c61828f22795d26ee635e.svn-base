//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
import java.text.ParseException;

//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;
//Библиотека, которая предоставляет классы и интерфейсы, работающие с 
//редактируемыми и нередактируемыми текстовыми компонентами
import javax.swing.text.*;

import main.ChairCalculator;
import main.FoldingSofaCalculator;
import main.PufCalculator;
import main.SofaCalculator;

//Публичный класс графического интерфейса c данными пользователя
public final class DataPersonGUI extends JFrame {
	
	private JPanel panelDataPersonGUI;
	
	private JLabel titleDataPersonGUI;
	private JLabel nameDataPersonGUI;
	private JLabel phoneDataPersonGUI;
	
	private static JTextField textNameDataPersonGUI;
	private static JFormattedTextField textPhoneDataPersonGUI;
	
	public static JTextField getTextNameDataPersonGUI() {
		return textNameDataPersonGUI;
	}
	
	public static JTextField getTextPhoneDataPersonGUI() {
		return textPhoneDataPersonGUI;
	}
	
	private String namePerson;
	private String phonePerson;
	
	//Конструктор класса
	public DataPersonGUI() {
		super();
		setTitle("Доставка");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelDataPersonGUI = new JPanel();
		panelDataPersonGUI.setLayout(null);
		panelDataPersonGUI.revalidate();
		add(panelDataPersonGUI);
		
		
		titleDataPersonGUI = new JLabel("Введите свои данные");
		titleDataPersonGUI.setSize(230, 20);
		titleDataPersonGUI.setLocation(230, 10);
		panelDataPersonGUI.add(titleDataPersonGUI);
		
		nameDataPersonGUI = new JLabel("Ф.И.О:");
		nameDataPersonGUI.setSize(150, 20);
		nameDataPersonGUI.setLocation(150, 60);
		panelDataPersonGUI.add(nameDataPersonGUI);
		
		textNameDataPersonGUI = new JTextField();
		textNameDataPersonGUI.setSize(200, 30);
		textNameDataPersonGUI.setLocation(210, 60);
		textNameDataPersonGUI.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((Character.isDigit(c)) || 
					(c == KeyEvent.VK_BACK_SPACE) || 
					(c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {;}

			@Override
			public void keyReleased(KeyEvent e) {;}

			
		});
		panelDataPersonGUI.add(textNameDataPersonGUI);
		
		phoneDataPersonGUI = new JLabel("Номер телефон:");
		phoneDataPersonGUI.setSize(150, 20);
		phoneDataPersonGUI.setLocation(100, 100);
		panelDataPersonGUI.add(phoneDataPersonGUI);
		
		try {
			MaskFormatter phoneFormat = new MaskFormatter("+#(###)###-##-##");
			textPhoneDataPersonGUI = new JFormattedTextField(phoneFormat);
			textPhoneDataPersonGUI.setSize(200, 30);
			textPhoneDataPersonGUI.setLocation(210, 100);
			panelDataPersonGUI.add(textPhoneDataPersonGUI);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		GeneralExitBtn exitBtnDataPersonGUI = new GeneralExitBtn();
		panelDataPersonGUI.add(exitBtnDataPersonGUI);
		
		GeneralForwardBtn forwardBtnDataPersonGUI = new GeneralForwardBtn();
		forwardBtnDataPersonGUI.setText("Рассчитать");
		forwardBtnDataPersonGUI.setSize(110, 30);
		//Анонимный слушатель кнопки
		forwardBtnDataPersonGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				if ((textPhoneDataPersonGUI.getText().equals("")) ||
					(textNameDataPersonGUI.getText().equals(""))) { 
					JOptionPane.showMessageDialog(panelDataPersonGUI, "Все поля обязательны для заполнения");
				} else {
					if (TypeGUI.sofa == 1) {
						SofaCalculator sofaCalculator = new SofaCalculator();
						}
						else if (TypeGUI.foldSofa == 1) {
							//System.out.println(TypeGUI.foldSofa);
							FoldingSofaCalculator foldingSofaCalculator = new FoldingSofaCalculator();
							}
						else if (TypeGUI.chair == 1) {
							ChairCalculator chairCalculator = new ChairCalculator();
							}
						else if (TypeGUI.puf == 1) {
							PufCalculator pufCalculator = new PufCalculator();
							}
					//ResultGUI resultGUI = new ResultGUI();
					dispose();
					ResultGUI resultGUI = new ResultGUI();
				}
				
			}	
		});
		panelDataPersonGUI.add(forwardBtnDataPersonGUI);
		
		GeneralBackwardBtn backwardBtnDataPersonGUI = new GeneralBackwardBtn();
		backwardBtnDataPersonGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора варианта транспортировки
				TransportGUI materialsGUI = new TransportGUI();
			}
		});
		panelDataPersonGUI.add(backwardBtnDataPersonGUI);
		
		setVisible(true);
		
	}
	
}