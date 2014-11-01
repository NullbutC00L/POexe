package editor.menu;

import pt.utl.ist.po.ui.InvalidOperation;

/**
 * Exception for representing cases where a form does not exist (when it
 * should).
 * 
 * @author Programação com Objectos
 * @version 3.0
 */
public class NoSuchFormException extends InvalidOperation {

    /**
     * Serial number for serialization.
     */
    private static final long serialVersionUID = 4577917255267517902L;

    /**
     * Constructor.
     */
    public NoSuchFormException() {
	    // intentionally left empty
    }

    /**
     * Constructor.
     * 
     * @param message error string.
     */
    public NoSuchFormException(String message) {
	super(message);
    }
}
