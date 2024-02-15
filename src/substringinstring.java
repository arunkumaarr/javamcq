public class substringinstring {


    public static int occurances_of_substring(String s, String t) {
        int i =s.length();
        int j =t.length();
        int count =0;
        int occurance=0;

        for(;count<=i-j;count++){

            if(count==0) {
                if (s.substring(count, j - 1).equals(t)) {
                    occurance++;
                }
            }
            else{
                    if(s.substring(count,(count+t.length())).equals(t)){                occurance++;

        }

        }
        }
        return occurance;
    }

    public static void main(String[] args) {
        System.out.println(occurances_of_substring("Banana","nn"));
    }

}