import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Room[] quartos = new Room [10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos quartos a alugar?");
        int numRooms = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numRooms; i++) {
            quartos [i] = new Room ();

            System.out.println("Rent #" + (i + 1));
            System.out.print("Nome: ");
            quartos[i].setLocatorName(sc.nextLine());

            System.out.print("Email: ");
            quartos[i].setLocatorEmail(sc.nextLine());

            System.out.print("Quarto: ");
            quartos[i].setRoomNumber(sc.nextInt());

            sc.nextLine();
        }

        /* o exercício é mais simples se apenas armazenarmos os dados escaneados em variáveis e as definir na chamada
         de um construtor pra cada objeto, mas achei mais interessante fazer por ordenação */

        sortRoomByNumber (quartos);

        System.out.println("Quartos ocupados:");

        for (int i = 0; i < numRooms; i++) {
            if (quartos [i] != null)
                System.out.println(quartos[i].toString());
        }

        sc.close();
    }

    public static void sortRoomByNumber (Room [] quartos) {

        for (int i = 0; i < quartos.length - 1; i++) {

            int minorRoomNumberIndex = i;
            int minorRoomNumber;

            if (quartos [i] != null)
                minorRoomNumber = quartos [i].getRoomNumber();
            else
                continue;

            for (int j = i + 1; j < quartos.length && quartos [j] != null; j++) {

                if (quartos[j].getRoomNumber() <= minorRoomNumber) {
                    minorRoomNumber = quartos[j].getRoomNumber();
                    minorRoomNumberIndex = j;
                }
            }

            if (minorRoomNumberIndex != i)
                swapRoomOrder(quartos, i, minorRoomNumberIndex);

        }
    }
    public static void swapRoomOrder(Room [] quartos, int i, int j) {
        Room aux = quartos [i];
        quartos [i] = quartos [j];
        quartos [j] = aux;
    }
    @SuppressWarnings("unused")
    public static int findMinorRoomNumberIndex (Room[] quartos) {

        int minorRoomNumber = 9;
        int minorRoomNumberIndex = 0;

        for (int i = 0; i < quartos.length; i++) {

            if (quartos[i] != null && quartos[i].getRoomNumber() <= minorRoomNumber) {
                minorRoomNumber = quartos[i].getRoomNumber();
                minorRoomNumberIndex = i;
            }
        }

        return minorRoomNumberIndex;
    }

}