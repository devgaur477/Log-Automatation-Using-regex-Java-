import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;

public class Read extends Filechooser  {
	
	
	void Readafile() throws IOException{
	JFileChooser c = new JFileChooser();
	File file = new File(c);
//	BufferedReader br = new BufferedReader(new FileReader(file));
	BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	String s;
	Pattern p = Pattern.compile("([a-zA-Z0-9\\s\\:]+)\\sip\\-([0-9\\-]+)\\ssshd\\[([0-9]+)\\]\\:\\s([a-zA-Z\\_\\&]+)\\(sshd:session\\)\\:\\ssession\\s([a-zA-Z]+)\\sfor\\suser\\s([a-zA-Z0-9\\-\\*\\^\\&\\@]+)");
	//Jun  7 12:39:27 ip-10-75-12-36 sshd[12834]: pam_unix(sshd:session): session closed for user ec2-user
	while((s = input.next())!= null) {
		Matcher m = p.matcher(s);
		
		if(m.find()) {
			
			System.out.println(m.group());
		
			writer.write(m.group());
			
			
		}
		writer.flush();
		//br.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
}