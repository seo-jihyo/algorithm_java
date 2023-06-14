import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Boj4949 {
    public static void Main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while(true){
            s = br.readLine();

  
            if(s.equals(".")){
                break;
            }
            sb.append(checkStack(s)).append('\n');
        }
        System.out.println(sb);
    }

    public static String checkStack(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

     
            if(c=='(' || c =='['){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.empty() || stack.peek()!='('){
                    return "no";
                } else {
                    stack.pop();
                }
            }
            else if(c==']'){
                if(stack.empty() || stack.peek()!='['){
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.empty()) return "yes";
        else return "no";
    }
}