import java.util.Deque;
import java.util.LinkedList;

public class GerenciadorNavegacao {
    private Deque<String> historicoAtras;
    private Deque<String> historicoFrente;
    private String paginaAtual;

    public GerenciadorNavegacao() {
        historicoAtras = new LinkedList<>();
        historicoFrente = new LinkedList<>();
        paginaAtual = null;
    }

    public void abrirPagina(String endereco) {
        if (paginaAtual != null) {
            historicoAtras.push(paginaAtual);
        }
        paginaAtual = endereco;
        historicoFrente.clear();
        mostrarPagina();
    }

    public void voltar() {
        if (historicoAtras.isEmpty()) {
            System.out.println("Não há páginas anteriores.");
            return;
        }
        historicoFrente.push(paginaAtual);
        paginaAtual = historicoAtras.pop();
        mostrarPagina();
    }

    public void avancar() {
        if (historicoFrente.isEmpty()) {
            System.out.println("Não há páginas seguintes.");
            return;
        }
        historicoAtras.push(paginaAtual);
        paginaAtual = historicoFrente.pop();
        mostrarPagina();
    }

    private void mostrarPagina() {
        System.out.println("Página atual: " + (paginaAtual != null ? paginaAtual : "Nenhuma"));
        System.out.println("Histórico de voltar: " + historicoAtras);
        System.out.println("Histórico de avançar: " + historicoFrente);
    }
}
