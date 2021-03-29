public class beforeInlineMethod6 {
    final int numberofLateDeliveries;

    public beforeInlineMethod6(int numberofLateDeliveries) {
        this.numberofLateDeliveries = numberofLateDeliveries;
    }

    void getRating() {
        moreThanFiveLateDeliveries(32);
    }

    void moreThanFiveLateDeliveries(int int_rand) {
        if (true == true) doSomething(33);
        else doSomething(int_rand);
    }

    void doSomething(int int_random)
    {
        return;
    }
}