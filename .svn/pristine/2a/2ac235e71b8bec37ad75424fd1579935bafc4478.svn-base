//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;

//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;

//Публичный класс графического интерфейса c типом мебели
public final class TypeGUI extends JFrame{
	
	//Список строк со значениями типов мягкой мебели
	
	static String[] types = {"Выберите тип...", "Диван", "Раскладной диван", "Кресло", "Пуф"};
	public static int sofa = 0, foldSofa = 0, chair = 0 , puf = 0;
	
    static String typeOfFurniture;
	
	private JPanel panelTypeGUI; 
	private JLabel titleTypeGUI;
	private JComboBox typesBoxTypeGUI;
	public static String getTypeOfFurniture() {
		return typeOfFurniture;
	}
	//Конструктор класса
	public TypeGUI() {
		super();
		setTitle("Тип мебели");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		panelTypeGUI = new JPanel();
		panelTypeGUI.setLayout(null);
		panelTypeGUI.revalidate();
		add(panelTypeGUI);
		
		
		titleTypeGUI = new JLabel("Выберите тип мебели");
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
		//Анонимный слушатель кнопки
		forwardBtnTypeGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				typeOfFurniture = typesBoxTypeGUI.getSelectedItem().toString();
				
				if (typesBoxTypeGUI.getSelectedItem().toString() == "Диван") {
					sofa=1;
					//Освобождаются ресурсы, используемые окном и экземпляр удаляется
					dispose();
					SofaSizeGUI sofaSizeGUI = new SofaSizeGUI();
					
				} else if (typesBoxTypeGUI.getSelectedItem().toString() == "Раскладной диван") {
					foldSofa=1;
					//Освобождаются ресурсы, используемые окном и экземпляр удаляется
					dispose();
					FoldingSofaSizeGUI foldingSofaSizeGUI = new FoldingSofaSizeGUI();
					
				} else if (typesBoxTypeGUI.getSelectedItem().toString() == "Кресло") {
					chair=1;
					//Освобождаются ресурсы, используемые окном и экземпляр удаляется
					dispose();
					ChairSizeGUI chairSizeGUI = new ChairSizeGUI();
					
				} else if (typesBoxTypeGUI.getSelectedItem().toString() == "Пуф") {
					puf=1;
					//Освобождаются ресурсы, используемые окном и экземпляр удаляется
					dispose();
					MaterialsGUI materialsGUI = new MaterialsGUI();
				} else {JOptionPane.showMessageDialog(panelTypeGUI, "Для продолжения сделайте выбор");}
			}
		});
		panelTypeGUI.add(forwardBtnTypeGUI);
		 
		
		GeneralBackwardBtn backwardBtnTypeGUI = new GeneralBackwardBtn();
		backwardBtnTypeGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI приветствия
				InitialGUI initialGUI = new InitialGUI();
			}
		});
		panelTypeGUI.add(backwardBtnTypeGUI);
		
		setVisible(true);
	}
	
	public Object getcheckingLab1() {return titleTypeGUI;}

}
