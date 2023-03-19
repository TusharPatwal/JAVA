// Write a program to demonstrate the concept of "this" keyword.


class Q4 {
    
    int a, b;
    public void setData(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void showData(){
        System.out.println("The value of a:" + a);
        System.out.println("The value of b:" + b);
    }
    public static void main(String[] args) {
        Q4 obj = new Q4();
        obj.setData(5,8);
        obj.showData();
    }    
}
