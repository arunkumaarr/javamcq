package morgan;

public class perfectsubstring {

    public int perfectsubstring(String s,int k) {
        int count = 0;        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPerfect(s.substring(i, j), k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
