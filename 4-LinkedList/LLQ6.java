
// implement circular linked list and all its operations

class MyCircularLL {
    int length = 0;
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1. display node of cll
    public void display() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(" Back to head " + length);
    }

    // 2. insert node at begining
    public void insertAtBegining(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            newNode.next = head;
            length++;
            return;
        }
        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        head = temp.next = newNode;
        length++;
    }

    // 3. insert node at end
    public void indertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            newNode.next = head;
            length++;
            return;
        }
        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        length++;
    }

    // 4. insert node at any position
    public void insertAtPosition(int pos, int data) {
        if(pos <= 0 || pos > length || head == null) {
            System.out.println("Invalid position or list is empty");
            return;
        }
        if(pos == 1) {
            insertAtBegining(data);
            return;
        }
        
        Node temp = head;
        for(int i = 1; i<pos-1; i++) {
            temp = temp.next;
        }
        
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
    }

    // 5. delete node from begining
    public void deleteFromBegining() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == head) {
            head = null;
            length--;
            return;
        }

        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
        length--;
    }

    // 6. delete node from end
    public void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == head) {
            head = null;
            length--;
            return;
        }

        Node temp = head;
        while(temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
        length--;

        // Node prev = null;
        // while (temp.next != head) {
            // prev = temp;
            // temp = temp.next;
        // }
    }

    // 7. delete node by value
    public void deleteByValue(int key) {
        if (head == null) return;

        Node curr = head;
        Node prev = null;
        do {
            if (curr.data == key) {
                if (curr == head) {
                    deleteFromBegining();
                } else {
                    prev.next = curr.next;
                }
                length--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
        System.out.println("Value not found");
    }

    // 8. search data in node
    public void search(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        int pos = 1;
        do {
            if (temp.data == key) {
                System.out.println("Found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        } while (temp != head);
        System.out.println("Not found");
    }

}

public class LLQ6 {
    public static void main(String[] args) {
        MyCircularLL list = new MyCircularLL();
        list.display();

        // list.insertAtBegining(100);
        // list.insertAtBegining(200);
        // list.insertAtBegining(300);
        list.insertAtBegining(400);
        list.display();

        list.indertAtEnd(500);
        list.indertAtEnd(600);
        list.display();

        list.insertAtPosition(3,35);
        list.display();

        list.deleteFromBegining();
        list.display();

        list.deleteFromEnd();
        list.display();

        list.deleteByValue(35);
        list.display();

        list.search(500);
    }
}