//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;

//Публичный класс графического интерфейса выбор размера раскладного дивана
public final class FoldingSofaSizeGUI extends JFrame {
	
	static String sizeOfFoldingSofa;
	public static boolean XL;//вспомогательные переменные
    public static boolean L;
    public static boolean M;
    
    private JPanel panelFoldingSofaSizeGUI;
    private JLabel titleFoldingSofaSizeGUI;
    private JRadioButton smallSizeFoldingSofaSizeGUI;
    private JRadioButton mediumSizeFoldingSofaSizeGUI;
    private JRadioButton largeSizeFoldingSofaSizeGUI;
    private ButtonGroup radioButtonGroup;
    
    public static String getSizeOfFoldingSofa() {
    	return sizeOfFoldingSofa;
    }
    
	public FoldingSofaSizeGUI() {
		
		super();
		setTitle("Размер мебели");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelFoldingSofaSizeGUI = new JPanel();
		panelFoldingSofaSizeGUI.setLayout(null);
		panelFoldingSofaSizeGUI.revalidate();
		add(panelFoldingSofaSizeGUI);
		
		titleFoldingSofaSizeGUI = new JLabel("Выберите размер раскладного дивана");
		titleFoldingSofaSizeGUI.setSize(230, 20);
		titleFoldingSofaSizeGUI.setLocation(180, 10);
		panelFoldingSofaSizeGUI.add(titleFoldingSofaSizeGUI);

		smallSizeFoldingSofaSizeGUI = new JRadioButton("M", false);
		smallSizeFoldingSofaSizeGUI.setText("1600х1900х900");
		smallSizeFoldingSofaSizeGUI.setSize(310, 20);
		smallSizeFoldingSofaSizeGUI.setLocation(220, 60);
		panelFoldingSofaSizeGUI.add(smallSizeFoldingSofaSizeGUI);
		
		mediumSizeFoldingSofaSizeGUI = new JRadioButton("L", false);
		mediumSizeFoldingSofaSizeGUI.setText("2100х1900х1050");
		mediumSizeFoldingSofaSizeGUI.setSize(310, 20);
		mediumSizeFoldingSofaSizeGUI.setLocation(220, 110);
		panelFoldingSofaSizeGUI.add(mediumSizeFoldingSofaSizeGUI);
		
		largeSizeFoldingSofaSizeGUI = new JRadioButton("XL", false);
		largeSizeFoldingSofaSizeGUI.setText("2600х1900х1200");
		largeSizeFoldingSofaSizeGUI.setSize(310, 20);
		largeSizeFoldingSofaSizeGUI.setLocation(220, 160);
		panelFoldingSofaSizeGUI.add(largeSizeFoldingSofaSizeGUI);
		
		//Экземпляр класса ButtonGroup, в который добавлются JRadioButton, то есть группа кнопок
		//Для того, чтобы можно было выбрать только один JRadioButton
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(smallSizeFoldingSofaSizeGUI);
		radioButtonGroup.add(mediumSizeFoldingSofaSizeGUI);
		radioButtonGroup.add(largeSizeFoldingSofaSizeGUI);
		
		
		
		
		GeneralExitBtn exitBtnFoldingSofaSizeGUI = new GeneralExitBtn();
		panelFoldingSofaSizeGUI.add(exitBtnFoldingSofaSizeGUI);
		
		GeneralForwardBtn forwardBtnFoldingSofaSizeGUI = new GeneralForwardBtn();
		forwardBtnFoldingSofaSizeGUI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((smallSizeFoldingSofaSizeGUI.isSelected() == true) ||
					(mediumSizeFoldingSofaSizeGUI.isSelected() == true) ||
					(largeSizeFoldingSofaSizeGUI.isSelected() == true)) {
					if (smallSizeFoldingSofaSizeGUI.isSelected() == true) {
						sizeOfFoldingSofa = smallSizeFoldingSofaSizeGUI.getText();
						M = smallSizeFoldingSofaSizeGUI.isSelected();
						dispose();
						DeviceGUI deviceGUI = new DeviceGUI();
					} else if (mediumSizeFoldingSofaSizeGUI.isSelected() == true) {
						sizeOfFoldingSofa = mediumSizeFoldingSofaSizeGUI.getText();
						L = mediumSizeFoldingSofaSizeGUI.isSelected();
						dispose();
						DeviceGUI deviceGUI = new DeviceGUI();
					} else {
						sizeOfFoldingSofa = largeSizeFoldingSofaSizeGUI.getText();
						XL = largeSizeFoldingSofaSizeGUI.isSelected();
						dispose();
						DeviceGUI deviceGUI = new DeviceGUI();
					}
				} else {
						JOptionPane.showMessageDialog(panelFoldingSofaSizeGUI, "Для продолжения необходимо выбрать размер");
				}
				
			}
			
		});
		panelFoldingSofaSizeGUI.add(forwardBtnFoldingSofaSizeGUI);
		
		GeneralBackwardBtn backwardBtnFoldingSofaSizeGUI = new GeneralBackwardBtn();
		backwardBtnFoldingSofaSizeGUI.addActionListener(new ActionListener() {
			//Переопределение метода интерфейса ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //При нажатии на кнопку...
				
				//Освобождаются ресурсы, используемые окном и экземпляр удаляется
				dispose();
				
				//Создается экземпляр класса - GUI выбора мебели
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelFoldingSofaSizeGUI.add(backwardBtnFoldingSofaSizeGUI);
		
		setVisible(true);
	}
}