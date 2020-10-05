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
			 FileInputStream file = new FileInputStream("/home/alienmj/arquivos/arquivo.txt");
			 GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("/home/alienmj/arquivos/file.gz"));
			 
			 int length;
			 while((length = file.read(buffer)) > 0) {
				 gos.write(buffer, 0, length);
			 }
			 
			 file.close();
			 gos.close();
			 System.out.println("Arquivo comprimido com sucesso");
			 
		 }catch (Exception e) {
			 e.printStackTrace();
 		}
	 } 
	
}
