//public class Linkedlistsamp {
//
//    static class Node {
//
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public class Main {
//
//        public static void main(String[] args) {
//
//            Node head = new Node(10);
//
//            head.next = new Node(20);
//            head.next.next = new Node(30);
//            head.next.next.next = new Node(40);
//
//            Node current = head;
//
//            while (current != null) {
//                System.out.print(current.data + " -> ");
//                current = current.next;
//            }
//        }
//    }
//}
//-------------------------------------------------------------------------------------------------------

// Question no 2
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        // Existing list
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//
//        // New node
//        Node newNode = new Node(5);
//
//        // Insert at beginning
//        newNode.next = head;
//        head = newNode;
//
//        // Display
//        Node current = head;
//
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//    }
//}

//-----------------------------------------------------------------------------------------------------------

//Question 3

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        // Existing linked list
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//
//        // New node
//        Node newNode = new Node(40);
//
//        // Go to last node
//        Node current = head;
//
//        while (current.next != null) {
//            current = current.next;
//        }
//
//        // Insert at end
//        current.next = newNode;
//
//        // Display
//        current = head;
//
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//    }
//}

//------------------------------------------------------------------------------------------------------

// Question no 4
//class Node {
//
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//
//        int position = 3;
//        Node newNode = new Node(25);
//
//        Node current = head;
//
//        // Go to node before the position
//        for (int i = 1; i < position - 1; i++) {
//            current = current.next;
//        }
//
//        // Insert new node
//        newNode.next = current.next;
//        current.next = newNode;
//
//        // Display
//        current = head;
//
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//    }
//}
//------------------------------------------------------------------------------------------------------

//Question no 5

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//
//        // Delete first node
//        head = head.next;
//
//        // Display
//        Node current = head;
//
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//    }
//}
//-------------------------------------------------------------------------------------------------------

// Question 6
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//
//        // Delete last node
//        Node current = head;
//
//        while (current.next.next != null) {
//            current = current.next;
//        }
//
//        current.next = null;
//
//        // Display
//        current = head;
//
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//    }
//}
//-------------------------------------------------------------------------------------------------------------

//Question no 7

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//
//        // Reverse linked list
//        Node previous = null;
//        Node current = head;
//
//        while (current != null) {
//            Node nextNode = current.next;
//
//            current.next = previous;
//
//            previous = current;
//            current = nextNode;
//        }
//
//        head = previous;
//
//        // Display
//        Node temp = head;
//
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//    }
//}