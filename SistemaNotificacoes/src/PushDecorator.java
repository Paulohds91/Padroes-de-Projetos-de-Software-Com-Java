public class PushDecorator extends DecoratorNotificacao {
    public PushDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        super.enviarMensagem(mensagem);
        enviarPush(mensagem);
    }

    private void enviarPush(String mensagem) {
        System.out.println("[Push Notification] " + mensagem);
    }
}