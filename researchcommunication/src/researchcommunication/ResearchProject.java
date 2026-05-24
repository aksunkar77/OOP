package researchcommunication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResearchProject implements Serializable {
    private int projectId;
    private String topic;
    private List<ResearchPaper> papers;
    private List<Researcher> participants;

    public ResearchProject(int projectId, String topic) {
        this.projectId = projectId;
        this.topic = topic;
        this.papers = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public int getProjectId()                 { return projectId; }
    public String getTopic()                  { return topic; }
    public List<ResearchPaper> getPapers()    { return papers; }
    public List<Researcher> getParticipants() { return participants; }
    public void setTopic(String topic)        { this.topic = topic; }

    // Researcher биш бол NotResearcherException шидэнэ
    public void addParticipant(Researcher researcher) throws NotResearcherException {
        if (researcher == null) {
            throw new NotResearcherException("null");
        }
        participants.add(researcher);
        System.out.println("[Project] " + researcher.getFirstName() +
                           " joined '" + topic + "'");
    }

    public void removeParticipant(Researcher researcher) {
        participants.remove(researcher);
        System.out.println("[Project] " + researcher.getFirstName() +
                           " left '" + topic + "'");
    }

    public void addPaper(ResearchPaper paper) {
        papers.add(paper);
        System.out.println("[Project] Paper '" + paper.getTitle() +
                           "' added to '" + topic + "'");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResearchProject)) return false;
        ResearchProject p = (ResearchProject) o;
        return projectId == p.projectId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId);
    }

    @Override
    public String toString() {
        return "ResearchProject{id=" + projectId + ", topic='" + topic +
               "', participants=" + participants.size() +
               ", papers=" + papers.size() + "}";
    }
}
