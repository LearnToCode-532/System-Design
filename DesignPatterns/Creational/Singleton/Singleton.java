package DesignPatterns.Creational.Singleton;

public final class Singleton {
    private static volatile Singleton instance;

    public String value;

    private Singleton(String classAttr) {
        this.value = classAttr;
    }

    public static Singleton getInstance(String classAttr) {
        if (instance != null)
            return instance;
        synchronized(Singleton.class) {
            if (instance == null)
                instance = new Singleton(classAttr);
        }
        return instance;
    }
}
