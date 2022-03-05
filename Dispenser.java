public class Dispenser {
    private int numberOfItems;   
    private int cost;   
 
        //Default constructor
    public Dispenser()
    {
         numberOfItems = 50;
         cost = 50;
    }
 
        //Constructor with parameters
    public Dispenser(int setNoOfItems, int setCost)
    {
         if (setNoOfItems <= 0)
         {
             throw new RuntimeException("Your number of items must be greater than zero.");
         }
         else
         {
             numberOfItems = setNoOfItems;
         }
 
         if (setCost <= 0)
         {
             throw new RuntimeException("Your cost must be greater than zero.");
         }
         else
         {
              cost = setCost;
         }
    }
 
        //number of items in the dispenser 
    public int getCount()
    {
         return numberOfItems;
    }
 
        //cost of the item
    public int getProductCost()
    {
         return cost;
    }
 
        //Subtracts the number of items by one
    public void makeSale()
    {
        numberOfItems--;
    } 
}
