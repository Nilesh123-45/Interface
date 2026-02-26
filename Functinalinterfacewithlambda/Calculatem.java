package Functinalinterfacewithlambda;

@FunctionalInterface
interface Calc{
    public abstract int multi(int x,int y);
}

public class Calculatem {

    public static void main(String[] args) {
       System.out.println(calcul(10,10,(a,b)->/* {
            if (a > b) {
                return a - b;
            } else if (a < b) {
                return a * b;
            } else {
                return a %b;
            }
        }*/// alternate is below using ternary operator

               a>b ? a-b : (a<b ? a*b : a%b)

       ));
    }
    public static int calcul(int x,int y,Calc c){
        return c.multi(x,y);
    }

    //Approach 2
//        calcul(10,10,(a,b)->/* {
//            if (a > b) {
//                return a - b;
//            } else if (a < b) {
//                return a * b;
//            } else {
//                return a %b;
//            }
//        }*/// alternate is below using ternary operator
//
//                a>b ? a-b : (a<b ? a*b : a%b)
//
//        );
//    }
//    public static void calcul(int x,int y,Calc c){
//        System.out.println (c.multi(x,y));
//    }
}
