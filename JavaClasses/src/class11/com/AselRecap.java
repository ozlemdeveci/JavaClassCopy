package class11.com;

public class AselRecap {
	public static void main(String[] args) {
		String[] names=new String[5];
		names[0]="Asel";
		names[1]="Awet";
	    names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dmitri";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			}
		System.out.println("-----for  loop-----");
		String[] studentName= {"Ali","veli","hasan","ozlem"};
		for (int j = 0; j <= studentName.length-1 ; j++) {
			System.out.println(studentName[j]);
		}
//retrieve values using;advanced for loop,for each loop,enchanced for loop
		System.out.println("-------Advanced for loop-------");
		for(String student:studentName){
			System.out.println(student);
		}
	
	}

}
