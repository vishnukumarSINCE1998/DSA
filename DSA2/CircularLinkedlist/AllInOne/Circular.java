package src.CircularLinkedlist.AllInOne;
class Node{
    int data ;
     Node next;
     Node(int data){
         this.data=data;
     }
}
public class Circular {
    public static void main(String args[]){
     Node node1=new Node(10);
     Node node2=new Node(20);
     Node node3=new Node(30);
     Node node4=new Node (40);

     node1.next=node2;
     node2.next=node3;
     node3.next=node4;
     node4.next=node1;

     Node head=node1;



     Node temp=head;
    do {
         System.out.print(temp.data+"===>");
         temp=temp.next;
     } while(temp!=head);
        System.out.println(temp);

    }
}
