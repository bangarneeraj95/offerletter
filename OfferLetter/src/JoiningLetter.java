import java.util.*;
import java.io.*;
public class JoiningLetter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your  name");
		String name=sc.nextLine();
		StringTokenizer st = new StringTokenizer(name);
		String tokenname=st.nextToken();  
		System.out.println("Enter your designation");
		String desg=sc.nextLine();
		System.out.println("Enter your CTC");
		String  ctc=sc.next();
		System.out.println("Enter your date of joining");
		String date=sc.next();
		String fname="Nmae :";	String fdesignation="Designation :"; 	String fctc="CTC :";	String fdate="Date of Joining :";
		String newline="\r\n"; String dear="Dear Mr."; String tab="\r\t";String fidate="Joining Date :"; String cur="Current Date :";
		try{  
			 FileInputStream fn=new FileInputStream("offerletter.txt");
			 FileInputStream fh=new FileInputStream("header.txt");
		     FileOutputStream fot=new FileOutputStream("D:\\Kepler\\"+tokenname+".txt");    
		     
		     byte aa[]=name.getBytes(); 
		     byte bb[]=date.getBytes();
		     byte cc[]=desg.getBytes();
		     byte dd[]=ctc.getBytes();
		     byte ee[]=fname.getBytes(); byte ff[]=fdesignation.getBytes(); byte gg[]=fctc.getBytes(); byte hh[]=fdate.getBytes();
		     byte ii[]=newline.getBytes(); byte jj[]=dear.getBytes(); byte kk[]=tab.getBytes(); byte ll[]=fidate.getBytes();byte nn[]=cur.getBytes();
		     fot.write(ee); fot.write(aa);fot.write(ii);fot.write(ii);
		     fot.write(ff); fot.write(cc);fot.write(ii);fot.write(ii);
		     fot.write(gg); fot.write(dd);fot.write(ii);fot.write(ii);
		     fot.write(kk); fot.write(jj);fot.write(aa);fot.write(ii);
		     int jjj=0;  
	    	    while((jjj=fh.read())!=-1){   
	    	     fot.write((byte)jjj);
	    	     } 
	    	    fot.write(cc);
		        int iii=0;  
	    	    while((iii=fn.read())!=-1){  
	    	     fot.write((byte)iii);

	    	    }
	    	    java.sql.Date dt1 = new java.sql.Date(System.currentTimeMillis());
	 		    String dtt = dt1.toString();
	 		    byte mm[]=dtt.getBytes();
	 		    fot.write(ii);fot.write(ii);fot.write(ii);fot.write(ii); fot.write(ll);
	    	    fot.write(bb);  fot.write(kk);fot.write(kk);fot.write(kk);fot.write(kk);fot.write(kk);fot.write(kk);fot.write(kk);fot.write(kk);  fot.write(kk);  fot.write(kk);  fot.write(kk);  fot.write(kk);  fot.write(nn);fot.write(mm);
	    	    fn.close();
	    	    fh.close();
		        fot.close();  
		        System.out.println("successfully write");  
		    }
		catch(Exception e){
		    	System.out.println(e);
		    	}  
		  }  
	}


