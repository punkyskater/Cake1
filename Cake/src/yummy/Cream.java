package yummy;

public class Cream {
    double cherryCream;
    double chocolateCream;
    double sourCream;

    public Cream(double cherryCream, double chocolateCream, double sourCream) {
        this.cherryCream = cherryCream;
        this.chocolateCream = chocolateCream;
        this.sourCream = sourCream;
    }
    void amountCream(){
        double amount = cherryCream + chocolateCream + sourCream;
        System.out.println(amount);
    }

    // Перевизначення
    int amountCream(int cherryCream){
        int amount = cherryCream + (int) chocolateCream + (int) sourCream;
        return amount;
    }
    double amountCream1 (){
        double amount = cherryCream + chocolateCream + sourCream;
        return amount;
    }

    void amountCream(double chocolateCream){
        double amount2 = cherryCream + chocolateCream;
        System.out.println(amount2);
    }
}
