public class Container {
    private int amountInContainer;

    public Container() {
        this.amountInContainer = 0;
       }

    public int contains() {
        return this.amountInContainer;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        amountInContainer += amount;
        if (amountInContainer > 100) {
            amountInContainer = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (amountInContainer < amount) {
            amountInContainer = 0;
        } else {
            amountInContainer -= amount;
        }
    }

    @Override
    public String toString() {
        return this.amountInContainer + "/100";
    }
}
