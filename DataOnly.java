/**
 * Created by zzZ on 2017/2/24.
 */
public class DataOnly {
    int i;
    double d;
    boolean b;
    String s;
    public static void main(String args[]){
        DataOnly data=new DataOnly();
        data.i=47;
        data.d=1.1;
        data.b=false;
        data.s="1234567890";
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
        System.out.println(new ExerciseStorage().storage(data.s));
    }
}
