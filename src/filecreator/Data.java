package filecreator;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
public class Data {
	private void fileDetails() throws IOException
	{
File f = new File("TEXT");
System.out.println("does the file exist? " + f.exists());

	if(f.exists())
	{
	BufferedReader br = new BufferedReader(new FileReader(f));
	
	
	String st;
	while ((st = br.readLine()) != null);
	{
		System.out.println(st);
	}
	}
	}


public static void main(String[] args)
{
	Data rf = new Data();
	try
	{
		rf.fileDetails();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
}

}