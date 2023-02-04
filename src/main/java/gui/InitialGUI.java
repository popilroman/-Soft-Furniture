//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;

//��������� ����� ���������� ������������ ����������
public final class InitialGUI extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem groupReference;
	
	private JPanel panelInitialGUI;
	
	private JLabel titleInitialGUI;
	
	
	//����������� ������ InitialGUI
	public InitialGUI() {
		super();
		setTitle("����� ����������!");
		setResizable(false);
		setSize(600, 300);
		setLocationRelativeTo(null);
		
		panelInitialGUI = new JPanel();
		panelInitialGUI.setLayout(null);
		panelInitialGUI.revalidate();
		add(panelInitialGUI);
		
		
		titleInitialGUI = new JLabel("����� ���������� � �����������!");
		titleInitialGUI.setSize(210, 20);
		titleInitialGUI.setLocation(200, 10);
		panelInitialGUI.add(titleInitialGUI);
		
		menuBar = new JMenuBar();
		menu = new JMenu("����");
		groupReference = new JMenuItem("������� � ������ �������������");
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
		//��������� ��������� ������
		forwardBtnInitialGUI.addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) { //��� ������� �� ������...
				//������������� �������, ������������ ����� � ��������� ���������
				dispose();
				
				//��������� ��������� ������ - GUI ������ ���� ������
				TypeGUI typeGUI = new TypeGUI();
			}
		});
		panelInitialGUI.add(forwardBtnInitialGUI);
		
		
		setVisible(true);
		
	}
}
