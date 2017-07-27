package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class e2504 {

    public e2504() throws IOException, ScriptException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        if(str.charAt(0) == '('){
            sb.append(2);
        }else{
            sb.append(3);
        }
        char buf;

        for(int i=1;i<str.length();i++){
            buf = str.charAt(i-1);
            if(str.charAt(i) == '('){
                if(buf == '(' || buf == '['){
                    sb.append('x');
                    sb.append('(');
                }else if(buf == ']' || buf == ')'){
                    sb.append('+');
                }
                sb.append(2);

            }else if(str.charAt(i) == '['){
                if(buf == '(' || buf == '['){
                    sb.append('x');
                    sb.append('(');
                }else if(buf == ']' || buf == ')'){
                    sb.append('+');
                }
                sb.append(3);
            }else{
            if(str.charAt(i) == ')'){
                if(buf != '('){
                    sb.append(')');
                }
            }else{
                if(buf != '['){
                    sb.append(')');
                }
            }
        }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException, ScriptException {
        new e2504();
    }

}
