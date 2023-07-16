package Arrays;

public class Wave_Print_the_Matrix {

	public static void main(String[] args) {
		int[][] matrix=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		wavePrintMatrix(matrix,matrix[0].length,matrix.length);

	}

	private static void wavePrintMatrix(int[][] matrix, int n, int m) {

		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(matrix[j][i]+" ");
				}
			}
			else {
				for(int j=m-1;j>=0;j--)
				{
					System.out.print(matrix[j][i]+" ");
				}
			}
		}
		
	}

}
