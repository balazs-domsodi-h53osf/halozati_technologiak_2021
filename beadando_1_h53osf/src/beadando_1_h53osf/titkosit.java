package beadando_1_h53osf;
import java.io.*;
public class titkosit {

	public static void main(String[] args) throws IOException {  
		BufferedReader br = new BufferedReader(new FileReader("input\\a.txt"));
		PrintWriter pw = new PrintWriter("output/b.txt");
		
		String line;
		String s;
		char c;
		int n;
		while ((line = br.readLine()) != null) {
		s = line;
		for (int i = 0; i < s.length(); i++){
			    c = s.charAt(i);        
			    n = c;
			    if (n>=48 && n<=56 || n>=65 && n<=89 || n>=97 && n<=121) {
			    	n++;
			    }
			    else if (n==57) {
			    	n=48;
			    }
			    else if (n==90) {
			    	n=65;
			    }
			    else if (n==122) {
			    	n=97;
			    }
			    c = (char)n;
			    pw.print(c);
			}
			pw.print("\n");
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
