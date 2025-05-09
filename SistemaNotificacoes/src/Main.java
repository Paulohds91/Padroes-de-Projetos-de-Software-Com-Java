public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new NotificacaoBasica();

        // Adicionando canais dinamicamente
        notificacao = new EmailDecorator(notificacao);
        notificacao = new SMSDecorator(notificacao);
        notificacao = new PushDecorator(notificacao);

        // Enviando mensagem
        notificacao.enviarMensagem("Sua encomenda foi despachada!");
    }
}