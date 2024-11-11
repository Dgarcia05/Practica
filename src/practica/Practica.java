package practica;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		int total = 0;
		
		for (int i = 0; i < sumArray.length; i++) {
			total += sumArray[i];
		}
		
		System.out.println("El total es: " + total);
		
		// User 2 fer la resta dels elements de subArray
		
		int subResult = subArray[0];
		for (int i = 1; i < subArray.length; i++) {
			subResult -= subArray[i];
		}
		System.out.println("Resta de los elementos de subArray: " + subResult);
		
<<<<<<< HEAD
		// User 3 fer la multiplicació dels elements de prodArray 
=======
		
		// User 3 fer la multiplicació dels elements de prodArray
		int total = 1;
		for(int i = 0; i<prodArray.length;i++){
			if(prodArray[i]!=0){
				 total = (prodArray[i] * total);
				
			}
		}
		
			
			System.out.println(total);
		
		
		
>>>>>>> multiplicacion
	}

}
