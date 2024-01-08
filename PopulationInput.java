import java.util.Scanner;
public class PopulationInput
{
    public static void main(String[] args)
    {
        System.out.println("Enter the total number of population");
        Scanner keyboard= new Scanner(System.in);
        int population=keyboard.nextInt();

        while (population <0 )
        {
            System.out.println("Invaled value. The number of population must be nonnegative");
            System.out.println("Enter Non-negative number");
            population=keyboard.nextInt();
            System.out.println("The population number is equal to " +population);
        }
    }


}
