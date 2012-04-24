package graphoTools.guiEditor.controllers;

import java.awt.*;
import java.awt.event.*;
import graphoTools.guiEditor.graphicComponents.*;

public class KeyListenerEditor  implements KeyListener{
private GraphOTextualEditor editor;
public KeyListenerEditor(GraphOTextualEditor e){
editor = e;
}
@Override
public void keyPressed(KeyEvent e) {
	int code = e.getKeyCode();
	if (e.isControlDown()) {
		editor.getTextPaneEditor().setBackground(Color.lightGray);
		if (code == KeyEvent.VK_SPACE) {
			if (!(editor.getTextPaneEditor().getCaret().getMagicCaretPosition() == null)) {
					editor.popupCompletion.completion();
					editor.popupCompletion.show(editor.getTextPaneEditor(),editor.getTextPaneEditor().getCaret().getMagicCaretPosition().x+5,editor.getTextPaneEditor().getCaret().getMagicCaretPosition().y+13);
			}
		}
	}
	if (code == KeyEvent.VK_ESCAPE) {
		//popupCompletion.setVisible(false);
	}
	if (e.isControlDown()) {
		if (code == KeyEvent.VK_K) {
			//popupCompletion = new PopupCompletion(textPaneEditor);
			//if (!(textPaneEditor.getCaret().getMagicCaretPosition() == null)) {
				//CommandColoration coloration = new CommandColoration(textPaneEditor, "coloration");
				//coloration.execute();
			//}
		}
	}
	if (e.isControlDown()) {
		if (code == KeyEvent.VK_SHIFT) {
			//CommandInterpret ci = new CommandInterpret(textPaneEditor, "interpret");
			//ci.execute();
			editor.getTextPaneEditor().setBackground(Color.white);
		}
	}
}
@Override
public void keyReleased(KeyEvent e) {
	editor.getTextPaneEditor().setBackground(Color.white);
}
@Override
public void keyTyped(KeyEvent e) {
	editor.getTextPaneEditor().setBackground(Color.white);
}
}