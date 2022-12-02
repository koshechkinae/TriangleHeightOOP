public class Triangle
{
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC)
    {
        if ((sideA < 0) || (sideB < 0) || (sideC < 0)) throwSideLengthMustBePositive();

        if ((sideA + sideB <= sideC) || (sideB + sideC <= sideA) || (sideC + sideA) <= sideB) throwTriangleDoesNotExist();

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getSideA()
    {
        return sideA;
    }

    public float getSideB()
    {
        return sideB;
    }

    public float getSideC()
    {
        return sideC;
    }

    public float getHeight(float calculatedHeightSide)
    {
        float semiperimeter = (sideA + sideB + sideC) / 2;

        return 2 / calculatedHeightSide * (float) Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    private void throwSideLengthMustBePositive()
    {
        throw new IllegalArgumentException("Длина стороны треугольника должна быть больше 0!");
    }

    private void throwTriangleDoesNotExist()
    {
        throw new IllegalArgumentException("Из данных сторон нельзя составить треугольник!");
    }

}
