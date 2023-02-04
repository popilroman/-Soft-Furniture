package gui;

//Библиотека, которая предоставляет компоненты графического интерфейса
import javax.swing.*;
//Библиотека, которая предоставляет интерфейсы и классы для работы
//с различными типами событий, запускаемых компонентами
import java.awt.event.*;
//BufferedReader оборачивает внутри него объект Reader, 
//который автоматически считывает данные из источника (например, файла) 
//и сохраняет их в buffer (буфер) BufferedReader
import java.io.BufferedReader;
//Класс File пакета java.io используется для управления информацией о файлах и каталогах.
import java.io.File;
//Сигнализирует о попытке открыть файл, который по указанному пути отсутствует
import java.io.FileNotFoundException;
//Класс FileReader используется для чтения потоков символов
import java.io.FileReader;
//Сигналы о том, что произошло какое-то исключение ввода-вывода. 
//Этот класс — это общий класс исключений, создаваемых сбоем или прерванные операции ввода-вывода
import java.io.IOException;

public final class GroupInformation extends JFrame{
	
	private JPanel panelGroupInformation;
	private JLabel titleGroupInformation;
	private JLabel teamLeadGroupInformation;
	private JLabel firstDevGroupInformation;
	private JLabel secondDevGroupInformation;
	private JLabel thirdDevGroupInformation;
	
	public GroupInformation() {
		
		super();
		setTitle("Информация о группе");
		setResizable(false);
		setSize(600, 300);
		setLocationRelativeTo(null);
		
		panelGroupInformation = new JPanel();
		panelGroupInformation.setLayout(null);
		panelGroupInformation.revalidate();
		add(panelGroupInformation);
		
		titleGroupInformation = new JLabel("Состав группы:");
		titleGroupInformation.setSize(210, 20);
		titleGroupInformation.setLocation(240, 10);
		panelGroupInformation.add(titleGroupInformation);
		
		teamLeadGroupInformation = new JLabel("Модератор: Попиль Р.А - №21130210");
		teamLeadGroupInformation.setSize(240, 20);
		teamLeadGroupInformation.setLocation(190, 40);
		panelGroupInformation.add(teamLeadGroupInformation);
		
		firstDevGroupInformation = new JLabel("Разработчик 1: Галицына П.М - №21130424");
		firstDevGroupInformation.setSize(260, 20);
		firstDevGroupInformation.setLocation(180, 80);
		panelGroupInformation.add(firstDevGroupInformation);
		
		secondDevGroupInformation = new JLabel("Разработчик 2: Васильева А.В - №21130751");
		secondDevGroupInformation.setSize(260, 20);
		secondDevGroupInformation.setLocation(180, 120);
		panelGroupInformation.add(secondDevGroupInformation);
		
		thirdDevGroupInformation = new JLabel("Разработчик 3: Киреев Р.В - №21130095");
		thirdDevGroupInformation.setSize(240, 20);
		thirdDevGroupInformation.setLocation(190, 160);
		panelGroupInformation.add(thirdDevGroupInformation);
		
		GeneralBackwardBtn backwardBtnGroupInformation = new GeneralBackwardBtn();
		backwardBtnGroupInformation.setLocation(20, 210);
		backwardBtnGroupInformation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				InitialGUI initialGUI = new InitialGUI();
			}
		});
		panelGroupInformation.add(backwardBtnGroupInformation);
		
		setVisible(true);
		
	}
}
