package geometric_leal;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area Demo01 = new Area (4);
		Area Demo02 = new Area (4,2);
		Area Demo03 = new Area (4,2,6);
		
		System.out.println("triangle: "+Demo03.triangle());
		System.out.println("square: "+ Demo01.square());
		System.out.println("rectangle: "+ Demo02.rectangle());
		System.out.println("circle: "+ Demo01.circle());
		System.out.println("cube: "+ Demo01.cube());
		
	}

}
