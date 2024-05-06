public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        Analisador(2500.0);
        Analisador(1500.0);
        Analisador(2000.0);
    }

    static void Analisador(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("\nLIGAR PARA CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("\nLIGAR E FAZER CONTRA PROPOSTA.");
        } else {
            System.out.println("\nAGUARDAR OUTROS CANDIDATOS.");
        }
    }
}
