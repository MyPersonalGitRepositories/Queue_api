package queue;

import lists.MyLinkedList;
import lists.exceptions.IllegalStateException;
import lists.exceptions.NoSuchElementException;
import lists.exceptions.NullPointerException;

public class Queue<T extends Comparable>{
    private MyLinkedList<T> list;
    private final int maxSize;
    private boolean areNullElementsAllowed;
    private boolean isSmthAdded = false;

    public <E extends T> Queue(){
        this(0, true);
    }

    public <E extends T> Queue(int maxSize, boolean areNullElementsAllowed){
        list = (MyLinkedList<T>) new MyLinkedList<E>();
        this.maxSize = maxSize <= 0 ? Integer.MAX_VALUE : maxSize;
        this.areNullElementsAllowed = areNullElementsAllowed;
    }

    public boolean add(T item) throws NullPointerException, IllegalStateException {
        if(getList().size() <= maxSize){
            if(areNullElementsAllowed){
                list.add(item);
                isSmthAdded = true;
                return true;
            } else {
                if(item == null){
                    System.out.println("false");
                    throw new NullPointerException();
                } else {
                    list.add(item);
                    isSmthAdded = true;
                    return true;
                }
            }
        } else {
            throw new IllegalStateException(maxSize);
        }
    }

    public boolean offer(T item) throws NullPointerException {
        if(getList().size() <= maxSize){
            if(areNullElementsAllowed){
                list.add(item);
                isSmthAdded = true;
                return true;
            } else {
                if(item == null){
                    System.out.println("false");
                    throw new NullPointerException();
                } else {
                    list.add(item);
                    isSmthAdded = true;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    public T peek() {
        T value = (T) list.getHeadValue();
        if(value == null) return null;
        return value;
    }

    public T poll() {
        T value = (T) list.removeHEAD();
        if(value == null) return null;
        return value;
    }

    public T remove() throws NoSuchElementException, NoSuchMethodException {
        T value = (T) list.removeHEAD();
        if(value == null) throw new NoSuchElementException(Queue.class.getMethod("remove"));
        return value;
    }

    public T element() throws NoSuchElementException, NoSuchMethodException {
        T value = (T) list.getHeadValue();
        if(value == null) throw new NoSuchElementException(Queue.class.getMethod("element"));
        return value;
    }

    public boolean empty(){
        if(isSmthAdded){
            return false;
        } else {
            return true;
        }
    }


    public int search(T o) throws NoSuchElementException, NoSuchMethodException {

        if(getList().getHEAD().getNext().getValue() == null){
            System.out.println("-1");
            throw new NoSuchElementException(Queue.class.getMethod("search", Comparable.class));
        }
        int counter = 1;
        MyLinkedList.Node TEMP = getList().getHEAD();
        while (TEMP == getList().getTAIL() || hasNext(TEMP)){
            if(TEMP.getValue().equals(o)){
                return counter;
            } else {
                if(TEMP == getList().getTAIL()){
                    break;
                }
                TEMP = getList().moveToNext(TEMP);
                counter++;
            }
        }
        return -1;
    }

    private boolean hasNext(MyLinkedList.Node node){
        return node != getList().getTAIL();
    }

    public void clear(){
        list.removeDoublyLinkedList();
        isSmthAdded = false;
    }

    public MyLinkedList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}