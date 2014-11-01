package editor.menu.commands;

import java.io.IOException;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;
import pt.utl.ist.po.ui.InputInteger;

import editor.core.Editor;
import editor.menu.EditorMenu;
import editor.menu.MenuEntries;
import editor.menu.NoSuchFormException;

/**
 * Command for removing a form.
 * 
 * @author Programação com Objectos
 * @version 3.0
 */
public class Remove extends Command<Editor> {
    /**
     * Constructor.
     * 
     * @param editor the target editor.
     */
    public Remove(Editor editor) {
	super(MenuEntries.REMOVE_FORM, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() throws NoSuchFormException {
	InputInteger id = null;

	Form f = new Form(title());
	id = new InputInteger(f, "Form to remove? ");
	f.parse();
	
	if (entity().formExists(id.value())) {
	    entity().remove(id.value());
	} else {
	    throw new NoSuchFormException("Form #" + id.value() + " does not exist");
	}

	if (entity().length() == 0) { // editor is empty
	    ((EditorMenu)menu()).hideOptionsEmptyEditor();
	}
    }
}
