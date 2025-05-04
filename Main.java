import java.util.ArrayList;

public class Main
{
    public static void main(String[]args)
    {
        double []temps= {99.1,142.0,85.0,85.1,84.6,94.3,124.9,98.0,101.0,102.5};
        ArrayList<Double> t=new ArrayList<Double>();
        for(double n:temps)t.add(n);
        WeatherData w=new WeatherData(t);
        w.cleanData(85.0,120.0);
        System.out.println(w);
        t.add(1,121.0);
        t.add(1,84.0);
        System.out.println(w);
        w.cleanData(85.0,120.0);
        System.out.println(w);
    }
}