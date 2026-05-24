package researchcommunication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class News implements Serializable {
    private int newsId;
    private String title;
    private String content;
    private String topic;
    private String authorName;
    private Date publishedDate;
    private boolean pinned;
    private List<Comment> comments;

    public News(int newsId, String title, String content, String topic, String authorName) {
        this.newsId = newsId;
        this.title = title;
        this.content = content;
        this.topic = topic;
        this.authorName = authorName;
        this.publishedDate = new Date();
        this.comments = new ArrayList<>();
        // "Research" topic автоматаар pin хийгдэнэ
        this.pinned = topic.equalsIgnoreCase("Research");
    }

    public int getNewsId()             { return newsId; }
    public String getTitle()           { return title; }
    public String getContent()         { return content; }
    public String getTopic()           { return topic; }
    public String getAuthorName()      { return authorName; }
    public Date getPublishedDate()     { return publishedDate; }
    public boolean isPinned()          { return pinned; }
    public List<Comment> getComments() { return comments; }

    public void setTitle(String title)     { this.title = title; }
    public void setContent(String content) { this.content = content; }
    public void setTopic(String topic)     { this.topic = topic; }

    public void addComment(Comment comment) {
        comments.add(comment);
        System.out.println("[News] " + comment.getAuthorName() +
                           " commented on '" + title + "'");
    }

    public void pin() {
        this.pinned = true;
        System.out.println("[News] '" + title + "' pinned.");
    }

    public void viewNews() {
        System.out.println("=== News: " + title + " ===");
        System.out.println("  Topic     : " + topic);
        System.out.println("  Author    : " + authorName);
        System.out.println("  Published : " + publishedDate);
        System.out.println("  Pinned    : " + pinned);
        System.out.println("  Content   : " + content);
        System.out.println("  Comments  : " + comments.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News n = (News) o;
        return newsId == n.newsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId);
    }

    @Override
    public String toString() {
        return "News{id=" + newsId + ", title='" + title +
               "', topic=" + topic + ", pinned=" + pinned + "}";
    }
}
