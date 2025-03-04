public class PilhasVetor {
    private int[] vetorPilha;
    private int topo;

    public PilhasVetor(int quantidade){
        this.vetorPilha = new int[quantidade];
        this.topo = -1;
    }

    public void push(int valor){
        if(topo < vetorPilha.length - 1){
            topo++;
            vetorPilha[topo] = valor;
        } else {
            System.out.println("A pilha está cheia");
        }
    }

    public boolean empty(){
       return (this.topo == -1);
    }

    public void exibirPilha(){
        for(int pilhas:vetorPilha){
            System.out.print(pilhas + ", ");
        }
    }

    public int pop(){
        if(empty()){
            System.out.println("A Pilha está vazia");
        }

        int valorRemovido = vetorPilha[topo];
        topo--;

        return valorRemovido;
    }

    public int tamanhoPilha(){
        return topo + 1;
    }

    public int stackpop(){
        if(empty()){
            System.out.println("A pilha está vazia");
            return -1;
        }

        return vetorPilha[topo];
    }

    
    public static void main(String[] args) throws Exception {
        PilhasVetor A = new PilhasVetor(5);
        A.push(1);
        A.push(2);
        A.push(3);
        A.push(4);
        A.push(5);

        System.out.println("Primeiro item da Pilha: " + A.stackpop());

    }
}
