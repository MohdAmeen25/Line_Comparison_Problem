public class LineComparison_using_OPPs_UC4 {
    public static void LineComparison(){
        int x1 = 2, x2 = 8;
        int y1 = 4, y2 = 8;

        int xAxis1 = 1 , xAxis2 = 8;
        int yAxis1 = 4 , yAxis2 = 8;

        Double lineLength1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        Double lineLength2 = Math.sqrt((xAxis2-xAxis1)*(xAxis2-xAxis1)+(yAxis2-yAxis1)*(yAxis2-yAxis1));

        System.out.println("First Line Length is "+lineLength1);
        System.out.println("Second Line Length is "+lineLength2);

        System.out.println(lineLength1.equals(lineLength2));

        if (lineLength1 > lineLength2) {
            System.out.println("Line-length 1 is less then " +lineLength1);
        }else if (lineLength1 < lineLength2) {
            System.out.println("Line-length1 is greater then " +lineLength2);
        }else {
            System.out.println("Both lines " + lineLength1 + " are equal " + lineLength2 );
        }
    }

    public static void main(String[] args) {
        LineComparison();
    }
}
