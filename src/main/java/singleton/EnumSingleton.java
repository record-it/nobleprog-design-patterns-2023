package singleton;
public enum EnumSingleton
{
    SINGLETON("jdbc:xxx");

    EnumSingleton(String connectionString){
        this.connectionString = connectionString;
    }

    private String connectionString;

    public void connect(){
        // kod połączenia z bazą
    }

    public static  EnumSingleton getInstance(){
        return SINGLETON;
    }
}
