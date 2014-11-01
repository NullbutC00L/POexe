package editor.menu;

import editor.core.Editor;
import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Menu;
import static pt.utl.ist.po.ui.UserInteraction.IO;

/**
 * Forms editor application: allows the creation and manipulation of
 * graphical forms such as squares, circles, and lines.
 * Forms can be created, moved, and deleted. The options for draw the forms,
 * moving and removing a form are only visible if the editor has at least one
 * form.
 * 
 * @author Programação com Objectos
 * @version 3.0
 */
public class EditorMenu extends Menu {

    /**
     * Constructor
     */
    public EditorMenu(Editor edt) {
	super(editor.menu.MenuEntries.TITLE, new Command<?>[] {
		new editor.menu.commands.CreateSquare(edt),
		    new editor.menu.commands.CreateCircle(edt),
		    new editor.menu.commands.CreateLine(edt),
		    new editor.menu.commands.Move(edt),
		    new editor.menu.commands.Remove(edt),
		    new editor.menu.commands.Draw(edt),
		    new editor.menu.commands.ShowTotal(edt),
		    new editor.menu.commands.Comando(edt),
		    });

	entry(3).invisible();
	entry(4).invisible();
	entry(5).invisible();
    }

    /**
     * Show the options move, draw and erase. These options should not be shown when the editor
     * is empty.
     **/
    public void showOptionsNonEmptyEditor() {
	entry(3).visible();
	entry(4).visible();
	entry(5).visible();
    }

    /**
     * Hide the options that should not be shown when the editor is empty.
     **/
    public void hideOptionsEmptyEditor() {
	entry(3).invisible();
	entry(4).invisible();
	entry(5).invisible();
    }
}
