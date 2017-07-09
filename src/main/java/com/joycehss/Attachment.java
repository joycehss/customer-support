package com.joycehss;

/**
 * Created by joyce on 2017/6/29.
 */
public class Attachment {

    private String name;
    private byte[] contents;

    public byte[] getContents() {
        return contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
