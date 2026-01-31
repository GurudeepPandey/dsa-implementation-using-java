
// Implementation of doubly linked list

class Dll {
    Node head = null;
    Node tail = null;
    int length = 0;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // 1. display ll in forward form using head pointer
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while(temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 2. display ll in backward form using tail pointer
    public void displayBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while(temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // 3. insert data at begining
    public void insertAtBegining(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            newNode.next = head;
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // 4. insert data at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;         // head = tail = newNode
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;

        // using head pointer TS: O(n)
        // Node temp = head;
        // while(temp.next != null) {
        //     temp = temp.next;
        // }
        // newNode.prev = temp;
        // temp.next = newNode;
        // tail = newNode;
    }

    // 5. delete data from begining
    public void deleteFromBegining() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        if(head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        length--;
    }

    // 6. delete data from end
    public void deleteFromEnd() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        length--;
    }

    // 7. search first presence of data
    public boolean search(int target) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == target) return true;
            temp = temp.next;
        }
        return false;
    }

    // 8. update first old data
    public void update(int oldValue, int newValue) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found");
    }

    // 9. reverse doubly linked list
    public void reverse() {
        Node curr = head;
        Node temp = null;
        while(curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp != null) {
            head = temp.prev;
        }
    }

    // 10. insert data at any position
    public void insertAtPosition(int pos, int data) {
        if(pos <= 0 || pos > length || head == null) {
            System.out.println("Invalid position or empty list");
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
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // 11. delete by value 
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            deleteFromBegining();
        } else if (temp == tail) {
            deleteFromEnd();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        length--;
    }
}

public class LLQ5 {
    public static void main(String[] args) {
        Dll list = new Dll();

        // list.displayForward();
        // list.displayBackward();

        // list.insertAtBegining(30);
        list.insertAtBegining(300);
        list.insertAtBegining(500);
        list.displayForward();
        // list.displayBackward();

        // list.insertAtEnd(7);
        // list.insertAtEnd(8);
        list.displayForward();

        
        // list.deleteFromBegining();
        list.displayForward();
        
        System.out.println(list.search(7));
        System.out.println(list.search(9));
        list.update(7, 700);
        list.displayForward();
        
        // list.reverse();
        
        System.out.println(list.length);
        list.insertAtPosition(2, 1);
        list.displayForward();
        list.displayBackward();

        list.deleteByValue(1);
        list.displayForward();
        list.displayBackward();
    }
}