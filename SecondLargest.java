import java.util.*;
public class SecondLargest {
    public static void main(String [] args){
        int array[]={2,3,5,7,9};
        if(array.length<2){
            System.out.println("Array must contain two elements");
            return;
        }
        int largest =Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondlargest=largest;
                largest=array[i];
            }
            else if(array[i] > secondlargest && array[i]!= largest){
                secondlargest=array[i];
            }
        }
        if(secondlargest == Integer.MIN_VALUE) {
            System.out.println("There's no distinct second largest element");
        }
        else{
            System.out.println("Second Largest Element is: "+ secondlargest);
        }
    }   
}