package com.cetin.data;

//Array ile linked list arasında veri saklama yönteminde farklılık vardır.
//Array memory üzerinde sıralı tutulur.
//Linked List rasgele tutulur.
//Linked list üzerinde veriye bir sonraki node'un adresini bilir ve onun üzerinden ulasilir.
public class DoubleLinkedList {
    private Node head;
    private Node tail;


    public DoubleLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
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

    private boolean addNodeAsEmptyList(Node newNode) {
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private void checkIfIsNodeNull() {
        assert this.head != null;
        assert this.tail != null;
    }


    public void printListFromBegin(){
        System.out.println("Start from beginning...");
        Node current = this.head;
        while(current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }


    public void printListFromLast(){
        System.out.println("Start from ending...");
        Node current = this.tail;
        while(current.prev != null){
            System.out.println(current.value);
            current = current.prev;
        }
        System.out.println(current.value);
    }

    public void addHead(int value){
        Node newNode = new Node(value);
        if(addNodeAsEmptyList(newNode))
            return;

        head.prev = newNode;
        newNode.next = head;
        head = newNode;

    }
    public void addTail(int value){
        Node newNode = new Node(value);
        if(addNodeAsEmptyList(newNode))
            return;

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

    }

    public void addMiddle(int value){
        Node newNode = new Node(value);
        if(addNodeAsEmptyList(newNode))
            return;
        else if(tail == head)
            addTail(value);

        int middle = count()/2;

        Node current = head;
        Node previous = head;
        int counter = 0;
        while(counter<= middle-1){
            previous = current;
            current = current.next;
            counter++;
        }

        previous.next = newNode;
        newNode.next = current;
        current.prev = newNode;
        newNode.prev = previous;
    }

    public void removeFromLast(){
        checkIfIsNodeNull();

        if(tail == head){
            tail = null;
            head = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;

    }

    public void removeFromBegin(){
        checkIfIsNodeNull();

        if(tail == head){
            tail = null;
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }



}
