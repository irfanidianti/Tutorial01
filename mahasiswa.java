import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Mahasiswa {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int key = Integer.parseInt(in.readLine());
		key = key % 26;
		String str = in.readLine();
		while(str != null){
			System.out.println(decrypt(str, key));
			str = in.readLine();
		}
	}
	
	public static String decrypt(String str, int key){
		
		char[] chArr = str.toCharArray();
		for(int i=0; i<chArr.length; i++){
			int ascii = (int) chArr[i];
			if(Character.isLetter(chArr[i])){
				if(ascii>=97 && ascii<= 122){
					if(ascii-97<key){
						chArr[i]=(char) (ascii+(26-key));
					}
					else{
						chArr[i] = (char) (ascii - key);
					}
				}
				
				else if(ascii>=65 && ascii<=90){
					if(ascii-65<key){
						chArr[i]=(char) (ascii+(26-key));
					}
					else{
						chArr[i] = (char) (ascii - key);
					}	
				}
			}
		}
		
		String res = new String(chArr);
		return res;
	}
}