package aplicacoes.multifuncional;

import aplicacoes.navegador.NavegadorInternet;
import aplicacoes.reprodutor.ReprodutorMusical;
import aplicacoes.telefone.AparelhoTelefonico;

public class AparelhoMultifuncional implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implements da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("TOCANDO VIA APARELHO MULTIFUNCIONAL");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO VIA APARELHO MULTIFUNCIONAL");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA " + musica + " VIA APARELHO MULTIFUNCIONAL");
    }
    
    // Implements da interface AparelhoTelefonico
    @Override
    public void ligar(String musica) {
        System.out.println("LIGANDO VIA APARELHO MULTIFUNCIONAL");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO VIA APARELHO MULTIFUNCIONAL");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA APARELHO MULTIFUNCIONAL");
    }
    
    // Implements da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA " + url + " VIA APARELHO MULTIFUNCIONAL");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA VIA APARELHO MULTIFUNCIONAL");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA VIA APARELHO MULTIFUNCIONAL");
    }
    
    
    
}
