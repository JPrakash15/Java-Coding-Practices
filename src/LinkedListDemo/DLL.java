package LinkedListDemo;

public class DLL {
    private Node head;

    public int  delete(int index) {
        Node deleteNode=get(index);
        int val=deleteNode.value;
        deleteNode.prev.next=deleteNode.next;
        deleteNode.next.prev=deleteNode.prev;
        return val;
    }

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

    public void reversalDisplay(){
        Node node=getLast();
        while(node!=null){
            System.out.print(node.value+" -> ");
            node=node.prev;
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
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        head.prev=null;
        return val;
    }
    public int deleteLast(){
        Node last=getLast();
        int val=last.value;
        last.prev.next=null;
        return val;
    }
    public Node find(int val){
        Node node=head;
        while(node.value!=val){
            node=node.next;
        }
        return node;
    }
    public void insertAfterValue(int insertValue,int afterValue){
        Node prevNode=find(afterValue);
        Node node=new Node(insertValue);
        prevNode.next.prev=node;
        node.next=prevNode.next;
        prevNode.next=node;
        node.prev=prevNode;
    }

}
