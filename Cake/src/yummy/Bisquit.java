package yummy;

public class Bisquit {
    double layer1;
    double layer2;
    double layer3;

    public Bisquit(double layer1, double layer2, double layer3) {
        this.layer1 = layer1;
        this.layer2 = layer2;
        this.layer3 = layer3;
    }

    void number(){
        double sum = layer1 + layer2 + layer3;
        System.out.println(sum);
    }

    // Перевизначення
    int number1(int layer1){
        int sum = layer1 + (int) layer2 +(int)layer3;
        return sum;
    }

    double square(int rad){
        double n=(3.14*(rad^2))*3;
        return n;
        }

        double volumeBisquit(){
        double v = (square(22)*5);
        return v;
        }

    void number(int layer2) {
        double dod = layer1 + layer2;
        System.out.println(dod);
    }
}
