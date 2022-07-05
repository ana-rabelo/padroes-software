package Singleton.Logger;

public class Logger {
    private boolean ativo = false;
    // váriavel estática instanciada
    private static Logger instance = null;

    // construtor privado
    private Logger(){

    }

    // método estático getInstance
    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public boolean isAtivo(){
        return this.ativo;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public void log(String s){
        if(this.ativo){
            System.out.println("LOG :: " + s);
        }
    }
}
