public class OutOfOrderState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("Machine is out of order. Cannot select items.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, int amount){
        System.out.println("Machine is out of order. Cannot insert coins.");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("Machine is out of order. Cannot dispense items.");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("Machine is already out of order.");
    }
}