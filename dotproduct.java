package ödev1;

import java.util.Random;

public class dotproduct{

	public static void main(String[] args) {
        int size = 3; 
        double[] vectorA = new double[size];
        double[] vectorB = new double[size];
        Random rand = new Random();


        for (int i = 0; i < size; i++) {
        	
                    
        	                   vectorA[i] = rand.nextDouble(); 
            
        	                   
        	                          vectorB[i] = rand.nextDouble(); 
        }

                          
   double dotProduct = 0.0;
        for (int i = 0; i < size; i++) {
            dotProduct += vectorA[i] * vectorB[i];
        }

        
        System.out.println("Sum of Dot Product: " + dotProduct);
    }
}