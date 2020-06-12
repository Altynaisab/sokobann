import javax.swing.*;
public class Model {
    Viewer viewer;
    int[][] desktop;
    int indexI;
    int indexJ;
    boolean flag;
    int[][] arrayGoals;
    char directionGamer;
    Levels levels;
    int countLevel;


    Model(Viewer viewer) {
	     this.viewer = viewer;
	      levels = new Levels();
	      directionGamer = 'R';
      	desktop = levels.nextLevel();
      	initialization();
    }

    public void initialization() {
      	int countOne = 0;
      	int countThree = 0;
      	int countFour = 0;
      	for(int i = 0; i < desktop.length; i++) {
      	    for(int j = 0; j < desktop[i].length; j++) {
      		    if(desktop[i][j] == 1) {
      			indexI = i;
      			indexJ = j;
      			countOne++;
      		   }

          		if(desktop[i][j] == 3) {
          			countThree++;
          		}

          		if(desktop[i][j] == 4) {
          			countFour++;
          		}
          	    }
          	}

             	if((countThree == 0 || countFour == 0) ||
          		 (countThree != countFour)) {
          		flag = true;
          	}

            	if(countOne != 1) {
          		flag = true;
          	}

	           arrayGoals = new int[2][countFour];

	            int a = 0;

	               for(int i = 0; i < desktop.length; i++) {
	                  for(int j = 0; j < desktop[i].length; j++) {
		                    if(desktop[i][j] == 4) {
                      			arrayGoals[0][a] = i;
                      			arrayGoals[1][a] = j;
                      			a++;
   		                       }
    }
	}
}

    public void move(String direction) {
	     if(direction.equals("Right")) {
      		moveRight();
      		directionGamer = 'R';
      	} else if(direction.equals("Left")) {
      		moveLeft();

      		directionGamer = 'L';
      	} else if(direction.equals("Up")) {
      		moveUp();
      	} else if(direction.equals("Down")) {
      		moveDown();
      	}
      	check();
      	viewer.updateCanvas();
      	won();
    }

    private void moveRight() {

        	int oldIndexI = -1;
        	int oldIndexJ = -1;

        	int nextIndexI = -1;
        	int nextIndexJ = -1;


            if(desktop[indexI][indexJ + 1] == 3){
        		if(desktop[indexI][indexJ + 2] == 0 || desktop[indexI][indexJ + 2] == 4) {
        			desktop[indexI][indexJ + 1] = 0;
        			desktop[indexI][indexJ + 2] = 3;
        		}
        	}

            if(desktop[indexI][indexJ + 1] == 0 || desktop[indexI][indexJ + 1] == 4){
        		oldIndexI = indexI;
        		oldIndexJ = indexJ;

        		desktop[indexI][indexJ] = 0;
        		indexJ = indexJ + 1;
        		desktop[indexI][indexJ] = 1;
        		nextIndexI = indexI;
        		nextIndexJ = indexJ;

        	}

System.out.println(oldIndexI + " " + oldIndexJ + " -- " + nextIndexI + " " + nextIndexJ);
    }

    private void moveLeft() {
        if(desktop[indexI][indexJ - 1] == 3){
		        if(desktop[indexI][indexJ - 2] == 0 || desktop[indexI][indexJ - 2] == 4) {
			desktop[indexI][indexJ - 1] = 0;
			desktop[indexI][indexJ - 2] = 3;
		}
	}

        if(desktop[indexI][indexJ - 1] == 0 || desktop[indexI][indexJ - 1] == 4){
		desktop[indexI][indexJ] = 0;
		indexJ = indexJ - 1;
		desktop[indexI][indexJ] = 1;
	}
    }


    private void moveUp() {

        if(desktop[indexI - 1][indexJ] == 3){
		        if(desktop[indexI - 2][indexJ] == 0 || desktop[indexI - 2][indexJ] == 4) {
			desktop[indexI - 1][indexJ] = 0;
			desktop[indexI - 2][indexJ] = 3;
		}
	}

        if(desktop[indexI - 1][indexJ] == 0 || desktop[indexI - 1][indexJ] == 4){
		desktop[indexI][indexJ] = 0;
		indexI = indexI - 1;
		desktop[indexI][indexJ] = 1;
	}
    }

    private void moveDown() {
        if(desktop[indexI + 1][indexJ] == 3){
		        if(desktop[indexI + 2][indexJ] == 0 || desktop[indexI + 2][indexJ] == 4) {
			desktop[indexI + 1][indexJ] = 0;
			desktop[indexI + 2][indexJ] = 3;
		}
	}

        if(desktop[indexI + 1][indexJ] == 0 || desktop[indexI + 1][indexJ] == 4){
		desktop[indexI][indexJ] = 0;
		indexI = indexI + 1;
		desktop[indexI][indexJ] = 1;
	}
    }


    private void printDesktop() {

	     for(int i = 0; i < desktop.length; i++) {
	        for(int j = 0; j < desktop[i].length; j++) {
		System.out.print(desktop[i][j] + " ");
	    }
	System.out.println();
	}
	System.out.println();
	System.out.println();
    }


    public void check() {

	int indexT = arrayGoals[0].length;
	   for(int j = 0; j < indexT; j++) {
		int x = arrayGoals[0][j];
		int y = arrayGoals[1][j];

		if(desktop[x][y] == 0) {
			desktop[x][y] = 4;
		}
	   }
    }

    public void won() {

	boolean isFinished = true;

	int indexT = arrayGoals[0].length;
	   for(int j = 0; j < indexT; j++) {
		int x = arrayGoals[0][j];
		int y = arrayGoals[1][j];

		if(desktop[x][y] != 3) {
			isFinished = false;
			break;
		}
	   }

	if(isFinished) {
	javax.swing.JOptionPane.showMessageDialog(viewer.getMainFrame()
	, "CONGRATULATIONS ! GO ON !");

	desktop = levels.nextLevel();
	initialization();
	viewer.updateCanvas();

	}
    }
}
