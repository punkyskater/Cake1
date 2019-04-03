package yummy;

public class CakeMain {
    public static void main(String[] args) {

        Bisquit bisquit = new Bisquit(1, 1, 1);
        Cream cream = new Cream(80, 120, 100);
        Fruits fruits = new Fruits(30, 2, 15);

        bisquit.number();
        System.out.println(bisquit.number1(1) +" - к-сть коржів");
        System.out.println(bisquit.square(22)+" - площа коржа");
        System.out.println(bisquit.volumeBisquit()+" - об'єм коржа");

        cream.amountCream();
        System.out.println(cream.amountCream1()+" - вага крему (гр.)");

        fruits.numberFruits();
        System.out.println(fruits.numberFruits1(1)+" - загальна вага фруктів");

        double p = bisquit.volumeBisquit() + cream.amountCream1() + fruits.numberFruits1(1);
        System.out.println("Вага торту - " +p);

        if (p<500){
            System.out.println("\n"+"Ціна торту 50");
        }  else if (p<=1000){
            System.out.println("Ціна торту 80");
        } else{
            System.out.println("Ціна торту 100"+ "\n");
        }

        cream.amountCream(1);
        cream.amountCream(70);
        System.out.println(cream.amountCream(1)+" - перевизначення");

        bisquit.number(1);
        System.out.println(bisquit.number1(1)+" - перевизначення");

        fruits.numberFruits1(1);
        System.out.println(fruits.numberFruits1(1)+" - перевизначення");
    }
}