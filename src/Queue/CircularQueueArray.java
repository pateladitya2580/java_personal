package Queue;

public class CircularQueueArray {
    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int [] arr = new int[5];
        public void add(int x)throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full");
            }
            else if (size == 0){
                front = rear= 0;
                arr[0] = x;
            }
            else if(rear<arr.length-1){
                arr[rear+1] = x;
                rear++;
            }
            else if (rear == arr.length-1)
            {
                rear = 0;
                arr[rear] = x;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else if (front == arr.length-1){
                int val = arr[front];
                front = 0;
                size--;
                return val;
            }
            else{
                int val = arr[front];
                front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty");
            }
            else return arr[front];
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
            }
            else if (front <= rear){
                for(int i = front;i<= rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else if (rear < front)
            {
                for(int i = front;i< arr.length;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0 ; i<= rear;i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();//1 2 3 4
        q.remove();
        q.display();//2 3 4
        q.add(5);
        q.display();// 2 3 4 5
        q.add(6);
        q.display();// 2 3 4 5 6
        q.add(7);
    }
}
