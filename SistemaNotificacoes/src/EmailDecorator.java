public class EmailDecorator extends DecoratorNotificacao {
    public EmailDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        super.enviarMensagem(mensagem);
        enviarEmail(mensagem);
    }

    private void enviarEmail(String mensagem) {
        System.out.println("[Email] " + mensagem);
    }
}