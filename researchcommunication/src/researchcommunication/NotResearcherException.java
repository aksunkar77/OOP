package researchcommunication;

// Exception 2: Researcher биш хүн ResearchProject-д орохыг оролдвол
public class NotResearcherException extends Exception {
    public NotResearcherException(String name) {
        super(name + " is not a Researcher and cannot join a Research Project.");
    }
}
