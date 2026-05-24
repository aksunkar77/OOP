package service;

import model.User;
import model.Message;
import model.News;
import model.Comment;
import enums.MessageStatus;

public class CommunicationService {

   
    public static void sendMessage(User from, User to, String content) {
        Message msg = new Message(to, to, content);
        msg.setStatus(MessageStatus.SENT);
        
        
        System.out.println("Зурвас: '" + from.getFirstName() + "'-ээс '" + to.getFirstName() + "' рүү илгээгдлээ.");
    }
    public static void postNews(News news) {
        System.out.println("Шинэ мэдээ нийтлэгдлээ: " + news.getTitle());
    }
    public static void addComment(User user, News news, String text) {
        Comment comment = new Comment(text, user);
        System.out.println(user.getFirstName() + " сэтгэгдэл үлдээлээ: " + text);
    }
}