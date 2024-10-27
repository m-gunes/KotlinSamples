package org.csystem.demo;


// kotlindeki Sample3 sinifinın Java karşılığı yaklaşık olarak aşağıdaki gibidir
public class Sample {
    private int field1;
    private double field2;

    public void setX(int x)
    {
        System.out.println("setX");
        field1 = x;
    }

    public int getX()
    {
        System.out.println("getX");
        return field1;
    }

   public void setY(double y)
   {
       System.out.println("setY");
       field2 = y;
   }

   public double getY()
   {
       System.out.println("getY");
       return field2;
   }
}
