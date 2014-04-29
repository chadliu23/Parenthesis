package iasl;

import java.util.Stack;

public class Parenthesis {
	public boolean isParenthesisMatch(String str) {
	    Stack<Character> stack = new Stack<Character>();
	    for(int i=0; i < str.length(); i++) {
	    	switch(str.charAt(i))
	    	{
	    		case '(':
	    			stack.push(str.charAt(i));
	    			break;
	    		
	    		case ')':
	    			if(stack.empty() )
	    			{
	    				return false;
	    			}
	    			if (stack.pop() != '(')
	    			{
	    				return false;
	    			}
	    			break;
	    		case '{':
	    			stack.push(str.charAt(i));
	    			break;
	    		case '}':
	    			if(stack.empty() )
	    			{
	    				return false;
	    			}
	    			if (stack.pop() != '{')
	    			{
	    				return false;
	    			}
	    			break;
	    		default:
	    			return false;
	    	};		
	        
	    }
	    return stack.empty();
	}
}
