public class SMSDecorator extends DecoratorNotificacao {
    public SMSDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        super.enviarMensagem(mensagem);
        enviarSMS(mensagem);
    }

    private void enviarSMS(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}