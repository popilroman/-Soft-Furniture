package main;

import gui.DeviceGUI;
import gui.MaterialsGUI;
import gui.TransportGUI;

public class FoldingSofaCalculator extends SoftFurniture{//класс для посчета стоимости материала на раскладной диван

	public static double priceCalculationFoldingSofa = 0;//переменная для конечного подсчета цены

	//переменные, для нахождения цены на каркасс, мягкий материал и обшивку
	private int priceCarcass; 
	private int priceSoft;
	private int priceCladding;
	private final int PRICE_MATERIAL_WORK_FOLDING_SOFA  = 13000;//переменная для сборки
	
	
	private String ziro, foldingSofa ;//для использования перегрузки 
	
	public static double getPriceCalculationFoldingSofa() {
		return priceCalculationFoldingSofa;
	}
	
	public FoldingSofaCalculator() {//вызов методов в определенном порядке
		    materiaConsumptionSoftFurniture();
		 	materialsSoftFurniture();
		    priceCalculation();
		    priceMastersWork();
		    
		    //прибавляем стоимость выбранного каркаса
		    if (DeviceGUI.mesanism == "Аккордеон") {
		    	priceCalculationFoldingSofa += 819;
		    }
		    else if (DeviceGUI.mesanism == "Выкатной") {
		    	priceCalculationFoldingSofa += 1627;
		    }
		    else {
		    	priceCalculationFoldingSofa += 1000;
		    }
		    if (TransportGUI.transportDecision == "Да") {//прибаляем стоимость транспортировки при выборе на форме
		    	priceCalculationFoldingSofa += 3000;
		    }
		    System.out.println(priceCalculationFoldingSofa);
	}
	
	@Override
	public void materiaConsumptionSoftFurniture() {//подсчет материала для выдвижного дивана
		MaterialConsumption.materialConsumption(ziro, foldingSofa);
		MaterialConsumption.materialConsumptionCarcass += MaterialConsumption.materialConsumptionCarcass * (1/3);
		MaterialConsumption.materialConsumptionSoft += MaterialConsumption.materialConsumptionSoft * (1/3);
		MaterialConsumption.materialConsumptionTrim += MaterialConsumption.materialConsumptionTrim * (1/3);
	}

	@Override
	public void materialsSoftFurniture() {//поиск цены на каркас
		for (int i=0; i<4; i++) {// поиск выбранного материала
	    	for (int j=0; j<2; j++) {//поиск цены выбранного материала
	    		if (PriceListMaterials.arrayPriceCarcass[i][j]  == MaterialsGUI.typeCarcass) {//сохраняем данные
	    			priceCarcass = Integer.valueOf(PriceListMaterials.arrayPriceCarcass[i][j+1]);//преобразуем число в нужный тип данных
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
		priceCalculationFoldingSofa = (MaterialConsumption.materialConsumptionCarcass * priceCarcass) + (MaterialConsumption.materialConsumptionSoft * priceSoft) + (MaterialConsumption.materialConsumptionTrim * priceCladding);
		
	}

	@Override
	public void priceMastersWork() {
	
		 //прибавляем к конечной цене, цену сборки
		 priceCalculationFoldingSofa = priceCalculationFoldingSofa +PRICE_MATERIAL_WORK_FOLDING_SOFA;
	 
	
	}
	public int getMastersWork() {return PRICE_MATERIAL_WORK_FOLDING_SOFA;}// для теста 

	public double getpriceCalculationFoldingSofa() {return priceCalculationFoldingSofa; }
}
