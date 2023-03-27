
//5. WAP that creates a class Accounts with following details:Instance variables: ac_no., name, ac_name,
// balance .Methods: withdrawal(), deposit(),display().Use constructors to initialize members.

class Accounts{
    long accNo;
    String name;
    String accName;
    double balance;

    Accounts(long accNo, String name, String accName, double balance){
        this.accNo = accNo;
        this.name = name;
        this.accName = accName;
        this.balance = balance;
    }

    void withdrawal(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance -= amount;
            System.out.println("Successfully withdraw");
        }
    }
    void deposit(int amount){
        balance += amount;
        System.out.println("Added Successfully");
    }
    void display(){
        System.out.println("Account no: "+accNo);
        System.out.println("Account holder name: "+name);
        System.out.println("Account type: "+accName);
        System.out.println("Balance: "+balance);
    }
}

class Labwork_6 {
    public static void main(String[] args) {
        Accounts obj = new Accounts(98, "Tushar", "Saving", 909900900);
        obj.withdrawal(3000);
        obj.deposit(4000);
        obj.display();
    }    
}
