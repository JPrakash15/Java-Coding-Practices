package LinkedListDemo;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size =0;
    }

    public void insertFirst(int val){
        Node n1=new Node(val);
        n1.next=head;
        head=n1;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        Node n1=new Node(val);
        tail.next=n1;
        tail=n1;
        if(head==null){
            head=tail;
        }
        size+=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }

    }

}
