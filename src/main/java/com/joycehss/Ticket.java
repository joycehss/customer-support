package com.joycehss;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by joyce on 2017/6/29.
 */
public class Ticket {

    private String customerName;
    private String subject;
    private String body;
    private Map<String, Attachment> attachments = new LinkedHashMap<String, Attachment>();

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Collection<Attachment> getAttachments() {
        return this.attachments.values();
    }

    public Attachment getAttachment(String name) {
        return this.attachments.get(name);
    }

    public int getNumberOfAttachments() {
        return this.attachments.size();
    }

    public void addAttachment(Attachment attachment) {
        this.attachments.put(attachment.getName(), attachment);
    }
}
