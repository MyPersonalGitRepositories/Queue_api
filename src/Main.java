import lists.exceptions.IllegalStateException;
import lists.exceptions.NoSuchElementException;
import lists.exceptions.NullPointerException;
import queue.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new Queue<>(10, false);
        Queue<Integer> queue2 = new Queue<>();

        System.out.println("Adding elements to queue1:");
        try {
            System.out.println(queue1.add(1));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue1.add(2));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }try {
            System.out.println(queue1.add(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Adding elements to queue2:");
        try {
            System.out.println(queue2.add(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue2.add(7));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Queue is not empty !");
        System.out.println(queue1.empty());
        System.out.println("Queue is not empty !");
        System.out.println(queue2.empty());

        queue1.clear();
        queue2.clear();

        System.out.println();
        System.out.println("Queue is empty !");
        System.out.println(queue1.empty());
        System.out.println("Queue is empty !");
        System.out.println(queue2.empty());
        System.out.println();

        try {
            System.out.println(queue1.element());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue2.element());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("Adding elements to queue1:");
        try {
            System.out.println(queue1.add(11));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue1.add(12));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }try {
            System.out.println(queue1.add(13));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Adding elements to queue2:");
        try {
            System.out.println(queue2.add(9));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue2.add(10));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println();
        try {
            System.out.println(queue1.element());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue2.element());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Offering elements to queue1");
        try {
            System.out.println(queue1.offer(12));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }try {
            System.out.println(queue1.offer(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("Offering elements to queue2");
        try {
            System.out.println(queue2.offer(11));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }try {
            System.out.println(queue2.offer(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println(queue1.poll());
        System.out.println(queue2.poll());

        queue1.clear();
        queue2.clear();
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println();

        System.out.println("Adding elements to queue1:");
        try {
            System.out.println(queue1.add(111));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue1.add(122));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }try {
            System.out.println(queue1.add(133));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Adding elements to queue2:");
        try {
            System.out.println(queue2.add(90));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue2.add(100));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            System.out.println(queue1.remove());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }try {
            System.out.println(queue2.remove());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println(queue1.peek());
        System.out.println(queue2.peek());
        System.out.println();

        queue1.clear();
        queue2.clear();

        try {
            System.out.println(queue1.remove());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue2.remove());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println(queue1.peek());
        System.out.println(queue2.peek());
        System.out.println();

        try {
            queue1.add(34);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            queue1.add(448);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            queue2.add(99);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            queue2.add(180);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println("This element is on:");
        try {
            System.out.println(queue1.search(34));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("This element is on:");
        try {
            System.out.println(queue2.search(180));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            System.out.println(queue1.search(200));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(queue1.search(300));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
