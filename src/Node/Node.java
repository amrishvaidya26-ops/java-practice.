//package Node;
//
//public class Node {
//
//    int data;
//    int next;
//
//
//    Node(int data) {
//        this.data =  data;
//        this.next = Integer.parseInt(null);
//
//    }
//}
//
//  class queue {
//    Node front;
//    Node rear;
//
//
////    Insert
//
//      void Enqueue(int data, Node nextnode) {
//
//          Node newnode = new Node(data);
//
//          if (rear == null) {
//              front = rear = newnode;
//              return;
//
//          }
//          rear.next = newnode;
//          rear = nextnode;
//
//
////          Delete
//
//          void dequeue () {
//              if (front == null) {
//
//                  System.out.println("Queue is Empty");
//                  return;
//              }
//
//              front = front.next;
//
//              if (front == null) {
//                  rear = null;
//
//              }
//          }
//
////          Display
//
//       void display () {
//
//              Node temp = Node;
//
//          }
