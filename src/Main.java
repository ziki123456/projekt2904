public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MojeVlakno mojeVlakno = new MojeVlakno();
        Thread thread = new Thread(mojeVlakno);
        thread.start();

        System.out.println("konec");
    }
}