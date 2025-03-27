package javaTesting.Resources;

public class AppParameters {

    public static final String DOMAIN = "127.0.0.1";
    public static final String PORT = "80";
    //public static final Object BD_CON = new ClasseConexionBBDD();

    //public static Object MESSAGES_TRANSLATIONS;

    //implementar SINGLETON PATTERN
    private static AppParameters instance;
   // private static final AppParameters instance = new AppParameters();

    private AppParameters(){

    }

    private void initApp(){
        //codigo necesario para la inicializacion de la app
    }
    public void resetApp(){
        //codigo para la reconfiguracion de la app
    }

    public static AppParameters getInstance(){
        if (instance == null) instance = new AppParameters();
        return instance;
    }

    public static String deployedURL(){
        return "https://"+ DOMAIN + ":" + PORT;
    }
}
