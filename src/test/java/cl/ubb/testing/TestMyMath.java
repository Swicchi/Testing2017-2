
package cl.ubb.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMyMath {
	@Test
	public void AddTwoAndTwoIsFour(){
		MyMath myMath = new MyMath();
		int resultado;
		resultado = myMath.Add(2, 2);
		assertEquals(resultado,4);
	}
	@Test
	public void AddMinusOneAndFourIsThree(){
		MyMath myMath = new MyMath();
		int resultado;
		resultado = myMath.Add(-1, 4);
		assertEquals(resultado,3);
	}
}
