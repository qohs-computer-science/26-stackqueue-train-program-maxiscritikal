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
    }

    public Train(String n, String des)
    {
        name = n;
        destination = des;
    }

    public String getName()
    {
        String temp = name;
        return temp;
    }

    public String getDestination()
    {
        String temp = destination;
        return temp;
    }

    public int getWeight()
    {
        int temp = weight;
        return temp;
    }

    public int getMiles()
    {
        int temp = miles;
        return temp;
    }
    
    public String getProduct()
    {
        String temp = product;
        return temp;
    }

    public void resetMiles()
    {
        this.miles = 100;
    }

    public boolean isEngine()
    {
        boolean temp = false;
        String name = this.getName().trim();
        if (name.startsWith("ENG"))
        {
            temp = true;
        }

        return temp;
    }

}
