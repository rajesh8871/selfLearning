package com.rajesh.selflearning.practiceDS;

public class LL {

    Node head;
    Node tail;
    int size;

    static class Node {
        int data;
        Node nextPointer;

        public Node(int data) {
            this.data = data;
            this.nextPointer = null;
        }
    }

    void add(int data) {
        //check if the LL is empty
        Node newNode = new Node(data);
        if (head == null || size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextPointer = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null || size == 0) {
            head = newNode;
        } else {
            tail.nextPointer = newNode;

        }
        tail = newNode;
        tail.nextPointer = null;
        size++;
    }

    public void deleteDataNode(int data) {
        //check for the invalid index first
        if (head == null) {
            System.out.println("Invalid index");
            return;
        }
        Node prev = head;
        Node current = head;
        while (current != tail.nextPointer) {
            if (current.data == data) {
                prev.nextPointer = current.nextPointer;
                return;
            } else {
                prev = current;
                current = current.nextPointer;
            }

        }


    }

    public void deleteIndex(int index) {
        if (head == null || index > size) {
            System.out.println("Invalid index");
            return;
        }
        //index at 0 needs to be deleted
        if (index == 0) {
            head = head.nextPointer;
            size--;
            return;
        }
        Node prev = head;
        Node curr = head.nextPointer;
        int counter = 0;
        while (counter < index) {
            if (counter == index - 1) {

                prev.nextPointer = curr.nextPointer;
                size--;
                return;
            } else {
                prev = curr;
                curr = curr.nextPointer;
                counter++;
            }
        }


    }

    @Override

    public String toString() {
        Node currentNode = head;//first node
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        while (currentNode != null) {
            stringBuilder.append(currentNode.data);
            stringBuilder.append(", ");
            currentNode = currentNode.nextPointer;
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.addLast(4);
       // ll.deleteIndex(1);

        ll.deleteDataNode(3);
        System.out.println(ll);

    }
}
