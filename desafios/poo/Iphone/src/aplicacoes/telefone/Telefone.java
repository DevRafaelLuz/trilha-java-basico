package aplicacoes.telefone;

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar(String musica) {
        System.out.println("FAZENDO LIGAÇÃO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }    
}
