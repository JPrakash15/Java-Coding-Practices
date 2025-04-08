package LinkedListDemo;

public class DLL {
    private Node head;
//    private Node tail;
//    private int size;

    private class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int val){
            this.value=val;
        }
        public Node(int val, Node next, Node prev){
            this.value=val;
            this.next=next;
            this.prev=prev;
        }
    }
    //Constructor
    public DLL(){
//        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;

    }
    public void insertLast(int val){
        Node last=getLast();
        Node node=new Node(val);
        node.prev=last;
        last.next=node;
        node.next=null;
    }
    public void insert(int val, int index){
        Node node=new Node(val);
        Node prevNode=get(index);
        node.next=prevNode.next;
        node.next.prev=node;
        prevNode.next=node;
        node.prev=prevNode;

    }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value+" -> ");
            node=node.next;
        }
        System.out.print("null\n");
    }

    public Node getLast(){
        Node node=head;
        while(node.next!=null) {
            node=node.next;
        }
        return node;
    }
    public Node get(int index){
        Node node=head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        return node;
    }

}
