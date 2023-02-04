package OurProjectTests24;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ChairCalculator;
import main.FoldingSofaCalculator;
import main.PufCalculator;
import main.SofaCalculator;


public class CheckingThePriceVasilevaTest {
	private PufCalculator a = new PufCalculator();
	private SofaCalculator b = new SofaCalculator();
	private FoldingSofaCalculator c = new FoldingSofaCalculator();
	private ChairCalculator d = new ChairCalculator();
	private double arr;
	private double arr1;
	private double arr2;
	private double arr3;
	private double ss = 0;
	
 @Test 
 public void checking() { 
	 arr = a.getpriceCalculationPuf(); 
 assertNotEquals(arr, ss);
System.out.println( arr);

	 arr1 = b.getpriceCalculationSofa();
 assertNotEquals(arr1, ss);

  
	 arr2 = c.getpriceCalculationFoldingSofa();
 assertNotEquals(arr2, ss);


	 arr3 = d.getpriceCalculationChair();
 assertNotEquals(arr3, ss);

 }

}
