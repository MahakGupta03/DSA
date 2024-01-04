package stacks;

public class StacksWithArray {
	
	public static int top = -1;
	public static int arr[] = new int[10];
	
	public static boolean isEmpty() {
		return arr.length==0;
	}
	
	public static void push(int data) {
		arr[++top] = data;
		
	}
	
	public static void pop() {
		if(isEmpty()) {
			System.out.println("empty stack");
			return;
		}
		
		top--;
	}
	
	public static void peek() {
		if(isEmpty()) {
			System.out.println("empty stack");
			return;
		}
		
		System.out.println(arr[top]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(10);
		push(20);
		peek();
		pop();
		peek();
		System.out.println(isEmpty()) ;

	}

}


/*
 public class StackUsingArray{
    public static class Stack{
        static int arr[];
        static int top=-1;
        static int sSize;
        public Stack(int n){
            this.sSize=n;
            arr=new int[sSize];
        }
        
        public static boolean isEmpty(){
            return arr.length==0;
        }
        
        public static boolean isFull(){
            return top==sSize-1;
        }
        
        public static void push(int data){
            if(isFull()){
                System.out.print("Stack is full");
                return;
            }
            arr[++top]=data;
        }
        public static int pop(){
            if(isEmpty()){
                System.out.print("Stack is empty");
                return -1;
            }
            int ele = arr[top];
            top--;
            return ele;
        }
        public static int peek(){
            return arr[top];
        }
    }
    
    public static void main(String args[]){
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
 */
