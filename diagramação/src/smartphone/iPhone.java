package smartphone;


public class iPhone implements funcoes.AparelhoTelefonico, funcoes.ReprodutorMusical, funcoes.NavegadorInternet {


    @Override
    public void ligar(String numero) {
       System.out.println(numero);
    }

    @Override
    public void atender(String numero) {
    	System.out.println(numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
    	System.out.printf(mensagem, destinatario);
    }

    @Override
    public void exibirPagina(String url) {
    	System.out.println(url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println(url);
    }

    @Override
    public void atualizarPagina() {
    	System.out.println("página atualizada");
    }

    @Override
    public void tocar() {
    	System.out.println("tocar");
    }

    @Override
    public void pausar() {
    	System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica() {
    	System.out.println("musica selecionada");
    }
}