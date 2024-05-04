package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.CEstruturasCondicionaisJava.Aula5SwitchCase;

public class SwitchCase {
    // Modo condicional convencional
//   public class PlanoOperadora {
//        public static void main(String[] args) {
//        String plano = "M"; //M / T
//
//            if(plano == "B") {
//                System.out.println("100 minutos de ligação");
//            }else if(plano == "M") {
//                System.out.println("100 minutos de ligação");
//                System.out.println("WhatsApp e Instagram grátis");
//            }else if(plano == "T") {
//                System.out.println("100 minutos de ligação");
//                System.out.println("WhatsApp e Instagram grátis");
//                System.out.println("5Gb Youtube");
//            }
    // Modo condicional switch/case
    public class PlanoOperadora {
        public static void main(String[] args) {
            String plano = "M"; // M / T

            switch (plano) {
                case "T": {
                    System.out.println("5Gb Youtube");
                    break;
                }
                case "M": {
                    System.out.println("WhatsApp e Instagram grátis");
                }
                case "B": {
                    System.out.println("100 minutos de ligação");
                }
            }
        }
    }


}



