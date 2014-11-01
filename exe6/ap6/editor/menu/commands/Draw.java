package editor.menu.commands;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;

import editor.core.Editor;
import editor.core.Form;
import editor.menu.MenuEntries;

/**
 * Command for drawing all forms held by the editor.
 * 
 * @author Programação com Objectos
 * @version 3.0
 */
public class Draw extends Command<Editor> {
    /**
     * Constructor.
     * 
     * @param editor the target editor.
     */
    public Draw(Editor editor) {
	super(MenuEntries.DRAW_ALL, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
	Display d = new Display(title());

	d.add("-------- FORMS --------");
	for (Form f : entity().forms()) {
	    d.addNewLine(f.draw());
	}

	d.addNewLine("----------------------------");
	d.display();
    }
}
