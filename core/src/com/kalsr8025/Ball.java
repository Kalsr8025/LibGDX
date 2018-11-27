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
public class Ball {

    private Rectangle shape;
    private int speed;
    private int dx;
    private int dy;

    public Ball(int x, int y, int width, int height, int speed) {
        this.speed = speed;
        this.shape = new Rectangle(x, y, width, height);
        this.dx = 1;
        this.dy = 1;
    }

    public void move() {
        shape.x += speed * dx;
        shape.y += speed * dy;
    }

    public void bounceX() {
        dx = dx * -1;
    }

    public void bounceY() {
        dy = dy * -1;
    }
    
    public float getX (){
        return shape.x;
    }
    
    public float getY(){
        return shape.y;
    }

}
