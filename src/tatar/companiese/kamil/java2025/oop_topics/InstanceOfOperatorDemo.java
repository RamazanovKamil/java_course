package tatar.companiese.kamil.java2025.oop_topics;

public class InstanceOfOperatorDemo {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        doSomething(child1);
    }
    public static void doSomething(Object obj){
        boolean isObjInstanceOf = obj instanceof Parent;
        boolean isObjInstanceOf1 = obj instanceof Child1;
        boolean isObjInstanceOf2 = obj instanceof Child2;

        ((Child1) obj).child1Method(); //основной вариант кастинга.
        if(obj instanceof Child1 child1){ //новый вариант кастинга доступный в новых версиях java.
            child1.child1Method();
        }
        Child1 child1 = (Child1) obj; //downcasting
        Parent parent = child1; //upcasting - можно не укзывать класс приводимый класс в круглых скобках.
        Child2 child2 = (Child2) parent; //downcasting
        Object object = child1; //upcasting
    }
}

class Parent {}

class Child1 extends Parent {
    void child1Method(){
        System.out.println("Child1 method calling.");
    }
}
class Child2 extends Parent {}