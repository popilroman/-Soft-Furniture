package main;

import gui.ChairSizeGUI;
import gui.FoldingSofaSizeGUI;
import gui.SofaSizeGUI;

public class MaterialConsumption {
	//особый коэффициент, который расчитывается по формуле = средний размер изделия(M/XL) / средний размер изделия(L), где средний размер = (длинна + высота + глубина)/3
	static double averageValue;
	//переменные, необходимые для дальнейшего расчета и означающие 
	public static double materialConsumptionCarcass, materialConsumptionSoft, materialConsumptionTrim;
	
	public static void materialConsumption(String Sofa,String FoldingSofa){ //одинаковые
		if (SofaSizeGUI.XL==true || FoldingSofaSizeGUI.XL==true) {// задаем размеры в соответствие с выбранным на форме размером
			averageValue = 1.20; // расчет ((2600+1100+1200)/3)/1366
			materialConsumptionCarcass = 5.44 * averageValue; // здесь умножаем коэффициент на количество материала (кв.м), необходимого для сборги изделия(L)
			materialConsumptionSoft = 1.36 * averageValue;// данные величины были найдены с помощью специальной программы по расчету необходимых материалов 
			materialConsumptionTrim = Math.ceil(9.62*averageValue); //округляем
	    }
		else if (SofaSizeGUI.L==true || FoldingSofaSizeGUI.L==true) {
			materialConsumptionCarcass = 5.44;
			materialConsumptionSoft = 3.8;
			materialConsumptionTrim = 10; // по расчетам 9.62
	    }
		else if (SofaSizeGUI.M==true || FoldingSofaSizeGUI.M==true) {
			averageValue = 0.81; //расчет ((1600+800+900)/3)/1366;
			materialConsumptionCarcass = 5.44 * averageValue; 	
			materialConsumptionSoft = 1.36 * averageValue;
			materialConsumptionTrim = Math.ceil(9.62*averageValue); //округляем
		}
	    }
	public static void materialConsumption(String Chair){
				if (ChairSizeGUI.XL==true) {         // задаем размеры в соответствие с выбранным на форме условным размером
					averageValue = 1.08; //расчет ((940+800+1100)/3)/873;
					materialConsumptionCarcass = 0.47 * averageValue; 	
					materialConsumptionSoft = 1.39 * averageValue;
					materialConsumptionTrim = Math.ceil(2.68*averageValue); //округляем
			    	
			    }
				else if (ChairSizeGUI.L==true) {
					materialConsumptionCarcass = 0.47;
					materialConsumptionSoft = 1.39;
					materialConsumptionTrim = 3; // по расчетам 2.68
			    	
			    }
				else if (ChairSizeGUI.M==true) {
					averageValue = 0.92; //расчет((700+600+1100)/3)/873
					materialConsumptionCarcass = 0.47 * averageValue; 	
					materialConsumptionSoft = 1.39 * averageValue;
					materialConsumptionTrim = Math.ceil(2.68*averageValue); //округляем
			    }
	}
	public static void materialConsumption(int constantTrimPuf) { // у пуфа только один стандартный размер
		materialConsumptionCarcass = 1.05;
		materialConsumptionSoft = 0.75;
		materialConsumptionTrim = constantTrimPuf; // по расчетам 1.25
	}
}
