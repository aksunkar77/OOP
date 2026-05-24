package researchcommunication;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Message implements Serializable {
    private String senderName;
    private String receiverName;
    private String content;
    private Date date;

    public Message(String senderName, String receiverName, String content) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.content = content;
        this.date = new Date();
    }

    public String getSenderName()   { return senderName; }
    public String getReceiverName() { return receiverName; }
    public String getContent()      { return content; }
    public Date getDate()           { return date; }

    public void setSenderName(String senderName)     { this.senderName = senderName; }
    public void setReceiverName(String receiverName) { this.receiverName = receiverName; }
    public void setContent(String content)           { this.content = content; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message m = (Message) o;
        return Objects.equals(senderName, m.senderName) &&
               Objects.equals(receiverName, m.receiverName) &&
               Objects.equals(content, m.content) &&
               Objects.equals(date, m.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderName, receiverName, content, date);
    }

    @Override
    public String toString() {
        return "Message{from=" + senderName + ", to=" + receiverName +
               ", content='" + content + "', date=" + date + "}";
    }
}
