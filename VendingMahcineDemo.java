public class VendingMahcineDemo {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine(3);

        machine.selectItem();
        machine.insertCoin(5);
        machine.insertCoin(5);

        machine.selectItem();
        machine.insertCoin(10);

        machine.setOutOfOrder();
        machine.insertCoin(5);

        machine.dispenseItem();
    }
}