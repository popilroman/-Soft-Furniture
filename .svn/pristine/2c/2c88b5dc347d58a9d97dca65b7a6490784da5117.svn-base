
package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.pdf.BaseFont;

import main.ChairCalculator;
import main.FoldingSofaCalculator;
import main.PufCalculator;
import main.SofaCalculator;

public class ListenerPDF implements ActionListener {
	//private Image loadImage(String path) {
		//return new imageicon(getClass().getResource(path)).getImage();
	//}
	
		
		@Override
	public void actionPerformed(ActionEvent e) {
			String path = "Квитанция.pdf";
			PdfWriter pdfWriter = null;
			try {
				pdfWriter = new PdfWriter(path);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);



			
			
			

		          
		      

			
			
			
			pdfDocument.setDefaultPageSize(PageSize.A4);
			Document document = new Document(pdfDocument);
			
			String imagePath = "logo.png";
			ImageData imageData = null;
			try {
				imageData = ImageDataFactory.create(imagePath);
			} catch (MalformedURLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			Image image = new Image(imageData);
			document.add(image);
			
			pdfDocument.setDefaultPageSize(PageSize.A4);
			String FONT_FILENAME = "arial.ttf";
			PdfFont font = null;
			try {
				font = PdfFontFactory.createFont(FONT_FILENAME, PdfEncodings.IDENTITY_H);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			double summ;
			float threecol = 190f;
			document.setFont(font);
			float twocol = 285f;
			float twocol150 = twocol+150f;
			float threeColumnWidth[]= {threecol,threecol,threecol};
			String sumStr;
			float twocolumnWidth[]= {twocol150,twocol};
			float fullwidth[]= {threecol*3};
			Paragraph onesp = new Paragraph("\n");
			
			Table table = new Table(twocolumnWidth);
			table.addCell(new Cell().add("Счёт").setFontSize(20f).setBorder(Border.NO_BORDER).setBold());
			Table nestedtabe = new Table(new float[] {twocol/2,twocol/2});
			nestedtabe.addCell(getHeaderTextCell("Квитанция №"));
			nestedtabe.addCell(getHeaderTextCellValue("10220221"));
			nestedtabe.addCell(getHeaderTextCell("Организация:"));
			nestedtabe.addCell(getHeaderTextCellValue("ООО <<НПРР>>"));
			table.addCell(new Cell().add(nestedtabe).setBorder(Border.NO_BORDER));
			Border gb = new SolidBorder(Color.GRAY,2f);
			Table divider = new Table(fullwidth);
			divider.setBorder(gb);
			document.add(table);
			document.add(onesp);
			document.add(divider);
			document.add(onesp);
			Table twoColTable = new Table(twocolumnWidth);
			twoColTable.addCell(getLeftColumn("Информация о НПРР"));
			twoColTable.addCell(getLeftColumn("Информация о получении товара"));
			document.add(twoColTable.setMarginBottom(12f));
			String mesto;
			if (TransportGUI.getTransportDecision() == "Да") {
				
				mesto = DataDeliveryGUI.getTextAdressDataDeliveryGUI().getText();
			}
			else {mesto = "Карла Маркса 12 корпус 6";}
			
			Table twoColTable2 = new Table(twocolumnWidth);
			twoColTable2.addCell(getCell12fLeft("Мебельная компания", true));
			twoColTable2.addCell(getCell12fLeft("Адрес получения посылки:", true));
			twoColTable2.addCell(getCell12fLeft("Основана в 2022 году", false));
			twoColTable2.addCell(getCell12fLeft(mesto, false));
			document.add(twoColTable2);
			
			Table twoColTable3 = new Table(twocolumnWidth);
			twoColTable3.addCell(getCell12fLeft("Директор", true));
			twoColTable3.addCell(getCell12fLeft("Адрес компании:", true));
			twoColTable3.addCell(getCell12fLeft("Попиль Роман", false));
			twoColTable3.addCell(getCell12fLeft("Карла Маркса 12 корпус 6", false));
			document.add(twoColTable3);
			
			Table twoColTable5 = new Table(twocolumnWidth);
			twoColTable5.addCell(getCell12fLeft("ФИО получателя", true));
			twoColTable5.addCell(getCell12fLeft("Номер телефона:", true));
			twoColTable5.addCell(getCell12fLeft(DataPersonGUI.getTextNameDataPersonGUI().getText(), false));
			twoColTable5.addCell(getCell12fLeft(DataPersonGUI.getTextPhoneDataPersonGUI().getText(), false));
			document.add(twoColTable5);
			document.add(onesp);
			document.add(onesp);
			
			Table tableDivider2 = new Table(fullwidth);
			Border dgb = new DashedBorder(Color.GRAY,0.5f);
			document.add(tableDivider2.setBorder(dgb));
			
			Paragraph zakazPara = new Paragraph("Заказ");
			document.add(zakazPara.setBold());
			Table threeColTabel = new Table(threeColumnWidth);
			threeColTabel.setBackgroundColor(Color.BLACK,0.7f);
			threeColTabel.addCell(new Cell().add("Товар").setFontSize(10f).setFontColor(Color.WHITE).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT));
			threeColTabel.addCell(new Cell().add("Количество").setFontSize(10f).setFontColor(Color.WHITE).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
			threeColTabel.addCell(new Cell().add("Стоимость").setFontSize(10f).setFontColor(Color.WHITE).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT));
			document.add(threeColTabel);
			
			summ = FoldingSofaCalculator.getPriceCalculationFoldingSofa() + PufCalculator.getPriceCalculationPuf() + SofaCalculator.getPriceCalculationSofa() + ChairCalculator.getPriceCalculationChair();
			
			sumStr = String.format("%.2f", summ);;
			Table threeColTabel2 = new Table(threeColumnWidth);
			threeColTabel2.addCell(new Cell().add(TypeGUI.getTypeOfFurniture()).setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT));
			threeColTabel2.addCell(new Cell().add("1").setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
			threeColTabel2.addCell(new Cell().add(sumStr).setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT));
			document.add(threeColTabel2.setMarginBottom(20f));
			
			float onetwo[] = {threecol+125f,threecol*2};
			Table threeColTabel4 = new Table(onetwo);
			threeColTabel4.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
			threeColTabel4.addCell(tableDivider2).setBorder(Border.NO_BORDER);
			document.add(threeColTabel4);
			
			Table threeColTabel3 = new Table(threeColumnWidth);
			threeColTabel3.addCell(new Cell().add("").setFontSize(10f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT).setMarginLeft(10f));
			threeColTabel3.addCell(new Cell().add("Стоимость").setFontSize(10f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT));
			threeColTabel3.addCell(new Cell().add(sumStr).setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT));
			document.add(threeColTabel3);
			document.add(tableDivider2.setBorder(dgb));
			document.add(onesp);
			document.add(divider.setBorder(new SolidBorder(Color.GRAY,1)).setMarginBottom(15f));
			
