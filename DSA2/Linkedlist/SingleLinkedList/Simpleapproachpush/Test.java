package src.Linkedlist.SingleLinkedList.Simpleapproachpush;
class Node{
    int data ;
    Node next;
// parameterized constructor
Node(int data){
        this.data=data;
    }

}
class Linkedlist{
  private Node head;
// push method is used to insert data
    void push(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    // print method is used print data
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ==>");
            temp=temp.next;
        }
        System.out.println(temp);
    }
}
public class Test {
    public static void main(String args[]){
        Linkedlist mylist=new Linkedlist();
        mylist.push(10);
        mylist.push(20);
        mylist.push(30);
        mylist.push(40);
        mylist.push(50);

        mylist.print();
    }

}
