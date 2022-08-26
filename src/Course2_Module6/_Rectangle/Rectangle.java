package Course2_Module6._Rectangle;

/*
 * TODO 1: Declare the Rectangle class. Make it public for testing purposes.
 */
public class Rectangle {

    /*
     * TODO 2: Declare two attributes as shown below.
     * 	length: int (to store length of the rectangle.)
     * 	width: int (to store width of the rectangle.)
     */
      int length;
      int width;

    /*
     * TODO 3: Declare and define the following methods.
     * 	getPerimeter() : int (calculate and return perimeter of the rectangle.)
     * 	getArea() : int (calculate and return area of the rectangle.)
     */

      int getPerimeter(){
         return (2*(length + width));
     }

     int getArea() {
         return (length*width);
     }

}
