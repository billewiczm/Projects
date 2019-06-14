package SaveMoney;

import java.util.Scanner;

public class SaveMoney {

    public static void RunSavings() {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to SaveMoney tool. We would like you to answer a few questions for us first.");
            System.out.println("[Press C to continue, X to exit]");

            String choice = input.nextLine().toUpperCase();

            if (choice.equals("C")) {

                System.out.println("For how long do you plan to save money for? [number of months]");
                int months = input.nextInt();
                input.nextLine();

                System.out.println("Choose your currency:");
                System.out.println("[Press 1 for USD, 2 = EUR, 3 = CHF, 4 = PLN]");
                int currency = input.nextInt();
                input.nextLine();

                System.out.println("What's your monthly income sum? [net]");
                double income = input.nextDouble();
                input.nextLine();

                System.out.println("How much money do you spend on shopping (food and objects of everyday use)? [monthly]");
                double food = input.nextDouble();
                input.nextLine();

                System.out.println("How much money do you spend on your education? [monthly]");
                double education = input.nextDouble();
                input.nextLine();

                System.out.println("How much money combined do you spend on your house/apartment? [rental installment/bills etc.]");
                double house = input.nextDouble();
                input.nextLine();

                System.out.println("How much money do you pay for your credit? [monthly]");
                double credit = input.nextDouble();
                input.nextLine();

                System.out.println("How much money do you spend on yourself? [entertainment, clothes, cinema, evenings out etc.]");
                double entertainment = input.nextDouble();
                input.nextLine();

                double monthlySave = income - (food + education + house + credit + entertainment);
                double overall = months * monthlySave;
                double percentage = (overall * 100) / (months * income);

                if (currency == 1) {
                    System.out.println("Money saved a month: " + monthlySave + " USD");
                    System.out.println("Money saved from " + months + " months: " + overall + " USD");
                    System.out.println("You save " + (int) percentage + "% of money earned.");
                }
                else if (currency == 2) {
                    System.out.println("Money saved a month: " + monthlySave + " EUR");
                    System.out.println("Money saved from " + months + " months: " + overall + " EUR");
                    System.out.println("You save " + (int) percentage + "% of money earned.");
                }
                else if (currency == 3) {
                    System.out.println("Money saved a month: " + monthlySave + " CHF");
                    System.out.println("Money saved from " + months + " months: " + overall + " CHF");
                    System.out.println("You save " + (int) percentage + "% of money earned.");
                }
                else if (currency == 4) {
                    System.out.println("Money saved a month: " + monthlySave + " PLN");
                    System.out.println("Money saved from " + months + " months: " + overall + " PLN");
                    System.out.println("You save " + (int) percentage + "% of money earned.");
                }

                System.out.println("Start again? [Y/N]");
                String startAgain = input.nextLine().toUpperCase();

                if (startAgain.equals("Y")) {
                    continue;
                    }
                else if (startAgain.equals("N")) {
                    System.out.println("Thank you for your time! :)");
                    break;
                    }
            }
            else if (choice.equals("X")) {
                System.out.println("Process terminated.");
                break;
                }
            else System.out.println("Invalid data. Please try again.");
                continue;
        }
    }
}
