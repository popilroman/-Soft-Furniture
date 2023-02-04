package main;

import gui.MaterialsGUI;
import gui.TransportGUI;

public class PufCalculator extends SoftFurniture {//����� ��� ������� ��������� ��������� �� ���������� �����

	public static double priceCalculationPuf = 0;//���������� ��� ��������� �������� ����
	 
	//����������, ��� ���������� ���� �� �������, ������ �������� � �������
	private int priceCarcass; 
	private int priceSoft;
	private int priceCladding;
	private final int PRICE_MATERIAL_WORK_PUF = 2000;//���������� ��� ������
	
	public static double getPriceCalculationPuf() {
		return priceCalculationPuf;
	}
	
	public PufCalculator() {//����� ������� � ������������ �������
		materiaConsumptionSoftFurniture();
	    materialsSoftFurniture();
	    priceCalculation();
	    priceMastersWork();
	    
	    if (TransportGUI.transportDecision == "��") {//��������� ��������� ��������������� ��� ������ �� �����
	    	priceCalculationPuf += 3000;
	    }
	    
    System.out.println(priceCalculationPuf);
   
}
	
	@Override
	public void materiaConsumptionSoftFurniture() {//������������� ���������� 
		MaterialConsumption.materialConsumption(2);
		
	}

	@Override
	public void materialsSoftFurniture() {//����� ���� �� ������
		for (int i=0; i<4; i++) {// ����� ���������� ���������
	    	for (int j=0; j<2; j++) {//����� ���� ���������� ���������
	    		if (PriceListMaterials.arrayPriceCarcass[i][j]  == MaterialsGUI.typeCarcass) {//��������� ������
	    			priceCarcass = Integer.valueOf(PriceListMaterials.arrayPriceCarcass[i][j+1]);// ����������� ����� � ������ ��� ������
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
		priceCalculationPuf = (MaterialConsumption.materialConsumptionCarcass * priceCarcass) + (MaterialConsumption.materialConsumptionSoft * priceSoft) + (MaterialConsumption.materialConsumptionTrim * priceCladding);
		
	}

	@Override
	public void priceMastersWork() {//���������� � �������� ����, ���� ������
			 priceCalculationPuf = priceCalculationPuf +PRICE_MATERIAL_WORK_PUF;
	}
	public int getMastersWork() {return PRICE_MATERIAL_WORK_PUF;}// ��� ����� 

	 public double getpriceCalculationPuf() {return priceCalculationPuf; }


}

