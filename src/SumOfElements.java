import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, sum = 0;

        System.out.print("Enter rows: ");
        i = scanner.nextInt();

        System.out.print("Enter columns: ");
        j = scanner.nextInt();
        double[][] array = new double[i][j];

        System.out.println("Enter Elements of the Array: ");
        for (int row = 0; row < array.length; row++)
        {
            for (int column = 0; column < array[row].length; column++)
            {
                System.out.print("a["+row+"]["+column+"] = ");
                array[row][column] = scanner.nextDouble();
            }
        }

        System.out.print("Enter column that summed ( 0 < column <= "+j+"): ");
        int col = scanner.nextInt();

        for (int row = 0; row < array.length; row++)
        {
            sum += array[row][col-1];
        }
        System.out.print("Sum of column "+col+" is : "+sum);
    }
}
