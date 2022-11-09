package de.fhac.vs.pietsch.ChatSystem;

import java.util.Date;

public class MessageEntity implements Comparable<MessageEntity> {

    private String userName;
    private Date date;
    private String message;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "userName='" + userName + '\'' +
                ", date=" + date +
                ", message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int compareTo(MessageEntity o) {
        return getDate().compareTo(o.getDate());
    }
}
