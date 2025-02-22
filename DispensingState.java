public class DispensingState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("Dispensing in progress. Please wait...");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount){
        System.out.println("Cannot insert coins during dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine machine){
        if (machine.getInventory() > 0) {
            machine.decreaseInventory();
            System.out.println("Item dispensed! Remaining inventory: " + machine.getInventory());
            machine.resetBalance();
            machine.setState(new IdleState());
        } 
        
        else {
            System.out.println("Out of stock! Refunding coins.");
            machine.refundBalance();
            machine.setState(new IdleState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("Machine is now out of order");
        machine.setState(new OutOfOrderState());
    }

}