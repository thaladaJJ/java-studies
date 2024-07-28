public class Ponto {
    private int x;
    private int y;
    private Cor cor;

    public Ponto(int x, int y, Cor cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Cor getCor() {
        return cor;
    }

    public String imprimir () {

        String corAnsi = switch (cor) {
            case VERMELHO -> "\u001B[31m"; // ANSI para cor vermelha
            case VERDE -> "\u001B[32m"; //  ANSI para cor verde
            case AZUL -> "\u001B[34m"; //  ANSI para cor azul
        };

        return (corAnsi + "Ponto: (" + x + ", " + y + ")\u001B[0m");

    }
}
