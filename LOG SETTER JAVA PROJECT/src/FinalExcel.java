import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class FinalExcel {

	
	void NewConvertor() throws IOException {
			File file = new File("Logs.txt");
		     BufferedReader br = new BufferedReader(new FileReader(file));
		   //  BufferedWriter write = new BufferedWriter(new FileWriter("excel.xls"));
		     String s ;
		     
		     HSSFWorkbook wb = new HSSFWorkbook();
		     HSSFSheet sheet = wb.createSheet();
		    
		     Row row = sheet.createRow(0);
		     row.createCell(0).setCellValue("Full");
		     row.createCell(1).setCellValue("date");
		     
		     row.createCell(2).setCellValue("ip");
		     row.createCell(3).setCellValue("port");
		     row.createCell(4).setCellValue("status");
		     row.createCell(5).setCellValue("username");
		     row.createCell(6).setCellValue("User's ip");
		     row.createCell(7).setCellValue("User's port");
		     
		     
		     
		     
		     Pattern p = Pattern.compile("([a-zA-Z0-9\\s\\:]+)\\sip-([0-9\\-]+)\\ssshd\\[([0-9]+)\\]\\:\\s([a-zA-Z\\s]+)\\sfor\\s([a-zA-Z0-9\\s\\.]+)\\sfrom\\s([0-9\\.]+)\\sport\\s([0-9]+)\\sssh2");
		     
		     int r = 1;
		     while((s = br.readLine())!= null) {  
		    	 Matcher m = p.matcher(s);
		    	 
		     if(m.find()) {
		    	 	Row datarow = sheet.createRow(r);	
		    	 	r++;
		    	 for(int j=0;j<=7;j++) {
		    		 
		    		 datarow.createCell(j).setCellValue(m.group(j));
		    	 }
	    	 }
		     else {
		    	 System.out.println("Pattern not found ");
		     }}
		
		     FileOutputStream out = new FileOutputStream(new File("NewExcel.xls"));
		    	wb.write(out);
		    	out.close();
		    		 
		    		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

