//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;

//Публичный класс графического интерфейса c типом мебели
public final class MaterialsGUI extends JFrame {
	
	//Списки строк со значениями материалов
	
	static String[] carcass = {"Выберите каркас", "Фанера", "ДСП", "ДВП", "Дерево"};
	static String[] softElement = {"Выберите набивку", "Поропласт - средне-жесткий", "Поролон - мягкий", "Синтепон - мягкий", "Синтепух - мягкий", "Конский волос - жесткий"};
	static String[] cladding = {"Выберите обшивку", "Микрофибра", "Велюр", "Нат. кожа", "Искуст. кожа", "Замша"};
	
	//для сохранения выбранных данных
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
	//Конструктор класса
	public MaterialsGUI() {
		
		super();
		setTitle("Материалы мебели");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		panelMaterialsGUI = new JPanel();
		panelMaterialsGUI.setLayout(null);
		panelMaterialsGUI.revalidate();
		add(panelMaterialsGUI);
		
		
		titleMaterialsGUI = new JLabel("Выберите материалы мебели");
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
		//Анонимный слушатель кнопки
		forwardBtnMaterialsGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				if ((carcassBoxMaterialsGUI.getSelectedItem().toString() == "Выберите каркас") ||
					(softElementBoxMaterialsGUI.getSelectedItem().toString() == "Выберите набивку") ||
					(claddingBoxMaterialsGUI.getSelectedItem().toString() == "Выберите обшивку")) {
					JOptionPane.showMessageDialog(panelMaterialsGUI, "Для продолжения выберите материалы");
				} else {
					typeCarcass = (String)carcassBoxMaterialsGUI.getSelectedItem(); //выбраннвй материал сохраняется в переменную 
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
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора типа мебели
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelMaterialsGUI.add(backwardBtnMaterialsGUI);
		
		setVisible(true);
	}

}