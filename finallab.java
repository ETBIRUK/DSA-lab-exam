import java.util.Arrays;

//number 1 test answer


public class finallab {
    public class BubbleSort {
        public class BubbleSortt {
            public static void sort(char[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            char temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            }

            public static void main(String[] args) {
                char[] number = {'5', '4', '3', '2', '1'};
                System.out.print("sorted array: ");
                System.out.println(new String(number));

                sort(number);

                System.out.print("Sorted array: ");
                System.out.println(new String(number));
            }
        }
    }
}





//number 3 test answer


            import java.util.Stack;
                     public class QueueUsingStacks {

                         private Stack<Integer> stack1;
                         private Stack<Integer> stack2;
                         public QueueUsingStacks() {
                             stack1 = new Stack<>();
                             stack2 = new Stack<>();
                         }

                         public void enqueue(int data) {

                             stack1.push(data);
                         }

                         public int dequeue() {
                             if (isEmpty()) {
                                 System.out.println("Queue is empty!");
                                 return -1;
                             }

                             moveElements(stack1, stack2);


                             int dequeuedElement = stack2.pop();
//
//
                             moveElements(stack2, stack1);
//
                             return dequeuedElement;
                         }

                         public int peek() {
                             if (isEmpty()) {
                                 System.out.println("Queue is empty!");
                                 return -1;
                             }
//
//
                             moveElements(stack1, stack2);
                             int topElement = stack2.peek();


                             moveElements(stack2, stack1);

                             return topElement;
                         }

                         public boolean isEmpty() {
                             return stack1.isEmpty();
                         }

                         private void moveElements(Stack<Integer> source, Stack<Integer> destination) {
                             while (!source.isEmpty()) {
                                 destination.push(source.pop());
                             }
                         }
                     }

////
 class QueueDemo {

    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();


        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);


        System.out.println("equeued: " + queue.dequeue());
        System.out.println("equeued: " + queue.dequeue());
        System.out.println("equeued: " + queue.dequeue());
        System.out.println("dequeued: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}


// 5 test question

import java.util.Arrays;
public class BubbleSortse {
    public static void sort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; true; j--) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] alphabets = {"olleh"};
        System.out.print("unsorted array: ");
        System.out.println(new String(Arrays.toString(alphabets)));
    }
}


//question 4


public class class4 {
    public int findMaximum(int[] nums) {
        boolean b = nums.length == 0;
        if (nums == null nums.length == 0) {
            System.out.println("Array is empty.");
            return -1;
        }
        int max = nums[0]; // Assume the first element is the maximum

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // Update the maximum if a larger element is found

        }

        return max;
    }
}
}