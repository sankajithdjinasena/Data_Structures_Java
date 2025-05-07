public class Linkedlist_Implementation {

//    Creating node class
    static class node {
        int data;
        node next;

        node(int value) {
            data = value;
            next = null;
        }
    }

    static node head;

//    Print the linkedlist
    static void printList() {
        node p = head;
        System.out.print("[");

        while (p != null) {
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
        System.out.println("]");
    }

//    Insert data at begin
    static void insertbegin(int data){
        node lk = new node(data);
        lk.next = head;

        head = lk;
    }

//    Insert data
    static void insertdata(int data) {
        node lk = new node(data);
        node linkedlist = head;

        while (linkedlist.next != null) {
            linkedlist = linkedlist.next;
        }
        linkedlist.next = lk;

    }

//    Insert Data at end
    static void insertend(int data) {
        node lk = new node(data);
        node linkedlist = head;

        while (linkedlist.next != null) {
            linkedlist = linkedlist.next;

        }
        linkedlist.next = lk;

    }

//    Insert data afternode
    static void insertafternode(node list,int data){
        node lk = new node(data);
        lk.next = list.next;
        list.next = lk;
    }

    static void deleteatend(){
        node linkedlist = head;
        while (linkedlist.next.next != null) {
            linkedlist = linkedlist.next;
        }
        linkedlist.next=null;
}

    static void deletenode(int key){
        node temp = head;
        node prev = null;
        if (temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp==null) return;

        prev.next = temp.next;
    }

    static void deleteatbegin(){
        if(head==null){
            System.out.println("Null");
        }
        head = head.next;
    }

    public static void main(String[] args) {

//        Insertion data at begin
        insertbegin(80);

//        Insertion data
        insertdata(10);
        insertdata(20);
        insertdata(30);
        insertdata(40);
        insertdata(50);
        insertdata(60);

//        Insertion data after node
        insertafternode(head.next , 15);
        insertafternode(head.next.next.next,25);

//        Insertion data at end
        insertend(70);
        System.out.println("Linked List: ");
        printList();

        deleteatend();
        deleteatbegin();

//        deletenode(50);
//        System.out.println("After deletion by key --> Linked List: ");
//        printList();

//        deleteatbegin();
        System.out.println("After deletion of begin element --> Linked List: ");
        printList();
    }
}



