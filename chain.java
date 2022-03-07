import java.util.Scanner;

class expenseAproval {

    public static void main(String[] args) {

        Scanner expense = new Scanner(System.in);
        System.out.println("Please enter your expense amount: ");
        int userInput = expense.nextInt();

        int projectManager = 500;
        int programManager = 2000;
        int subdivisionManager = 5000;
        int divisionDirector = 20000;
        int ceo = 100000;

        if (userInput <= 500 && projectManager <= 500) {

            System.out.println("Project Manager will approve your request!");

        } else if (userInput <= 2000 && programManager <= 2000) {

            System.out.println("Program Manager will approve your request!");

        } else if (userInput <= 5000 && subdivisionManager <= 5000) {

            System.out.println("Subdivision Manager will approve your request!");

        } else if (userInput <= 20000 && divisionDirector <= 20000) {

            System.out.println("Division Director will approve your request!");

        } else if (userInput <= 100000 && ceo <= 100000) {

            System.out.println("CEO will approve your request!");

        } else {

            System.out.println("Requested amount cannot be approved!");

        }
        expense.close();
    }
}
