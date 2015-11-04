/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistpractice;

import apcscvm.DefaultControl;
import apcscvm.View;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author DSTIGANT
 */
public class PolygonView extends DefaultControl<ArrayList<Point>> implements View<ArrayList<Point>>
{
    private boolean drawDiagonals = false;
    
    // paint:
    // consumes an array list of Points representing the vertices of a polygon
    // and produces an image of the polygon.  Draw a circle of
    // radius 6 at each vertex of the polygon and lines connecting adjacent vertices
    // if drawDiagonals is true, draw all of the diagonals of the polygon as well.
    @Override
    public void paint(ArrayList<Point> points, Graphics g, int w, int h) 
    {
        for (Point p : points) {
            g.setColor(Color.BLACK);
            g.drawOval(p.x - 3, p.y - 3, 6, 6);
        }
        for (int i = 0; i < points.size(); ++i) {
            g.setColor(Color.BLACK);
            g.drawLine(points.get(i).x,
                    points.get(i).y,
                    points.get((i+1)%points.size()).x,
                    points.get((i+1)%points.size()).y );
        }
        if (!drawDiagonals) return;
        
        for (int i = 0; i < points.size(); ++i)
            for (int j = i+1; j < points.size(); ++j)
                g.drawLine(points.get(i).x, points.get(i).y,
                        points.get(j).x, points.get(j).y);
    }

    // handleMouseClick
    // consumes an array list of points which represents the vertices of a polygon.
    // add a vertex at the location of the mouse click
    @Override
    public void handleMouseClick( ArrayList<Point> p, int ea, MouseEvent me )
    {
        p.add(new Point(me.getX(), me.getY()));
    }
    
    @Override
    public void handleKeyPress( ArrayList<Point> p, int ea, KeyEvent ke )
    {
        if ( ke.getKeyCode() == KeyEvent.VK_D )
        {
            drawDiagonals = !drawDiagonals;
        }
        if ( ke.getKeyCode() == KeyEvent.VK_C )
            p.clear();
    }
    
}
