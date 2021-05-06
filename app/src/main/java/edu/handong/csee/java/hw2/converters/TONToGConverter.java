package edu.handong.csee.java.hw2.converters;

/**
 * This is class of TONToGConverter which implements Convertible interface
 * @author YeongMin Kim
 */
public class TONToGConverter implements Convertible{

    private double value;
    private double result;
    /**
     * This method sets input values
     * @param fromValue
     */
    public void setFromValue(double fromValue){
        value = fromValue;
    }
    /**
     * This method gets converted value
     * @return converted value
     */
    public double getConvertedValue(){
        return result;
    }
    /**
     * This method converts input value
     * Converts Ton to G
     */
    public void convert(){
        result = value*1000000;
    }
    
}
