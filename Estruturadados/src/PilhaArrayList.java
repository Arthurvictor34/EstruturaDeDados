import java.util.ArrayList;

public class PilhaArrayList {
    private ArrayList<Integer> pilhaList;

    public PilhaArrayList(){
        this.pilhaList = new ArrayList<>();
    }

    public void push(int valor){
        pilhaList.add(valor);
    }

    public int pop(){
        if(empty()){
            System.out.println("A pilha está vazia!");
            return -1;
        }
        return pilhaList.remove(0);
    }

    public boolean empty(){
        return pilhaList.isEmpty();
    }

    public int stackpop(){
        if(empty()){
            System.out.println("Pilha está vazia!");
            return -1;
        }

        return pilhaList.get(0);
    }

    public int size(){
        return pilhaList.size();
    }

    public static void main(String[] args) {
        PilhaArrayList Pilha = new PilhaArrayList();

        Pilha.push(0);
        Pilha.push(1);
        Pilha.push(2);

        System.out.println(Pilha.stackpop());
        Pilha.pop();
        System.out.println(Pilha.stackpop());
    }
}   
