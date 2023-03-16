package src.z;
class Stack {
    private int max_size=5;
    private int stack[]=new int[max_size];
    private  int top =-1;
    int peek(){
        if(isempty()){
            System.out.println("is empty");
            return -1;
        }
        return stack[top];
    }

    void push(int data){
        if(top+1>=max_size){
            System.out.println("limit exceeded");
            return ;
        }
        top++;
        stack[top]=data;
    }
    int  pop(){
        if(isempty()){
            System.out.println("ERROR MSG LIST IS EMPTY ");
            return -1;
        }
        int delv=stack[top];
        top--;
        return delv;
    }
    boolean isempty(){
        return top==-1;
    }
    void print(){
        for(int i=0;i<=top;i++)
            System.out.print(stack[i]+" ");
        System.out.println();
    }
}
public class Stacktest {
    public static void main(String args[]){
        Stack mylist=new Stack();
//
        mylist.push(10);
        mylist.push(20);
        mylist.push(30);
        mylist.push(40);
        mylist.push(50);
        mylist.push(60);
//        mylist.print();


        mylist.print();
        mylist.pop();
        mylist.print();
        System.out.println("peek"+mylist.peek());
    mylist.print();

    }
}
