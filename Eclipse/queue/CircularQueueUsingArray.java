package queue;

public class CircularQueueUsingArray {
	
	static class Queue{
		static int arr[];
		static int size;
		static int rear = -1;
		static int front = -1;
		
		Queue(int n){
			arr = new int [n];
			this.size = n;
		}
		
		//empty queue
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		
		//Enqueue: adding elements in queue
		public static void add(int data) {
			if(isFull()) {
				System.out.println("queue is full");
				return;
			}
			
			if(front==-1) {
				front = 0;
			}
			rear = (rear+1)%size;
			arr[rear] = data;
		}
		
		//Dequeue: removing element -  O(n)
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			int result = arr[front];
			if(rear==front) {
				rear = front=-1;
			}else {
				front = (front+1)%size;
			}
			
			return result;
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			return arr[front];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(	q.remove());
		q.add(6);
		System.out.println(q.remove());
		q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}

//PRACTICE
/*
 public class CircularQueue{
    public static class Queeue{
        private static int arr[];
        private static int size;
        private static int front=-1;
        private static int rear=-1;
        private static int currSize=0;
        
        public Queeue(int n){
            this.size = n;
            arr = new int[size];
        }
        
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        
        public static boolean isEmpty(){
            return (front==-1 && rear==-1);
        }
        
        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
            currSize++;
            System.out.println("Data enqueued");
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return 0;
            }
            int ele = arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            currSize--;
            return ele;
        }
         public static int peek(){
            return arr[front];
        }
    }
    public static void main(String args[]){
        
        Queeue q = new Queeue(5); 
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        System.out.println(q.currSize);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
        
        
    }
}*/
