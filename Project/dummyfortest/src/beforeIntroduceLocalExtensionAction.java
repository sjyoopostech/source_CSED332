import java.util.Date;

public class beforeIntroduceLocalExtensionAction {
    Date previousEnd = new Date(2020, 11, 1);

    void sendReport() {
        Date nextDay = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }
}