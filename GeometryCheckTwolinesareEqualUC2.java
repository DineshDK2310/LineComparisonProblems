package LineComparison;

public class GeometryCheckTwolinesareEqualUC2 {
	public static void main(String[] args) {
		int x1=4,y1=10,x2=8,y2=15;
		int x3=7,y3=16,x4=23,y4=23;
		double length1=Math.sqrt( Math.pow((x2-x1),2)+ Math.pow((y2-y1),2) );
		double length2=Math.sqrt( Math.pow((x4-x3),2)+ Math.pow((y4-y3),2) );

		if (length1==length2) 
			System.out.println("The two lines are equal");
		else 
			System.out.println("The two lines are unequal");

	}
}
