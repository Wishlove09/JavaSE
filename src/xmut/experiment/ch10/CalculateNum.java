
import java.util.HashMap;
import java.util.Map;

/**
 * @author ˷��
 * @date 2023-11-24 20:41
 */
public class CalculateNum {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : args) {
            Integer num = Integer.valueOf(s);
            if (num < 0 || num > 49) {
                System.out.println("ֻ����0-49��Χ������");
                return;
            }
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String key : map.keySet()) {
            System.out.printf("%s������%s��%n", key, map.get(key));
        }
    }
}
