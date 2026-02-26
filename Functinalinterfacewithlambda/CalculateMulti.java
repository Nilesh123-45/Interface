package Functinalinterfacewithlambda;

@FunctionalInterface
public interface CalculateMulti {
    public abstract int operation(int a,int b);
    public static void docalculate(int x,int y,CalculateMulti ccc){
        System.out.println(ccc.operation(x,y));
    }

    public static void main(String[] args) {
//        CalculateMulti c=(a,b)->(a*b);
//        System.out.println(c.operation(2,5));

//        CalculateMulti cc=(i,j)->{
//            return (i*i);
//        };

//        CalculateMulti ccc=(i,j)->(i*i);
        docalculate(10,20,(a,b)->a*a);
    }
}


