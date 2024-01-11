package com.cetin.data;

//Array ile linked list arasında veri saklama yönteminde farklılık vardır.
//Array memory üzerinde sıralı tutulur.
//Linked List rasgele tutulur.
//Linked list üzerinde veriye bir sonraki node'un adresini bilir ve onun üzerinden ulasilir.
public class SingleLinkedList {
    private Node head;

    public SingleLinkedList(Node head) {
        this.head = head;
    }

    public int count(){
        Node current = this.head;
        int counter = 0;
        while(current != null){
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            this.head = newNode;
        } else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int index){
        if(isEmpty())
            System.out.println("List is empty");

        if(index > count())
            System.out.println("Index out of bound");

        Node current = this.head;
        Node prev = null;
        int counter = 0;
        while(counter < index-1){
            prev  = current;
            current = current.next;
            counter++;
        }

        assert prev != null;
        prev.next = current.next;
    }

    private boolean isEmpty() {
        return this.head == null;
    }

    public void printList(){
        Node current = this.head;
        while(current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

}
