//                      Interface Variables 

interface costomerAnsh {
    int amt = 5; // public + static + final

    void purchase(); // public + abstract
}

class sellerTushar implements costomerAnsh {
    @Override
    public void purchase() {
        System.out.println("Tushar needs " + amt + " kg rice.");
    }
}

class Check {
    public static void main(String[] args) {

        costomerAnsh obj = new sellerTushar();
        obj.purchase();
        System.out.println(costomerAnsh.amt);
    }
}