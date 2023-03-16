package src.Linkedlist.SingleLinkedList.Popposition;
class Node{
    int data;
    Node next;
}
class Linekdlist{
    Node head;

    void pushfirst(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=head;
        head=newnode;
    }
    int  poppos(int pos){
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        int delv= temp.next.data;
        temp.next=temp.next.next;
        return delv;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"==>");
            temp=temp.next;
        }
        System.out.println(temp);
    }
}

public class Poppos {
    public static void main(String args[]){
        Linekdlist mylist=new Linekdlist();

        mylist.pushfirst(40);
        mylist.pushfirst(30);

        mylist.pushfirst(20);
        mylist.pushfirst(10);
        mylist.print();
        System.out.println(mylist.poppos(3));
        mylist.print();
    }
}
