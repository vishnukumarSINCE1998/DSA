package src.Linkedlist.SingleLinkedList;
class Node{
    int data;
    Node next;
}
class Linkedlist {
    Node head;

    //push the data int the FIRST;
    void pushbegin(int data) {
        if (head == null) {
            Node newnode = new Node();
            newnode.data = data;
            head = newnode;
        } else {
            Node newnode = new Node();
            newnode.data = data;
            newnode.next = head;
            head = newnode;
        }
    }


    // push the data in the LAST;
    void pushlast(int data) {
        if (head == null) {
            Node newnode = new Node();
            newnode.data = data;
            head = newnode;
        } else {
            Node newnode = new Node();
            newnode.data = data;

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode = null;
        }
    }
    void pushposition(int data,int pos) {
        Node newnode = new Node();
        newnode.data = data;

        Node temp = head;
        for(int i=1;i<pos-1;i++) {
            temp = temp.next;
        }
            newnode.next = temp.next;
        temp.next=newnode;
        }

    boolean isempty(){
        return head==null;
    }
//    pop the data from the first;
    int popbegin(){
       // delete even in single data;
        if(head.next==null){
            int delvalue=head.data;
            head=null;
            return delvalue;
        }
        if(head==null){
            System.out.println("ERROR MESSAGE : your list is empty");
            return -1;
        }

        int delvaluefromfirst=head.data;
        head=head.next;
        return delvaluefromfirst;
    }

    //    pop the data in the LAST;
    int pop() {
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
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int delvalue=temp.next.data;
        temp.next = null;
        return delvalue;
    }

//    delete the data from the particular position
    int popposition(int pos){

        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        int delv=temp.next.data;
        temp.next=temp.next.next;
    return delv;
    }

//    size of the list
    int size(){
        int count=0;

        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    void revere() {
        Node pre = head;
        Node cur = head.next;
        Node post = cur.next;
        while (cur != null) {
            cur.next = pre;
            pre = cur;
            cur = post;
            if (post != null) {
                post = post.next;
            }
        }
        head.next = null;
        head = pre;
    }


        void print(){
        Node temp=head;
            while (temp != null) {

                System.out.print(temp.data+" ===>");
                temp=temp.next;
            }
            System.out.println(temp);
        }
    }



    public class AllInOne {
        public static void main(String args[]) {
        Linkedlist mylist= new Linkedlist();

        mylist.pushlast(10);
            mylist.pushlast(20);
            mylist.pushlast(30);
            mylist.pushlast(40);
            mylist.pushlast(50);
            mylist.pushlast(60);
            mylist.pushlast(70);
            mylist.print();

//            push first
            mylist.pushbegin(100);
            mylist.pushbegin(200);
            mylist.pushbegin(300);
            mylist.print();
//            System.out.println("the list empty : "+mylist.isempty());
//            pop from the last

//            System.out.println("the delete value from the LAST  : " +mylist.pop());
//            System.out.println("the delete value from the LAST  : " +mylist.pop());
//            System.out.println("the delete value from the FIRST : " +mylist.popbegin());
mylist.pushposition(500, 3);
mylist.print();
mylist.pushposition(1000, 4);
            mylist.print();
            System.out.println("size of the list : "+mylist.size());

            System.out.println(mylist.popposition(4));
            System.out.println("revere list");
            mylist.revere();
            mylist.print();







        }
    }

