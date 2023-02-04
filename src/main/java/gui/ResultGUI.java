//Пользовательский пакет, предназначенный для объединения классов графического интерфейса
package gui;

//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;


import main.ChairCalculator;
import main.PufCalculator;
import main.SofaCalculator;
import main.FoldingSofaCalculator;
import main.PriceListMaterials;


//Публичный класс графического интерфейса c данными пользователя
public final class ResultGUI extends JFrame{
	
	private JPanel panelResultGUI;
	private JLabel titleResultGUI;
	private JLabel typeResultGUI;
	private JTextField textTypeResultGUI;
	private JLabel sizeResultGUI;
	private JTextField textSizeResultGUI;
	private JLabel deliveryResultGUI;
	private JTextField textDeliveryResultGUI;
	private JLabel carcassResultGUI;
	private JTextField textCarcassResultGUI;
	private JLabel softResultGUI;
	private JTextField textSoftResultGUI;
	private JLabel claddingResultGUI;
	private JTextField textCladdingResultGUI;
	private JLabel amountResultGUI;
	private JTextField textAmountResultGUI;
	private JLabel deviceResultGUI;
	private JTextField textDeviceResultGUI;
	
	//Конструктор класса
	public ResultGUI() {
		super();
		setTitle("Итог");
		setSize(600, 340);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelResultGUI = new JPanel();
		panelResultGUI.setLayout(null);
		panelResultGUI.revalidate();
		add(panelResultGUI);
		
		titleResultGUI = new JLabel("Итог");
		titleResultGUI.setSize(100, 20);
		titleResultGUI.setLocation(260, 10);
		panelResultGUI.add(titleResultGUI);
		
		typeResultGUI = new JLabel("Тип:");
		typeResultGUI.setSize(50, 20);
		typeResultGUI.setLocation(30, 50);
		panelResultGUI.add(typeResultGUI);
		
		textTypeResultGUI = new JTextField();
		textTypeResultGUI.setSize(150, 30);
		textTypeResultGUI.setLocation(110, 50);
		textTypeResultGUI.setEditable(false);
		textTypeResultGUI.setText(TypeGUI.getTypeOfFurniture());
		panelResultGUI.add(textTypeResultGUI);
		
		sizeResultGUI = new JLabel("Размер:");
		sizeResultGUI.setSize(50, 20);
		sizeResultGUI.setLocation(30, 90);
		panelResultGUI.add(sizeResultGUI);
		
		textSizeResultGUI = new JTextField();
		textSizeResultGUI.setSize(150, 30);
		textSizeResultGUI.setLocation(110, 90);
		textSizeResultGUI.setEditable(false);
		if (ChairSizeGUI.getSizeOfChair() != null) {
			textSizeResultGUI.setText(ChairSizeGUI.getSizeOfChair());
		} else if (SofaSizeGUI.sizeOfSofa != null) { 
			textSizeResultGUI.setText(SofaSizeGUI.getSizeOfSofa());
		} else if (FoldingSofaSizeGUI.sizeOfFoldingSofa != null){
			textSizeResultGUI.setText(FoldingSofaSizeGUI.getSizeOfFoldingSofa());
		} else {
			textSizeResultGUI.setText("50х50х50");
		}
		panelResultGUI.add(textSizeResultGUI);
		
		deliveryResultGUI = new JLabel("Доставка + сборка:");
		deliveryResultGUI.setSize(150, 20);
		deliveryResultGUI.setLocation(30, 130);
		panelResultGUI.add(deliveryResultGUI);
		
		textDeliveryResultGUI = new JTextField();
		textDeliveryResultGUI.setSize(150, 30);
		textDeliveryResultGUI.setLocation(150, 130);
		textDeliveryResultGUI.setEditable(false);
		textDeliveryResultGUI.setText(TransportGUI.getTransportDecision());
		panelResultGUI.add(textDeliveryResultGUI);
		
		carcassResultGUI = new JLabel("Каркас:");
		carcassResultGUI.setSize(50, 20);
		carcassResultGUI.setLocation(340, 50);
		panelResultGUI.add(carcassResultGUI);
		
		textCarcassResultGUI = new JTextField();
		textCarcassResultGUI.setSize(150, 30);
		textCarcassResultGUI.setLocation(400, 50);
		textCarcassResultGUI.setEditable(false);
		textCarcassResultGUI.setText(MaterialsGUI.getTypeCarcass());
		panelResultGUI.add(textCarcassResultGUI);
		
		softResultGUI = new JLabel("Набивка:");
		softResultGUI.setSize(60, 20);
		softResultGUI.setLocation(320, 90);
		panelResultGUI.add(softResultGUI);
		
		textSoftResultGUI = new JTextField();
		textSoftResultGUI.setSize(175, 30);
		textSoftResultGUI.setLocation(380, 90);
		textSoftResultGUI.setEditable(false);
		textSoftResultGUI.setText(MaterialsGUI.getTypeSoft());
		panelResultGUI.add(textSoftResultGUI);
		
		claddingResultGUI = new JLabel("Обивка:");
		claddingResultGUI.setSize(50, 20);
		claddingResultGUI.setLocation(340, 130);
		panelResultGUI.add(claddingResultGUI);
		
		textCladdingResultGUI = new JTextField();
		textCladdingResultGUI.setSize(150, 30);
		textCladdingResultGUI.setLocation(400, 130);
		textCladdingResultGUI.setEditable(false);
		textCladdingResultGUI.setText(MaterialsGUI.getTypeCladding());
		panelResultGUI.add(textCladdingResultGUI);
		
		deviceResultGUI = new JLabel("Механизм:");
		deviceResultGUI.setSize(65, 20);
		deviceResultGUI.setLocation(190, 180);
		panelResultGUI.add(deviceResultGUI);
		
		textDeviceResultGUI = new JTextField();
		textDeviceResultGUI.setSize(150, 30);
		textDeviceResultGUI.setLocation(260, 180);
		textDeviceResultGUI.setEditable(false);
		if (TypeGUI.foldSofa == 1) {
		textDeviceResultGUI.setText(DeviceGUI.getTypeDevice());
		}
		panelResultGUI.add(textDeviceResultGUI);
		
		amountResultGUI = new JLabel("Сумма:");
		amountResultGUI.setSize(50, 20);
		amountResultGUI.setLocation(210, 220);
		panelResultGUI.add(amountResultGUI);
		
		textAmountResultGUI = new JTextField();
		textAmountResultGUI.setSize(150, 30);
		textAmountResultGUI.setLocation(260, 220);
		textAmountResultGUI.setEditable(false);
		if (ChairCalculator.getPriceCalculationChair() != 0) {
			textAmountResultGUI.setText(String.valueOf(ChairCalculator.getPriceCalculationChair()));
		} else if (SofaCalculator.priceCalculationSofa != 0) {
			textAmountResultGUI.setText(String.valueOf(SofaCalculator.getPriceCalculationSofa()));
		} else if (FoldingSofaCalculator.priceCalculationFoldingSofa != 0) {
			textAmountResultGUI.setText(String.valueOf(FoldingSofaCalculator.getPriceCalculationFoldingSofa()));
		} else {
			textAmountResultGUI.setText(String.valueOf(PufCalculator.getPriceCalculationPuf()));
		}
		panelResultGUI.add(textAmountResultGUI);
		
		
		
		GeneralExitBtn exitBtnResultGUI = new GeneralExitBtn();
		exitBtnResultGUI.setLocation(20, 250);
		panelResultGUI.add(exitBtnResultGUI);
		
		GeneralForwardBtn forwardBtnResultGUI = new GeneralForwardBtn();
		forwardBtnResultGUI.setLocation(460, 250);
		forwardBtnResultGUI.setText("Чек");
		//Анонимный слушатель кнопки
		ActionListener createPdf = new ListenerPDF(); //создаем слушатель
		forwardBtnResultGUI.addActionListener(createPdf); 
		panelResultGUI.add(forwardBtnResultGUI);
		
		setVisible(true);
		
	}
	public String [][] getCheckingObject() {return PriceListMaterials.arrayPriceCarcass;}// для теста 
}