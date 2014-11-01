package editor.menu.commands;

import java.io.IOException;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;
import pt.utl.ist.po.ui.InputInteger;
import pt.utl.ist.po.ui.InvalidOperation;

import editor.core.Editor;
import editor.core.Circle;
import editor.menu.EditorMenu;
import editor.menu.MenuEntries;

/**
 * Command for creating circles.
 * 
 * @author Programação com Objectos
 * @version 3.0
 */
public class CreateCircle extends Command<Editor> {

    /**
     * Constructor.
     * 
     * @param editor the target editor.
     */
    public CreateCircle(Editor editor) {
	super(MenuEntries.CREATE_CIRCLE, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() throws InvalidOperation {
	Form f = new Form(title());
	InputInteger radius = new InputInteger(f, "Radius? ");
	InputInteger x = new InputInteger(f, "X coordinate? ");
	InputInteger y = new InputInteger(f, "Y coordinate? ");

	f.parse();

	Circle c = new Circle(entity(), x.value(), y.value(), radius.value());
	Display d = new Display(title());

	d.add("-------- NEW OBJECT --------");
	d.addNewLine("Circle #" + c.getId());
	d.addNewLine("----------------------------");
	d.display();

	((EditorMenu)menu()).showOptionsNonEmptyEditor();
    }
}
