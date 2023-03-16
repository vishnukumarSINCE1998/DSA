package src.Linkedlist.SingleLinkedList.Reverse;
class Node{
    int data;
    Node next;

}
class Linkedlist {
    Node head;


    void pushfirst(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = head;
        head = newnode;

    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "===>");
            temp = temp.next;
        }
        System.out.println(temp);
    }

    void reverse() {
        Node pre = head;
        Node cur = pre.next;
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
    }


    public class Reverse {
        public static void main(String args[]) {
            Linkedlist mylist = new Linkedlist();
            mylist.pushfirst(10);
            mylist.pushfirst(20);
            mylist.pushfirst(30);
            mylist.pushfirst(40);

            mylist.print();
            mylist.reverse();
            mylist.print();
        }
    }

