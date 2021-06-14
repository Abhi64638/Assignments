
public class Addition 
{
	public static void main(String[] args) 
	{
	int a[][]={{4,15,21},{23,34,13},{31,44,5}};    
	int b[][]={{12,12,25},{9,22,55},{19,11,15}};    
	int c[][]=new int[3][3];
	for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
				{    
					c[i][j]=a[i][j]+b[i][j]; 
					System.out.print(c[i][j]+" ");    
				}    
				System.out.println();
		}
	}
}
