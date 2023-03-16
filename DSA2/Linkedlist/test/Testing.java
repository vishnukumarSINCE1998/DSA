package src.Linkedlist.test;
class Node{
    int data;
    Node next;
}
public class Testing {
    public static void main(String args[]){
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        Node node4=new Node();

        node1.data=10;
        node1.next=node2;
        node2.data=20;
        node2.next=node3;
        node3.data=30;
        node3.next=node4;
        node4.data=40;
        node4.next=null;

        Node head=node1;

        //use while loop
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"===>");
            temp=temp.next;
//        we can use For loop also
//        Node temp=head;
//        for(;temp!=null;temp= temp.next){
//            System.out.print(temp.data+"==>>");

        }
        System.out.println(temp);
    }
}
