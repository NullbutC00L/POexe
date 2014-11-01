package editor.menu.commands;

import java.util.*;
import java.io.IOException;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;

import editor.core.Point;
import editor.core.Editor;
import editor.menu.MenuEntries;
import editor.menu.NoSuchFormException;

public class Comando extends Command<Editor>{
	
	private int count,i=1;
	private static int[] group={47,77924,77969,77992};



	public Comando(Editor editor) {

	super(MenuEntries.COMANDO_ORIGIN, editor);
    }

    public static int[] obtemAutoria(){
    	return group;
    };


    @Override
    public final void execute(){

	Display np = new Display(title());
	Point pont = new Point(0,0);
	np.add("---------FORMS--------");
 		for(;i<(entity().length())+1;i++){

        if(entity().getForm(i).getOrigin().equals(pont)){
        	count++;
        }   
    }
    	np.addNewLine("o numero de formas com um ponto na origem e: "+count);
        np.display();


	}
}