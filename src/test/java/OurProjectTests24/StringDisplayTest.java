package OurProjectTests24;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ChairCalculator;
import main.FoldingSofaCalculator;
import main.PufCalculator;
import main.SofaCalculator;

public class StringDisplayTest {

	private PufCalculator a = new PufCalculator();
	private SofaCalculator b = new SofaCalculator();
	private FoldingSofaCalculator c = new FoldingSofaCalculator();
	private ChairCalculator d = new ChairCalculator();
	private double arr;
	private double arr1;
	private double arr2;
	private double arr3;
	private double ss = 0;
	private double summ1;
	private double summ2;
	private double summ3;
	private double summ4;
	private int summ;
 @Test 
 public void checking() { 
	 arr = a.getpriceCalculationPuf(); 
	 summ1 = arr;
System.out.println( arr);

	 arr1 = b.getpriceCalculationSofa();
	 summ2 = arr1;

  
	 arr2 = c.getpriceCalculationFoldingSofa();
	 summ3 =  arr2;

	 arr3 = d.getpriceCalculationChair();
	 summ4 =  arr3;

 }
	@Test
	public void test() {
		summ = (int) (summ1 + summ2 + summ3 + summ4);
		assertNotNull("",summ) ;
		
	}

}
