public class SegmentoDeReta {
    Ponto pontoInicial;
    Ponto pontoFinal;

    public SegmentoDeReta(Ponto pontoInicial, Ponto pontoFinal) {
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
    }

    public Ponto getPontoInicial() {
        return pontoInicial;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }

    public String imprimir () {

        String corAnsi = switch (pontoInicial.getCor()) {
            case VERMELHO -> "\u001B[31m"; // ANSI para cor vermelha
            case VERDE -> "\u001B[32m"; //  ANSI para cor verde
            case AZUL -> "\u001B[34m"; //  ANSI para cor azul
        };

        return (corAnsi + "Segmento de reta: (" + pontoInicial.imprimir() + ", " + pontoFinal.imprimir() + ")\u001B[0m");
    }
}
