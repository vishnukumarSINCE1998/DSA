package src.Linkedlist.SingleLinkedList.pushpostion;
class Node{
    int data;
    Node next;

}
class Linkedlist{
    Node head;

    void pushfirst(int data){
        Node newnode=new Node();
        newnode.data=data;

        newnode.next=head;
        head=newnode;
    }
    void pushpos(int data,int pos){
        Node temp=head;

        for (int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=temp.next;
        temp.next=newnode;
        int push=newnode.data;


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
public class Pushposition {
public static void main(String args[]){
    Linkedlist mylist=new Linkedlist();
    mylist.pushfirst(10);
    mylist.pushfirst(20);
    mylist.pushfirst(30);
    mylist.print();
    mylist.pushpos(100, 4);
    mylist.print();
}
}
