
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class Nonagon implements Shape
{
  private int sideLength;
  private String color;

  /**
   * Constructor for objects of class Circle
   */
  public Nonagon(int sideLength, String color)
  {
    this.sideLength = sideLength;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return 2.25*sideLength*sideLength*(1.0/Math.tan(Math.PI/9));
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return 9 * this.sideLength;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color; 
  }
}
