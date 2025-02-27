//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.printf("Hello\tWorld\n");
        System.out.printf("More\tHello\tStatements\n");
        System.out.print("Hello World\n");
        System.out.print("More Hello Statements\n");
        System.out.println("Hello World");
        System.out.println("More Hello Statements");
        System.out.println("Hello \bWorld");
        System.out.println("More \bHello \bStatements");
        System.out.println("Hello   \b\b\bWorld");
        System.out.println("More Hello \b\b\b\b\b\bStatements");
        System.out.println("Hello \"World\"");
        System.out.println("More \"Hello\" Statements");
        hazelnut();

        for (int i = 1; i <= 5; i++)
        {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    public static void hazelnut ()
    {
        System.out.println("Tree");
        System.out.println("Grass");
    }
}

/*
 notes
 \n = newline
 \t = tab
 \b = backspace
*/


