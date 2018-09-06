import java.util.Scanner;
public class Program_1{
  public static void main (String [] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("input the test algorithm");
      String test = scan.nextLine();

      CharStack opstack = new CharStack();

      for(int i=0; i<test.length(); i++){
        char current = test.charAt(i);
        if (isOperand(current)){
          System.out.print(current);
        }else if(current == '('){
          opstack.push(current);
        }else if(current == ')'){
          while(!opstack.isEmpty() && opstack.peek()!='('){
            System.out.print(opstack.pop());
          }
          opstack.pop();
        }else{
          while (!opstack.isEmpty() && opstack.peek()!= '(' && precedenceOrder(opstack.peek()) >= precedenceOrder(current))
          {
            System.out.print(opstack.pop());
          }
          opstack.push(current);
        }


      }
       while(!opstack.isEmpty()){
          System.out.print(opstack.pop());
        }
  }

  public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }
  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }
  public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
  }
}