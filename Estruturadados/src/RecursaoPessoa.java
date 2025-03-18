public class RecursaoPessoa {
    private String nome;
    private RecursaoPessoa filho;
    
    public RecursaoPessoa(String nome, RecursaoPessoa filho){
        this.nome = nome;
        this.filho = filho;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setFilho(RecursaoPessoa filho) {
        this.filho = filho;
    }

    public RecursaoPessoa getFilho() {
        return filho;
    }

    @Override
    public String toString() {
        return "Filho=" + getNome() + "";
    }

    public static void main(String[] args) {
        RecursaoPessoa p1 = new RecursaoPessoa("João", null);
        RecursaoPessoa p2 = new RecursaoPessoa("Juan", p1);
        RecursaoPessoa p3 = new RecursaoPessoa("AAS", p2);
        RecursaoPessoa p4 = new RecursaoPessoa("Luana", p3);
        RecursaoPessoa p5 = new RecursaoPessoa("aaua", p4);

        System.out.println(p5.filho.filho.filho.filho.filho);
    }
}
