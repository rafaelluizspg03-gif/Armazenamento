package ARMAZENAMENTO;

public class DocumentoService{
    private  Armazenamento armazenamento;

    public DocumentoService(Armazenamento armazenamento){
        this.armazenamento = armazenamento;
    }

    public void enviarDocumento(String nome, byte[] Arquivo){
        System.out.println("validade documento...");
        if(Arquivo.length == 0){
            System.out.println("arquivo inválido.");
            return;
        }

        String caminho = armazenamento.salvar(nome, Arquivo);
        System.out.println("documentos");
        System.out.println(caminho);
    }
}
