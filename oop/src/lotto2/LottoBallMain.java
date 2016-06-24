package lotto2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileWriter;

/**
 * @date :2016. 6. 24.
 * @author :오승준
 * @file :SBSMain.java
 * @story :
 */
public class LottoBallMain {
		public static void main(String[] args) {
			LottoBean lot = new LottoBean();
			LottoBallService service = new LottoBallServiceImpl();
			StringBuffer buf = new StringBuffer();
			service.setLottoBall(lot);
			int[] lottos = service.getLottoBall();
			for (int i = 0; i < lottos.length; i++) {
				Arrays.sort(lottos);
				buf.append(lottos[i]+" ");
				buf.append("");
	}
		System.out.println("로또\n"+buf);
		
		File output = new File("C:\\eclipse\\lotto\\Lottoball.txt");
		BufferedWriter bw = null;
		String[] myLotto = buf.toString().split("/");

		try{
		bw = new BufferedWriter(new FileWriter(output, true));
			for (String lots : myLotto) {
				bw.write(lots);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				bw.flush(); // 
				bw.close(); // 
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	}