package src.CircularLinkedlist;
class Node{
    int data;
Node next;

     Node(int data){
         this.data=data;
     }
}
class circularlinkedlist {
   Node head;

//   push the data from the first
    void pushbegin(int data){
        Node newnode=new Node(data);

        if (isempty()) {
            head = newnode;
            head.next = newnode;
        }
        else {

            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
            head=newnode;
        }


        }


    // push the data from the lAST
    void pushlast(int data) {
        Node newnode = new Node(data);


        if (isempty()) {
            head = newnode;
            head.next = newnode;
        } else {

            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }

    }

    int poplast() {
        //        delete even in single data;
        if(head.next==null){
            int delvalue=head.data;
            head=null;
            return delvalue;
        }

        if(head==null){
            System.out.println("ERROR MESSAGE : your list is empty");
            return -1;
        }

        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        int delvalue=temp.next.data;
        temp.next = head;
        return delvalue;
    }

    int popbegin(){
        if(head==null) {
            System.out.println("ERROR MESSAGE : your list is empty");
            return -1;

        }
        int delv= head.data;
        head=head.next;
        poplast();
        return delv;
        }


    boolean isempty() {
        return head == null;
    }

    //    print the data
    void print() {
       Node temp = head;
        do {
            System.out.print(temp.data+" ===>");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
    public class Main {
        public static void main(String args[]) {
            circularlinkedlist mylist=new circularlinkedlist();

            mylist.pushlast(10);
            mylist.pushlast(20);
            mylist.pushlast(30);
            mylist.pushlast(40);
            mylist.pushlast(50);
           mylist.print();

           mylist.pushbegin(100);
           mylist.print();
            System.out.println(mylist.poplast());
           mylist.print();
            System.out.println(mylist.popbegin());
            mylist.print();

        }
    }


