import java.util.Scanner;

public class Gradesystem {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter First subject marks: ");
      int a = sc.nextInt();

      System.out.println("Enter second subject marks: ");
      int b = sc.nextInt();

      System.out.println("Enter third subject marks:" );
      int c = sc.nextInt();
    
      double total = a+b+c;
      double percentage = total/3;

      System.out.println("Total marks:" +total);
      System.out.println("Total percentage:" +percentage+"%");


    if (percentage >= 90){
        System.out.println("Grade A");
    } else if(percentage >=80){
        System.out.println("Grade B");
    } else if(percentage >=70){
        System.out.println("Grade C");
    } else if(percentage <=35){
        System.out.println("Grade D");
    } else{
        System.out.println("Fail");
    }

    sc.close();

}
}


      



      

    

