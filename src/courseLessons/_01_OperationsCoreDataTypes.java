package courseLessons;

import java.util.function.Predicate;

public class _01_OperationsCoreDataTypes {
    public static void main(String[] args) {


        //1.4 - Casting
        Predicate<String> ps = s -> s.length() > 3 ;
        Predicate<String> ps1 = (Predicate<String>)s -> s.length() > 3 ;

        //1.5 - Wrapper classes
         //valid
         Integer intg=99;
         int i=intg;
         long l=intg;
         Object o=i;

         //not valid
        //Long l1=99;

        System.out.println(Float.isNaN(Float.parseFloat("NaN")));
        System.out.println(Float.isFinite(Float.parseFloat("Infinity")));
        System.out.println(Float.isInfinite(Float.parseFloat("-Infinity")));
        System.out.println(Double.isNaN(Double.parseDouble("NaN")));

        Integer i2 = Integer.valueOf(0);

        //1.6 - Primitives

        Thing t1 = new Thing(100);
        Thing t2 = new Thing(100);
        Thing t3 = new Thing(99);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t3);
        System.out.println(t1.equals(t2));


    }
}

class Thing{
    private int data;

    public Thing(int data){
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        Thing t = (Thing) obj;
        return this.data==t.data;
    }
}