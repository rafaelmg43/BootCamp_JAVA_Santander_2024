package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.FDebuggingJava;

public class Main {
    private static Thread thread;

    public static void main(String[] args) {
        System.out.println(" Iniciou o Programa no Método main. ");
        a();
        System.out.println(" finalizou do Programa no Método main. ");

    }

    static void a() {
        System.out.println("Entrou no Metodo a. ");
        b();
        System.out.println("Finalizou no Metodo a. ");
    }

    static void b() {
        System.out.println("Entrou no Metodo b. ");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou no Metodo b. ");

    }

    static void c() {
        System.out.println("Entrou no Metodo c. ");
        //thread.dumpStack();
        System.out.println("Finalizou no Metodo c. ");
    }
}
