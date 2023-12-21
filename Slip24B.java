import java.io.*;
class Slip24B
{
  public static void main(String args[]) throws Exception
  {
      FileReader fr=new FileReader(args[0]);
      int data=0;
      int ca=0,cd=0,cs=0;
      while(data!=-1)
      {
        data=fr.read();
        char ch=(char)data;
        if(ch>='0' && ch<='9')
        {
         cd++;
        }
        else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
     	 ca++;
        }
        else if(ch==' ')
        {
        cs++;
        }
      }
         System.out.println("Total digits:"+cd);
         System.out.println("Total charater:"+ca);
         System.out.println("Total spaces:"+cs);
         fr.close();
 }

}