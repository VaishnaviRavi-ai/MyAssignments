package org.testleaf.week1.day2;

public class FindOddNumbersClassroom{
    
    public static void main(String[] args) {
        for (int maxRange = 1; maxRange <=10; maxRange++) {

            if(maxRange%2==0){
                continue;

            }

            System.out.println("The first Method "+maxRange);
        }

        for (int maxRange = 1; maxRange <=10; maxRange++){

            if(maxRange%2!=0){
            
                System.out.println("The second method "+maxRange); 

            }

        }
        
    }

}
