package school.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by michal on 14.06.15.
 */
public class Message {
    String author;
    final LocalDateTime messegeDate;
    String text;

    public Message(String author, String text) {
        this.author = author;
        this.messegeDate =  LocalDateTime.now();
        this.text = text;
    }
}
