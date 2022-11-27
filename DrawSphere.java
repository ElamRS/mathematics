package geometryStudies;

/*
 	* What is a Sphere?
 	* 	A sphere could be defined as the reunion of all points in space at the same
 	* 	or minor distance from the a given point O, center of the sphere, as the size
 	* 	of a segment called the radius of the sphere.
 	* 
 	*  And that's what this program is supposed to do, it will try to occupy all points in space at
 	*  an equal or minor distance as a integer value called radius from a point called center
 	*  
 	*  Obs: In this program, the sphere is drawed from the central point in the space
*/

//Import Math library to calculate the distance between 
//two dots and to use the round function
import java.lang.Math; 

public class DrawSphere {
	// Create the 3 Dimensional Array to represent the Space
	
	final static int e = 31; // Number of points of the space in any axis, the greater the e and the radius of the sphere, more the drawing seems like a actual sphere
	
	// The array that represents the space
	static int space[][][] = new int[e][e][e];
	
	/*
	  * If space[x][y][z] == 0, then it's a "void" in space
	  * If space[x][y][z] == 1, then there's a point in this location in space
	*/
	
	// Method to Populate the Space with zero values
	public static void clearSpace() {
		for (int x=0; x<e; ++x) {
			for (int y=0; y<e; ++y) {
				for (int z=0; z<e; ++z) {
					DrawSphere.space[x][y][z] = 0; // A static way to call the array
				}
			}
		}
	}
	
	// Method to actually draw the sphere
	public static void drawSphere(int radius) {
		// Clear the Space to Draw the Sphere
		clearSpace();
		
		double D; // D stands for the distance
		
		for (int x=0; x<e; ++x) {
			for (int y=0; y<e; ++y) {
				for (int z=0; z<e; ++z) {
					D = getDistance(x, y, z); // D receive it's value
					
					if (Math.round(D)<=radius) {
						space[x][y][z] = 1;
					}
				}
			}
		}
	}
	
	// Method to calculate the distance from the generic point (x, y, z) to the center of the sphere (e/2, e/2, e/2)
	// In this method the formula of the distance between two points is the one for a R3 plane
	public static double getDistance(int x, int y, int z) {
		// D = sqrt([(x1 - x2)^2 + (y1 - y2)^2 + (z1 - z2)^2])
		double distance = Math.sqrt((Math.pow(e/2 - x, 2) + Math.pow(e/2 - y, 2) + Math.pow(e/2 - z, 2)));
		// Return that distance
		return distance;
	}
	
	// A method to try to print the sphere as a series of sections of sphere, in order to visualize the 3d solid in a 2d console
	public static void print3Din2D() {
		for (int x=0; x<e; ++x) {
			for (int y=0; y<e; ++y) {
				for (int z=0; z<e; ++z) {
					System.out.print(space[x][y][z] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
}
