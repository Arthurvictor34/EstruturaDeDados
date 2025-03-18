public class App {

    public static int fatorial(int valor){
        if(valor > 0){
            return valor * fatorial(valor- 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println(fatorial(6));
    }
}
