/**
 * 
 */
package TwentyFortyEight;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import guiPractice.components.Component;
import guiPractice.components.Graphic;

/**
 * @author Student 8
 *
 */
public class MyDemo extends Component {
	private int[][]board;
	private int [][]changeBoard;
	public MyDemo(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */

	@Override
	public void update(Graphics2D g) {
		int[][]a = new int[4][4];
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
	
		int height = 40,width = 40;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				g.drawRect(col*width,row*height, width, height);
				Graphic picture = new Graphic(50,50,5,"resources/images2048/grass.jpg");
				g.drawImage(picture.getImage(), picture.getX(), picture.getY(), null);
//
//					
//				}
			}
		}
		g.drawRect(120, 230, 170, 60);
		board = a;
	
		
		
	}
	public void changeImages(){
		// checks array values.
		// if its 2 then it will be bulbasaur
		// default (0) = grass img
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				changeBoard[row][col] = (int) Math.sqrt(board[row][col]);
 			}
		}
//		// if values of chaneBoard[row][col] == 0  -> img is grass
//		== 1 image is bulbasaur
//				 == 2 is ivysaur
	}
	public void setNewImages(){
		//don't know where to put this yet
		// this will change the images based on the values (reason stated above)
	}
	
	

//	public void start(){
//		ArrayList<Integer> Nrow = new ArrayList<Integer>();
//		ArrayList<Integer> Ncol = new ArrayList<Integer>();
//		for (int row = 0; row < board.length; row++) {
//			for (int col= 0; col < board.length; col++) {
//				if(board[row][col] == 0){
//					Nrow.add(row);
//					Ncol.add(col);
//					//will add row and col of all unfilled squares
//				}
//			}
//			for (int i = 0; i < 2; i++) {
//				int rndX = (int)(Nrow.size()*Math.random());
//				int rndY = (int)(Ncol.size()*Math.random());
//				int expo = (int) ((1 * Math.random()) + 1); // (0 or 1) + 1;
//				// 
//				// 2 ^1 = 2; 2^2 = 4;  it will random 
//				board[rndX][rndY] = (int) Math.pow(2, expo);
//				Nrow.remove(rndX);
//				Nrow.remove(rndY);
//				
//			}
//		}
//		
//	}
	

}
