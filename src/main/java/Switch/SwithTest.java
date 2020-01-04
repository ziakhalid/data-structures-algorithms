package Switch;


import java.util.HashMap;
import java.util.Stack;

public class SwithTest {

    //Valid Perenthesis
    public static void main(String[] args) {

        System.out.println("Valid Perenthesis : "+validPerenthsis("{{{[[(]]}}}"));

    }

    private static boolean validPerenthsis(String givenString){

        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');


        Stack<Character> stack = new Stack<>();

        for(int i=0;i<givenString.length();i++){
            if(map.containsKey(givenString.charAt(i))){
                stack.push(givenString.charAt(i));
            }else if(map.containsValue(givenString.charAt(i))){
                if(!stack.empty() &&givenString.charAt(i) == map.get(stack.peek())){
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

}
