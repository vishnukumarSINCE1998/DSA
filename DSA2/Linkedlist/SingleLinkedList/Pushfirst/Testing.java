package src.Linkedlist.SingleLinkedList.Pushfirst;
class Node{
    int data;
    Node next;
}
class Linkedlist {
    Node head;

    //    push first
    void pushfirst(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next=head;
        head=newnode;


        head=newnode;
    }

void print() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data+"===>");

        temp = temp.next;
    }
    System.out.println(temp);
}
}
public class Testing {
    public static  void main(String args[]){
        Linkedlist mylist=new Linkedlist();
        mylist.pushfirst(10);
        mylist.pushfirst(20);
        mylist.pushfirst(30);
        mylist.print();
    }

}
