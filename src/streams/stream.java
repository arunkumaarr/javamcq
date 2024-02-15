package streams;

import java.util.Arrays;

public class stream {
    public static void main(String[] args) {
        int sum= Arrays.stream(new int[]{1,2,3,4,5}).filter(x->x%2==0).map(x->x*2).sum();
        System.out.println(sum);
    }
}
