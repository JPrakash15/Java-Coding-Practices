package LinkedListDemo;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertLast(7);
        list.insertLast(1);
        list.insertLast(18);
        list.insert(200,3);
        list.insert(150, 0);

        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3));
        list.display();


    }
}
