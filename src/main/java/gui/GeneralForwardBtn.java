//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;

//��������� ����� GeneralForwardBtn, ������� ����������� �� ������ JButton
//����� ������ ��� ����, ����� ������������ ������������� ������ �� ������ ������
//������ ��������� �� ������ ����� ����������� �� �����, �.� ����������� ������ ��������
public final class GeneralForwardBtn extends JButton {
	
	//����������� ������
	public GeneralForwardBtn() {
		
		//� ������� super() ��������� ������� ���������
		//������������� ������. ����� ������� ���������
		//��������� ������ JButton
		super();
		
		//��������� ������
		setText("�����");
		setSize(100, 30);
		setLocation(460, 210);
	
	}

}