public class VendingMachine {

    private VendingMachineState state;
    private int inventory;
    private int balance;
    private final int itemPrice = 10;

    public VendingMachine(int inventory){
        this.inventory = inventory;
        this.balance = 0;
        this.state = new IdleState();
    }

    public void setState(VendingMachineState state){
        this.state = state;
    }

    public void selectItem(){
        state.selectItem(this);
    }

    public void insertCoin(int amount){
        state.insertCoin(this, amount);
    }

    public void dispenseItem(){
        state.dispenseItem(this);
    }

    public void setOutOfOrder(){
        state.setOutOfOrder(this);
    }

    public int getBalance(){
        return balance;
    }

    public void addBalance(int amount){
        balance += amount;
    }

    public void resetBalance(){
        balance = 0;
    }

    public void refundBalance(){
        System.out.println("Refunding: " + balance);
        balance = 0;
    }

    public int getInventory(){
        return inventory;
    }

    public void decreaseInventory(){
        inventory--;
    }

    public int getItemPrice(){
        return itemPrice;
    }
}
