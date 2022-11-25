package geometryStudies;

public class PolyhedronsVolumes {
	// Volume of a Cube
	public static double cubeVolume(double edge) {
		// Given a cube of arest of size h, then it's volume is V = h^3
		double volume = edge*edge*edge;
		// Return the volume
		return volume;
	}
	
	// Volume of a Regular Parallelepiped
	public static double parallelepipedVolume(double height, double baseEdge) {
		// The volume of a parallelepiped is calculated by the base times the height
		
		double base = baseEdge*baseEdge; // Calculate the area of the base
		double volume = base * height; // Calculate the volume
		
		return volume;
	}
}
