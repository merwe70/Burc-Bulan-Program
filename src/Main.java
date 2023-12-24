import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int months,day ;

        Scanner input=new Scanner(System.in);
        System.out.println("Kaçıncı ayda doğdunuz? ");
        months=input.nextInt();

        System.out.println("Hangi gün doğdunuz? ");
        day = input.nextInt();

        if(months == 1 ) {
            if ((day >= 1) && (day <31)){
                if(day < 22){
                    System.out.println("Burcunuz Oğlak");
                }
                else {
                    System.out.println("Burcunuz Kova");
                }
            }
        }
        if (months == 2 ){
            if ((day >=1 ) && (day <=28)){
                if(day < 20){
                    System.out.println("Burcunuz Kova");
                }
                else {
                    System.out.println("Burcunuz Balık");
                }
            }

        }
        if (months == 3) {
            if ((day >1) && (day <31 )){
                if (day <21 ){
                    System.out.println("Burcunuz Balık");
                }
                else{
                    System.out.println("Burcunuz Koç");
                }
            }
        }
        if (months == 4) {
            if ((day > 1) && (day < 30)){
                if (day < 21){
                    System.out.println("Burcunuz Koç");
                }
                else {
                    System.out.println("Burcunuz Boğa");
                }
            }
        }
        if (months == 5){
            if ((day >1) && (day < 31)){
                if (day < 22){
                    System.out.println("Burcunuz Boğa");
                }
                else {
                    System.out.println("Burcunuz İkizler");
                }
            }
        }
        if (months == 6){
            if ((day > 1) && (day < 30)){
                if (day < 23 ){
                    System.out.println("Burcunuz İkizler");
                }
                else{
                    System.out.println("Burcunuz Yengeç");
                }
            }
        }
        if (months == 7){
            if((day > 1) &&(day <31)){
                if (day < 23 ){
                    System.out.println("Burcunuz Yengeç");
                }
                else {
                    System.out.println("Burcunuz Aslan");
                }
            }
        }
        if (months == 8){
            if ((day > 1) && (day < 30)){
                if (day < 23){
                    System.out.println("Burcunuz Aslan");
                }
                else {
                    System.out.println("Burcunuz Başak");
                }
            }
        }
        if (months == 9){
            if((day > 1) && (day <31 )){
                if (day <22){
                    System.out.println("Burcunuz Başak");
                }
                else {
                    System.out.println("Burcunuz Terazi");
                }
            }
        }
        if (months == 10){
            if ((day > 1) && (day <30)){
                if (day < 22){
                    System.out.println("Burcunuz Terazi");
                }
                else {
                    System.out.println("Burcunuz Akrep");
                }
            }
        }
        if (months == 11) {
            if ((day > 1) && (day < 31)) {
                if (day < 22) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            }
        }
        if (months == 12) {
            if ((day > 1) && (day < 30)) {
                if (day < 22) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oğlak");
                }
            }
        }
    }
}