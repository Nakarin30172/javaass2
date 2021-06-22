
public class lab13 {

	public static void main(String[] args) {
		int[][] twoD_Array = {
			     {1, 2, 3},{4, 5, 6, 7},{8, 9}
			   };
			   for (int[] row : twoD_Array) {
			     for (int element: row) {
			       System.out.println(element);
			     }

	}
			    int[] firstRow = twoD_Array[0];
			    int[] secondRow = twoD_Array[1];
			    int[] lastRow = twoD_Array[twoD_Array.length - 1];

			    //getting last element in each row
			    int lastItemInFirstRow = firstRow[firstRow.length - 1]; 
			    int lastItemInSecondRow = secondRow[secondRow.length - 1];
			    int lastItemInLastRow = lastRow[lastRow.length - 1]; 
			    System.out.println(lastItemInFirstRow + lastItemInSecondRow + lastItemInLastRow);
}
}