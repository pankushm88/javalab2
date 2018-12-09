
package dictionary;
import java.io.*;
import java.util.*;
 public class Dictionary { public static void main(String arg[]) throws Exception   {
 File file1=new File("C:\\Users\\ridhima\\Downloads\\HW2-dictionary.txt");   
 //reading dictionary file
	Scanner sc1=new Scanner(file1);
	File file2=new File("C:\\Users\\ridhima\\Downloads\\HW2-Keywords.txt");       
//reading keyword file
	Scanner sc2=new Scanner(file2);
//creating output class
FileWriter fw=new FileWriter("C:\\Users\\ridhima\\Desktop\\Output1.txt");     
	  int c=0;
	int q=0,x=0;
	String p="";
	String r="";
	sort_search ob=new sort_search();
	String dict[]=new String[16000],keywords[]=new String[84];
	 while(sc1.hasNextLine())      //reading dictionary file line by line
               {p=sc1.nextLine();
	  dict[q++]=p;}                 // making dictionary array
	  while(sc2.hasNextLine())      //reading keyword file line by line
	 { r=sc2.nextLine();
	 keywords[x++]=r;}            //making an array of keywords
	  ob.sort(dict,16000);        // calling sort function in sort_search class
	 ob.sort(keywords,84);
	  for(int i=0;i<84;i++)
           {   //calling search function in sort_search class
	if(ob.search(dict,0,15999,keywords[i])==0)
	{fw.write("Keyword not found:"+keywords[i]);
		fw.write("\r\n");
		c++;} }
	 fw.write(" Number of Keyword not found:"+c);
	 sc1.close();
	 sc2.close();
	 fw.close();
	 System.out.println("FILE CREATED");
	 }	 }
   
