package DSA.OPPs;

class Bike
{
    int speedlimit = 90;
}

class runtimePolymorphisim extends Bike
{
    int speedlimit = 150;

    public static void main(String args[])
    {
        Bike obj = new runtimePolymorphisim();

        System.out.println(obj.speedlimit); // 90
    }
}