package ARMAZENAMENTO;

public class ArmazenamentoCloud implements Armazenamento {
    @Override 
    public String salvar(String nomeArquivo, byte[] conteudo){
        System.out.println("autenticado no serviço de cloud...");
        System.out.println("enviando arquivo...");
        String url = "https://storage.emprese.com/" + nomeArquivo;
        System.out.println("upload concluido.");
        return url;
    }

    @Override
    public void remover(String caminho){
        System.out.println("solicittando remoção na cloud...");
        System.out.println("arquivo removido: " + caminho);
    }
    
}
