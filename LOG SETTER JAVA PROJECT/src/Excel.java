import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Excel {
		
	  HSSFWorkbook wb = new HSSFWorkbook();
	  HSSFSheet sheet1 = wb.createSheet();
	//  JFileChooser Filechooser = new JFileChooser();
	  StringBuilder sb = new StringBuilder();
	 // File file = Filechooser.getSelectedFile();
	 
	  

	 	  

	
	
	void Convertor() throws IOException {
			File file = new File("Logs.txt");
		     BufferedReader br = new BufferedReader(new FileReader(file));
		   //  BufferedWriter write = new BufferedWriter(new FileWriter("excel.xls"));
		     String s ;
		//JFileChooser filechooser = new JFileChooser();
		StringBuilder sb = new StringBuilder();
		   HSSFWorkbook wb = new HSSFWorkbook();
		     HSSFSheet sheet = wb.createSheet();
		 	HSSFSheet sheet1 = wb.createSheet();
		    
		     Row row = sheet.createRow(0);
		     row.createCell(0).setCellValue("Full");
		     row.createCell(1).setCellValue("date");
		     
		     row.createCell(2).setCellValue("ip");
		     row.createCell(3).setCellValue("port");
		     row.createCell(4).setCellValue("Username");
		     row.createCell(5).setCellValue("Status");
		     row.createCell(6).setCellValue("User");
		    // row.createCell(7).setCellValue("User's port");
		     
		     Row row1 = sheet1.createRow(0);
		     row1.createCell(0).setCellValue("Full");
		     row1.createCell(1).setCellValue("date");
		     
		     row1.createCell(2).setCellValue("ip");
		     row1.createCell(3).setCellValue("port");
		     row1.createCell(4).setCellValue("Username");
		     row1.createCell(5).setCellValue("Status");
		     row1.createCell(6).setCellValue("User");
		     row1.createCell(7).setCellValue("User's port");

		//public void pickme() throws FileNotFoundException {
			
			
			
			//if(filechooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
				
				
				//File file = 	filechooser.getSelectedFile();
				
				//Scanner input = new Scanner(file);
//				   Pattern AF = Pattern.compile("([a-zA-Z0-9\\s\\:]+)\\sip-([0-9\\-]+)\\ssshd\\[([0-9]+)\\]\\:\\s([a-zA-Z\\s]+)\\sfor\\s([a-zA-Z0-9\\s\\.]+)\\sfrom\\s([0-9\\.]+)\\sport\\s([0-9]+)\\sssh2");
//				    Pattern n = Pattern.compile("([a-zA-Z0-9\\s\\:]+)\\sip\\-([0-9\\-]+)\\ssshd\\[([0-9]+)\\]\\:\\s([a-zA-Z\\_\\&]+)\\(sshd:session\\)\\:\\ssession\\s([a-zA-Z]+)\\sfor\\suser\\s([a-zA-Z0-9\\-\\*\\^\\&\\@]+)");
//				    //System.out.println("reached here");
//				while((s = br.readLine())!= null) {
//					
//					Matcher m = AF.matcher(sb);
//					Matcher m2 = n.matcher(sb);
//					int r =1;
//					int count=0;
//					if(m.find()) {
//						System.out.println(m.group());
//						Row datarow = sheet1.createRow(0);
//						r++;
//						count++;
//						for(int i=0;i<=7;i++) {
//							
//							datarow.createCell(i).setCellValue(m.group(i));
//							
//							
//						}
//						
//						
//					}
//					else if (m2.find())
//				      {    
//				    	  
//				    	  //			HSSFWorkbook wb2 = new HSSFWorkbook();
//				    	  			
//				    	  				//System.out.println(p.group());
//				    	  
//				    	  				//Excel obj = new Excel();
//				    	  				//obj.newpattern();
//				    	  
//				    	  
//				    	  				Row newrow = sheet1.createRow(r++);
//				    	    		for(int i =0;i<=7;i++) {
//				    	    			 newrow.createCell(i).setCellValue(m2.group(i));
//				    	    		}
//
//				    	    			// System.out.println("Wrong pattern");
//				    			  
//				    		  
//				    		  
//				    		  
//				      }
//					
//					
//					
//					
//					
//									}
//				
//				FileOutputStream out = new FileOutputStream(new File("Final.xls"));
//				wb.close();
//				out.close();

			
			
//			else {
//				sb.append(" no file is uploaded");
//			}
	
	


			
			
			
			
			
			
			
			
		

		
		
		     
		  		     
		     
		     
		     
		    Pattern AF = Pattern.compile("([a-zA-Z0-9\\s\\:]+)\\sip-([0-9\\-]+)\\ssshd\\[([0-9]+)\\]\\:\\s([a-zA-Z\\s]+)\\sfor\\s([a-zA-Z0-9\\s\\.]+)\\sfrom\\s([0-9\\.]+)\\sport\\s([0-9]+)\\sssh2");
		    Pattern n = Pattern.compile("([a-zA-Z0-9\\s\\:]+)\\sip\\-([0-9\\-]+)\\ssshd\\[([0-9]+)\\]\\:\\s([a-zA-Z\\_\\&]+)\\(sshd:session\\)\\:\\ssession\\s([a-zA-Z]+)\\sfor\\suser\\s([a-zA-Z0-9\\-\\*\\^\\&\\@]+)");
		    {
		    	
		     
		     
		     while((s = br.readLine())!= null) {  
		    	 Matcher m = n.matcher(sb);
		    	 Matcher p = AF.matcher(sb);
		    	 int r = 1;
		    	 int count =0;
		    	 
		    	
		    	 
		     if(m.find()) {
		    	 	Row datarow = sheet1.createRow(r);	
		    	 	r++;
		    	 	count++;
		    	 	
		    	 	
		    	 		
		    	 	for(int j=0;j<=6;j++) {
		    		 
		    		 datarow.createCell(j).setCellValue(m.group(j));
		    		
		    	 
		    	 //	System.out.println(" "+count);
	    	 }
		     }
		     	
		      else if (p.find())
		      {    
		    	  
		    	  //			HSSFWorkbook wb2 = new HSSFWorkbook();
		    	  			
		    	  				//System.out.println(p.group());
		    	  
		    	  				//Excel obj = new Excel();
		    	  				//obj.newpattern();
		    	  
		    	  
		    	  				Row newrow = sheet1.createRow(r++);
		    	    		for(int i =0;i<=7;i++) {
		    	    			 newrow.createCell(i).setCellValue(p.group(i));
		    	    		}

		    	    			// System.out.println("Wrong pattern");
		    			  
		    		  
		    		  
		    		  
		      }
		      
		    		  
		     }//while loop
		    	     
		     
		
		     FileOutputStream out = new FileOutputStream(new File("YourExcel.xls"));
		    	wb.write(out);
		    	out.close();
		    		 
		    		 
		     
		     
	
	
	
	}
	
}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


