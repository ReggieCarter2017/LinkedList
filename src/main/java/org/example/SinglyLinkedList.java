package org.example;

class ReverseLL {
    public static void main(String[] args)
    {
        ReverseLL ll = new ReverseLL();
        ll.head = new Node(5);
        ll.head.next = new Node(1);
        ll.head.next.next = new Node(24);
        ll.head.next.next.next = new Node(14);
        ll.head.next.next.next.next = new Node(87);

        ll.printList(head);
        head = ll.reverse(head);
        System.out.println("\n");
        ll.printList(head);
    }
static Node head;
static class Node {

    Integer value;
    Node next;

    Node(int n)
    {
        value = n;
        next = null;
    }
}
    Node reverse(Node head)
    {
        Node previousNode = null;
        Node currentNode = head;
        Node next = null;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = next;
        }
        head = previousNode;
        return head;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
}