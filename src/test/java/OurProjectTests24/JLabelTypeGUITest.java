package OurProjectTests24;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import gui.TypeGUI;

public class JLabelTypeGUITest {

	TypeGUI obj = new TypeGUI();
	@Test
	public void test() {
		assertNotNull(obj.getcheckingLab1());
	}

}
