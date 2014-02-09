package union.codebreakers.exception;

/**
 * Exception which is thrown whenever a method gets unexpected input
 * 
 * @author polakl
 */
public class ExceptionUnexpectedInput extends RuntimeException{
    
    /*
     * Constructor
    */
    public ExceptionUnexpectedInput(String msg ) {
        super( msg );
    }
}
