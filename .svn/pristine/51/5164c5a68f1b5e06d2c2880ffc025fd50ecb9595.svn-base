//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;

//Публичный класс графического интерфейса выбор размера дивана
public final class SofaSizeGUI extends JFrame{
	
	static String sizeOfSofa;
	
	public static boolean XL;//вспомогательные переменные для выбора нужных габаритов
    public static boolean L;
    public static boolean M;
    
    private JPanel panelSofaSizeGUI;
    private JLabel titleSofaSizeGUI;
    private JRadioButton smallSizeSofaSizeGUI;
    private JRadioButton mediumSizeSofaSizeGUI;
    private JRadioButton largeSizeSofaSizeGUI;
    private ButtonGroup radioButtonGroup;
    public static String getSizeOfSofa() {
    	return sizeOfSofa;
    }
	public SofaSizeGUI() {
		
		super();
		setTitle("Размер мебели");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelSofaSizeGUI = new JPanel();
		panelSofaSizeGUI.setLayout(null);
		panelSofaSizeGUI.revalidate();
		add(panelSofaSizeGUI);
		
		titleSofaSizeGUI = new JLabel("Выберите размер дивана");
		titleSofaSizeGUI.setSize(210, 20);
		titleSofaSizeGUI.setLocation(220, 10);
		panelSofaSizeGUI.add(titleSofaSizeGUI);
		
		smallSizeSofaSizeGUI = new JRadioButton("M", false);
		smallSizeSofaSizeGUI.setText("1600х800х900");
		smallSizeSofaSizeGUI.setSize(210, 20);
		smallSizeSofaSizeGUI.setLocation(220, 60);
		panelSofaSizeGUI.add(smallSizeSofaSizeGUI);
		
		mediumSizeSofaSizeGUI = new JRadioButton("L", false);
		mediumSizeSofaSizeGUI.setText("2100х950х1050");
		mediumSizeSofaSizeGUI.setSize(210, 20);
		mediumSizeSofaSizeGUI.setLocation(220, 110);
		panelSofaSizeGUI.add(mediumSizeSofaSizeGUI);
		
		largeSizeSofaSizeGUI = new JRadioButton("XL", false);
		largeSizeSofaSizeGUI.setText("2600х1100х1200");
		largeSizeSofaSizeGUI.setSize(210, 20);
		largeSizeSofaSizeGUI.setLocation(220, 160);
		panelSofaSizeGUI.add(largeSizeSofaSizeGUI);
		
		//Экземпляр класса ButtonGroup, в который добавлются JRadioButton, то есть группа кнопок
		//Для того, чтобы можно было выбрать только один JRadioButton
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(smallSizeSofaSizeGUI);
		radioButtonGroup.add(mediumSizeSofaSizeGUI);
		radioButtonGroup.add(largeSizeSofaSizeGUI);
		
		
		
		
		GeneralExitBtn exitBtnSofaSizeGUI = new GeneralExitBtn();
		panelSofaSizeGUI.add(exitBtnSofaSizeGUI);
		
		GeneralForwardBtn forwardBtnSofaSizeGUI = new GeneralForwardBtn();
		forwardBtnSofaSizeGUI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((smallSizeSofaSizeGUI.isSelected() == true) ||
					(mediumSizeSofaSizeGUI.isSelected() == true) ||
					(largeSizeSofaSizeGUI.isSelected() == true)) {
					if (smallSizeSofaSizeGUI.isSelected() == true) {
						sizeOfSofa = smallSizeSofaSizeGUI.getText();
						M = smallSizeSofaSizeGUI.isSelected();
						dispose();
						MaterialsGUI materialsGUI = new MaterialsGUI();
					} else if (mediumSizeSofaSizeGUI.isSelected() == true) {
						sizeOfSofa = mediumSizeSofaSizeGUI.getText();
						L = mediumSizeSofaSizeGUI.isSelected();
						dispose();
						MaterialsGUI materialsGUI = new MaterialsGUI();
					} else {
						sizeOfSofa = largeSizeSofaSizeGUI.getText();
						XL = largeSizeSofaSizeGUI.isSelected();
						dispose();
						MaterialsGUI materialsGUI = new MaterialsGUI();
					}
				} else {
					JOptionPane.showMessageDialog(panelSofaSizeGUI, "Для продолжения необходимо выбрать размер");
				}
			}
			
		});
		panelSofaSizeGUI.add(forwardBtnSofaSizeGUI);
		
		GeneralBackwardBtn backwardBtnSofaSizeGUI = new GeneralBackwardBtn();
		backwardBtnSofaSizeGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора мебели
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelSofaSizeGUI.add(backwardBtnSofaSizeGUI);
		
		setVisible(true);
	}
}
