package main;

import gui.DeviceGUI;
import gui.MaterialsGUI;
import gui.TransportGUI;

public class FoldingSofaCalculator extends SoftFurniture{//����� ��� ������� ��������� ��������� �� ���������� �����

	public static double priceCalculationFoldingSofa = 0;//���������� ��� ��������� �������� ����

	//����������, ��� ���������� ���� �� �������, ������ �������� � �������
	private int priceCarcass; 
	private int priceSoft;
	private int priceCladding;
	private final int PRICE_MATERIAL_WORK_FOLDING_SOFA  = 13000;//���������� ��� ������
	
	
	private String ziro, foldingSofa ;//��� ������������� ���������� 
	
	public static double getPriceCalculationFoldingSofa() {
		return priceCalculationFoldingSofa;
	}
	
	public FoldingSofaCalculator() {//����� ������� � ������������ �������
		    materiaConsumptionSoftFurniture();
		 	materialsSoftFurniture();
		    priceCalculation();
		    priceMastersWork();
		    
		    //���������� ��������� ���������� �������
		    if (DeviceGUI.mesanism == "���������") {
		    	priceCalculationFoldingSofa += 819;
		    }
		    else if (DeviceGUI.mesanism == "��������") {
		    	priceCalculationFoldingSofa += 1627;
		    }
		    else {
		    	priceCalculationFoldingSofa += 1000;
		    }
		    if (TransportGUI.transportDecision == "��") {//��������� ��������� ��������������� ��� ������ �� �����
		    	priceCalculationFoldingSofa += 3000;
		    }
		    System.out.println(priceCalculationFoldingSofa);
	}
	
	@Override
	public void materiaConsumptionSoftFurniture() {//������� ��������� ��� ���������� ������
		MaterialConsumption.materialConsumption(ziro, foldingSofa);
		MaterialConsumption.materialConsumptionCarcass += MaterialConsumption.materialConsumptionCarcass * (1/3);
		MaterialConsumption.materialConsumptionSoft += MaterialConsumption.materialConsumptionSoft * (1/3);
		MaterialConsumption.materialConsumptionTrim += MaterialConsumption.materialConsumptionTrim * (1/3);
	}

	@Override
	public void materialsSoftFurniture() {//����� ���� �� ������
		for (int i=0; i<4; i++) {// ����� ���������� ���������
	    	for (int j=0; j<2; j++) {//����� ���� ���������� ���������
	    		if (PriceListMaterials.arrayPriceCarcass[i][j]  == MaterialsGUI.typeCarcass) {//��������� ������
	    			priceCarcass = Integer.valueOf(PriceListMaterials.arrayPriceCarcass[i][j+1]);//����������� ����� � ������ ��� ������
	    			break;
	    		}
	    	}
	    }
	    for (int i=0; i<5; i++) {//����� ���� �� ������ �������
	    	for (int j=0; j<2; j++) {
	    		if (PriceListMaterials.arrayPriceSoft[i][j]  == MaterialsGUI.typeSoft) {
	    			priceSoft = Integer.valueOf(PriceListMaterials.arrayPriceSoft[i][j+1]);
	    			break;
	    		}
	    	}
	    }
	    for (int i=0; i<4; i++) {//����� ���� �� �������
	    	for (int j=0; j<2; j++) {
	    		if (PriceListMaterials.arrayPriceFacing[i][j]  == MaterialsGUI.typeCladding) {
	    			priceCladding = Integer.valueOf(PriceListMaterials.arrayPriceFacing[i][j+1]);
	    			break;
	    		}
	    	}
	    }
		
	}

	@Override
	public void priceCalculation() {//������� �������� ���� ������������ ������
		priceCalculationFoldingSofa = (MaterialConsumption.materialConsumptionCarcass * priceCarcass) + (MaterialConsumption.materialConsumptionSoft * priceSoft) + (MaterialConsumption.materialConsumptionTrim * priceCladding);
		
	}

	@Override
	public void priceMastersWork() {
	
		 //���������� � �������� ����, ���� ������
		 priceCalculationFoldingSofa = priceCalculationFoldingSofa +PRICE_MATERIAL_WORK_FOLDING_SOFA;
	 
	
	}
	public int getMastersWork() {return PRICE_MATERIAL_WORK_FOLDING_SOFA;}// ��� ����� 

	public double getpriceCalculationFoldingSofa() {return priceCalculationFoldingSofa; }
}
