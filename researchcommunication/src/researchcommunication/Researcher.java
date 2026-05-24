package researchcommunication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Researcher — Decorator pattern ашигласан.
 * Ямар ч User (Student, Teacher, Employee) -ийг
 * Researcher болгон өргөтгөж болно.
 * Диаграмд UserDecorator wraps User гэж байгаатай нийцнэ.
 */
public class Researcher implements Serializable {
    private String firstName;
    private String lastName;
    private int researcherId;
    private List<ResearchPaper> papers;
    private List<ResearchProject> projects;
    private List<Message> messages;

    public Researcher(int researcherId, String firstName, String lastName) {
        this.researcherId = researcherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public int getResearcherId()          { return researcherId; }
    public String getFirstName()          { return firstName; }
    public String getLastName()           { return lastName; }
    public List<ResearchPaper> getPapers()     { return papers; }
    public List<ResearchProject> getProjects() { return projects; }
    public List<Message> getMessages()    { return messages; }

    // h-index бодох
    public int calculateHIndex() {
        List<Integer> c = new ArrayList<>();
        for (ResearchPaper p : papers) c.add(p.getCitations());
        c.sort(Comparator.reverseOrder());
        int h = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i) >= i + 1) h = i + 1;
            else break;
        }
        System.out.println("[Researcher] " + firstName + "'s h-index = " + h);
        return h;
    }

    // Supervisor болгохын өмнө h-index шалгах
    public void assignAsSupervisor(String graduateStudentName)
            throws LowHIndexException {
        int h = calculateHIndex();
        if (h < 3) {
            throw new LowHIndexException(firstName + " " + lastName, h);
        }
        System.out.println("[Researcher] " + firstName + " assigned as supervisor of "
                           + graduateStudentName);
    }

    public void publishResearchPaper(ResearchPaper paper) {
        paper.addAuthorName(firstName + " " + lastName);
        papers.add(paper);
        // Нийтлэхэд автоматаар Research topic-той News үүснэ
        News announcement = new News(
            paper.getPaperId(),
            "New Paper Published: " + paper.getTitle(),
            firstName + " " + lastName + " published a new research paper.",
            "Research",   // ← автоматаар pinned болно
            firstName + " " + lastName
        );
        System.out.println("[Researcher] " + firstName +
                           " published '" + paper.getTitle() + "'");
        System.out.println("[Auto News] " + announcement);
    }

    // Comparator-оор эрэмбэлж хэвлэнэ
    public void printPapers(Comparator<ResearchPaper> comparator) {
        List<ResearchPaper> sorted = new ArrayList<>(papers);
        sorted.sort(comparator);
        System.out.println("[Researcher] Papers by " + firstName + " " + lastName + ":");
        for (ResearchPaper p : sorted) {
            System.out.println("  - " + p.getTitle() +
                               " | citations: " + p.getCitations() +
                               " | pages: " + p.getPages() +
                               " | date: " + p.getDatePublished());
        }
    }

    public void joinProject(ResearchProject project) throws NotResearcherException {
        projects.add(project);
        project.addParticipant(this);
    }

    public void getCitation(ResearchPaper paper, CitationFormat format) {
        paper.getCitation(format);
    }

    public void sendMessage(Message message) {
        messages.add(message);
        System.out.println(firstName + " sent message to " + message.getReceiverName());
    }

    public void receiveMessage(Message message) {
        messages.add(message);
        System.out.println(firstName + " received message from " + message.getSenderName());
    }

    public void viewMessages() {
        System.out.println("=== Messages for " + firstName + " ===");
        if (messages.isEmpty()) {
            System.out.println("  No messages.");
            return;
        }
        for (Message m : messages) {
            System.out.println("  [" + m.getDate() + "] " +
                               m.getSenderName() + ": " + m.getContent());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Researcher)) return false;
        Researcher r = (Researcher) o;
        return researcherId == r.researcherId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(researcherId);
    }

    @Override
    public String toString() {
        return "Researcher{id=" + researcherId +
               ", name=" + firstName + " " + lastName +
               ", papers=" + papers.size() +
               ", projects=" + projects.size() +
               ", h-index=" + calculateHIndex() + "}";
    }
}
