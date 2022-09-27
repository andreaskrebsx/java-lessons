import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("3. на складе хранится товар одного размера.\n" +
                "В консоли вводится размер склада в кв метрах,\n" +
                "после чего вводится ширина и длина товара.\n" +
                "Необходимо посчитать сколько  товара поместится на складе.");

        System.out.println();
        System.out.print("введите размер склада в кв метрах:   ");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
        System.out.print("введите длинну товара в метрах:   ");
                int товарДлинна = scanner.nextInt();
        System.out.print("введите ширину товара в метрах:   ");
                int товарШирина = scanner.nextInt();

                int размерТовара = товарДлинна * товарШирина;

                int количествоТовара = x / размерТовара;

        System.out.print("на складе поместится :   " +(количествоТовара));
        System.out.print(" штук товара");




    }
}