package com.cetin.data;

public class Main {
    public static void main(String[] args) {
       // testSingleLinkedList();
        testDoubleLinkedList();
    }

    private static void testDoubleLinkedList() {
        Node node = new Node(1);
        DoubleLinkedList dl = new DoubleLinkedList(node, node);
        dl.addHead(2);
        dl.addHead(3);
        dl.addHead(4);
        dl.addHead(5);
        dl.addTail(6);
        dl.addTail(7);
        dl.addTail(8);
        dl.addTail(9);
        dl.printListFromBegin();
        dl.printListFromLast();

        printLineByStr("REMOVE FROM HEAD");
        dl.removeFromBegin();
        printLineByStr("------------");
        dl.printListFromBegin();
    }

    private static void testSingleLinkedList() {
        Node n1 = new Node(1);
        SingleLinkedList sl = new SingleLinkedList(n1);
        sl.add(2);
        printLineByStr("ADD");
        sl.printList();
        sl.add(3);
        printLineByStr("ADD");
        sl.printList();
        sl.add(4);
        printLineByStr("ADD");
        sl.printList();
        sl.add(5);
        printLineByStr("ADD");
        sl.printList();
        sl.add(6);
        printLineByStr("ADD");
        sl.printList();
        printLineByStr("DELETE");
        sl.delete(3);
        sl.printList();
    }

    private static void printLineByStr(String str) {
        System.out.println("---------------------"+str+"------------------------------");
    }
}