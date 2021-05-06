package edu.handong.csee.java.hw2.converters;
/**
 * This is interface of Convertible
 * This interface is used by Converter Class
 * @author JC
 */
public interface Convertible {
    /**
     * This method sets input values
     * @param fromValue The type is double
     */
    public void setFromValue(double fromValue);
    /**
     * This method gets converted value
     * @return This method returns converted value by convert method
     */
    public double getConvertedValue();
    /**
     * This method converts input value
     */
    public void convert();

}