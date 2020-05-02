package com.company;

public class Subtracter extends CalculateBase {
    public Subtracter() {}
    public Subtracter(double leftVal, double rigthVal){
        super(leftVal, rigthVal);
    }
    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
