class GasCalc {
    static private final double TANK_SIZE = 13.2;
    public static double gallonCalc(int numOfBars, double gallonCost)
    {
        double cost = TANK_SIZE - (numOfBars/TANK_SIZE);
        return 1.06625 * (cost * gallonCost);
    }


public static void main(String[] args) {
    System.out.println(gallonCalc(2, 2.859));
}
}