package src.Doublylinkedlist;
class Node{
    int data;
    Node next;
    Node prev;
}
class DoublyLl {
    Node head;
    Node tail;

    //    push first
    void pushbegin(int data) {
        Node newnode = new Node();
        newnode.data = data;

        if (isEmpty()) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }


    //    push last in doublyLL
    void pushlast(int data) {
        Node newnode = new Node();
        newnode.data = data;



        if (isEmpty()) {
            head = newnode;
            tail = newnode;
        } else {

            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }

    }

    // delete the data from first
    int popbegin() {
        if(head!=null && head==tail){
            int delv=head.data;
            head=null;
            tail=null;
            return delv;
        }

        if (isEmpty()) {
            head = null;
            tail = null;
            System.out.println("ERROR MSG : your list is empty ");
            return -1;
        } else {
            int delv = head.data;
            head = head.next;
            head.prev = null;
            return delv;

        }
    }

//    delete the data from LAST
    int poplast(){
        if(head!=null && head==tail){
            int delv=head.data;
            head=null;
            tail=null;
            return delv;
        }

        if(isEmpty()){
            System.out.println("ERROR MSG : your is empty ");
            return -1;
        }
        int delv=tail.data;
        tail=tail.prev;
        tail.next=null;
        return delv;
    }

//    print the data
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"====>");
            temp=temp.next;
        }
        System.out.println(temp);
    }
// list is empty or not
     boolean isEmpty(){
        return  (head==null && tail==null);
    }
}
public class main {
    public static void main(String args[]){
        DoublyLl mylist= new DoublyLl();
        mylist.pushlast(10);
        mylist.pushlast(20);
        mylist.pushlast(30);
        mylist.pushlast(40);
        mylist.pushlast(50);
        mylist.pushlast(60);
        mylist.print();


//        mylist.pushbegin(100);
//        mylist.pushbegin(200);
//        mylist.pushbegin(300);
//        mylist.pushbegin(400);
//        mylist.print();
//        System.out.println(mylist.poplast());
//        mylist.print();
//      System.out.println(mylist.popbegin());
//        mylist.print();
//        System.out.println( mylist.isEmpty());

    }
}
