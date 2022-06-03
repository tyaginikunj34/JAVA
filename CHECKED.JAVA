package checked;

import java.io.*;

public class checked1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileReader file = new FileReader("c:\\test\\a.txt");
BufferedReader fileinput=new BufferedReader(file);
for (int counter=0;counter<3;counter++)
	System.out.println(fileinput.readLine());
fileinput.close();
}
}
