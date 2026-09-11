package Circlar.queue;

class Queue {

    private int Front;
    private int Rear;
    private int Capacity;
    private int CurrentSize;
    private int[] arr;

    public Queue(int size) {
        this.Front = 0;
        this.Rear = 0;
        this.Capacity = size;
        this.CurrentSize = 0;
        this.arr = new int[size];
    }

    public void dequeue() {

        if (CurrentSize == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        arr[Front] = 0;
        Front = (Front + 1) % Capacity;
        CurrentSize--;
    }

    public static void main(String[] args) {
            Queue q = new Queue(4);
            q.dequeue();
        }
    }
