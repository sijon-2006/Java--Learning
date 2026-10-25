/* 
//Task 1 – Selection Sort (Ascending)
//Problem-Write a Java program to sort an array in ascending order using Selection Sort:-
public class Day36{
    public static void main(String[] args){
        int[] a={10,2,4,1,8};

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
    }
}



//Task 2 – Selection Sort (Descending)
//Problem-Sort an array in descending order using Selection Sort:-
public class Day36{
    public static void main(String[] args){
        int[] a={10,2,4,1,8};

        for(int i=0;i<a.length-1;i++){
            int max=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[max]){
                    max=j;
                }
            }
            int temp=a[i];
            a[i]=a[max];
            a[max]=temp;
        }
        System.out.println("Sorted Array in Descending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
    }
}



//Task 3 – User Input Selection Sort
//Problem-Take the array size and elements from the user.
import java.util.*;
public class Day36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 Elements:");
        int[] a=new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}



//Task 4 – Count Total Comparisons
//Problem-Count the total number of comparisons performed during Selection Sort:-
public class Day36{
    public static void main(String[] args){
        int[] a={11,9,8,7,6,1};
        int count=0;

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                count++;
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
        System.out.println("Number of Comparision:"+count);
    }
}
    


//Task 5 – Count Total Swaps
//Problem-Display the total number of swaps performed:-
public class Day36{
    public static void main(String[] args){
        int[] a={11,9,8,7,6};
        int count=0;

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=0){ 
              int temp=a[i];
              a[i]=a[min];
              a[min]=temp;
              count++;
            }
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int num:a){
            System.out.println(num+" ");
        }
        System.out.println("Number of Swaps:"+count);
    }
}





//Task 6 – Print Array After Every Pass
//Problem-Display the array after each pass:-
public class Day36{
    public static void main(String[] args) {
        int[] a={20,10,50,30,40};

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;

            System.out.println("Pass:"+(i+1));
            for(int k=0;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println("\n");
        }
    }
}
    



//Task 7 – Find Minimum Element Using Selection Logic
//Problem-Without sorting the array, find only the smallest element using the same logic used in Selection Sort:-
import java.util.*;
public class Day36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 Elements:");
        int [] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i=1;i<a.length;i++){
          if(a[i] < min){
          min = a[i];
          }
        }
        System.out.println(min);        
        sc.close();
    }
}




//Task 8 – Selection Sort with Duplicate Elements
//Problem-Sort an array containing duplicate values:-
import java.util.*;
public class Day36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 Elements (Duplicate Elements can be entered):");
        int[] a=new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
    


//Task 9 – Sort Student Marks
//Problem-Sort student marks in ascending order:-
import java.util.*;
public class Day36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Students Marks:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("\n");
        System.out.println("Marks are Sorted:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<a.length;){
            System.out.println("Lowest Mark:"+a[0]);
            System.out.println("Highest Mark:"+a[a.length-1]);
            break;
        }
        sc.close();
    }
}
    


//Task 10 – Sort Names Alphabetically
//Problem-Sort an array of strings alphabetically using Selection Sort:-
import java.util.*;
public class Day36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Names:");
        String[] a =  new String[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextLine();
        }

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j].compareTo(a[min])<0){
                    min=j;
                }
            }
            String temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("Names are Sorted in Alphabetic Order:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
    */



//Challenge Program - Sort Employee Salaries:-
import java.util.*;
public class Day36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Employee Salary:");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("\n");
        System.out.println("Salary are Sorted:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<a.length;){
            System.out.println("Lowest Salary:"+a[0]);
            System.out.println("Highest Salary:"+a[a.length-1]);
            break;
        }
        sc.close();
    }
}