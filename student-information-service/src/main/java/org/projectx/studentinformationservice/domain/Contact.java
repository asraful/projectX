package org.projectx.studentinformationservice.domain;

/**
 * Created by Khan on 11/13/2014.
 */
public class Contact {
    private String name;
    private String content;
    private String contactType;

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getContactType() {
        return contactType;
    }
}
