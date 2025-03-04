import java.util.ArrayList;

public class FilaArrayList {
    private ArrayList<Integer> fila;

    public FilaArrayList(){
        this.fila = new ArrayList<>();
    }

    public void enqueue(int valor){
        fila.add(valor);
    }

    public int dequeue(){
        if(empty()){
            System.out.println("A Fila está vazia");
        }
        return fila.remove(0);
    }

    public boolean empty(){
        return fila.isEmpty();
    }

    public int size(){
        return fila.size();
    }

    public int front(){
        if(empty()){
            System.out.println("A Fila está cheia!");
            return -1;
        }

        return fila.get(0);
    }

    public static void main(String[] args) {
        FilaArrayList fila = new FilaArrayList();

        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);

        System.out.println("Primeiro item da fila: " + fila.front());
    }
}
