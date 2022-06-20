package main.java;

public class MyLinkedLists {
    public static void main(String[] args) {
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        integerMyLinkedList.add(8);
        System.out.println(integerMyLinkedList);
        integerMyLinkedList.add(9);
        integerMyLinkedList.add(88);
        integerMyLinkedList.add(18);
        System.out.println(integerMyLinkedList);
        System.out.println(integerMyLinkedList.size());
        System.out.println(integerMyLinkedList.get(21));
        integerMyLinkedList.remove(2);
        System.out.println( integerMyLinkedList);
        integerMyLinkedList.clear();
        System.out.println(integerMyLinkedList);
    }
}

