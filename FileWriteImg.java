import java.io.*;

class FileWriteImg 
{
	public static void main(String arg[]) throws Exception 
	{
        	FileInputStream fin = new FileInputStream("h3.jpg");
        	FileOutputStream fos = new FileOutputStream("New.jpg");

        	int data;

       		while ((data = fin.read()) != -1) 
		{
            		fos.write(data);
        	}

        fos.flush();
        fos.close();
        fin.close();

        System.out.println("Image copied successfully!");
    }
}
