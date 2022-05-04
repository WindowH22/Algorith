package loop;

import java.io.*;

public class BJ_11022 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		 for(int i = 1 ; i<=t ; i++) {
			 String string = br.readLine();
				int a = Integer.parseInt(string.split(" ")[0]);
				int b = Integer.parseInt(string.split(" ")[1]);
				System.out.println("Case #" +i+": "+a+ " + " + b +" = " + (a+b) );
		 }
		 bw.flush();
	}
}