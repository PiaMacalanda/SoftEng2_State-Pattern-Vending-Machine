public class ItemSelectedState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("Item already selected. Please, insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount){
        machine.addBalance(amount);
        System.out.println("Coin inserted. Balance: " + machine.getBalance());
        if (machine.getBalance() >= machine.getItemPrice()) {
            machine.setState(new DispensingState());
            machine.dispenseItem();
        }
    }

    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("Please, insert enough coind to dispense item.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("Sorry, machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}