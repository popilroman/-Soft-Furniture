//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;

//Публичный класс графического интерфейса выбор размера кресла
public final class ChairSizeGUI extends JFrame {
	
	static String sizeOfChair;
	public static boolean XL;//вспомогательные переменные
    public static boolean L;
    public static boolean M;
	
    private JPanel panelChairSizeGUI;
    private JLabel titleChairSizeGUI;
    private JRadioButton smallSizeChairSizeGUI;
    private JRadioButton mediumSizeChairSizeGUI;
    private JRadioButton largeSizeChairSizeGUI;
    private ButtonGroup radioButtonGroup;
    
    public static String getSizeOfChair() {
    	return sizeOfChair;
    }
    
	public ChairSizeGUI() {
		
		super();
		setTitle("Размер мебели");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelChairSizeGUI = new JPanel();
		panelChairSizeGUI.setLayout(null);
		panelChairSizeGUI.revalidate();
		add(panelChairSizeGUI);
		
		titleChairSizeGUI = new JLabel("Выберите размер кресла");
		titleChairSizeGUI.setSize(210, 20);
		titleChairSizeGUI.setLocation(220, 10);
		panelChairSizeGUI.add(titleChairSizeGUI);

		smallSizeChairSizeGUI = new JRadioButton();
		smallSizeChairSizeGUI.setText("700х600х1100");
		smallSizeChairSizeGUI.setSize(210, 20);
		smallSizeChairSizeGUI.setLocation(220, 60);
		panelChairSizeGUI.add(smallSizeChairSizeGUI);
		
		mediumSizeChairSizeGUI = new JRadioButton();
		mediumSizeChairSizeGUI.setText("820х700х1100");
		mediumSizeChairSizeGUI.setSize(210, 20);
		mediumSizeChairSizeGUI.setLocation(220, 110);
		panelChairSizeGUI.add(mediumSizeChairSizeGUI);
		
		largeSizeChairSizeGUI = new JRadioButton();
		largeSizeChairSizeGUI.setText("940х800х1100");
		largeSizeChairSizeGUI.setSize(210, 20);
		largeSizeChairSizeGUI.setLocation(220, 160);
		panelChairSizeGUI.add(largeSizeChairSizeGUI);
		
		//Экземпляр класса ButtonGroup, в который добавлются JRadioButton, то есть группа кнопок
		//Для того, чтобы можно было выбрать только один JRadioButton
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(smallSizeChairSizeGUI);
		radioButtonGroup.add(mediumSizeChairSizeGUI);
		radioButtonGroup.add(largeSizeChairSizeGUI);
		
		GeneralExitBtn exitBtnChairSizeGUI = new GeneralExitBtn();
		panelChairSizeGUI.add(exitBtnChairSizeGUI);
		
		GeneralForwardBtn forwardBtnChairSizeGUI = new GeneralForwardBtn();
		forwardBtnChairSizeGUI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((smallSizeChairSizeGUI.isSelected() == true) ||
					(mediumSizeChairSizeGUI.isSelected() == true) ||
					(largeSizeChairSizeGUI.isSelected() == true)) {
					if (smallSizeChairSizeGUI.isSelected() == true) {
						sizeOfChair = smallSizeChairSizeGUI.getText();
						M = smallSizeChairSizeGUI.isSelected();
						dispose();
						MaterialsGUI materialsGUI = new MaterialsGUI();
					} else if (mediumSizeChairSizeGUI.isSelected() == true) {
						sizeOfChair = mediumSizeChairSizeGUI.getText();
						L = mediumSizeChairSizeGUI.isSelected();
						dispose();
						MaterialsGUI materialsGUI = new MaterialsGUI();
					} else {
						sizeOfChair = largeSizeChairSizeGUI.getText();
						XL = largeSizeChairSizeGUI.isSelected();
						dispose();
						MaterialsGUI materialsGUI = new MaterialsGUI();
					}
				} else {
					JOptionPane.showMessageDialog(panelChairSizeGUI, "Для продолжения необходимо выбрать размер");
				}
			}
			
		});
		panelChairSizeGUI.add(forwardBtnChairSizeGUI);
		
		GeneralBackwardBtn backwardBtnChairSizeGUI = new GeneralBackwardBtn();
		backwardBtnChairSizeGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора мебели
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelChairSizeGUI.add(backwardBtnChairSizeGUI);
		
		setVisible(true);
	}
}
