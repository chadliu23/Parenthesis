package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import iasl.Parenthesis;

import org.junit.Test;

public class TestParenthesis {
	@Test
	public void test() {
		Parenthesis p = new Parenthesis();
		assertTrue(p.isParenthesisMatch("()"));
		assertFalse(p.isParenthesisMatch("(()"));
		assertFalse(p.isParenthesisMatch(")"));
		
	}
	//@Test
	public void testBracket(){
		Parenthesis p = new Parenthesis();
		assertTrue(p.isParenthesisMatch("({})"));
		assertTrue(p.isParenthesisMatch("({})"));

		assertFalse(p.isParenthesisMatch("({}("));
		assertFalse(p.isParenthesisMatch("){})"));
	}
}
