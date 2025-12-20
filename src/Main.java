//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание номер 1
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание номер 2
        for (byte j = 10; j >= 1; j--) {
            System.out.println(j);
        }
        // Задание номер 3
        for (byte f = 0; f <= 17; f += 2) {
            System.out.println(f);
        }
        // Задание номер 4
        for (byte h = 10; h <= -10; h--) {
            System.out.println(h);
        }
        // Задание номер 5
        for (short year = 1904; year < 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        // Задание номер 6
        byte number = 7;
        for (byte u = 1; u <= 14; u++) {
            byte result = (byte) (number * u);
            System.out.println(result);
        }
        // Задание номер 7
        short numberSymbol = 1;
        for (byte i = 0; i < 10; i++) {
            System.out.println(numberSymbol);
            numberSymbol *= 2;
        }
        // Задание номер 8
        int savings = 0;
        int income = 29000;
        for (byte d = 0; d <= 12; d++) {
            savings = d * income;
            System.out.println(" Месяц " + d + ", сумма накопленная равна " + savings + " рублей");
        }
        // Задание номер 9
        int savingsBank = 0;
        int incomeBank = 29000;
        for (byte numberMonths = 1; numberMonths <= 12; numberMonths++) {
            savingsBank = savingsBank + savingsBank * 12 / 100;
            savingsBank = savingsBank + incomeBank;
            System.out.println(" Месяц " + numberMonths + " сумма накоплений равна " + savingsBank + " рублей");
        }
        // Задание номер 10
        byte numberInTable = 2;
        for (byte w = 1; w <= 10; w++) {
            byte resultInTable = (byte) (numberInTable * w);
            System.out.println(numberInTable + "*" + w + "=" + resultInTable);
        }
    }
}