package src.Linkedlist.SingleLinkedList.popfirst;

class Node{
    int data;
    Node next;
}
class Linkedlist{
    Node head;

    void pushfirst(int data){
        Node newnode =new Node();
        newnode.data=data;
        newnode.next=head;
        head=newnode;
    }
    void popfisrt(){
        head=head.next;

    }

void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"===>");
        temp=temp.next;
    }
    System.out.println(temp);
    }
}
public class Popfirst {
public static void main(String args[]){
    Linkedlist mylist=new Linkedlist();
    mylist.pushfirst(10);
    mylist.pushfirst(20);
    mylist.pushfirst(30);
mylist.print();
    mylist.popfisrt();
    mylist.print();
}
}
