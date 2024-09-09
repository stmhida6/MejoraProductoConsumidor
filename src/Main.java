//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Buffer buffer = new Buffer(10);
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);
        Thread hiloProductor = new Thread(productor);
        Thread hiloConsumidor = new Thread(consumidor);
        hiloProductor.start();
        hiloConsumidor.start();
    }
}