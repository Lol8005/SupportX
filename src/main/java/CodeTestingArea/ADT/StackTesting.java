package CodeTestingArea.ADT;

import ADT.Stack;

public class StackTesting {

    public static void main(String[] args) {
        scenario3();
    }

    /** test stack declaration, push, pop and peek function */
    static void scenario1(){
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    /** test stack 'class' declaration */
    static void scenario2(){
        Stack<testingStackClass> stack = new Stack<>();
        stack.push(new testingStackClass(12, "lol"));
        stack.push(new testingStackClass(13, "new"));
        stack.push(new testingStackClass(4, "man"));

        stack.pop().display();
        stack.pop().display();
        stack.pop().display();
    }

    static void scenario3(){
        Stack<String> stack = new Stack<>();

        for (int i=1; i<=17; i++){
            stack.push(i + "");
        }

        System.out.println("Peek: " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}

class testingStackClass {
    int number;
    String name;

    public testingStackClass(){}

    public testingStackClass(int number, String name){
        this.number = number;
        this.name = name;
    }

    public void display(){
        System.out.println(number + " " + name);
    }
}
