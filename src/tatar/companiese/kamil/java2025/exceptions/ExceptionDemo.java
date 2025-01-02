package tatar.companiese.kamil.java2025.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        int number = parseUserInt1("hundred");
        System.out.println(number);
    }
    public static int parseUserInt1(String arg){
        System.out.println("You're in the parseUserInt1 method");
        int number = parseUserInt2(arg);
        System.out.println("Parsed");
        return number;
    }
    public static int parseUserInt2(String arg){
        try {
            return Integer.parseInt(arg);
        } catch(NumberFormatException e){
            System.out.println("Cannot parse input parameter in method parseUserInt2");
            throw new UserInputIntegerException("Cannot parse input parameter in method parseUserInt2", e);
        }
    }
}
