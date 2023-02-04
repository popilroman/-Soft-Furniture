package main;

public class PriceListMaterials {//класс с созданием двумерных массивов для дальнейшего обращения к ценам на материалы
	//массив цен на материалы для каркаса
	public static final String[][] arrayPriceCarcass = {{"Фанера", "29"},{"ДСП","19"},{"ДВП","23"},{"Дерево","59"}};
	//массив цен на материалы для мягкого элемента
	public static final String [][] arrayPriceSoft = {{"Поролон","10"},{"Поропласт","29"},{"Синтепон","15"},{"Синтепух","4"},{"Конский волос","120"}};
	//массив цен на материалы для обшивки
	public static final String [][] arrayPriceFacing = {{"Велюр","520"},{"Микрофибра","570"},{"Нат. кожа","3600"},{"Искуст. кожа","790"}, {"Замша","45"}};
	
	public String [][] getCheckingObject() {return arrayPriceCarcass;}// для теста 
}
