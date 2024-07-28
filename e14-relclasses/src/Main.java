public class Main {

    public static void main(String[] args) {

        Ponto p1 = new Ponto(5, 8, Cor.VERMELHO);
        Ponto p2 = new Ponto(2, 4, Cor.VERDE);

        SegmentoDeReta segmento = new SegmentoDeReta(p1, p2);

        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
        System.out.println(segmento.imprimir());

    }
}