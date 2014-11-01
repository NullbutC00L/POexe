package editor.menu.commands;

import java.io.IOException;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;
import pt.utl.ist.po.ui.InputInteger;

import editor.core.Editor;
import editor.menu.MenuEntries;
import editor.menu.NoSuchFormException;

/**
 * Command for moving a form.
 * 
 * @author PO
 * @version 3.0
 */
public class Move extends Command<Editor> {
    /**
     * Constructor.
     * 
     * @param editor the target editor.
     */
    public Move(Editor editor) {
	super(MenuEntries.MOVE_FORM, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() throws NoSuchFormException {
	InputInteger id = null;

	Form f = new Form(title());
	id = new InputInteger(f, "Form to move? ");
	f.parse();

	if (entity().formExists(id.value())) {
	    InputInteger x, y;
	    f = new Form("Move form "+id.value()+" to");
	    x = new InputInteger(f, "X offset? ");
	    y = new InputInteger(f, "Y offset? ");
	    f.parse();

	    editor.core.Form form = entity().getForm(id.value());
	    if (form != null)  // should not happen
		form.move(x.value(), y.value());
	} else {
	    throw new NoSuchFormException("Form #" + id.value() + " does not exist");
	}
    }
}
