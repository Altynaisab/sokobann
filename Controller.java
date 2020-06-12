import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import javax.swing.*;
public class Controller implements ActionListener, KeyListener{
    Model model;
    JFrame rules = new JFrame();

    Controller(Viewer viewer) {
	model = new Model(viewer);
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
	   switch(command) {
		case "Level 1": model.desktop = model.levels.level1();model.initialization();model.viewer.updateCanvas();
		   break;
		case "Level 2": model.desktop = model.levels.level2();model.initialization();model.viewer.updateCanvas();
		   break;
		case "Level 3": model.desktop = model.levels.level3();model.initialization();model.viewer.updateCanvas();
		   break;
		case "Level 4": model.desktop = model.levels.level4();model.initialization();model.viewer.updateCanvas();
		   break;
		case "Level 5": model.desktop = model.levels.level5();model.initialization();model.viewer.updateCanvas();
		   break;
	}
    }
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent event) {
	int keyCode = event.getKeyCode();
	String direction = "";

	switch(keyCode) {
		case 39:
			direction = "Right";
		break;
		case 37:
			direction = "Left";
		break;
		case 38:
			direction = "Up";
		break;
		case 40:
			direction = "Down";
		break;
	}
	model.move(direction);
    }

    public void keyReleased(KeyEvent e) {
    }


}
