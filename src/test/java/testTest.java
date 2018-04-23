package test.java;

import org.junit.Assert;
import org.junit.Test;

import net.sourceforge.jeval.EvaluationException;
import net.sourceforge.jeval.Evaluator;

public class testTest {

	@Test
	public void testDivide() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void testDivide2() throws EvaluationException {
		Assert.assertEquals("2.0", new Evaluator().evaluate("1+1"));
	}
}
