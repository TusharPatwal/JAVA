// 14. WAP to implement Run time polymorphism or (Dynamic Method Dispatch).

class Stocks {
    double dividendYield() {
        return 0;
    }
}

class Nalco extends Stocks {
    double dividendYield() {
        return 8.52;
    }

}

class Recltd extends Stocks {
    double dividendYield() {
        return 10.06;
    }

}

public class Labwork_14 {
    public static void main(String[] args) {

        Stocks s; // Reference Variable creation
        s = new Nalco();
        System.out.println("Dividend Yield for National Aluminium Co Ltd is " + s.dividendYield());
        s = new Recltd();
        System.out.println("Dividend Yield for REC Ltd is " + s.dividendYield());
    }
}
