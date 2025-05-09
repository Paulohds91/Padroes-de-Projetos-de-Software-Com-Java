public abstract class DecoratorNotificacao implements Notificacao {
    protected Notificacao notificacao;

    public DecoratorNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        notificacao.enviarMensagem(mensagem);
    }
}