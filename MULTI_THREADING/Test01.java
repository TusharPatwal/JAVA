// Java Thread Example by extending Thread class

class Test01 extends Thread {
    public void run() {
        System.out.println("Thread class ... ");
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        t.start();
    }
}
