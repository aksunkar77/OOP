package researchcommunication;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Comment implements Serializable {
    private int commentId;
    private String authorName;
    private String text;
    private Date date;

    public Comment(int commentId, String authorName, String text) {
        this.commentId = commentId;
        this.authorName = authorName;
        this.text = text;
        this.date = new Date();
    }

    public int getCommentId()        { return commentId; }
    public String getAuthorName()    { return authorName; }
    public String getText()          { return text; }
    public Date getDate()            { return date; }
    public void setText(String text) { this.text = text; }

    public void pin() {
        System.out.println("[Comment #" + commentId + "] Pinned by " + authorName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment c = (Comment) o;
        return commentId == c.commentId && Objects.equals(text, c.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, text);
    }

    @Override
    public String toString() {
        return "Comment{id=" + commentId + ", author=" + authorName +
               ", text='" + text + "'}";
    }
}
