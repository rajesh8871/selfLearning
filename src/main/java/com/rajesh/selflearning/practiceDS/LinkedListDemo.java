package com.rajesh.selflearning.practiceDS;

public class LinkedListDemo<T> {

    class Node {
        //one node consist of data and pointer to nextNode
        T data;
        Node next;

         Node(T data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size;

    public void add(T data) {
        //for the first time when Linkedlist is empty
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }
        size++;
    }

    public void add(T data, int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Index out of range...");
            return;
        }

        Node currentNode = head;
        Node prev = null;
        int i = 0;
        while (currentNode != null && i != index) {
            prev = currentNode;
            currentNode = currentNode.next;
            i++;
        }

        Node newNode = new Node(data);
        //if user try to add before 1st node
        if (prev == null) {
            newNode.next = head;
            head = newNode;
        }else
        {
            prev.next=newNode;
            newNode.next=currentNode;
        }
        size++;

    }

    @Override
    public String toString() {
        Node currentNode = head;//first node
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        while (currentNode != null) {
            stringBuilder.append(currentNode.data);
            stringBuilder.append(", ");
            currentNode = currentNode.next;
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<>();
        linkedListDemo.add(20);
        linkedListDemo.add(2);
        linkedListDemo.add(22);
        System.out.println(linkedListDemo);
    }
}
