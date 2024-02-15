package fundumental;

public class main {

    public static void main(String[] args) {

        displaya arr1 = new displaya();
        displayb arr2 = new displayb();

        arr1.x=0;
        arr2.x=0;


        arr1.cal(5);
        arr2.cal(5);

        System.out.println(arr1.x);
        System.out.println(arr2.x);
}

}
