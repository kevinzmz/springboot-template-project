package com.base.pattern.Factory;

/**
 * <p>通过枚举进行特定实例返回</p>
 *
 * @author kevin
 * @create 2018-04-25 10:50
 **/
public enum ShapeSecFactory {
    RECTANGLE("R"),SQUARE("S");

    private String key;

    ShapeSecFactory(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public Shape getShape(){
        if(this.key.equals("R")){
            return new RectangleImpl();
        }else if(this.key.equals("S")){
            return new SquareImpl();
        }else{
            return null;
        }
    }
}
