public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.portaAberta = false;
        this.andarAtual = 0;
    }

    // Subir
    public void subir() {
        if (!portaAberta && andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo para o andar " + andarAtual);
        } else {
            System.out.println("Não é possível subir");
        }
    }

    // Descer
    public void descer() {
        if (!portaAberta && andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo para o andar " + andarAtual);
        } else {
            System.out.println("Não é possível descer");
        }
    }

    // Abrir porta
    public void abrirPorta() {
        if (!portaAberta) {
            portaAberta = true;
            System.out.println("A porta está abrindo");
        } else {
            System.out.println("A porta já está aberta!");
        }
    }

    // Fechar porta
    public void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println("A porta está fechando!");
        } else {
            System.out.println("A porta já está fechada!");
        }
    }

    // Estado da porta
    public void estadoPorta() {
        if (portaAberta) {
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada!");
        }
    }

    // Andar atual
    public void qualAndarAtual() {
        System.out.println("Você está no andar " + andarAtual);
    }
}