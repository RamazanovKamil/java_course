package tatar.companiese.kamil.testing;
import java.util.HashMap;
import java.util.Map;
public class MapIterationExample {
    public static void main(String[] args) {
        Map<Long, String> fructById = getHashMapWithValues();
        for(Map.Entry<Long, String> fruct : fructById.entrySet()){
            System.out.println("Id + fruct = " + fruct.getKey() + ", " + fruct.getValue());
        }
    }
    static Map<Long, String> getHashMapWithValues(){
        Map<Long, String> fructById = new HashMap<>();
        fructById.put(1L,"Arbuz");
        fructById.put(2L,"Dynya");
        fructById.put(3L,"Pomelo");
        fructById.put(4L,"Sliva");
        fructById.put(5L,"Abrikos");
        return fructById;
    }
}
