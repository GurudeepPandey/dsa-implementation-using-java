
// 1. delete nth node from last
// 2. check palindrome

class MyLinkedList2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1. delete nth node from last
    void deleteNthNodeFromLast(int n) {
        // find length of ll
        Node temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        if(n <= 0 || n > size || head == null) {
            System.out.println("Invalid value of n or empty linked list");
            return;
        } else if(n == size) {
            head = head.next;
            return;
        }

        temp = head;
        for(int i = 1; i<=size-n-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    // 2. check palindrome
    Boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return false;
        }

        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart  = head;
        while(secondHalfStart != null) {
            if(firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }

    // reverse function
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // find middle function
    Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
    }

    // display data
    void displayData() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add bulk data
    void insertBulkData(int[] arr) {
        for(int i = arr.length - 1; i>=0; i--) {
            Node newNode = new Node(arr[i]);
            newNode.next = head;
            head = newNode;
        }
    }
}

public class LLQ4 {
    public static void main(String[] args) {
        MyLinkedList2 list = new MyLinkedList2();

        list.displayData();

        int[] arr = {100, 200, 200};
        list.insertBulkData(arr);
        list.displayData();

        System.out.println(list.checkPalindrome());

        list.deleteNthNodeFromLast(2);
        list.displayData();
    }
}