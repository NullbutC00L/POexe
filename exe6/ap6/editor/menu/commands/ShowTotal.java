package editor.menu.commands;

import java.io.IOException;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;

import editor.core.Editor;
import editor.menu.MenuEntries;
import editor.menu.NoSuchFormException;

/**
 * Command for showing the number of forms of the graphical editor.
 * 
 * @author PO
 * @version 3.0
 */
public class ShowTotal extends Command<Editor> {
    /**
     * Constructor.
     * 
     * @param editor the target editor.
     */
    public ShowTotal(Editor editor) {
	super(MenuEntries.SHOW_NUMBER_FORMS, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {

	// add code here
        Display d = new Display(title());
        d.add("---------FORMS--------");
 
            d.addNewLine(entity().length()+"");
        d.display();

    }
}
