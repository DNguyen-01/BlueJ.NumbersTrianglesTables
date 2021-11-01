 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String results = "";
        for(int y = 0; y < numberOfStars; y++){
            results = results + "*"; //<- *
        }
        return results;
    }
    
    public static String getTriangle(int numberOfRows) {
        String results = "";
        String currentRow = ""; //track the rows / declaring the tracking of the additional row
        for(int y = 0; y < numberOfRows; y++){
           currentRow = currentRow + "*"; //<- current row track
            //currentRow = getRow(y+1); // referencing the previous method + 1 to start at 1 and not 0;
            results = results + currentRow + "\n"; //<-- this gives the command to start new line
        }
        return results;
    }


    public static String getSmallTriangle() { //method to get the triangle
        //i would want the triangle to increase by 1 until it bottoms out at 4. 
        String results = getTriangle(4); // reference rows and stars so that we can just set the parameters
        return results;
    }

    public static String getLargeTriangle() {
        String results = getTriangle(9);
        return results;
    }
}
