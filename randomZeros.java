/* Li Huang
 * Per.1
 * 01/11/2018
 * Array List - Programming
 */

import java.util.ArrayList;
public class randomZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numsRandom = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			numsRandom.add((int)(Math.random()*99+1));
		}
		System.out.println("The random list "+numsRandom);
		
		for(int j=0; j<numsRandom.size(); j++){
			numsRandom.set(j,0);
		}
		System.out.println("The modified list "+numsRandom);
	}

}
