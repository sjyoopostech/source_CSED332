import java.util.Date;

public class beforeIntroduceForeignMethodAction3 {
    Date previousEnd;

    void sendReport() {
        Date nextDay = new Date(previousEnd.getYear(), previousEnd.getMonth(), 1);
    }
}