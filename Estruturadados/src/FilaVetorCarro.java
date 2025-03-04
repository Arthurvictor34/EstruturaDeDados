public class FilaVetorCarro {
    private Carros[] carros;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaVetorCarro(int capacidade){
        this.carros = new Carros[capacidade];
        this.capacidade = capacidade;
        this.inicio = 0;
        this.tamanho = 0;
        this.fim = -1;
    }

    public void enqueue(Carros carro){
        if(tamanho == capacidade){
            System.out.println("Fila está cheia!");
        }

        fim = (fim + 1) % capacidade;
        carros[fim] = carro;
        tamanho++;
    }

    public Carros dequeue(){
        if(empty()){
            System.out.println("A pilha está vazia!");
            return null;
        }

        Carros valorRemovido = carros[inicio];
		
		inicio = (inicio + 1) % capacidade;
		tamanho--;
		return valorRemovido;
    }

    public boolean empty(){
        return tamanho == 0;
    }

    public int size(){
        return tamanho;
    }

    public Carros front(){
        if(empty()){
            System.out.println("A fila está vazia!");
            return null;
        }

        return carros[inicio];
    }


    public static void main(String[] args) {
        Carros carros = new Carros("Onix");
        Carros carros1 = new Carros("FIAT");
        Carros carros2 = new Carros("Fusca");

        FilaVetorCarro fila = new FilaVetorCarro(3);

        fila.enqueue(carros);
        fila.enqueue(carros1);
        fila.enqueue(carros2);

        System.out.println(fila.front().getMarca());

        fila.dequeue();

        System.out.println(fila.front().getMarca());

    }
}
