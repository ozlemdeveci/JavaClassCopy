package reviewNes.com;

public class NestedForLoop {
public static void main(String[] args) {
	// bitane for aynis seyi defalarca yazdirmak icin
	for(int i=1; i<=5; i++) {
		System.out.println("*");	
		}
	
	
	for(int k=1; k<=4; k++) {  //rows kac satir
		
		for(int l=1; l<=6; l++ ) {
			System.out.print("*");	
		}
		System.out.println();
	}
	
	for(int floor=1; floor<=4; floor++) {
		System.out.print("floor"+ floor+ " -->");
		for(int room=1; room<=6; room++) {
			System.out.print(floor +"."+room+"  ");
			System.out.print(floor +"  ");
		}System.out.println();
	}
	
	
	
}
}
