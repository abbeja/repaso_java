import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
    //    System.out.println("hello world");
    String lluvia;
    Scanner sc=new Scanner(System.in);
    System.out.print("ta lloviendo: ");
    lluvia=sc.nextLine();
    if(lluvia.equals("si")){
        System.out.println("si llueve usa paraguas");
    }else{
        System.out.println("si no sali asi no mas");
    }

}
}
