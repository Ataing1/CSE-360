package cse360assignment02;

public class TestRunner {
    public static void main (String[] args){
        AddingMachine a = new AddingMachine();
        a.add(14);
        a.add(24);
        a.subtract(42);
        a.add(41);
        System.out.println(a.getTotal());
        System.out.println(a.toString());
        a.clear();
        System.out.println(a.getTotal());
    }
}
