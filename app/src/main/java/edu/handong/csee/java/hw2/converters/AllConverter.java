package edu.handong.csee.java.hw2.converters;

/**
 * This is class of define AllConverter which contians method( setFromValue(), setOriginalMeasure(), convertAndPrintOut() )
 * @author YeoungMin Kim
 */
public class AllConverter {

    private double fromValue;
    private String originalMeasure;
    private double result1;
    private double result2;
    private String convertedMeasure1;
    private String convertedMeasure2;

    /**
     * This method returns input value
     * @param value The value type is double
     * @return return input value (fromValue)
     */
    public AllConverter setFromValue(double value){
        fromValue = value;
        return this;
    }

    /**
     * This method returns input measure
     * @param Measure The value type is String
     * @return return input measure (originalMeasure)
     */
    public AllConverter setOriginalMeasure(String Measure){
        originalMeasure = Measure;
        return this;
    }

    
    /**
     * The method converts input values and pirnts them
     * This method type is void (no return value)
     */
    public void convertAndPrintOut(){
        if(originalMeasure.equals("KM")){
            result1 = fromValue*1000;
            convertedMeasure1 = "M";
            result2 = fromValue/1.6;
            convertedMeasure2 = "MILE";
            System.out.println(fromValue +" "+ originalMeasure + " " + "to" + " " + result1 + " " + convertedMeasure1);
            System.out.println(fromValue +" "+ originalMeasure + " " + "to" + " " + result2 + " " + convertedMeasure2);

            }
        else if(originalMeasure.equals("TON")){
            result1 = fromValue*1000;
            convertedMeasure1 = "KG";
            result2 = result1*1000;
            convertedMeasure2 = "G";
            System.out.println(fromValue +" "+ originalMeasure + " " + "to" + " " + result1 + " " + convertedMeasure1);
            System.out.println(fromValue +" "+ originalMeasure + " " + "to" + " " + result2 + " " + convertedMeasure2);
        }
        else{
            System.out.println("AllConverter cannot support the measure!");
        }
    }
    
}
