package com.kamilrr.java.git;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StartArrayList{
    public static void main(String[] args) {
        ArrayListExample.demonstrateArrayList("Moneday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
        ListAndArrayListExample.demonstrateArrayListAndList();
    }
}
public class ArrayListExample {
    static void demonstrateArrayList(String... args){
        ArrayList<String> arrayList = new ArrayList<>();
        for(String s : args){
            arrayList.add(s);
        }
        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
class ListAndArrayListExample {
    static void demonstrateArrayListAndList(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Integer> arrayList1 = new ArrayList<>(list);
        arrayList1.add(10);
        arrayList1.addAll(List.of(11,12,13));
        for(int i = arrayList1.size()-1; i >= 0; i--){
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();

        ArrayList<String> arrayList2 = new ArrayList<>(List.of("One","Two","Three","Four","Five","Six","Seven","Eight","Nine"));
        arrayList2.add("Ten");
        for(String s : arrayList2){
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        arrayList3.addAll(List.of(11,12,13,14,15));
        for(int i : arrayList3){
            System.out.print(i + " ");
        }
    }
}