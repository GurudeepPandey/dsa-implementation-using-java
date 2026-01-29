
// 1. reverse linked list
// 2. find middle element in linked list


class MyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // reverse ll using iterative method
    void reverse() {
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;

            // update pointers
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // find middle element in linked list
    // hair and tortoise approach
    void getMiddle() {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
    }

    // display data of linked list
    void displayData() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add data at first
    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}

public class LLQ3 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        list.displayData();
        list.addFirst(20);
        list.addFirst(50);
        list.addFirst(100);
        list.addFirst(200);
        list.addFirst(1000);
        list.displayData();

        list.reverse();
        list.displayData();
        
        list.getMiddle();
    }
}