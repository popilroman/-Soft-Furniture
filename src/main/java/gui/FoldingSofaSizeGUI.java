//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;

//��������� ����� ������������ ���������� ����� ������� ����������� ������
public final class FoldingSofaSizeGUI extends JFrame {
	
	static String sizeOfFoldingSofa;
	public static boolean XL;//��������������� ����������
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
		setTitle("������ ������");
		setSize(600, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panelFoldingSofaSizeGUI = new JPanel();
		panelFoldingSofaSizeGUI.setLayout(null);
		panelFoldingSofaSizeGUI.revalidate();
		add(panelFoldingSofaSizeGUI);
		
		titleFoldingSofaSizeGUI = new JLabel("�������� ������ ����������� ������");
		titleFoldingSofaSizeGUI.setSize(230, 20);
		titleFoldingSofaSizeGUI.setLocation(180, 10);
		panelFoldingSofaSizeGUI.add(titleFoldingSofaSizeGUI);

		smallSizeFoldingSofaSizeGUI = new JRadioButton("M", false);
		smallSizeFoldingSofaSizeGUI.setText("1600�1900�900");
		smallSizeFoldingSofaSizeGUI.setSize(310, 20);
		smallSizeFoldingSofaSizeGUI.setLocation(220, 60);
		panelFoldingSofaSizeGUI.add(smallSizeFoldingSofaSizeGUI);
		
		mediumSizeFoldingSofaSizeGUI = new JRadioButton("L", false);
		mediumSizeFoldingSofaSizeGUI.setText("2100�1900�1050");
		mediumSizeFoldingSofaSizeGUI.setSize(310, 20);
		mediumSizeFoldingSofaSizeGUI.setLocation(220, 110);
		panelFoldingSofaSizeGUI.add(mediumSizeFoldingSofaSizeGUI);
		
		largeSizeFoldingSofaSizeGUI = new JRadioButton("XL", false);
		largeSizeFoldingSofaSizeGUI.setText("2600�1900�1200");
		largeSizeFoldingSofaSizeGUI.setSize(310, 20);
		largeSizeFoldingSofaSizeGUI.setLocation(220, 160);
		panelFoldingSofaSizeGUI.add(largeSizeFoldingSofaSizeGUI);
		
		//��������� ������ ButtonGroup, � ������� ���������� JRadioButton, �� ���� ������ ������
		//��� ����, ����� ����� ���� ������� ������ ���� JRadioButton
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
						JOptionPane.showMessageDialog(panelFoldingSofaSizeGUI, "��� ����������� ���������� ������� ������");
				}
				
			}
			
		});
		panelFoldingSofaSizeGUI.add(forwardBtnFoldingSofaSizeGUI);
		
		GeneralBackwardBtn backwardBtnFoldingSofaSizeGUI = new GeneralBackwardBtn();
		backwardBtnFoldingSofaSizeGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				
				//������������� �������, ������������ ����� � ��������� ���������
				dispose();
				
				//��������� ��������� ������ - GUI ������ ������
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelFoldingSofaSizeGUI.add(backwardBtnFoldingSofaSizeGUI);
		
		setVisible(true);
	}
}