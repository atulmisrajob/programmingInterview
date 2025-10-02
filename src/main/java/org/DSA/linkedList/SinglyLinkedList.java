package org.DSA.linkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        ssl.head.next = second;
        second.next = third;
        third.next = fourth;

        dispaly(ssl);

        newNodeatBegining(ssl, 12);
        dispaly(ssl);
        reverse(ssl);
    }

    private static void newNodeatBegining(SinglyLinkedList ssl, int i) {
        ListNode newNode = new ListNode(i);
        newNode.next = ssl.head;
        ssl.head = newNode;

    }

    private static void reverse(SinglyLinkedList ssl) {

    }

    private static void dispaly(SinglyLinkedList ssl) {
        ListNode current = ssl.head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
}
