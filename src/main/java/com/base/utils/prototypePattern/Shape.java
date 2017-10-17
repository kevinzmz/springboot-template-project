package com.base.utils.prototypePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/4 16:32.
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for property 'type'.
     *
     * @return Value for property 'type'.
     */
    public String getType() {
        return type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();//此处可以实现深拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
