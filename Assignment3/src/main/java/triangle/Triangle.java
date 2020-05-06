package triangle;
public class Triangle
{
    //Tygo Verholen
    //Assignment 3 Project Software Engineering.
    //Improved with SonarLint.

    private double a;
    private double b;
    private double c;

    private double unused; //unused variable to trigger SonarInt.

    private int CAPITALS = 2; //variable written with capitalsto trigger SonarInt.

    public void Methodcapital()
    {
        //Method with a capital to trigger SonarInt.

    }


    //This constructor ask for the sides and place them in the above variables.
    Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    String checkTriangle()
    {
        if (a <= 0 || b <= 0 || c <= 0){
            return "invalid"; // added test
        }
        if (a == b && b == c) {
            return "equilateral";
        }
        if (a >= b+c || c >= b+a || b >= a+c){
            return "invalid";
        }
        if (b==c || a==b || c==a) {
            return "isosceles";
        }
        return "scalene";//if the others fail its scalene
    }
}
