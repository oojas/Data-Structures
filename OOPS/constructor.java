public class constructor {
    String Name;
    int Age;
    String Dl;
    constructor()
    {
        Name="Ojas";
        this.Age=22;
        this.Dl="JK02";
    }
    void print()
    {
        System.out.print(Name+" ");
        System.out.print(Age+" ");
        System.out.print(Dl);
        System.out.println();
    }
    @Override
    public String toString() // Overiding the address of the class to print the default values
    {
        return Name+" "+Age+" "+Dl;
    }
    public static void main(String[] args) {
        constructor cons=new constructor();
        cons.print();
        cons.Age=25;
        cons.Name="Pranjal";
        cons.Dl="Jk02";
        cons.print();
    }
}
