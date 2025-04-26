import java.util.HashMap;
import java.util.Map;

// Interface comum
interface Passagem {
    double getValor();
    String getDestino();
}

// Cada destino é uma classe que implementa Passagem
class PassagemSP implements Passagem {
    public double getValor() { return 500.0; }
    public String getDestino() { return "São Paulo (SP)"; }
}

class PassagemRJ implements Passagem {
    public double getValor() { return 550.0; }
    public String getDestino() { return "Rio de Janeiro (RJ)"; }
}

class PassagemBA implements Passagem {
    public double getValor() { return 700.0; }
    public String getDestino() { return "Salvador (BA)"; }
}

class PassagemPE implements Passagem {
    public double getValor() { return 750.0; }
    public String getDestino() { return "Recife (PE)"; }
}

class PassagemRS implements Passagem {
    public double getValor() { return 600.0; }
    public String getDestino() { return "Porto Alegre (RS)"; }
}

class PassagemDF implements Passagem {
    public double getValor() { return 650.0; }
    public String getDestino() { return "Brasília (DF)"; }
}

class PassagemAM implements Passagem {
    public double getValor() { return 800.0; }
    public String getDestino() { return "Manaus (AM)"; }
}

class PassagemSC implements Passagem {
    public double getValor() { return 620.0; }
    public String getDestino() { return "Florianópolis (SC)"; }
}

// Factory Method
class PassagemFactory {
    public static Passagem criarPassagem(String destino) {
        switch (destino.toLowerCase()) {
            case "sp": return new PassagemSP();
            case "rj": return new PassagemRJ();
            case "ba": return new PassagemBA();
            case "pe": return new PassagemPE();
            case "rs": return new PassagemRS();
            case "df": return new PassagemDF();
            case "am": return new PassagemAM();
            case "sc": return new PassagemSC();
            default: throw new IllegalArgumentException("Destino inválido!");
        }
    }
}

// Singleton para registrar passagens
class RegistroPassagens {
    private static RegistroPassagens instancia;
    private Map<String, Double> registros = new HashMap<>();

    private RegistroPassagens() {}

    public static RegistroPassagens getInstancia() {
        if (instancia == null) {
            instancia = new RegistroPassagens();
        }
        return instancia;
    }

    public void registrar(Passagem passagem) {
        registros.put(passagem.getDestino(), passagem.getValor());
        System.out.println("Passagem para " + passagem.getDestino() + " registrada. Valor: R$ " + passagem.getValor());
    }

    public void listar() {
        System.out.println("\n--- Projeto desenvolvido por Paulo Henrique - Matrícula: 202302294308 ---");
        System.out.println("--- Passagens Registradas ---");
        for (Map.Entry<String, Double> entry : registros.entrySet()) {
            System.out.println("Destino: " + entry.getKey() + " | Valor: R$ " + entry.getValue());
        }
    }
}

// Classe Principal
public class Main {
    public static void main(String[] args) {
        RegistroPassagens registro = RegistroPassagens.getInstancia();

        Passagem p1 = PassagemFactory.criarPassagem("sp");
        Passagem p2 = PassagemFactory.criarPassagem("rj");
        Passagem p3 = PassagemFactory.criarPassagem("ba");
        Passagem p4 = PassagemFactory.criarPassagem("pe");
        Passagem p5 = PassagemFactory.criarPassagem("rs");
        Passagem p6 = PassagemFactory.criarPassagem("df");
        Passagem p7 = PassagemFactory.criarPassagem("am");
        Passagem p8 = PassagemFactory.criarPassagem("sc");

        registro.registrar(p1);
        registro.registrar(p2);
        registro.registrar(p3);
        registro.registrar(p4);
        registro.registrar(p5);
        registro.registrar(p6);
        registro.registrar(p7);
        registro.registrar(p8);

        registro.listar();
    }
}
