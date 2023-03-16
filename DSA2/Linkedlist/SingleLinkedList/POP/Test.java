package src.Linkedlist.SingleLinkedList.POP;
class Node{
    int data;
    Node next;
// parameterized constrctor
    Node(int data){
        this.data=data;

    }
}
class Linkedlist{
    Node head;

    // push method is used to insert a data in the beging
    void pushbegin(int data){
        Node newnode=new Node(data);

        newnode.data=data;
        newnode.next=head;
        head=newnode;}
//    push data in the last
    void pushlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{

            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
// delete data inthe first
    int popfirst(){
//        if(head ==null){
//            System.out.println("ERROR : your list is empty ");
//            return -1;
//        }

//        Node temp=head;
//        while(temp.next.next!=null){
//            temp=temp.next;
//        }
        int delv=head.data;

        head=head.next;
        return delv;

    }

//  list is empty gets error message
    int poplast(){
        // if your list is empty get some error msg
        if(head ==null){
            System.out.println("ERROR : your list is empty ");
            return -1;
        }
// delete from the last;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int delv=temp.next.data;

        temp.next=null;
        return delv;
    }
    boolean isempty(){
        return head==null;
    }


    // print method is used to print a data;
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ==>");
            temp=temp.next;
        }
        System.out.println(temp);
    }
}

// driver code
public class Test {
    public static void main(String args[]){
        Linkedlist mylist=new Linkedlist();
        mylist.pushlast(10);
        mylist.pushlast(20);
        mylist.pushlast(30);
        mylist.pushlast(40);
        mylist.pushlast(50);

//        System.out.println(mylist.isempty());
mylist.print();
        System.out.println(mylist.popfirst());
mylist.print();
    }
}
