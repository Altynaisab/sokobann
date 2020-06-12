import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

class Canvas extends JPanel{
   Model model;

   Image imageGamer;
   Image imageGamerLeft;
   Image imageWall;
   Image imageBox;
   Image imageGoal;

   Font font;

   Canvas(Model model){
     this.model = model;
     setBackground(Color.black);
     font = new Font("Impact", Font.BOLD, 35);
     File fileNameGamer = new File("images/gamer.png");
     File fileNameGamerLeft = new File("images/gamerleft.png");
     File fileNameWall = new File("images/wall.png");
     File fileNameBox = new File("images/box.png");
     File fileNameGoal = new File("images/goal.png");

     try {
       imageGamer = ImageIO.read(fileNameGamer);
       imageGamerLeft = ImageIO.read(fileNameGamerLeft);
       imageWall = ImageIO.read(fileNameWall);
       imageBox = ImageIO.read(fileNameBox);
       imageGoal = ImageIO.read(fileNameGoal);

      } catch(IOException e) {
       System.out.println("Hello");
        }
}
   public void paint(Graphics g) {
     super.paint(g);

      if(model.flag) {
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString("INITIALIZATION ERROR ! ", 50, 50);
        } else {
        drawDesktop(g);
        }
   }
   public void drawDesktop(Graphics g) {
        int startX = 50;
      	int startY = 50;
      	int x = startX;
      	int y = startY;
      	int width = 50;
      	int height = 50;
      	int offset = 0;
      	for(int i = 0; i < model.desktop.length; i++) {
    	    for(int j = 0; j < model.desktop[i].length; j++) {
    		        if(model.desktop[i][j] == 1) {

    			      if(model.directionGamer == 'R') {
    			    g.drawImage(imageGamer, x, y, null);
    			           } else if(model.directionGamer == 'L') {
    			    g.drawImage(imageGamerLeft, x, y, null);

    			     }
    		            } else if(model.desktop[i][j] == 2) {
    		      g.drawImage(imageWall, x, y, null); } else if(model.desktop[i][j] == 3) {
		          g.drawImage(imageBox, x, y, null);

		                } else if(model.desktop[i][j] == 4) {
              g.drawImage(imageGoal, x, y, 50, 50, null);


		                } else {
		}
		x = x + width + offset;
	    }
	    x = startX;
	    y = y + height + offset;
	}


   }
}
