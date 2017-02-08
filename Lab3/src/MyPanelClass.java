import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;



public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;
		
		g.setColor(Color.BLACK);
		g.fillRect(x1, y1, width+1, height+1);
		
		//Draw a border
//		g.setColor(Color.YELLOW);
//		g.drawRect(x1, y1, width, height);
//		
//		//Second border
//		g.setColor(Color.BLUE);
//		g.drawRect(x1+2, y1+2, width-4, height-4);
		
		//Lines
//		g.setColor(Color.WHITE);
//		g.drawLine(x1, y1, x2, y2);
//		g.setColor(Color.GREEN);
//		g.drawLine(x1,y2, x2,y1);
		
		//Ovals
//		g.setColor(Color.BLACK);
//		g.fillOval(x1+70,y1+65,width-150,height-150);
		
		//Polygons
//		Polygon p = new Polygon();
//		p.addPoint(x1+5, y1+25);
//		p.addPoint(x1+20,y1+10);
//		p.addPoint(x1+35,y1+25);
//		p.addPoint(x1+25,y1+25);
//		p.addPoint(x1+25,y1+45);
//		p.addPoint(x1+15,y1+45);
//		p.addPoint(x1+15,y1+25);
//		g.setColor(Color.PINK);
//		g.fillPolygon(p);
		
		//The Star
		Polygon p2 = new Polygon();
        p2.addPoint(x1 + 25, y1 + 95); //left arm
        p2.addPoint(x1 + 42, y1 + 95); //top left valley
        p2.addPoint(x1 + 47, y1 + 80); //top
        p2.addPoint(x1 + 53, y1 + 95); //top right valley
        p2.addPoint(x1 + 69, y1 + 95); //right arm
        p2.addPoint(x1 + 56, y1 + 105); //bottom right valley
        p2.addPoint(x1 + 61, y1 + 120); //right leg
        p2.addPoint(x1 + 47, y1 + 110); //middle bottom valley
        p2.addPoint(x1 + 34, y1 + 120); //left leg
        p2.addPoint(x1 + 38, y1 + 105); //bottom left valley
        
        
        //The Triangle
        Polygon p3 = new Polygon();
        p3.addPoint(x1+10, y1+10);
        p3.addPoint(x1+125, y1+107);
        p3.addPoint(x1+10, y1+200);
        
        //Stripes
        
        g.setColor(Color.RED);
        g.fillRect(x1+10, y1+10, 270, 40);
        g.setColor(Color.WHITE);
        g.fillRect(x1+40, y1+52, 240, 40);
        g.setColor(Color.RED);
        g.fillRect(x1+80, y1+82, 200, 40);
        g.setColor(Color.WHITE);
        g.fillRect(x1+40, y1+124, 240, 40);
        g.setColor(Color.RED);
        g.fillRect(x1+10, y1+160, 270, 40);
        g.setColor(Color.BLUE);
        g.fillPolygon(p3);
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
	}
	
	
}
