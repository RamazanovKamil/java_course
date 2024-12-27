package tatar.companiese.kamil.testing;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        String id1 = "az001";
        String name1 = "Markus";
        String id2 = "az002";
        String name2 = "Lora";

        HashMap<String, String> nameById = new HashMap<>();
        nameById.put(id1, name1);
        nameById.put(id2, name2);

        System.out.println(nameById.get("az001")); //Вернет Lora.
        System.out.println(nameById.get("az005")); //Вернет null, т.к. его в коллекции нет.
    }
}
