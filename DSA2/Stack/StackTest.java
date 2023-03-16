package src.Stack;
class Stack {
    private int max_size = 10;
    private int Stack[] = new int[max_size];
    private int top = -1;


    //     push the data;
    void push(int data) {
        if(top+1>=max_size){
            System.out.println("STACK LIMIT CROSS");
            return;
        }
        top++;
        Stack[top] = data;
    }

    //    pop the data ;
    int pop() {
        if(isempty()){
            System.out.println("ERROR MSG : STACK IS EMPTY ");
            return  -1;
        }
        int delv = Stack[top];
        top--;
        return delv;

    }
//check Stack is empty or not
    boolean isempty(){
        return top <=-1;
    }
//    find the highest value in the peek
    int peek(){
        if(isempty()){
            System.out.println("ERROR MSG : STACK IS EMPTY ");
            return -1;
        }
        return Stack[top];
    }
    //print the data
    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(Stack[i] + " ");

        }
        System.out.println();
    }
}


    public class StackTest {
        public static void main(String args[]) {
            Stack mylist = new Stack();
            mylist.push(1);
            mylist.push(2);
            mylist.push(3);
            mylist.push(4);
            mylist.push(5);
            mylist.push(6);
            mylist.push(7);
            mylist.push(8);
            mylist.push(9);
            mylist.push(10);
            mylist.push(100);



            mylist.print();
            System.out.println(mylist.pop());

            mylist.print();
            mylist.push(30);
            mylist.print();

            System.out.println(mylist.peek());

        }

    }

