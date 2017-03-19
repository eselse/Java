// Вывод календаря на 2017 год
class Calendar {
	public static void main(String args[]) {
		String jan = "Январь";
		String feb = "Февраль";
		String mar = "Март";
		String apr = "Апрель";
		String may = "Май";
		String jun = "Июнь";
		String jul = "Июль";
		String aug = "Август";
		String sep = "Сентабрь";
		String oct = "Октябрь";
		String nov = "Ноябрь";
		String dec = "Декабрь";


		int wc = 6;
		int l = 31;
		int m = 30;
		int s = 28;
		int dp = 6;

		for(int i = 0; i < 12; i++) {

			switch(i) {
				case 0 :
					System.out.print("\n       " + jan + "	\n");
					break;
				case 1 :
					System.out.print("\n       " + feb + "	\n");
					break;
				case 2 :
					System.out.print("\n       " + mar + "	\n");
					break;
				case 3 :
					System.out.print("\n       " + apr + "	\n");
					break;
				case 4 :
					System.out.print("\n       " + may + "	\n");
					break;
				case 5 :
					System.out.print("\n       " + jun + "	\n");
					break;
				case 6 :
					System.out.print("\n       " + jul + "	\n");
					break;
				case 7 :
					System.out.print("\n       " + aug + "	\n");
					break;
				case 8 :
					System.out.print("\n       " + sep + "	\n");
					break;
				case 9 :
					System.out.print("\n       " + oct + "	\n");
					break;
				case 10 :
					System.out.print("\n       " + nov + "	\n");
					break;
				case 11 :
					System.out.print("\n       " + dec + "	\n");
					break;
			}

			if((i == 0) | (i == 2) | (i == 4) | (i == 6) | (i == 7) | (i == 9) | (i == 11)) {
				int k = 1;
				while(k <= l) {
					if(dp > 6) {
						System.out.print('\n');
						dp = 0;
					}
					if(k < 10){
						System.out.print(" " + k++ + " ");
						dp++;
					}
					else if(k > 9) { 
						System.out.print(k++ + " ");
						dp++;
					}
				}
				System.out.println();
			}

			else if((i == 3) || (i == 5) || (i == 8) || (i == 10)) {
				int k = 1;
				while(k <= m) {
					if(dp > 6) {
						System.out.print('\n');
						dp = 0;
					}
					if(k < 10){ 
						System.out.print(" " + k++ + " ");
						dp++;
					}
					else if(k > 9) { 
						System.out.print(k++ + " ");
						dp++;
					}
				}
				System.out.println();
			}

			else {
				int k = 1;
				while(k <= s) {
					if(dp > 6) {
						System.out.print('\n');
						dp = 0;
					}
					if(k < 10){ 
						System.out.print(" " + k++ + " ");
						dp++;
					}
					else if(k > 9) { 
						System.out.print(k++ + " ");
						dp++;
					}
				}
				System.out.println();
			}
		}
		System.out.println();
	}
}