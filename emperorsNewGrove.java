/* Li Huang
 * Per.1
 * 01/11/2018
 * Array List - Programming
 */

import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println("The original list: "+emperorCast);
		
		emperorCast.remove(1);
		emperorCast.add(2,"Chaca");
		emperorCast.add(3,"Tipo");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		System.out.println("The midified list: "+emperorCast);
		
		
	}

}
