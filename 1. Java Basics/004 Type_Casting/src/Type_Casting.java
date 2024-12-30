public class Type_Casting {

    public static void main(String[] args) {

        //[ Type-casting: converting a data-type to another type ]

            //implicit casting: happens automatically when converting from a narrower-range datatype to wider-range datatype
        short x1 = 45;
        int y1 = x1;
        System.out.println(y1);

        int x2 = 34;
        float y2 = x2;
        System.out.println(y2);
                //error:
//        float f1 = 4.5;   //4.5 is a double, while 4.5f is a float
//        int x3 = 34343434343434L;

            //explicit casting: Does not happen automatically, should be done by the programmer when converting form a wider range to narrower range
        double d1 = 4.5;
        int i1 = (int) d1; //=> 4;  which results in [data loss]
        long l1 = 4534685433L;
        int i2 = (int) l1;
        System.out.println(d1); //Keep in mind that we are only casting the value of d1, d1 itself is not affected here
        System.out.println(i1);
        System.out.println(i2);

        //Every arithmetic operator should be applied between values of the same type
        float f1 = 4.5f + 3;  //3 will be automatically cast to 3.0f
        double d2 = 4.5 + 3;  //same here, 3 will be cast to 3.0 :- double d2 = 4.5 + (double) 3;
        System.out.println(f1);
        System.out.println(d2);
    }
}
