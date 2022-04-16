import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
 
public class Readme
{   
    public static void main(String[] args) throws IOException
    {  

//Use BufferReader as size is not known 
//Declare two BufferReaders for two files 

 BufferedReader R1 = null;
 BufferedReader R2 = null;

// Declaring two Lists of type Strings

List<String> file1 = new ArrayList<String>();
List<String> file2 = new ArrayList<String>();

//Read file 1 
R1 = new BufferedReader(new FileReader("C:/BPC/input.txt"));

String st;

//until R1 is null add and store each line to list as type string 

while ((st=R1.readLine()) != null) {
file1.add(st);
}

// Repeat same to R2 and store data in string 
R2 = new BufferedReader(new FileReader("C:/BPC/compare.txt"));

while ((st = R2.readLine()) != null) {
file2.add(st);
}

//System.out.println(file1);
//System.out.println(file2);

//For each string in compare.txt check with every name inside input.txt 
//Used contains as name can be any of the first name and last name

 for( int j = 0; j < file2.size(); j++ ){    
   for (int i = 0; i < file1.size(); i++){
     if(file1.get(i).toLowerCase().contains(file2.get(j).toLowerCase()))
     {    
         System.out.println(file1.get(i));
     }
}
}
}}