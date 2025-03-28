public class Main {
    public static void main(String[] args) {
        GerenciadorNavegacao navegador = new GerenciadorNavegacao();

        navegador.abrirPagina("google.com");
        navegador.abrirPagina("inkarnate.com");
        navegador.abrirPagina("outlook.live.com");

        navegador.voltar();
        navegador.voltar();
        navegador.avancar();
    }
}