public class Main {
    public static void main(String[] args) {
        GerenciadorSenhas gestor = new GerenciadorSenhas();

        gestor.emitirNovaSenha();
        gestor.emitirNovaSenha();
        gestor.emitirNovaSenha();

        gestor.atenderProximo();
        gestor.atenderProximo();

        gestor.mostrarHistorico();
    }
}
