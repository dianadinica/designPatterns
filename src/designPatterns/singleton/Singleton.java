package designPatterns.singleton;

public class Singleton {
    private static volatile Singleton instance;
    public static int nrOfInstances;

    private Singleton() {
        System.out.println("Din constructorul default Singleton()");
        nrOfInstances++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
