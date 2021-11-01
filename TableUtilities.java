 

public class TableUtilities {
    public static String getSmallMultiplicationTable() { //we are trying to nest a forLoop within a four(loop)
        /**
        String results = "";
        for(int row = 1; row <= 5; row++){
            for(int column = 1; column <= 5; column++){
                int product = row * column;
                results = results + String.format("%3d |",product); //%3d - conditional spacing
            }
            results = results + "\n"; //this is for formatting
        }
        
        return results; //short-way; since we established a para of tablesize
        */
        // we can reference table size in this results utilizing a previously establish method. 
        // It would look like this: 
        return getMultiplicationTable(5);
    } 

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10); 
        //because we have already made the get multiplicationTable dynamic
    }

    public static String getMultiplicationTable(int tableSize) {//helper method within the parameter
        String results = "";
        for(int row = 1; row <= tableSize; row++){
            for(int column = 1; column <= tableSize; column++){
                int product = row * column;
                results = results + String.format("%3d |",product); //%3d - conditional spacing
            }
            results = results + "\n"; //this is for formatting
        }
        return results;
    }
}
