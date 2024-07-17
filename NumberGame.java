import java.util.*;
public class NumberGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=10;
        int n=(int)(Math.random()*100)+1;
        int a=0;
        int b=0;
        int score=0;
        System.out.println("Lets play the game:");
        System.out.println("enter the number between 1 to 100");
        int g=0;
        while(a<max){
            g=sc.nextInt();
            if(g<n){
                System.out.println("Oop!! To Low,Try Again.");
                a++;
            }else if(g>n){
                System.out.println("Oops!! Too High,Try Again");
                a++;
            }
            if(g==n){
                score++;
                System.out.println("Great!! you got it.");
                System.out.println("congratulations!! Your Score:"+score);
                b++;
            }else if(a==max){
                System.out.println("Sorry!! your attempts are completed:");
                if(score!=0){
                    System.out.println("Congratulation!! your score:"+score);
                    }else{
                        System.out.println("Sorry your score:"+score);
                        }
                        b++;
                }if(b!=0){
                System.out.println("Do you want to play again ? if yes press y/ for no press n:");
                String s=sc.next();
                if(s.equals("y")){
                    a=0;
                    b=0;
                    n=(int)(Math.random()*100)+1;
                    System.out.println("Enter the number between 1 to 100:");
                }else{
                    System.out.println("Congratulations!! your final score:"+score);
                    break;
                    
                }
                }
           
        }
    }
}
