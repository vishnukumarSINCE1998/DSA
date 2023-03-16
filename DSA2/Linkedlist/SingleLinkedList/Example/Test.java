package src.Linkedlist.SingleLinkedList.Example;

class Node{
    int data ;
    Node next;
}
class Linked{
    Node head;

    // insert data in the fisrt position;
    void pushbegin(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

        void push(int data){
        if(head== null){
            Node newnode= new Node();
            newnode.data=data;

            head = newnode;
        }
        else{
            Node newnode= new Node();
            newnode.data=data;

            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;

        }
    }

    int pop(){
        if(head==null){
            System.out.println("ERROR MSG: List is empty!");
            return  -1;
        }
        if(head.next==null){
            int delv=head.data;
            head=null;
            return delv;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

        int deletevalue=temp.next.data;
        temp.next=null;
        return deletevalue;
    }
    boolean isempty() {
        return head == null;
    }

void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ===>");
            temp=temp.next;
        }
    System.out.println(temp);
}

}

public class Test {
    public static void main(String args[]){
        Linked mylist=new Linked();
        mylist.push(1);
        mylist.push(2);
        mylist.push(3);
        mylist.push(4);
        mylist.push(5);
      mylist.push(6);
//        System.out.println(mylist.isempty());
//      mylist.print();
//        System.out.println(mylist.pop());
//      mylist.print();
//      mylist.push(9);
      mylist.print();

      mylist.pushbegin(100);
      mylist.print();








    }
}
