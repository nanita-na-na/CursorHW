package homework5;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(7);
        myList.add(20);
        myList.add(1);
        myList.add(-10);
        myList.add(48);
        System.out.println(myList + " Max number is: " + myList.max() + " Min number is: " + myList.min());
    }
}
