public class SolidGeometry {
	final static int e = 11;
	
	// The 3-dimension Array that represents the Space
	private static int[][][] space = new int[e][e][e]; // Eleven was choiced to allow the point space[5][5][5] to be the origin
	
	// If space[i][j][k] == 1, then it's space is occupied
	// Else if space[i][j][k] == 0, then there's no point in it
	
	// Method to populate the space with zero values (void) 
	public static void clearSpace() {
		for (int i=0; i<e; ++i) {
			for (int j=0; j<e; ++j) {
				for (int k=0; k<e; ++k) {
					space[i][j][k] = 0;
				}
			}
		}
	}
	
	// Print 3D in a 2D console
	public static void print3Din2D() {
		for (int i=0; i<e; ++i) {
			for (int j=0; j<e; ++j) {
				for (int k=0; k<e; ++k) {
					System.out.print(space[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	// A Method to draw a cube in a 3-dimensional array
	public static void createCube(int size) {
		clearSpace();
		if (size<=e) {
			for (int i=(e-size)/2; i<(e+size)/2; ++i) {
				for (int j=(e-size)/2; j<(e+size)/2; ++j) {
					for (int k=(e-size)/2; k<(e+size)/2; ++k) {
						SolidGeometry.space[i][j][k] = 1;
					}
				}
			}
		} else {
			System.out.println("Cube too large to the available space.");
		}
	}
	
	// A Method to draw a Regular Quadrangular Prism in a 3-dimensional array
	public static void createRegQuadPrism(int height, int baseEdge) {
		clearSpace();
		if (height <= e && baseEdge <= e) {
			for (int i=(e-height)/2; i<(e+height)/2; ++i) {
				for (int j=(e-baseEdge)/2; j<(e+baseEdge)/2; ++j) {
					for (int k=(e-baseEdge)/2; k<(e+baseEdge)/2; ++k) {
						SolidGeometry.space[i][j][k] = 1;
					}
				}
			}
		} else {
			System.out.println("Quadrangular Prism too large to the available space.");
		}
	}
}
