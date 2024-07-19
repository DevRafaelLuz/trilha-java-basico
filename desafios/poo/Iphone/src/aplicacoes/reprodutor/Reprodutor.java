package aplicacoes.reprodutor;

public class Reprodutor implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MÚSICA SELECIONADA: " + musica);
    }    
}
