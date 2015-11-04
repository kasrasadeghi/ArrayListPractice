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
    public void paint(ArrayList<Point> p, Graphics g, int w, int h) 
    {
        
    }

    // handleMouseClick
    // consumes an array list of points which represents the vertices of a polygon.
    // add a vertex at the location of the mouse click
    public void handleMouseClick( ArrayList<Point> p, int ea, MouseEvent me )
    {
        
    }
    
    public void handleKeyPress( ArrayList<Point> p, int ea, KeyEvent ke )
    {
        if ( ke.getKeyCode() == KeyEvent.VK_D )
        {
            drawDiagonals = !drawDiagonals;
        }
    }
    
}
