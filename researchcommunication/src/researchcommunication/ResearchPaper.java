package researchcommunication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ResearchPaper implements Serializable, Comparable<ResearchPaper> {
    private int paperId;
    private String title;
    private int citations;
    private int pages;
    private String topic;
    private String doc;
    private String journal;
    private String doi;
    private Date datePublished;
    private List<String> authorNames;

    public ResearchPaper(int paperId, String title, String topic,
                         int pages, String doc, String journal, String doi) {
        this.paperId = paperId;
        this.title = title;
        this.topic = topic;
        this.pages = pages;
        this.doc = doc;
        this.journal = journal;
        this.doi = doi;
        this.citations = 0;
        this.datePublished = new Date();
        this.authorNames = new ArrayList<>();
    }

    public int getPaperId()              { return paperId; }
    public String getTitle()             { return title; }
    public int getCitations()            { return citations; }
    public int getPages()                { return pages; }
    public String getTopic()             { return topic; }
    public String getDoc()               { return doc; }
    public String getJournal()           { return journal; }
    public String getDoi()               { return doi; }
    public Date getDatePublished()       { return datePublished; }
    public List<String> getAuthorNames() { return authorNames; }

    public void setTitle(String title)     { this.title = title; }
    public void setTopic(String topic)     { this.topic = topic; }
    public void setDoc(String doc)         { this.doc = doc; }
    public void setJournal(String journal) { this.journal = journal; }
    public void setDoi(String doi)         { this.doi = doi; }

    public void addAuthorName(String name) {
        authorNames.add(name);
    }

    // PLAIN_TEXT эсвэл BIBTEX форматаар citation буцаана
    public String getCitation(CitationFormat format) {
        String firstAuthor = authorNames.isEmpty() ? "Unknown" : authorNames.get(0);
        int year = 1900 + datePublished.getYear();
        String citation;

        if (format == CitationFormat.PLAIN_TEXT) {
            citation = firstAuthor + ". \"" + title + ".\" " +
                       journal + " (" + year + "). " +
                       "Pages: " + pages + ". DOI: " + doi;
        } else {
            // BIBTEX format
            citation = "@article{" + doi + ",\n" +
                       "  author  = {" + String.join(", ", authorNames) + "},\n" +
                       "  title   = {" + title + "},\n" +
                       "  journal = {" + journal + "},\n" +
                       "  year    = {" + year + "},\n" +
                       "  pages   = {" + pages + "},\n" +
                       "  doi     = {" + doi + "}\n" +
                       "}";
        }
        System.out.println("[Citation - " + format + "]\n" + citation);
        return citation;
    }

    public void addCite() {
        citations++;
        System.out.println("[ResearchPaper] '" + title + "' cited. Total: " + citations);
    }

    // Comparable — default: citations буурах дарааллаар
    @Override
    public int compareTo(ResearchPaper other) {
        return Integer.compare(other.citations, this.citations);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResearchPaper)) return false;
        ResearchPaper p = (ResearchPaper) o;
        return paperId == p.paperId && Objects.equals(doi, p.doi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paperId, doi);
    }

    @Override
    public String toString() {
        return "ResearchPaper{id=" + paperId + ", title='" + title +
               "', citations=" + citations + ", pages=" + pages +
               ", journal='" + journal + "'}";
    }
}
