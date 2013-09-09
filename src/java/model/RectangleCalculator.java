/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ncummins
 */
public class RectangleCalculator {
    
    private double length;
    private double width;
    
    public RectangleCalculator(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea(){
        return length * width;
    }
}
