//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;

//Публичный класс начального графического интерфейса
public final class InitialGUI extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem groupReference;
	
	private JPanel panelInitialGUI;
	
	private JLabel titleInitialGUI;
	
	
	//Конструктор класса InitialGUI
	public InitialGUI() {
		super();
		setTitle("Добро пожаловать!");
		setResizable(false);
		setSize(600, 300);
		setLocationRelativeTo(null);
		
		panelInitialGUI = new JPanel();
		panelInitialGUI.setLayout(null);
		panelInitialGUI.revalidate();
		add(panelInitialGUI);
		
		
		titleInitialGUI = new JLabel("Добро пожаловать в калькулятор!");
		titleInitialGUI.setSize(210, 20);
		titleInitialGUI.setLocation(200, 10);
		panelInitialGUI.add(titleInitialGUI);
		
		menuBar = new JMenuBar();
		menu = new JMenu("Меню");
		groupReference = new JMenuItem("Справка о группе разработчиков");
		groupReference.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				GroupInformation windowGroup = new GroupInformation();
			}
		});
		menu.add(groupReference);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		GeneralExitBtn exitBtnInitialGUI = new GeneralExitBtn();
		exitBtnInitialGUI.setLocation(20, 190);
		panelInitialGUI.add(exitBtnInitialGUI);
		
		
		GeneralForwardBtn forwardBtnInitialGUI = new GeneralForwardBtn();
		forwardBtnInitialGUI.setLocation(460, 190);
		//Анонимный слушатель кнопки
		forwardBtnInitialGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора типа мебели
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelInitialGUI.add(forwardBtnInitialGUI);
		
		
		setVisible(true);
		
	}
}
