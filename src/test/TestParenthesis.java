package test;
import iasl.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestParenthesis {

	@Test
	public void test() {
		
		assertTrue(Parenthesis.isParenthesisMatch("()"));
		assertFalse(Parenthesis.isParenthesisMatch("(()"));
		
	}
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void testBracket(){
//
//		assertTrue(Parenthesis.isParenthesisMatch("({})"));
//		assertTrue(Parenthesis.isParenthesisMatch("({})"));
//
//		assertFalse(Parenthesis.isParenthesisMatch("({}("));
//		assertFalse(Parenthesis.isParenthesisMatch("){})"));
//	}

}
