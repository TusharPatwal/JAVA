// 9. WAP to implement method over ridding & method overloading.

class Loading{
    void show(){
        System.out.println("Loading class show func");
    }
    void show(String name,int age){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }
}
class Riding extends Loading{
    void show(){
        System.out.println("Riding class show func");
    }
}

class Labwork_10 {
    public static void main(String[] args) {
        Loading obj1 = new Loading();
        obj1.show();
        obj1.show("Tushar", 20);

        Riding obj2 = new Riding();
        obj2.show();
    }
}
