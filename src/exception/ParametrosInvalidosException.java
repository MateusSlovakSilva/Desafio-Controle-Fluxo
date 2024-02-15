package exception;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException () {
        super("O Segundo Parâmetro deve ser maior que o primeiro.");
    }

}
