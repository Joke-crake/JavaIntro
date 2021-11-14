package by.epam.jonline.part03;

/*
 * 2. Даны две последовательности n m a  a  a и b  b  b 1 2 1 2 . Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
 */

		public class Task02 {
			public static void main(String[] args) {

				int[] a1 = {1, 2, 3, 5, 6, 6, 7, 8, 9};
				int[] a2 = {5, 6, 8, 9, 12, 16, 18, 19};

				int[] result = new int[a1.length + a2.length];
				System.arraycopy(a1, 0, result, 0, a1.length);
				for(int i = 0; i < a2.length; i++){
					for (int j = 0; j < result.length; j++){
						if(a2[i] <= result[j]){
							System.arraycopy(result, j, result, j + 1, result.length - j - 1);
							result[j] = a2[i];
							break;
						}
						else if(result[j] == 0){
							result[j] = a2[i];
							break;
						}
					}
				}
		System.out.println();
		for(int el : result){
			System.out.print(el + " ");
		}
	}
}
