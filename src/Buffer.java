import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> cola;
   // int[] buffer;
  //  private int contador = 0;
    private int tamanio;

    public Buffer(int tamanio) {
        this.tamanio = tamanio;
       // buffer = new int[tamanio];
        cola = new LinkedList<>();
    }

    public synchronized void producir(int item) throws InterruptedException {
        // while (contador == tamanio) {
        while (cola.size() == tamanio) {
            wait();
        }
        cola.add(item);  // Añadir el elemento a la cola
        //  buffer[contador] = item;
        // contador++;
        System.out.println("Produciendo " + item);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {

        // while (contador == 0) {
        while (cola.isEmpty()) {
            wait();
        }

        int item = cola.poll();  // Obtener y remover el elemento del frente de la cola

        //  contador--;
        //  int item = buffer[contador];
        System.out.println("Consumiendo " + item);
        notifyAll();
        return item;
    }

}
