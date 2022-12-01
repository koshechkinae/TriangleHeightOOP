import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float sideA = readSideLength("A");
        float sideB = readSideLength("B");
        float sideC = readSideLength("C");

        try
        {
            Triangle triangle = new Triangle(sideA, sideB, sideC);

            printHeightsOfTriangle(triangle);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static float readSideLength(String sideName)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Введите длину стороны %s:\n",sideName);

        return scan.nextFloat();
    }

    private static void printHeightsOfTriangle(Triangle triangle)
    {
        System.out.printf("Высота стороны A = %.2f\n", triangle.getHeight(triangle.getSideA()));
        System.out.printf("Высота стороны B = %.2f\n", triangle.getHeight(triangle.getSideB()));
        System.out.printf("Высота стороны C = %.2f\n", triangle.getHeight(triangle.getSideC()));

    }
}