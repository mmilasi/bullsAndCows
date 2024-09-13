import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int numSymbols = 0;

        while (true) {
            try {
                System.out.println("Enter the secret code's length:");
                length = Integer.parseInt(scanner.next());
                System.out.println("Enter the number of possible symbols in the code:");
                numSymbols = Integer.parseInt(scanner.next());

                if (length > numSymbols) {
                    System.out.println("Error: it's impossible to generate a code with a length of " + length +
                            " with only " + numSymbols + " unique symbols.");
                } else if (numSymbols > 36) {
                    System.out.println("Error: the number of possible symbols cannot be greater than 36.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: please enter valid integers for the length and number of symbols.");
            }
        }

        String secretCode = generateSecretCode(length, numSymbols);
        String symbolRange = getSymbolRange(numSymbols);

        System.out.println("The secret is prepared: " + "*".repeat(length) + " (" + symbolRange + ").");
        System.out.println("Okay, let's start a game!");

        int turn = 1;
        while (true) {
            System.out.println("Turn " + turn + ":");
            String guess = scanner.next();

            if (guess.length() != length) {
                System.out.println("Invalid input length, please guess a code of length " + length + ".");
                continue;
            }
            String grade = gradeInput(guess, secretCode);
            System.out.println(grade);
            if (grade.contains("bull") && grade.split(" ")[0].equals(String.valueOf(length))) {
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }
            turn++;
        }
    }


    public static String generateSecretCode(int length, int numSymbols) {
        String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";

        String availableSymbols = symbols.substring(0, numSymbols);

        Set<Character> uniqueSymbols = new LinkedHashSet<>();
        Random random = new Random();

        while (uniqueSymbols.size() < length) {
            int index = random.nextInt(numSymbols);
            uniqueSymbols.add(availableSymbols.charAt(index));
        }

        StringBuilder secretCode = new StringBuilder();
        for (Character ch : uniqueSymbols) {
            secretCode.append(ch);
        }

        return secretCode.toString();

    }

    public static String getSymbolRange(int numSymbols) {
        String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";
        if (numSymbols <= 10) {
            return "0-" + symbols.charAt(numSymbols - 1);
        } else {
            return "0-9, a-" + symbols.charAt(numSymbols - 1);
        }
    }

    public static String gradeInput(String input, String secretCode) {
        int bulls = 0;
        int cows = 0;

        boolean[] isBull = new boolean[secretCode.length()];
        boolean[] isCow = new boolean[secretCode.length()];

        for(int i = 0; i < secretCode.length(); i++) {
            if(input.charAt(i) == secretCode.charAt(i)) {
                bulls++;
                isBull[i] = true;
            }
        }

        for(int i = 0; i < secretCode.length(); i++) {
            if(!isBull[i]) {
                for(int j = 0; j < secretCode.length(); j++) {
                    if(i != j && !isBull[j] && !isCow[j] && input.charAt(i) == secretCode.charAt(j)) {
                        cows++;
                        isCow[j] = true;
                        break;
                    }
                }
            }
        }

        if(bulls == 0 && cows == 0) {
            return "None";
        }

        StringBuilder result = new StringBuilder();
        if (bulls == 1) {
            result.append(bulls).append(" bull");
        } else if (bulls > 1 || bulls == 0) {
            result.append(bulls).append(" bulls");
        }

        if (cows == 1) {
            if (bulls >= 0) {
                result.append(" and ");
            }
            result.append(cows).append(" cow");
        } else if (cows > 1 || cows == 0) {
            if (bulls > 0) {
                result.append(" and ");
            }
            result.append(cows).append(" cows");
        }

        return result.toString();


    }

    public static boolean isValidPositiveInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
