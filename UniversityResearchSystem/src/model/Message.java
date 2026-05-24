package model;

import enums.MessageStatus;
import java.util.Date;


public class Message {
    private User sender;
    private User receiver;
    private String content;
    private Date date;
    private MessageStatus status;
 
    public Message(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.date = new Date();
        this.setStatus(MessageStatus.SENT);
    }
 
    public User getSender()    { return sender; }
    public User getReceiver()  { return receiver; }
    public String getContent() { return content; }
    public Date getDate()      { return date; }
 
    public void setSender(User sender)     { this.sender = sender; }
    public void setReceiver(User receiver) { this.receiver = receiver; }
    public void setContent(String content) { this.content = content; }
 
    @Override
    public String toString() {
        return "Message{from=" + sender.getFirstName()
                + ", to=" + receiver.getFirstName()
                + ", content='" + content + "'}";
    }

	public MessageStatus getStatus() {
		return status;
	}

	public void setStatus(MessageStatus status) {
		this.status = status;
	}
}


