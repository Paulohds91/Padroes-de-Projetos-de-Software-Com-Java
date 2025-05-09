# Sistema de Notificações - Padrão Decorator

Este projeto é uma implementação do padrão estrutural **Decorator** em Java, desenvolvido como parte do estudo dirigido sobre Padrões GoF Estruturais.

---

## 📚 Descrição do Projeto

O sistema simula um mecanismo flexível de envio de notificações que pode ser estendido dinamicamente para incluir diferentes canais de entrega, como **Email**, **SMS** e **Push Notification**, sem a necessidade de modificar as classes base.

---

## 📂 Estrutura do Projeto

```
SistemaNotificacoes/
│
├── src/
│   ├── Notificacao.java
│   ├── NotificacaoBasica.java
│   ├── DecoratorNotificacao.java
│   ├── EmailDecorator.java
│   ├── SMSDecorator.java
│   ├── PushDecorator.java
│   └── Main.java
│
└── README.md
```

---

## 🚀 Como Executar

1. Navegue até a pasta `src`:
    ```bash
    cd src
    ```

2. Compile todos os arquivos Java:
    ```bash
    javac *.java
    ```

3. Execute o programa:
    ```bash
    java Main
    ```

---

## ✅ Resultado Esperado

```
Notificação básica: Sua encomenda foi despachada!
[Email] Sua encomenda foi despachada!
[SMS] Sua encomenda foi despachada!
[Push Notification] Sua encomenda foi despachada!
```

---

## 👨‍💻 Desenvolvido por

**Paulo Henrique**  
**Matrícula:** 202302294308  
**Disciplina:** Padrões de Projetos de Software com Java - Estácio

---