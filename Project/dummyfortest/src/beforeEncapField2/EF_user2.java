package beforeEncapField2;

public class EF_user2 {
    private EF_owner o;

    public int method1(){
        EF_owner o2 = new EF_owner(){
            public void method1()
            {
                System.out.println("Subclass");
            }
        };

        return o2.value;
    }
}
