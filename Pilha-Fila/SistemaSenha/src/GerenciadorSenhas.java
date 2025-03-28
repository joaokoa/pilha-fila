import java.util.ArrayDeque;
import java.util.Deque;

public class GerenciadorSenhas {
    private Deque<Integer> filaDeAtendimento;
    private Deque<Integer> historicoChamadas;
    private int contadorSenha;

    public GerenciadorSenhas() {
        filaDeAtendimento = new ArrayDeque<>();
        historicoChamadas = new ArrayDeque<>();
        contadorSenha = 100; // Começa com 100 para parecer um sistema diferente
    }

    public void emitirNovaSenha() {
        filaDeAtendimento.offer(contadorSenha);
        System.out.println("Nova senha emitida: " + contadorSenha);
        contadorSenha++;
    }

    public void atenderProximo() {
        if (filaDeAtendimento.isEmpty()) {
            System.out.println("Nenhum paciente aguardando atendimento.");
            return;
        }
        int senhaAtual = filaDeAtendimento.poll();
        historicoChamadas.offer(senhaAtual);
        System.out.println("Senha chamada: " + senhaAtual);
    }

    public void mostrarHistorico() {
        System.out.println("Senhas já atendidas: " + historicoChamadas);
    }
}
