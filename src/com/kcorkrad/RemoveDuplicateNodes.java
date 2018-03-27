package com.kcorkrad;

class Node {
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class RemoveDuplicateNodes {

    private static Node removeDuplicates(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node flyNode = head;
        Node nexNode = flyNode.next;
        while (nexNode != null){
            while (nexNode != null && flyNode.data == nexNode.data){
                nexNode = nexNode.next;
            }
            flyNode.next = nexNode;
            if (nexNode == null) {
                return head;
            }
            flyNode = nexNode;
            nexNode = flyNode.next;

        }

        return head;
    }

    private static Node insert(Node head, int data){
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;
        }
        return head;
    }
    private static void display(Node head){
        Node start = head;
        while (start != null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //Scanner in = new Scanner(System.in);
        int[] dataList1 = {1,2,2,3,3,4};
        int[] dataList2 = {1,1,1,1,1};
        int[] dataList3 = {3,9,9,11,11,11,11,89,89,100,100,101,102,103,108,200,250,250,250,250};

        Node head = null;
        for (int a : dataList1) {
            head = insert(head, a);
        }
        display(head);
        System.out.println();
        head = removeDuplicates(head);
        display(head);

    }
}
