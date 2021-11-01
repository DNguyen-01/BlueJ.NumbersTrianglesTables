
public class NumberUtilities {

    public static String getRange(int stop) { 
        String getRangeNew = "";
        for (int y=0; y < stop; y++){
             getRangeNew = getRangeNew + Integer.toString(y);//this tracks the previous # and add it to the next
        }
        return getRangeNew; 
    }


    public static String getRange(int start, int stop) {
        String getRangeNew = "";
        for (int y=start; y < stop; y++){//use the input start to change
             getRangeNew = getRangeNew + Integer.toString(y);  
             }
        return getRangeNew; 
    }

    
    public static String getRange(int start, int stop, int step) {
                String getRangeNew = "";
        for (int y=start; y < stop; y+=step){//adding different steps, "+=" to the input
             
            getRangeNew = getRangeNew + Integer.toString(y);  
             }
        return getRangeNew; 
    }

    public static String getEvenNumbers(int start, int stop) {
        String getEvenNumbers = "";
        for (int y=start; y < stop; y++){ //adding different steps, "+=" to the input
             if(y%2==0)
            getEvenNumbers = getEvenNumbers + Integer.toString(y);  
             }
        return getEvenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String getOddNumbers = "";
        for (int y=start; y < stop; y++){ //adding different steps, "+=" to the input
             if(y%2!=0)
            getOddNumbers = getOddNumbers + Integer.toString(y);  
             }
        return getOddNumbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String getExponentiationsNumbers = ""; 
        for (int y=start; y <= stop; y++){
           double exPo = Math.pow(y, exponent); //declare double, contain formula in a variable
        getExponentiationsNumbers = getExponentiationsNumbers + Integer.toString((int)exPo);// add variable within the string Integer w/ new variable.
    }
        return getExponentiationsNumbers;
    }
}
