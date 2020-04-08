package Collection;

public class Collect {
	
	public int[] addtolst() {
		int[] lst = new int[100];
		
		for(int i = 0; i <100; i++) {
			lst[i]=i;
		}
		return lst;
	}
	
	public int[] addtoHundred() {
		int[] lst = new int[900];
		int num = 100;
		for(int i = 0; i < 900; i++) {
			lst[i]= num++;
		}
		return lst;
	}
}
