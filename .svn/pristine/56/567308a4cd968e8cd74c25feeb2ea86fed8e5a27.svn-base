package main;

import gui.MaterialsGUI;
import gui.TransportGUI;

public class ChairCalculator extends SoftFurniture{//класс для посчета стоимости материала на раскладной диван

	public static double priceCalculationChair = 0;//переменная для конечного подсчета цены
	
	//переменные, для нахождения цены на каркасс, мягкий материал и обшивку
	private int priceCarcass; 
	private int priceSoft;
	private int priceCladding;
	private final int PRICE_MATERIAL_WORK_CHAIR = 9000;//переменная для сборки
	
	public static double getPriceCalculationChair() {
		return priceCalculationChair; 
	}
	
	private String chair;//для использования перегрузки
	
	public ChairCalculator() {//вызов методов в определенном порядке
		materiaConsumptionSoftFurniture();
		materialsSoftFurniture();
	    priceCalculation();
	    priceMastersWork();
	    
	    if (TransportGUI.transportDecision == "Да") {//прибаляем стоимость транспортировки при выборе на форме
	    	priceCalculationChair += 3000;
	    }
	    System.out.println(priceCalculationChair);
	}
	
	@Override
	public void materiaConsumptionSoftFurniture() {//использование перегрузки 
		MaterialConsumption.materialConsumption(chair);
		
	}

	@Override
	public void materialsSoftFurniture() {//поиск цены на каркас
		for (int i=0; i<4; i++) {// поиск выбранного материала
	    	for (int j=0; j<2; j++) {//поиск цены выбранного материала
	    		if (PriceListMaterials.arrayPriceCarcass[i][j]  == MaterialsGUI.typeCarcass) {//сохраняем данные
	    			priceCarcass = Integer.valueOf(PriceListMaterials.arrayPriceCarcass[i][j+1]);// преобразуем число в нужный тип данных
	    			break;
	    		}
	    	}
	    }
	    for (int i=0; i<5; i++) {//поиск цены на мягкий элемент
	    	for (int j=0; j<2; j++) {
	    		if (PriceListMaterials.arrayPriceSoft[i][j]  == MaterialsGUI.typeSoft) {
	    			priceSoft = Integer.valueOf(PriceListMaterials.arrayPriceSoft[i][j+1]);
	    			break;
	    		}
	    	}
	    }
	    for (int i=0; i<4; i++) {//поиск цены на обшивку
	    	for (int j=0; j<2; j++) {
	    		if (PriceListMaterials.arrayPriceFacing[i][j]  == MaterialsGUI.typeCladding) {
	    			priceCladding = Integer.valueOf(PriceListMaterials.arrayPriceFacing[i][j+1]);
	    			break;
	    		}
	    	}
	    }
		
	}
	
	
	@Override
	public void priceCalculation() {//считаем конечную цену производства товара
		priceCalculationChair = (MaterialConsumption.materialConsumptionCarcass * priceCarcass) + (MaterialConsumption.materialConsumptionSoft * priceSoft) + (MaterialConsumption.materialConsumptionTrim * priceCladding);
		
	}

	@Override
	public void priceMastersWork() {//прибавляем к конечной цене, цену сборки
			 
			 priceCalculationChair = priceCalculationChair +PRICE_MATERIAL_WORK_CHAIR;
	}

	public int getMastersWork() {return PRICE_MATERIAL_WORK_CHAIR;}// для теста 

	public double getpriceCalculationChair() {return priceCalculationChair; }
}
