package exceptionstest;

public class except {

    public void divide(int a,int b ){
        try{
            int c = a/b;
        }
        finally{
            System.out.println("finally-divide");
        }
    }

    public static void main(String[] args) {

        except e = new except();


        try{
            e.divide(10,0);
        }
        catch(RuntimeException re){
            System.out.println("Runtime Exception");
        }
        catch(Exception e1){
            System.out.println("exception");
        }
        finally{
            System.out.println("finally-main");
        }

}
}
