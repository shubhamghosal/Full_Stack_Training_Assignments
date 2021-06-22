/*5. Write a program to take "name" as command line argument and print "Hello "+<name> on the console?

>> java MyFirstJavaProgram Shakir
Hello Shakir*/

public class CommandLine {

    public static void main(String[] args) {

        System.out.println("Hello " + args[0]);

    }

}