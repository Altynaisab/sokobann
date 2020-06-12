import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

  class Viewer{

      Canvas canvas;
      private JFrame frame;
      private JMenu levels;

        Viewer(){
        Controller controller = new Controller(this);
        canvas = new Canvas(controller.model);

        JMenuItem level1 = new JMenuItem("Level 1");
      	level1.addActionListener(controller);
      	level1.setActionCommand("Level 1");
      	JMenuItem level2 = new JMenuItem("Level 2");
      	level2.addActionListener(controller);
      	level2.setActionCommand("Level 2");
      	JMenuItem level3 = new JMenuItem("Level 3");
      	level3.addActionListener(controller);
      	level3.setActionCommand("Level 3");
      	JMenuItem level4 = new JMenuItem("Level 4");
      	level4.addActionListener(controller);
      	level4.setActionCommand("Level 4");
      	JMenuItem level5 = new JMenuItem("Level 5");
      	level5.addActionListener(controller);
      	level5.setActionCommand("Level 5");

      	JMenu levelsList = new JMenu("Levels");
      	levelsList.add(level1);
      	levelsList.add(level2);
      	levelsList.add(level3);
      	levelsList.add(level4);
      	levelsList.add(level5);


      	JMenuBar mBar = new JMenuBar();
      	mBar.add(levelsList);


    frame = new JFrame("SOKOBAN");
    frame.setSize(1100, 700);
    frame.setLocation(0, 0);
    frame.add("Center", canvas);
    frame.setJMenuBar(mBar);
    frame.setVisible(true);
    frame.addKeyListener(controller);
}
  public void updateCanvas(){
    canvas.repaint();
}
  public JFrame getMainFrame(){
    return frame;
  }
}
