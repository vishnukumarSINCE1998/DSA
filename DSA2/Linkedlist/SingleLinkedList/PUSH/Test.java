package src.Linkedlist.SingleLinkedList.PUSH;
class Node{
    int data;
    Node next;


    }

class Linkedlist{
    Node head;
    void pushbegin(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=head;
        head=newnode;
    }
    //push method insert data from last
    void pushlast(int data){
        if(head==null){
            Node newnode=new Node();
            newnode.data=data;
            head=newnode;
        }
        else{
            Node newnode=new Node();
            newnode.data=data;

            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    // print method for print first to last
    void print(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ==>");
            temp=temp.next;
        }
        System.out.println(temp);
    }
}
// driver code
public class Test {
    public static void main(String args[]){
    Linkedlist mylist=new Linkedlist();
//    mylist.pushlast(20);
//    mylist.pushlast(30);
//    mylist.pushlast(40);
//    mylist.print();

        mylist.pushbegin(20);
        mylist.pushbegin(30);
        mylist.pushbegin(40);
    mylist.print();
    }
}
