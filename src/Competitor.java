
/**
 * The Competitor class represents a competitor in system that will that will appear on the scoreboard.
 * It holds the competitor details relevant in our context.
 * 
 * @author Caroline Collaço and
 * @version 2013.04.03
 */
public class Competitor
{
    // the competitor's full name
    private String name;
    // the competitive category
    private String category;
    // the competitor's academy
    private String academy;
    // the competitor's instructor
    private String instructor;

    /**
     * Create a new competitor with a given name and category and academy.
     */
    public Competitor(String fullName, String competitorcategory, String competitoracademy, String competitorinstructor)
    {
        name = fullName;
        category = competitorcategory;
        academy = competitoracademy;
        instructor = competitorinstructor;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the category of this competitor.
     */
    public String getCompetitorCategory()
    {
        return category;
    }
    
    /**
     * Return the academy of this competitor.
     */
    public String getCompetitorAcademy()
    {
        return academy;
    }
    
    /**
     * Return the instructor of this competitor.
     */
    public String getCompetitorInstructor()
    {
        return instructor;
    }
 
    /**
     * Print the student's name, category and academy.
     */
    public void print()
    {
        System.out.println("name:" +name + ",  category:" + category + ",  academy:" + academy + ",  instructor:" + instructor);
    }
}

