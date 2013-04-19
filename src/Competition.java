import java.util.*;

public class Competition
{
    private String area;
    private String day;
    private List competitor;
       
    /**
     * Create a Competition.
     */
    public Competition()
    {
        area = "unknown";
        day = "unknown";
        competitor = new ArrayList();        
    }

    /**
     * Add a competitor to this competition.
     */
    public void enrolCompetitor(Competitor newCompetitor)
    {
        competitor.add(newCompetitor);        
    }
    
       /**
     * Set the room number for this LabClass.
     */
    public void setArea(String areaNumber)
    {
        area = areaNumber;
    }
    
    /**
     * Set the day for this competition. 
     */
    public void setDa(String dayString)
    {
        day = dayString;
    }
       
    /**
     * Print out a competition list with other competition details to the standard
     * terminal.
     */
    public void printList()
    {
        System.out.println("Competition: " + day);
        System.out.println("Area: " + area);
        System.out.println("Competitor's list:");
        Iterator i = competitor.iterator();
        while(i.hasNext()) {
            Competitor competitor = (Competitor)i.next();
            competitor.print();
        }
    }
}
