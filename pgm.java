import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class pgm 
{

	public abstract void flip_horizontally()
	{
		int [][] horizdata = new int[width][height];
		for(int k = 0; k < width;k++){
			
			for(int l = height - 1;l > -1; l--){
				int numzero = 0;
				horizdata[k][numzero] = data[k][l];

				//System.out.print(horizdata[k][numzero] + " ");
				numzero += 1;
			}
			
			//System.out.println("");
		}
	}

	public abstract void flip_vertically()
	{
			int [][] vertdata = new int[width][height];
		
			for(int m = width - 1; m > -1;m--)
			{
				for(int n = 0; n < height; n++)
				{
					vertdata[m][n] = data[m][n];
					//System.out.print(vertdata[m][n] + " ");
				}
				//System.out.println(" ");
			}
	}

	public abstract void rotate_right_90()
	{
		int [][] vertdata = new int[height][width];
		
		for(int m = 0; m < height;m++)
		{	
			for(int n = width - 1; n > -1; n--)
			{
				vertdata[m][n] = data[n][m];
				//System.out.print(vertdata[m][n] + " ");
			}
			//System.out.println(" ");
			
		}

	}
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("pgmfile.txt"));
		String magic = sc.nextLine();

		String matr = sc.nextLine();
		String[] splitmatr = matr.split("\\s+");
		//System.out.println(splitmatr[0] + "//////" + splitmatr[1]);
		int width = Integer.parseInt(splitmatr[1]);
		int height = Integer.parseInt(splitmatr[0]);
		int scale = sc.nextInt();
		//System.out.println(scale);
		int [][] data = new int[width][height];

		for(int i = 0; i < width;i++)
		{
			for(int j = 0; j < height;j++)
			{
			data[i][j] = sc.nextInt();
			//System.out.print(data[i][j] + " ");
			}
			//System.out.println(" ");
		}
		//System.out.println("");
		
	}
}