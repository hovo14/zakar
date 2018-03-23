public class Test {
    public static void main(String[] args) {
        /*Triangle t1 = new Triangle();
        t1.createPoint1(11, 12);
        t1.createPoint2(14, 18);
        t1.createPoint3(22, 24);*/

        IPC_I pp = new IPC_I() {
            @Override
            public void print() {
                System.out.println("barev");
            }
        };

        send(new Message_I() {
            @Override
            public void greet() {
                System.out.println("baaaaaaaaaaaaaa");
            }
        });

    }

    public static void send(Message_I a){
        a.greet();
    }
}
