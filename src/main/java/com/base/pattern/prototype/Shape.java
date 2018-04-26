package com.base.pattern.prototype;

/**
 * <p>继承Cloneable保证可以被克隆</p>
 *
 * @author kevin
 * @create 2018-04-26 10:44
 **/
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
       this.id = id;
    }

    @Override
    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
