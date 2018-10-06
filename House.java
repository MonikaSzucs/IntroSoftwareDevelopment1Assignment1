
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House
{
    private static  final   int     MIN_YEAR = 1920;
    private static  final   int     MAX_YEAR = 2018;
    private static  final   double  MIN_SQUARE_FEET = 2500.0;
    private static  final   int     MIN_BEDROOMS = 3;
    private static  final   double  MIN_BATHROOMS = 2.5;
    
    //Class (Static) Variables
    private static  String type = "mansion";
    private static String  pictureGallery = "http://www.mansion.com/gallery/";
    // instance variables - replace the example below with your own
    private int     year;
    private double  size;
    private String  neighborhood;
    private int     numBedrooms;
    private double  numBathrooms;
    private boolean view;


    /**
     * Constructor for objects of class House
     * 
     * @param year is when the house was built.
     * @param size is how many square feet the house is.
     * @param neighborhood is where the house is located.
     * @param numBedrooms is how many bedrooms are in the house.
     * @param numBathrooms is ow many bathrooms are in the house.
     * @param view is if there is a basement.
     * @param pictureGallery is sending out a link to view the pictures of the house.
     * 
     */
    public House(int year, double size, String neighborhood, int numBedrooms, double numBathrooms, boolean view, String pictureGallery)
    {
        // initialise instance variables
        setYear(year);
        setSize(size);
        setNeighborhood(neighborhood);
        setNumBedrooms(numBedrooms);
        setNumBathrooms(numBathrooms);
        setView(view);
        setPictureGallery(pictureGallery);
    }

    /**
     * Accessor
     * 
     * @return the year
     */
    public int getYear()
    {
        return this.year;
    }

    /**
     * Mutator
     * 
     * @param year sets the value for the year
     */
    public final void setYear(int theYear)
    {
        if((theYear>=MIN_YEAR)&&(theYear<=MAX_YEAR)){
            year = theYear;
        }

        else if (theYear>MAX_YEAR){
            throw new IllegalArgumentException("Sorry, the year " + theYear + " is invalid.");
        }
        else{
            throw new IllegalArgumentException("Sorry, the year " + theYear + " is too old for a mansion.");
        }
    }

    /**
     * Accessor
     * 
     * @return the size of the house
     */
    public double getSize()
    {
        return this.size;
    }

    /**
     * Mutator
     * 
     * @param size get the size of the house in square feet.
     */
    public final void setSize(double theSize)
    {
        if(theSize>=MIN_SQUARE_FEET){
            size = theSize;
        }
        else {
            throw new IllegalArgumentException("Sorry, " + theSize + " square feet is too small for a mansion");
        }
    }

    /**
     * Accessor
     * 
     * @return the neighborhood
     */
    public String getNeighborhood()
    {
        return this.neighborhood;
    }

    /**
     * Mutator
     * 
     * @param theNeightborhood checks if the value is not nall.
     */
    public final void setNeighborhood(String theNeighborhood)
    {
        if(theNeighborhood != null){
            neighborhood = theNeighborhood;
        }
        else {
            throw new IllegalArgumentException("The " + theNeighborhood + " is not valid");
        }

        if(theNeighborhood.length()>0){
            neighborhood = theNeighborhood;
        }
        else {
            throw new IllegalArgumentException("Sorry the neightborhood must be set");
        }
    }

    /**
     * Accessor
     * 
     * @return the number of bedrooms.
     */
    public int getNumBedrooms()
    {
        return this.numBedrooms;
    }

    /**
     * Mutator
     * 
     * @param theNumBedrooms checks to see if it is greater than or equal to three.
     */
    public final void setNumBedrooms(int theNumBedrooms)
    {
        if(theNumBedrooms>=MIN_BEDROOMS){
            numBedrooms = theNumBedrooms;
        }
        else {
            throw new IllegalArgumentException("Sorry, a mansion should have at least 3 bedrooms.");
        }
    }

    /**
     * Accessor
     * 
     * @return the number of bathrooms.
     */
    public double getNumBathrooms()
    {
        return this.numBathrooms;
    }

    /**
     * Mutator
     * 
     * @param theNumBathrooms checks to see if there is more than or equal to 2.5 bathrooms.
     */
    public final void setNumBathrooms(double theNumBathrooms)
    {
        if(theNumBathrooms>=MIN_BATHROOMS){
            numBathrooms = theNumBathrooms;
        }
        else {
            throw new IllegalArgumentException("Sorry, a mansion should hae at least 2.5 bathrooms.");
        }
    }
    
    /**
     * Accessor
     * 
     * @return the view.
     */
    public boolean hasView()
    {
        return this.view;
    }
    
    /**
     * Mutator
     * 
     * @param theView is checking if here is a view or not.
     */
    public final void setView(boolean theView){
        if(theView){
            view = theView;
        }
    }
    
    
    /**
     * Accessor
     * 
     * @return the view.
     */
    public String getPictureGallery()
    {
        return this.pictureGallery;
    }
    
    /**
     * Mutator
     * 
     * @param pictureGallery checks to see if there is a link to a picture gallary for the house.
     */
    public final void setPictureGallery(String thePictureGallery)
    {
        if(thePictureGallery.length()>0){
            pictureGallery = thePictureGallery;
        }
        else {
            throw new IllegalArgumentException("Sorry, the Picture Gallery must be set");
        }

        if(thePictureGallery != null){
            pictureGallery = thePictureGallery;
        }
        else {
            throw new IllegalArgumentException("Sorry, the Picture Gallery is not valid.");
        }
    }
    
    
    public void getHouseDetails(){
        if(view){
            System.out.println("This mansion was built in " + getYear() + " with " + getSize() + " square feet of space, " + getNumBedrooms() + " bedrooms and " + getNumBathrooms() + " bathrooms. it has a spectacular view. You can see pictures of this house at " + getPictureGallery());
        }
        else {
            System.out.println("This mansion was built in " + getYear() + " with " + getSize() + " square feet of space, " + getNumBedrooms() + " bedrooms and " + getNumBathrooms() + " bathrooms. It is situated in a fantastic location. You can see pictures of this house at " + getPictureGallery());
        }
    }
}