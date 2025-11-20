public class DefaultValueChecker{
    
    byte b;
    short s;
    int i;   
    long l;
    double d;
    char c;
    boolean bo;
    float f;
    public static void main(String[] args){
        DefaultValueChecker value=new DefaultValueChecker();
        System.out.println(value.b);
        System.out.println(value.s);
        System.out.println(value.i);
        System.out.println(value.l);
        System.out.println(value.d);
        System.out.println(value.c);
        System.out.println(value.bo);
        System.out.println(value.f);
        /*Java doesnt assign default values to local variables but assigns to the global variables. If we try to assign default value to
        it throws compilation error.
        */
    }
}