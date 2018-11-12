
/**
 * Class House for Assignment 1.
 *
 * @author Joe Developer
 * @version Nov. 1, 2018
 */
public class House
{
    // Constants
    public static final String DEFAULT_HOUSE_TYPE = "mansion";
    public static final int    YEAR_BUILT_LOWER_BOUND = 1850;
    public static final int    CURRENT_YEAR = 2018;
    public static final double MINIMUM_SIZE_SQ_FEET = 2500.0;
    public static final int    MINIMUM_NUM_BEDROOMS = 3;
    public static final double MINIMUM_NUM_BATHROOMS = 2.5;
    
    /*
     * Instance Variables
     */
    private final String type = DEFAULT_HOUSE_TYPE;
    private int year;
    private double size;
    private String neighborhood;
    private int numBedrooms;
    private double numBathrooms;
    private boolean view;
    private String pictureGallery;

    
    /**
     * House constructor.
     * 
     * @param year The year built of the house as an int value.
     * @param size The size of the house in square feet as a double value.
     * @param neighborhood The neighborhood of the house as a String value.
     * @param numBedrooms The number of bedrooms in the house as an int value.
     * @param numBathrooms The number of bathrooms in the house as a double value.
     * @param view Whether the house has a view or not as a boolean value.
     * @param pictureGallery THe URL of the picture gallery of the house as a String value.
     */
    public House(int year, 
                 double size, 
                 String neighborhood, 
                 int numBedrooms, 
                 double numBathrooms,
                 boolean view,
                 String pictureGallery)
    {
        setYear(year);
        setSize(size);
        setNeighborhood(neighborhood);
        setNumBedrooms(numBedrooms);
        setNumBathrooms(numBathrooms);
        setView(view);
        setPictureGallery(pictureGallery);
    }
    
    /*
     * Accesor Methods
     */
    
    /**
     * Returns the String value of the type of the house.
     * 
     * @return The type of the house as a String value.
     */
    public String getType()
    {
        return this.type;
    }
    
    /**
     * Returns the int value of when the house was built.
     * 
     * @return The year the house was built as an int value.
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * Returns the double value of the size of the house in square feet.
     * 
     * @return The size of the house in square feet as a double value.
     */
    public double getSize()
    {
        return this.size;
    }
    
    /**
     * Returns the String value of the neighborhood of the house.
     * 
     * @return The neighborhood of the house as a String value.
     */
    public String getNeighborhood()
    {
        return this.neighborhood;
    }
    
    /**
     * Returns the int value of the number of bedrooms in the house.
     * 
     * @return The number of bedrooms in the house as an int value.
     */
    public int getNumBedrooms()
    {
        return this.numBedrooms;
    }
    
    /**
     * Returns the double value of the number of bathrooms in the house.
     * 
     * @return The number of bathrooms in the house as an double value.
     */
    public double getNumBathrooms()
    {
        return this.numBathrooms;
    }
    
    /**
     * Returns the boolean value of whether the house has a view or not.
     * 
     * @return Whether the house has a view or not as an boolean value.
     */
    public boolean hasView()
    {
        return this.view;
    }
    
    /**
     * Returns the String value of the URL where the picture gallery of the house is.
     * 
     * @return The URL where the picture gallery of the house is as a String value.
     */
    public String getPictureGallery()
    {
        return this.pictureGallery;
    }
    
    /*
     * Setter Methods
     */
    
    /**
     * Sets the year built of the house as an int value.
     * 
     * @param year The year the house was built as an int value.
     */
    public void setYear(int year)
    {
        if(year < YEAR_BUILT_LOWER_BOUND)
        {
            throw new IllegalArgumentException("Sorry, the year " +
                                               year +
                                               " is too old for a " +
                                               this.getType() +
                                               ".");
        }
        
        if(year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Sorry, the year " +
                                               year +
                                               " is invalid.");
        }
        
        this.year = year;
    }
    
    /**
     * Sets the size of the house in square foot as a double value.
     * 
     * @param size The size of the house in square foot as a double value.
     */
    public void setSize(double size)
    {
        if(size < MINIMUM_SIZE_SQ_FEET)
        {
            throw new IllegalArgumentException("Sorry, " +
                                               size +
                                               " square feet is too small for a " +
                                               this.getType() +
                                               ".");
        }
        
        this.size = size;
    }
    
    /**
     * Sets the nieghborhood of the house as a String value.
     * 
     * @param neighborhood The neighborhood of the house as a String value.
     */
    public void setNeighborhood(String neighborhood)
    {
        if(neighborhood == null)
        {
            throw new IllegalArgumentException("The Neighborhood is not valid.");
        }
        
        if(neighborhood.equals(""))
        {
            throw new IllegalArgumentException("Sorry, the Neighborhood must be set.");
        }
        
        this.neighborhood = neighborhood;
    }
    
    /**
     * Sets the number of bedrooms in the house as an int value.
     * 
     * @param numBedrooms The number of bedrooms in the house as an int value.
     */
    public void setNumBedrooms(int numBedrooms)
    {
        if(numBedrooms < MINIMUM_NUM_BEDROOMS)
        {
            throw new IllegalArgumentException("Sorry, a " +
                                               this.getType() +
                                               " should have at least " +
                                               MINIMUM_NUM_BEDROOMS +
                                               " bedrooms.");
        }
        
        this.numBedrooms = numBedrooms;
    }
    
    /**
     * Sets the number of bathrooms in the house as an double value.
     * 
     * @param numBathrooms The number of bathrooms in the house as an double value.
     */
    public void setNumBathrooms(double numBathrooms)
    {
        if(numBathrooms < MINIMUM_NUM_BATHROOMS)
        {
            throw new IllegalArgumentException("Sorry, a " +
                                               this.getType() +
                                               " should have at least " +
                                               MINIMUM_NUM_BATHROOMS +
                                               " bathrooms.");
        }
        
        this.numBathrooms = numBathrooms;
    }
    
    /**
     * Sets whether the house has a view or not as a boolean value.
     * 
     * @param view Whether the house has a view or not as a boolean value.
     */
    public void setView(boolean view)
    {
        this.view = view;
    }
    
    /**
     * Sets the URL of the picture gallery of the house as a String value.
     * 
     * @param pictureGallery The URL of the picture gallery of the house as a String value.
     */
    public void setPictureGallery(String pictureGallery)
    {
        if(pictureGallery == null)
        {
            throw new IllegalArgumentException("The Picture Gallery is not valid.");
        }
        
        if(pictureGallery.equals(""))
        {
            throw new IllegalArgumentException("Sorry, the Picture Gallery must be set.");
        }
        
        this.pictureGallery = pictureGallery;
    }
    
    /*
     * Other Methods
     */
    
    /**
     * Returns a String value with the details of the house.
     * 
     * @return The details of the house as a String value.
     */
    public String getHouseDetails()
    {
        String viewOrNotString = "";
        
        if(this.hasView())
        {
            viewOrNotString = "It has a spectacular view.";
        }
        else
        {
            viewOrNotString = "It is situated in a fantastic location.";
        }
        
        return "This " +
               this.getType() +
               " was built in " +
               this.getYear() +
               " with " +
               this.getSize() +
               " square feet of space, " +
               this.getNumBedrooms() + 
               " bedrooms and " +
               this.getNumBathrooms() +
               " bathrooms. " +
               viewOrNotString +
               " You can see pictures of this house at " +
               this.getPictureGallery() +
               ".";
    }       
}
