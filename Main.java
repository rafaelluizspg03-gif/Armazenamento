package ARMAZENAMENTO;

public class Main {
    public static void main(String[] args) {
        byte[] conteudoExemplo = "Conteudo do arquivo".getBytes();

        System.out.println("--- Testando Armazenamento Local ---");
        Armazenamento armazenamentoLocal = new ArmazenamentoLocal();
        DocumentoService serviceLocal = new DocumentoService(armazenamentoLocal);
        serviceLocal.enviarDocumento("relatorio.pdf", conteudoExemplo);

        System.out.println("\n--- Testando Armazenamento Cloud ---");
        Armazenamento armazenamentoCloud = new ArmazenamentoCloud();
        DocumentoService serviceCloud = new DocumentoService(armazenamentoCloud);
        serviceCloud.enviarDocumento("foto.png", conteudoExemplo);
    }
}
