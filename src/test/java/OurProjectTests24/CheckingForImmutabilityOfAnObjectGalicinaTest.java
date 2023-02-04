package OurProjectTests24;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import gui.ResultGUI;
import main.ChairCalculator;
import main.FoldingSofaCalculator;
import main.PriceListMaterials;
import main.PufCalculator;
import main.SofaCalculator;

public class CheckingForImmutabilityOfAnObjectGalicinaTest {
	private String[][] objectAfter, objectBefore;
	PriceListMaterials beforeObject = new PriceListMaterials();
	ResultGUI arterObject = new ResultGUI();

	@Test
	public void testChair() {
		objectBefore = beforeObject.getCheckingObject();
		objectAfter = arterObject.getCheckingObject();
		assertArrayEquals(objectBefore,objectAfter);
	}
}


