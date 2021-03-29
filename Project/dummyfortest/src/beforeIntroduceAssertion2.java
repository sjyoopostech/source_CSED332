public class beforeIntroduceAssertion2 {
    private int x;
    private int y;

    public void INA(beforeIntroduceAssertion2 p, beforeIntroduceAssertion2 q, int num) {
        if (num == 1) num += 1;
        if (num == 0) {
            num = 1;
        }
        else {
            p.setX(0);
            q.setX(1);
        }
        num = 1;
    }

    public void setX(int num) {
        this.x = num;
    }
}