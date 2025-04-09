package LinkedListDemo;

public class Main {
    public static void main(String[] args) {
        //Singly LinkedList Traversals & Manipulations
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertLast(7);
        list.insertLast(1);
        list.insertLast(18);
        list.insert(200,3);
        list.insert(150, 0);

        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3));
        list.display();

//        Doubly LinkedList Traversals & Manipulations
        System.out.println("DOUBLY LINKEDLIST STARTS");
        System.out.println();
        DLL dList=new DLL();
        dList.insertFirst(5);
        dList.insertFirst(100);
        dList.insertLast(200);
        dList.insertLast(600);
        dList.insertFirst(0);
        dList.insert(350,2);
        dList.display();
    }
}
