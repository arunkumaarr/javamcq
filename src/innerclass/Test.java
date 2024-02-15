package innerclass;

   public abstract class Test {
        public String recipient;
        public abstract void sendMessage();
        public static void main(String[] args) {
            Test m = new Child();
            m.recipient = "1234567890";
            m.sendMessage();
        }
            static class Child extends Test {
                public  void sendMessage() {
                    System.out.println("text to " + recipient);
                }
            }

}
