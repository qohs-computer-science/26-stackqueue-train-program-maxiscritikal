/*
 * Max Korsa
 * 1/8/26
 * PD: 4
 * This class acts as a custom object for trains used in the trainyard simulation program.
 */
public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    public Train(String n, String prod, String org, String des, int w, int m)
    {
        name = n;
        product = prod;
        origin = org;
        destination = des;
        weight = w;
        miles = m;
    }// end constructor

    public Train(String n, String des)
    {
        name = n;
        destination = des;
    }// end constructor

    public String getName()
    {
        String temp = name;
        return temp;
    }//end getName

    public String getDestination()
    {
        String temp = destination;
        return temp;
    }//end getDestination

    public int getWeight()
    {
        int temp = weight;
        return temp;
    }//end getWeight

    public int getMiles()
    {
        int temp = miles;
        return temp;
    }//end getMiles
    
    public String getProduct()
    {
        String temp = product;
        return temp;
    }//end getProduct

    public void resetMiles()
    {
        this.miles = 100;
    }//end resetMiles

    public boolean isEngine()
    {
        boolean temp = false;
        String name = this.getName().trim();
        if (name.startsWith("ENG"))
        {
            temp = true;
        }//end if
        return temp;
    }//end isEngine

}//end class Train