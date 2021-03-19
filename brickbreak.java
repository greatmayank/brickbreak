package gamedevelopment;

import javax.swing.JFrame;

public class brickbreak {

	public static void main(String[] args) {
		JFrame obj=new JFrame();
		
		
		
	
		brickbreakermain brick=new brickbreakermain();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("    Brick Breaker by mayank      ");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(brick);
	}

}
