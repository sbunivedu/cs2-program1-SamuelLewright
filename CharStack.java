public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //PRE:
    //POS: top == -1; empty stack
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE: Stack isn't full
    //POS: Top ++;
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }

  public char pop (){
    //PRE: Stack isn't empty
    //POS: Top --;
    //TAS: remove and return the item on the top of the stack
    return s[top --];
  }

  public boolean isEmpty(){
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
    if (top == -1)
      return true;
    else
      return false;
  }

  public char peek(){
    return s[top];
  }

  public boolean isFull(){
    //TAS: return whether or not the stack is full
    return top == MAX_CAP-1;
  }

  public String toString(){
    String result = "";

    int current = top;

    while (current != -1){
      result += s[current];
      current--;
    }

    return result;
  }
}
