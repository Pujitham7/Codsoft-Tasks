import java.util.*;
public class GradeCaluclator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();
        int Total=0;
        System.out.println("Enter the marks obtained for each subject :");
        for(int i=0;i<n;i++){
            Total+=sc.nextInt();
        }
        System.out.println("total marks:" +Total);
        double pc=(Total)/n;
        System.out.println("Your Average Percentage:"+pc+ "%");

        if(pc>=90){
            System.err.println("Grade Obtained: A");
        }else if(pc>=80 &&pc<90){
            System.out.println("Grade obtained: B");
        }else if(pc>=70 &&pc<80){
            System.out.print("Grade Obtained: c");
        }else if(pc>=60 && pc<70){
            System.out.println("Grade Obtained: E");
        }else{
            System.out.println("Grade Obtained: F");
        }
        
    }
}