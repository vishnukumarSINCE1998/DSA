package src.Linkedlist.SingleLinkedList.Pushlast;

class Node {
    int data;
    Node next;
}
    class Linkedlist {
        Node head;

//        pushlast

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
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"===>>");
                temp=temp.next;
            }
            System.out.println(temp);
        }

    }

public class Testing {
    public static void main(String args[]){
        Linkedlist mylist=new Linkedlist();
        mylist.pushlast(10);
        mylist.pushlast(20);
        mylist.pushlast(30);

        mylist.print();
    }
}
