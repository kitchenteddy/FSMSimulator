package union.codebreakers.exception;

/**
 * Exception which is thrown whenever a method gets unexpected input
 * 
 */
public class ExceptionUnexpectedInput extends RuntimeException{
    
    /*
     * Constructor
    */
    public ExceptionUnexpectedInput(String msg ) {
        super( msg );
    }
}
