package LinkedListDemo;

import java.util.NoSuchElementException;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private int value;
        private Node next;
        public Node(int val){
            this.value=val;
        }
        public Node(int val, Node next){
            this.value=val;
            this.next=next;
        }
    }
    public LL(){
        this.size=0;
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
        if(tail!=null){
            tail.next=n1;
        }
        tail=n1;
        if(head==null){
            head=tail;
        }
        size+=1;
    }
    public int size(){
        return size;
    }

    public void display() {
        if(size==0){
            System.out.println("List is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp =temp.next;
        }
        System.out.print("END ");
    }
    public void insert(int val, int index) throws IndexOutOfBoundsException{
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node n1=new Node(val,temp.next);//creating a new node and link it with next node
        temp.next=n1;
        size++;
    }
    public int deleteFirst(){
        if(size<=0){
            throw new NoSuchElementException("List is Empty");
        }
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=0){
            throw new NoSuchElementException("List is Empty");
        }
        if(size==1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
}
