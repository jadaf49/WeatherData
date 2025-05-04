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
            if (i>upper || i<lower) 
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
    { /* to be implemented in part (b) */ }
    // There may be instance variables, constructors, and methods that are not shown.
}