package ARMAZENAMENTO;

public class ArmazenamentoLocal implements Armazenamento {
    @Override 
    public String salvar(String nomeArquivo, byte[] conteudo){
        System.out.println("Salvando no disco do servidor..;");
        String caminho = "/arquivo/" + nomeArquivo;
        
        System.out.println("Arquivo salvo em: " + caminho);
        return caminho;
    }
    @Override 
    public void remover(String caminho){
        System.out.println("remover arquivo local: " + caminho);
    }
}
