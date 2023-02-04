//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;


import main.ChairCalculator;
import main.PufCalculator;
import main.SofaCalculator;
import main.FoldingSofaCalculator;
import main.PriceListMaterials;


//��������� ����� ������������ ���������� c ������� ������������
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
	
	//����������� ������
	public ResultGUI() {
		super();
		setTitle("����");
		setSize(600, 340);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelResultGUI = new JPanel();
		panelResultGUI.setLayout(null);
		panelResultGUI.revalidate();
		add(panelResultGUI);
		
		titleResultGUI = new JLabel("����");
		titleResultGUI.setSize(100, 20);
		titleResultGUI.setLocation(260, 10);
		panelResultGUI.add(titleResultGUI);
		
		typeResultGUI = new JLabel("���:");
		typeResultGUI.setSize(50, 20);
		typeResultGUI.setLocation(30, 50);
		panelResultGUI.add(typeResultGUI);
		
		textTypeResultGUI = new JTextField();
		textTypeResultGUI.setSize(150, 30);
		textTypeResultGUI.setLocation(110, 50);
		textTypeResultGUI.setEditable(false);
		textTypeResultGUI.setText(TypeGUI.getTypeOfFurniture());
		panelResultGUI.add(textTypeResultGUI);
		
		sizeResultGUI = new JLabel("������:");
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
			textSizeResultGUI.setText("50�50�50");
		}
		panelResultGUI.add(textSizeResultGUI);
		
		deliveryResultGUI = new JLabel("�������� + ������:");
		deliveryResultGUI.setSize(150, 20);
		deliveryResultGUI.setLocation(30, 130);
		panelResultGUI.add(deliveryResultGUI);
		
		textDeliveryResultGUI = new JTextField();
		textDeliveryResultGUI.setSize(150, 30);
		textDeliveryResultGUI.setLocation(150, 130);
		textDeliveryResultGUI.setEditable(false);
		textDeliveryResultGUI.setText(TransportGUI.getTransportDecision());
		panelResultGUI.add(textDeliveryResultGUI);
		
		carcassResultGUI = new JLabel("������:");
		carcassResultGUI.setSize(50, 20);
		carcassResultGUI.setLocation(340, 50);
		panelResultGUI.add(carcassResultGUI);
		
		textCarcassResultGUI = new JTextField();
		textCarcassResultGUI.setSize(150, 30);
		textCarcassResultGUI.setLocation(400, 50);
		textCarcassResultGUI.setEditable(false);
		textCarcassResultGUI.setText(MaterialsGUI.getTypeCarcass());
		panelResultGUI.add(textCarcassResultGUI);
		
		softResultGUI = new JLabel("�������:");
		softResultGUI.setSize(60, 20);
		softResultGUI.setLocation(320, 90);
		panelResultGUI.add(softResultGUI);
		
		textSoftResultGUI = new JTextField();
		textSoftResultGUI.setSize(175, 30);
		textSoftResultGUI.setLocation(380, 90);
		textSoftResultGUI.setEditable(false);
		textSoftResultGUI.setText(MaterialsGUI.getTypeSoft());
		panelResultGUI.add(textSoftResultGUI);
		
		claddingResultGUI = new JLabel("������:");
		claddingResultGUI.setSize(50, 20);
		claddingResultGUI.setLocation(340, 130);
		panelResultGUI.add(claddingResultGUI);
		
		textCladdingResultGUI = new JTextField();
		textCladdingResultGUI.setSize(150, 30);
		textCladdingResultGUI.setLocation(400, 130);
		textCladdingResultGUI.setEditable(false);
		textCladdingResultGUI.setText(MaterialsGUI.getTypeCladding());
		panelResultGUI.add(textCladdingResultGUI);
		
		deviceResultGUI = new JLabel("��������:");
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
		
		amountResultGUI = new JLabel("�����:");
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
		forwardBtnResultGUI.setText("���");
		//��������� ��������� ������
		ActionListener createPdf = new ListenerPDF(); //������� ���������
		forwardBtnResultGUI.addActionListener(createPdf); 
		panelResultGUI.add(forwardBtnResultGUI);
		
		setVisible(true);
		
	}
	public String [][] getCheckingObject() {return PriceListMaterials.arrayPriceCarcass;}// ��� ����� 
}