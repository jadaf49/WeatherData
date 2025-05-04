import java.util.ArrayList;

public class WeatherData
{
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;
    
    public WeatherData(ArrayList<Double>temps)
    {
        temperatures = temps;
    }

    public void cleanData(double lower, double upper)
    { 
        for (int i=0;i<temperatures.size();i++)
        {
            if (temperatures.get(i)>upper || temperatures.get(i)<lower) 
            {
                temperatures.remove(i);
                i--;
            }
        }
    }
    /**
    * Returns the length of the longest heat wave found in temperatures, as described in
    * part (b)
    * Precondition: There is at least one heat wave in temperatures based on threshold.
    */
    public int longestHeatWave(double threshold)
    { 
        int count=0;
        int max=0;
        double current=0;
        for (int i=0; i<temperatures.size();i++)
        {
            current = temperatures.get(i);
            if (current>threshold)
            {
                count++;
            }
            if (current<=threshold)
            {
                if (count>max) max=count;
                count=0;
            }

        }
        return max;
    }
    // There may be instance variables, constructors, and methods that are not shown.

    public String toString()
    {
        return temperatures.toString();

    }
}