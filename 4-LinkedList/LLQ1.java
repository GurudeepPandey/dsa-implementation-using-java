
// Implementation of singly Linked list:


// Linked List Class
class LL {
    Node head;

    // Create Node class to create node object
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1. display data of Linked List
    public void printLinkedList() {
        Node tempHead = head;
        while(tempHead != null) {
            System.out.print(tempHead.data + " -> ");
            tempHead = tempHead.next;
        }
        System.out.println("null");
    }

    // 2. add data at first
    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 3. add data at last
    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node tempHead = head;
        while(tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = newNode;
    }

    // 4. delete data from first
    public void deleteAtFirst() {
        if(head == null) {
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
    }

    // 5. delete data from last
    public void deleteAtLast() {
        if(head == null) {
            System.out.println("List is already empty.");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node tempHead = head;
        while(tempHead.next.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = null;
    }

    // 6. search data in ll
    public boolean searchData(int target) {
        Node tempHead = head;
        while(tempHead != null) {
            if(tempHead.data == target) return true;
            tempHead = tempHead.next;
        }
        return false;
    }

    // 7. length of ll
    public int length() {
        int count = 0;
        Node tempHead = head;
        while(tempHead != null) {
            count++;
            tempHead = tempHead.next;
        }
        return count;
    }

    // 8. delete node by value
    public void deleteByValue(int value) {
        if(head == null) {
            System.out.println("List is already empty.");
            return;
        }
        if(head.data == value) {
            head = head.next;
            return;
        }
        Node tempHead = head;
        while(tempHead.next != null) {
            if(tempHead.next.data == value) {
                tempHead.next = tempHead.next.next;
                return;
            }
            tempHead = tempHead.next;
        }
        System.out.println("Element not found");
    }

    // 9. insert data at any position (1 based indexing)
    public void insertAt(int data, int pos) {
        int length = length();
        if(pos > length || pos <= 0) {
            System.out.println("Invalid position");
            return;
        } else if(pos == 1) {
            addAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node tempHead = head;
        for(int i = 1; i<pos-1; i++) {
            tempHead = tempHead.next;
        }
        newNode.next = tempHead.next;
        tempHead.next = newNode;
    }

    // 10. delete data by index(1 based indexing)
    public void deleteByPos(int pos) {
        int length = length();
        if(pos <= 0 || pos > length) {
            System.out.println("Invalid position");
            return;
        } else if(pos == 1) {
            deleteAtFirst();
            return;
        } else if(pos == length) {
            deleteAtLast();
            return;
        }

        Node tempHead = head;
        for(int i = 1; i<pos-1; i++) {
            tempHead = tempHead.next;
        }
        tempHead.next = tempHead.next.next;
    }
}


public class LLQ1 {
    public static void main(String[] args) {
        LL list = new LL();

        // print empty linked list
        list.printLinkedList();

        // add data at first in ll
        list.addAtFirst(500);
        list.addAtFirst(100);
        list.printLinkedList();

        // add data at last in ll
        list.addAtLast(1000);
        list.addAtLast(2000);
        list.printLinkedList();
        System.out.println("Length of Linked List: " + list.length());

        // delete data from first in ll
        list.deleteAtFirst();
        list.printLinkedList();

        // delete data from last of ll
        list.deleteAtLast();
        list.printLinkedList();

        // search data in ll
        System.out.println(list.searchData(23));
        System.out.println(list.searchData(0));
        System.out.println(list.searchData(1000));

        // length of ll
        list.addAtFirst(35);
        list.addAtLast(70);
        list.addAtLast(78);
        list.printLinkedList();
        System.out.println("Length of Linked List: " + list.length());

        // delete node by value
        list.deleteByValue(780);
        list.printLinkedList();

        // insert data at any position
        list.insertAt(20, 2);
        list.printLinkedList();

        // delete by position
        list.deleteByPos(4);
        list.printLinkedList();
    }
}