package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import iasl.Parenthesis;
import org.junit.Test;

public class TestParenthesis {
	@Test
	public void test() {
		
		assertTrue(Parenthesis.isParenthesisMatch("()"));
		assertFalse(Parenthesis.isParenthesisMatch("(()"));
		
	}
	// @Test
	public void testBracket() {

		assertTrue(Parenthesis.isParenthesisMatch("({})"));
		assertTrue(Parenthesis.isParenthesisMatch("({})"));

		assertFalse(Parenthesis.isParenthesisMatch("({}("));
		assertFalse(Parenthesis.isParenthesisMatch("){})"));
	}
}
