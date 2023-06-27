class X {
    X show() {
        System.out.println("method of x");
        return this;
    }
}

class Y extends X {
    Y show() {
        super.show();
        System.out.println("method of y");
        return this;
    }
}

class CovarientReturnType {
    public static void main(String[] args) {
        Y a = new Y();
        a.show();
    }
}
