package yummy;

public class Fruits {
    int cherry;
    int banana;
    int strawberry;

    public Fruits(int cherry, int banana, int strawberry) {
        this.cherry = cherry;
        this.banana = banana;
        this.strawberry = strawberry;
    }

    void numberFruits(){
        int m = cherry + banana + strawberry;
        System.out.println(m);
    }

    // перевизначення
    int numberFruits1(int cherry){
        int m = cherry + (int)banana + (int)strawberry;
        return  m;
    }

    void numberFruits1(){
        int m1 = cherry + strawberry;
        System.out.println(m1);
    }

}
