package gr.aueb.cf.ch14.services;

public class CodingFactoryLazy {

    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy() {

    }

    //Lazy instantiation: Δημιουργία του μοναδικού αντικειμένου μόνο όταν χρειάζεται
    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