			String Size = null;
			if (ChairSizeGUI.getSizeOfChair() != null) {
				Size = ChairSizeGUI.getSizeOfChair();
			}
			else if (SofaSizeGUI.getSizeOfSofa()!=null) {
				Size = SofaSizeGUI.getSizeOfSofa();
			}
			else if (FoldingSofaSizeGUI.getSizeOfFoldingSofa()!=null) {
				Size = FoldingSofaSizeGUI.getSizeOfFoldingSofa();
			}
			else if (TypeGUI.getTypeOfFurniture() == "Пуф") {
				Size ="";
			}
			
			Table tab = new Table(fullwidth);
			tab.addCell(new Cell().add("").setBold().setBorder(Border.NO_BORDER));
			document.add(tab);
			List<String> IncList = new ArrayList<>();
			IncList.add(TypeGUI.getTypeOfFurniture() + " - " +  Size + ",  материал: " + MaterialsGUI.getTypeCarcass() +" , "+ MaterialsGUI.getTypeSoft() +" , "+ MaterialsGUI.getTypeCladding()+".");
		 	IncList.add("");
		 	
		 	for(String tnc:IncList) {
		 		tab.addCell(new Cell().add(tnc).setBorder(Border.NO_BORDER));
		 	}
		 	document.add(tab);
			
			Table tb = new Table(fullwidth);
			tb.addCell(new Cell().add("").setBold().setBorder(Border.NO_BORDER));
			document.add(tb);
			
			
			document.add(onesp);
			document.add(onesp);
		 	List<String> TncList = new ArrayList<>();
		 	TncList.add("За день до получения товара с вами свяжется оператор.");
		 	TncList.add("При возникновении вопросов звонить по номеру: +7(903)356-97-90");

		 	for(String tnc:TncList) {
		 		tb.addCell(new Cell().add(tnc).setBorder(Border.NO_BORDER));
		 	}
		 	document.add(tb);
		 	document.add(onesp);
			document.add(onesp);
		 	
			
			Table ltb = new Table(fullwidth);
			ltb.addCell(new Cell().add("").setBold().setBorder(Border.NO_BORDER));
			document.add(ltb);
			
		 	List<String> TLast = new ArrayList<>();
		 	TLast.add("Разработали:");
		 	TLast.add("Попиль Роман, Галицына Полина, Васильева Анастасия, Киреев Руслан.");
		 	
		 	for(String tnc:TLast) {
		 		ltb.addCell(new Cell().add(tnc).setBorder(Border.NO_BORDER));
		 	}
		 	document.add(ltb);
		 	
		 	
		 	
		 	document.close();
		 	JOptionPane.showMessageDialog(null, "pdf created");
			System.out.println("pdf created");
		
		}
		static Cell getHeaderTextCell(String textValue) {
			return new Cell().add(textValue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT);
		}
		static Cell getHeaderTextCellValue(String textValue) {
			return new Cell().add(textValue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
		}
		 static Cell getLeftColumn(String textValue) {
			 return new Cell().add(textValue).setFontSize(12f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
			 }
		 static Cell getCell12fLeft(String textValue,Boolean isBold) {
			 Cell myCell = new Cell().add(textValue).setFontSize(12f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
			return isBold ?myCell.setBold():myCell;
		 } 
		 
		 


}
			