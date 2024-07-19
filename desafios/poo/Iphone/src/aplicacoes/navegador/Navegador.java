package aplicacoes.navegador;

public class Navegador implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PÁGINA ATUALIZADA");
    }    
}
