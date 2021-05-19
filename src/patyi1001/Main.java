package patyi1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(in.readLine());
		in.close();
		int count = 0;
		while (input != 1) {
			if (input % 2 != 0)
				input = input * 3 + 1;
			input /= 2;
			count++;
		}
		System.out.print(count);
	}

}
