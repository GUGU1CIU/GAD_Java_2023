package basics;

import static java.lang.System.arraycopy;

public class Main {
    static void copyArrayExample() {
        char[] copyFrom = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] copyTo = new char [7];
        System.arraycopy(copyFrom, 2, copyTo, 0 ,7);
        System.out.println(copyTo);
    }

    static void compareStirng(){
        String firstString = new String("First String");
        String secondString = new String("Secnond string");

        if(firstString.equals(secondString)) {
            System.out.println("ture");
        }
    }

    public static void main(String[] args) {
        copyArrayExample();
        byte a1 = 12;
        byte a2 = 56;
        int a3 = a1 + a2;
    }
}
