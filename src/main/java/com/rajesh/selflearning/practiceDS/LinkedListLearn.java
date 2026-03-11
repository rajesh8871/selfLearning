package com.rajesh.selflearning.practiceDS;


public class LinkedListLearn {

    class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail;
    Node headNode;
    int size;

    public void add(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void add(int data, int index) {

        Node newNode = new Node(data);
        Node prevNode = null;
        Node currentNode = headNode;

        if (index < 0 || index > size - 1) {
            System.out.println("Index out of range");
            return;
        }
        int counter = 0;
        while (currentNode.next != null && counter != index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            counter++;
        }
        //check if its head index to add
        if (prevNode == null) {
            newNode.next = currentNode;
            headNode = newNode;
        } else {
            prevNode.next = newNode;
            newNode.next = currentNode;
        }
        size++;
    }

    public void swapNode(int x, int y) {

        Node currentNodeX = headNode;
        Node prevX = null;
        //find prevX node
        while (currentNodeX.next != null && currentNodeX.data != x) {
            prevX = currentNodeX;
            currentNodeX = currentNodeX.next;
        }

        Node prevY = null;
        Node currentNodeY = headNode;
        while (currentNodeY.next != null && currentNodeY.data != y) {
            prevY = currentNodeY;
            currentNodeY = currentNodeY.next;
        }

        if (prevX != null) {
            prevX.next = currentNodeY;
        } else {
            headNode = currentNodeY;
        }

        if (prevY != null) {
            prevY.next = currentNodeX;
        } else {
            headNode = currentNodeX;
        }

        // swapping pointers
        Node temp = currentNodeX.next;
        currentNodeX.next = currentNodeY.next;
        currentNodeY.next = temp;
    }

    @Override
    public String toString() {
        Node currentNode = headNode;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (currentNode != null) {
            builder.append(currentNode.data);
            builder.append(", ");
            currentNode = currentNode.next;
        }
        if (builder.length() > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }
        builder.append("]");
        return builder.toString();
    }

    // prints content
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public Node reverseLinkedList() {
        Node currentNode = headNode;
        Node prevNode = null;//keeping prev as null so can point as next node to first element

        while (currentNode != null) {
            Node tempNextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = tempNextNode;

        }
        printList(prevNode);
        return prevNode;

    }

    public Node evenToOddElementsNode() {
        Node evenStartPoint = null;
        Node evenPointerNode = null;
        Node oddStartPoint = null;
        Node oddPointerNode = null;
        Node currentNode = headNode;//point to head Node

        while (currentNode != null) {
            //check if even node
            if (currentNode.data % 2 == 0) {
                //check if we are at first even node
                if (evenStartPoint == null) {
                    //set evenStartPont
                    evenStartPoint = currentNode;
                } else {
                    evenPointerNode.next = currentNode;
                }
                evenPointerNode = currentNode;
            } else {
                if (oddStartPoint == null) {
                    //set oddStartPoint
                    oddStartPoint = currentNode;
                } else {
                    oddPointerNode.next = currentNode;
                }
                oddPointerNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        if (evenStartPoint != null) {
            evenPointerNode.next = oddStartPoint;
        }
        if (oddStartPoint != null) {
            oddPointerNode.next = null;
        }
        if (evenStartPoint != null) {
            return evenStartPoint;
        }
        return oddStartPoint;
    }

    public void oddToEvenNodePrint() {
        Node oddStartingPosition = null;
        Node oddNode = null;
        Node evenStartPoint = null;
        Node evenNode = null;
        Node currentNode = headNode;

        int count = 1;
        while (currentNode != null) {
            //if node is even
            if (count % 2 == 0) {
                // if first node of even
                if (evenStartPoint == null) {
                    evenStartPoint = currentNode;
                    evenNode = currentNode;
                } else {
                    evenNode.next = currentNode;
                    evenNode = currentNode;
                }
            } else {
                //first node of odd
                if (oddStartingPosition == null) {
                    oddStartingPosition = currentNode;
                    oddNode = currentNode;
                } else {
                    oddNode.next = currentNode;
                    oddNode = currentNode;
                }

            }
            currentNode = currentNode.next;
            count++;
        }
        //once we will get even and odd nodes connect accordingly
        if (evenStartPoint != null) {
            evenNode.next = null;
        }
        if (oddStartingPosition != null) {
            oddNode.next = evenStartPoint;
        }
        if (oddStartingPosition != null)
            printList(oddStartingPosition);
        else if (evenStartPoint != null)
            printList(evenStartPoint);
    }

    //short code for oddToEven
    public void oddToEvenNodes() {
        Node oddStartingPosition = headNode;
        Node oddNode = headNode;
        Node evenStartPosition = headNode.next;
        Node evenNode = headNode.next;

        while (evenNode != null && evenNode.next != null) {
            if (oddStartingPosition == null)
                oddStartingPosition = oddNode;

            if (evenStartPosition == null)
                evenStartPosition = evenNode;

            oddNode.next = oddNode.next.next;
            evenNode.next = evenNode.next.next;
            oddNode = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenStartPosition;
        printList(oddStartingPosition);
    }

    public void removeDuplicates() {
        //1->1->1->2->2->3->
        Node currentNode = headNode;
        while (currentNode != null) {
            Node tempNode = currentNode;
            while (tempNode != null && tempNode.data == currentNode.data) {
                tempNode = tempNode.next;
            }
            currentNode.next = tempNode;
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListLearn linkedListLearn = new LinkedListLearn();
        linkedListLearn.add(20);
        linkedListLearn.add(31);
        linkedListLearn.add(40);
        linkedListLearn.add(51);
        linkedListLearn.add(60);
        //linkedListLearn.swapNode(20, 40);
        // linkedListLearn.printList(linkedListLearn.evenToOddElementsNode());
        //linkedListLearn.oddToEvenNodePrint();
        linkedListLearn.oddToEvenNodes();
        // System.out.println("earlier :" + linkedListLearn);
        // linkedListLearn.reverseLinkedList();
    }
}
