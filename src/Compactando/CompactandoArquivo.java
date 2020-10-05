package Compactando;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class CompactandoArquivo {
  
	public static void main(String[] args) {
		
		CompactandoArquivo zipCom = new CompactandoArquivo();
		zipCom.ZipFile();
 	}
	
	 public void ZipFile() {
		 byte[] buffer = new byte[1024];
		 
		 try {
			 GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("/home/alienmj/arquivos/file.gz"));
			 FileInputStream file = new FileInputStream("/home/alienmj/arquivos.txt");
			 
			 
		 }catch (Exception e) {
			 e.printStackTrace();
 		}
	 } 
	
}
