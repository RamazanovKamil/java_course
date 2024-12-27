package tatar.companiese.kamil.testing;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> vegetables = new HashSet<>();
        vegetables.addAll(List.of("cucumber","tomato","onion","pumpkin"));
        vegetables.add("zucchini");
        System.out.println(vegetables);
    }
}
