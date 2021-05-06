package edu.handong.csee.java.hw2.converters;

/**
 * This is class of KMToMILEConverter which implements Convertible interface
 * @author YeongMin Kim
 */
public class KMToMILEConverter implements Convertible{

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
     * Converts Km to Mile
     */
    public void convert(){
        result = value/1.6;
    }
}
