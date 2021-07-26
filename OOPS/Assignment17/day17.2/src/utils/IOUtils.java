package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Student;

public interface IOUtils {
	//add a static method to store sorted student details , in text file , using buffer
	 static void storeData(String fileName,List<Student> list) throws IOException
	{
		//Java App ---> PW ---> FW --> Text File
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			//write student details from the list ---> PW ---> FW --> text file
			list.forEach(s -> pw.println(s));
		}
	}

}
