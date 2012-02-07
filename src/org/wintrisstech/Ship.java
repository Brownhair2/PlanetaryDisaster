/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wintrisstech;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author workshopjan23
 */
public class Ship 
{
    private int x = 10;
    private int counter = 0;
    private int counteri = 0;
    private int[] bomby = new int[20];
    private Image spaceship;
    private Image bomb;
    public Ship() throws IOException
    {
        for(int i = 20; i < 20; i++)
        {
            
        }
        spaceship = ImageIO.read(getClass().getResource("alien-spaceship-icon.png"));
        bomb = ImageIO.read(getClass().getResource("bomb.png"));
    }
    public void paint(Graphics g)
    {
        g.drawImage(spaceship, x, 20, 100, 100, null);
        x++;
        
    }
    public void update()
    {
        counter++;
        
    }
}