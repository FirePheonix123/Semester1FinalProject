public class Customer {
    private String pin;
    private String customerName;


    public Customer(String pin, String name){
        this.pin = pin;
        customerName = name;
    }
    public String getPin(){
        return pin;
    }
    public void setPin(String newPin) {
        pin = newPin;
    }
}