package fundumental3;

public class enumtest {

        enum Animals {
            LION, DOG, COW;
        }
            public static void main(String[] args) {
                Animals[] animals = Animals.values();
                System.out.println(animals[1]);
            }
}
