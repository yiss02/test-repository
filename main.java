import java.util.Arrays;
class main{ // Sommes des plus petites valeurs positives des lignes de T.
		public static void main(String[] args){
			int[][] T = {{-1,0,2,3}, {-5,-3,-2,-1}, {-1,1,3,4}};
			System.out.println("tableau T : ");
			afficher(T);
			System.out.printf("Somme des plus petites valeurs positives de ses lignes : %d\n",
				sppvpl(T)
			);
		}
		static int sppvpl(int[][] T){ int m = T.length, n = T[0].length;
			int s = 0; // somme des valeurs plus petites val. positives des lignes de T
			for(int i=0; i<m; i++){
                int k=0;
                for(int j=0; j<n; j++){
                    if(T[i][j]<=0)k++;
                }
                if(k<n){
					s += T[i][k];
				}
            }
			return s; 		
		}
		// Fonction annexe : afficher T
		static void afficher(int[][] T){ int m = T.length;
			for (int i = 0; i < m; i++)
				System.out.println(Arrays.toString(T[i]));
		}	
}
/* compilation et exécution dans un terminal Unix.
% javac Exercice2.java
% java Exercice2
tableau T : 
[-1, 0, 2, 3]
[-5, -3, -2, -1]
[-1, 1, 3, 4]
Somme des plus petites valeurs positives de ses lignes : 3
% 

*/
