package main;

import gui.*;

public class SofaCalculator extends SoftFurniture {//����� ��� ������� ��������� ��������� �� �����


	public static double priceCalculationSofa = 0;//���������� ��� ��������� �������� ����
	
	//����������, ��� ���������� ���� �� �������, ������ �������� � �������
	private int priceCarcass; 
	private int priceSoft;
	private int priceCladding;
	private final int PRICE_MATERIAL_WORK_SOFA = 10000;//���������� ��� ������
	
	private String sofa, ziro;//��� ������������� ���������� 
	
	public static double getPriceCalculationSofa() {//�������� �������� ����� � ���
		return priceCalculationSofa;
	}
	
	public SofaCalculator() {//����� ������� � ������������ �������
			materiaConsumptionSoftFurniture();
		    materialsSoftFurniture();
		    priceCalculation();
		    priceMastersWork();
		    
	    if (TransportGUI.transportDecision == "��") {//��������� ��������� ��������������� ��� ������ �� �����
	    	priceCalculationSofa += 3000;
	    }
	    
	    System.out.println(priceCalculationSofa);
	   
	}
	    
	@Override
	public void materiaConsumptionSoftFurniture() {//������������� ���������� 
		MaterialConsumption.materialConsumption(sofa, ziro);
				
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
		priceCalculationSofa = (MaterialConsumption.materialConsumptionCarcass * priceCarcass) + (MaterialConsumption.materialConsumptionSoft * priceSoft) + (MaterialConsumption.materialConsumptionTrim * priceCladding);
		
	}

	@Override
	public void priceMastersWork() {//���������� � �������� ����, ���� ������
			 
			 priceCalculationSofa = priceCalculationSofa +PRICE_MATERIAL_WORK_SOFA;
	}
	public int getMastersWork() {return PRICE_MATERIAL_WORK_SOFA;}// ��� ����� 
	
	public double getpriceCalculationSofa() {return SofaCalculator.priceCalculationSofa; }//��� �����

	

	
}
