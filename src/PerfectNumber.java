import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int nbr,total=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        nbr=input.nextInt();

        for(int i=1;i<nbr;i++){
            if(nbr%i==0){total+=i;}
        }
        if(total==nbr){
            System.out.println(nbr+" Mükemmel sayıdır.");
        }
        else{System.out.println(nbr+" Mükemmel sayı değildir.");}
    }
}
