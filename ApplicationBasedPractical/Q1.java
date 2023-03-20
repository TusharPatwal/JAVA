// Create a class employee which have name, age and address of employee, include methods getData() and showData(). Get data takes the input from the user. So data displays the data in the following format. 
// Name:
// Age:

class Employee{
    String name, address;
    int age;

    public void getData(String n, int a, String addr){
        name = n;
        age = a;
        address = addr;
    }
    public void showData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);

    }
}
class Q1{
    public static void main(String[] args) {
    Employee obj = new Employee();

    obj.getData("Tushar", 20, "Burari");
    obj.showData();
}
}