public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
