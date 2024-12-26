package tatar.companiese.kamil.testing;

import java.util.Arrays;

class StartGE{
    public static void main(String[] args) {
        GenericExample<String> ge1 = new GenericExample<>();
        GenericExample<Object> ge2 = new GenericExample<>();
        GenericExample<Integer> ge3 = new GenericExample<>();
        GenericExample<Double> ge4 = new GenericExample<>();
        ge1.add(1,"One");
        ge1.add(2, "Two");
        ge2.add(3,3);
        ge2.add(4,4.0f);
        ge2.add(5,5000L);
        ge1.show();
        ge2.show();
    }
}

public class GenericExample<T> {
    private Object[] array = new Object[10];
    void add(int id, T value){
        array[id] = value;
    }
    void show(){
        System.out.println(Arrays.toString(array));
    }
}
