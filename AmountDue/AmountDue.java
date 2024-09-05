public class AmountDue {
    public double computeAmountDue(double price) {
        double addTax = price * 0.12;
        double totalDue = price + addTax;
        return totalDue;
    }

    public double computeAmountDue(double price, int quantity) {
        double addTax = price * 0.12;
        double totalDue = (price * quantity) + addTax;
        return totalDue;
    }

    public double computeAmountDue(double price, int quantity, int discount) {
        double addTax = price * 0.12;
        double totalDue = ((price * quantity) - discount) + addTax;
        return totalDue;
    }
}