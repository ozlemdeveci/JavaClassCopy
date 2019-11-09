package class12.com;

public class ReplaceOzetHilal {
	public static void main(String[] args) {
		      //   012345678  //baslangic harfleri yazdirma substring
		String s1="Javatpoint";
		     
		String str=s1.substring(0);  
		System.out.println(str);        //javatpoint
		System.out.println(s1.substring(2,4)); //va
		System.out.println(s1.substring(2));  //vatpoint
		System.out.println(s1.substring(5,7)); //po
		System.out.println("*********");
		
		
		
		//charAt // charAt hepsini yazdirma
		String  car="BeginnersBook";
		for(int i=0; i<car.length(); i++) {
				System.out.print(car.charAt(i));
				}
		System.out.println("******");
		System.out.println(car.charAt(5));
	//charAt//kactane secilen karakterden oldugunu bulma
		int sum=0;
		for(int j=0; j<car.length(); j++) {
			if(car.charAt(j)=='g') {
				sum++;
			}
		}System.out.println(sum);
		// replace harfleri degistir ilki eski harf, ikinci yeni harf
		String hilal="ozlem";
		System.out.println(hilal.replace('z','s'));
		
		String ozlem="hilal";
		System.out.println(ozlem.replace('i','a' ));
		
		String s5="java point is a very good website";  
		String replaceString=s5.replaceAll("a","e");
		//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
		
		String halal="We love each other";
		System.out.println(halal.replace("We", "they"));
		System.out.println(halal.replace("each other","their dog"));
		System.out.println("&&&&&&&&&&&&&&");
		
		String myString=new String("Lets learn java");
		System.out.println(myString.substring(5));
		
		//indexOf icine harf yazdigimizda kacinci sirada oldugunu gosteriyor
		String satir="World";
		int index=satir.indexOf('d');  //
		System.out.println(index);
		
		String konusan="ali veli kemal seval veli";
		int indexo=konusan.indexOf("kemal");  // harf olarak aldigindan 9 cikti
		System.out.println(indexo);	
		
		// char i string e cevirme
			char c='S';  
			String s=String.valueOf(c);  
			System.out.println("String is: "+s); 
			
			
			
	}	   
	}

