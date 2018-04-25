package com.base.pattern.abstractFactory;

import java.util.Optional;

/**
 * <p>颜色工厂</p>
 *
 * @author kevin
 * @create 2018-04-25 11:32
 **/
public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(!Optional.ofNullable(color).isPresent()){
            return null;
        }
        if(color.equalsIgnoreCase("R")){
            return new RedImpl();
        }else if(color.equalsIgnoreCase("B")){
            return new BlueImple();
        }else{
            return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
