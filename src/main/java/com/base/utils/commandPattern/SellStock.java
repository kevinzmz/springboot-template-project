package com.base.utils.commandPattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/20 10:33.
 */
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
