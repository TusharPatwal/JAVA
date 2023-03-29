//                                      Interface Methods

interface ClientSharma{

    void webDesign();
    void webDevelope();
}

abstract class MTech implements ClientSharma{

    public void webDesign(){

        // @Override
        System.out.println("Green, top menu, three dot button");

    }
}
class NTech extends MTech{

    public void webDevelope(){

        // @Override
        System.out.println("html, css, javascript");

    }
}
class InterfaceMethod{

    public static void main(String[] args) {
        
        NTech obj = new NTech();
        
        obj.webDesign();
        obj.webDevelope();
    }
}