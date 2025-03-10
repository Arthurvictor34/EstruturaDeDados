public class FilaVetor {
    private int[] fila;
    private int capacidade;
    private int tamanho;
    private int fim;
    private int inicio;

    public FilaVetor(int quantidade){
        this.capacidade = capacidade;
        this.fila = new int[quantidade];
        this.fim = -1; 
        this.inicio = 0;
        this.tamanho = 0;
    }

    public void enqueue(int valor){
        if(tamanho == capacidade){
            System.out.println("Fila está cheia");
        }

        fim = (fim + 1) % capacidade;
        fila[fim] = valor;
        tamanho++;
    }

    public int dequeue(){
        if(empty()){
            System.out.println("Fila está vazia");
            return -1;
        }  
        
        int valorremovido = fila[inicio];
        tamanho--;
        return valorremovido;
    }

    public boolean empty(){
        return tamanho == 0;
    }

    public int size(){
        return tamanho;
    }

    public int front(){
        if(empty()){
            System.out.println("Fila está vazia");
            return -1;
        }

        return fila[inicio];
    }


    public static void main(String[] args) {
        FilaVetor fila = new FilaVetor(3);
        fila.enqueue(2);
        fila.enqueue(21);
        fila.enqueue(321);
        System.out.println(fila.front());
    }
}
