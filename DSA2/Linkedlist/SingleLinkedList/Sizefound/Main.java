package src.Linkedlist.SingleLinkedList.Sizefound;
class Node{
    int data;
    Node next;

}
class Linkedlist {
    Node head;

    void push(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = head;
        head = newnode;
    }

    void  pushpos(int data, int pos) {
        int size = getsize();
        if (pos > size+1) {
            System.out.println("ERROR :" + size + " u should insert in the range");
            return ;
        }
        Node temp = head;
        Node newnode = new Node();
        newnode.data = data;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }


    // found size of the linkrd list;
    int getsize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println(temp);

    }

}
public class Main {
    public static void main(String args[]){
        Linkedlist mylist=new Linkedlist();
        mylist.push(10);
        mylist.push(20);
        mylist.push(30);
        mylist.push(40);

        mylist.print();
        System.out.println(mylist.getsize());
        mylist.pushpos(200, 30);
        mylist.print();
    }
}
