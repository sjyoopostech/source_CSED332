public class beforeConsolidateCondExpr3 {
    public boolean CCE() {
        int num = 1;
        if (num == 1) return true;
        else if (num == 2) return true;
        return false;
    }

    public boolean CCE2() {
        int num = 0;
        if (CCE()) return true;
        else if (num == 2) return true;
        else return true;
    }
}