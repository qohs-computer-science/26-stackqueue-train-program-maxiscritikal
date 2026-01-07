public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    public car(String n, String prod, String org, String des, int w, int m)
    {
        name = n;
        product = prod;
        origin = org;
        destination = des;
        weight = w;
        miles = m;
    }

    public engine(String n, String des)
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

    public String getWeight()
    {
        int temp = weight;
        return temp;
    }

    public String getMiles()
    {
        int temp = miles;
        return temp;
    }
    
    public String getProduct()
    {
        String temp = product;
        return temp;
    }

}
