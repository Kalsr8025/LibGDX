/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalsr8025;

import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author kalsr8025
 */
public class Paddle {
    private Rectangle player;
    private int speed;
    
    public Paddle (int x, int y, int width, int height, int speed){
        this.speed = speed;
        this.player = new Rectangle (x,y,width,height);
        
    }
    
    public void moveUp(){
        player.y += speed;
       
    }
    public void moveDown(){
        player.y -= speed;
    }
}
