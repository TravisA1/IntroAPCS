public class FirstClass
{
    public static void main(String[] args)
    {
        System.out.print("Hello, World!");
        System.out.println("What it do baby!\nWe chillin.");

        int numDwarves; // instantiation
        numDwarves = 7; // initialization

        int numStooges = 3; // instantiation & initialization

        System.out.println("There are "+numDwarves+" dwarves in my cottage.");
        System.out.println("At first, there were "+numStooges+" stooges.");

        numStooges = numStooges + 1;
        numStooges += 1;
        numStooges++;
        System.out.println("There are now "+numStooges+" stooges.");


//        int a = 0;
//        while (a < 100)
//        {
//            System.out.print(a + " --> ");
//            a += 2;
//            if (a == 32)
//            {
//                System.out.println("It's 32.");
//                break;
//                continue;
//            }
//            System.out.println(a);
//        }

        for (int x = 1; x < 30; x *= 2)
        {
            System.out.print(x+"\t");
            for (int i=0; i<x; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\nDone.");
        System.out.println("Isn't that nifty?");
    }

}
