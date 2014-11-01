package editor.menu.commands;

import java.io.IOException;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;
import pt.utl.ist.po.ui.InputInteger;
import pt.utl.ist.po.ui.InvalidOperation;

import editor.core.Editor;
import editor.core.Square;
import editor.menu.EditorMenu;
import editor.menu.MenuEntries;

/**
 * Command for creating squares.
 * 
 * @author Programação com Objectos
 * @version 3.0
 */
public class CreateSquare extends Command<Editor> {
    /**
     * Constructor.
     * 
     * @param editor the target editor.
     */
    public CreateSquare(Editor editor) {
	super(MenuEntries.CREATE_SQUARE, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() throws InvalidOperation {
	Form f = new Form(title());
	InputInteger side = new InputInteger(f, "Side? ");
	InputInteger x = new InputInteger(f, "X coordinate? ");
	InputInteger y = new InputInteger(f, "Y coordinate? ");

	f.parse();

	Square sq = new Square(entity(), x.value(), y.value(), side.value());
	Display d = new Display(title());

	d.add("-------- NEW OBJECT --------");
	d.addNewLine("Square #" + sq.getId());
	d.addNewLine("----------------------------");
	d.display();

	((EditorMenu)menu()).showOptionsNonEmptyEditor();
    }

}
