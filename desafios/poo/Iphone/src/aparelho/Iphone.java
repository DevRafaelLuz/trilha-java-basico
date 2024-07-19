package aparelho;

import aplicacoes.multifuncional.AparelhoMultifuncional;
import aplicacoes.navegador.NavegadorInternet;
import aplicacoes.reprodutor.ReprodutorMusical;
import aplicacoes.telefone.AparelhoTelefonico;

public class Iphone {

    public static void main(String[] args) {
        AparelhoMultifuncional am = new AparelhoMultifuncional();
        
        ReprodutorMusical reprodutor = am;
        AparelhoTelefonico telefone = am;
        NavegadorInternet navegador = am;
        
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("GOSPEL");
        
        telefone.ligar("");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        navegador.exibirPagina("www.dio.me");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
    
}
