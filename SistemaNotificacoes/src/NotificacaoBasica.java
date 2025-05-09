public class NotificacaoBasica implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Notificação básica: " + mensagem);
    }
}