import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Newpattern   {
	void Npattern() throws Exception{
	File file = new File("Logs.txt");
	BufferedReader br = new BufferedReader(new FileReader(file));
	String s ;
    
    HSSFWorkbook wb = new HSSFWorkbook();
    HSSFSheet sheet = wb.createSheet();
   
    Row row1 = sheet.createRow(0);
    row1.createCell(0).setCellValue("Full");
    row1.createCell(1).setCellValue("date");
    
    row1.createCell(2).setCellValue("ip");
    row1.createCell(3).setCellValue("port");
    row1.createCell(4).setCellValue("Username");
    row1.createCell(5).setCellValue("Status");
    row1.createCell(6).setCellValue("User");
    
    Pattern n = Pattern.compile("([a-zA-Z0-9\\s\\:]+)\\sip\\-([0-9\\-]+)\\ssshd\\[([0-9]+)\\]\\:\\s([a-zA-Z\\_\\&]+)\\(sshd:session\\)\\:\\ssession\\s([a-zA-Z]+)\\sfor\\suser\\s([a-zA-Z0-9\\-\\*\\^\\&\\@]+)");
	
    int count =1;
    
    while((s= br.readLine())!= null) {
    	Matcher m = n.matcher(s);
    	
    	if(m.find()) {
    		Row rowdata = sheet.createRow(count);
    		count++;
    		for(int i =0;i<=6;i++) {
    			
    			rowdata.createCell(i).setCellValue(m.group(i));
    			
    			
    			
    		}
    		
    		
    	}
    	else {
    		System.out.println("nothing ");
    	}
    }
    
    FileOutputStream out = new FileOutputStream(new File("newpattern.xls"));
    wb.write(out);;
    out.close();
    
	
	}

}
