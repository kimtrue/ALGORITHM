package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test7 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int a, c, d;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(br.readLine());
			int[] cnt = new int[a];
			for(int i = 0 ; i < a; i++) {
			 c = Integer.parseInt(st.nextToken());
			 d = Integer.parseInt(st.nextToken());
			 cnt[i] = c + d;
			}
			for(int i = 0 ; i < a; i++) {
				 bw.write(cnt[i]);
			}
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
			
		

