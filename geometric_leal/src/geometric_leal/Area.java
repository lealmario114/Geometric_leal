package geometric_leal;

public class Area {

	int A;
	int B;
	int C;
	
	Area(int a) {
		A = a;
	}
	
	Area(int a, int b) {
		A = a;
		B = b;
	}
	
	Area(int a, int b, int c) {
		A = a;
		B = b;
		C = c;
	}
	
	int triangle() {
		return (A+B+C)/2;
	}
	
	double square() {
		return Math.pow(A, 2);
	}
	
	int rectangle() {
		return A*B;
	}
	
	double circle() {
		return Math.pow(((A/2)*3.149),2);
	}
	
	double cube() {
		return 6*(Math.pow(A, 2));
	}
}
