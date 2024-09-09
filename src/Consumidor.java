public class Consumidor implements  Runnable{
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

 @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                buffer.consumir();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
