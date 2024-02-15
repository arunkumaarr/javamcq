package fundumentals4;

import java.util.HashMap;
import java.util.Map;

public class test {

        public static void main(String[] args) {

            int x = 10/0;
            Map<Color, String> map = new HashMap<>();
            map.put(new Color("Red"), "Red");
            map.put(new Color("Blue"), "Blue");
            map.put(new Color("Green"), "Green");
            System.out.println(map.size());
            System.out.println(map.get(new Color("Red")));
        }
}
