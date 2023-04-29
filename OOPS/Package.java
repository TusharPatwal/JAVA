// package creation in java
package myPackage;

class Package {
    public void show(){
        System.out.println("This is a package");
    }
    public static void main(String[] args) {
        Package obj1 = new Package();
        obj1.show(); 
    }
}