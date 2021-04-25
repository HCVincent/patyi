package patyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author he 卡拉兹(Callatz)猜想：
 * 
 *         对任何一个正整数 n，如果它是偶数，那么把它砍掉一半；如果它是奇数，那么把 (3n+1)
 *         砍掉一半。这样一直反复砍下去，最后一定在某一步得到 n=1。卡拉兹在 1950
 *         年的世界数学家大会上公布了这个猜想，传说当时耶鲁大学师生齐动员，拼命想证明这个貌似很傻很天真的命题，结果闹得学生们无心学业，一心只证
 *         (3n+1)，以至于有人说这是一个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进展……
 * 
 *         我们今天的题目不是证明卡拉兹猜想，而是对给定的任一不超过 1000 的正整数 n，简单地数一下，需要多少步（砍几下）才能得到 n=1？
 * 
 *         输入格式： 每个测试输入包含 1 个测试用例，即给出正整数 n 的值。
 * 
 *         输出格式： 输出从 n 计算到 1 需要的步数。
 * 
 *         输入样例： 3 输出样例： 5
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(in.readLine());
		in.close();
		int count = 0;
		while (input != 1) {
			if (input % 2 == 0)
				input /= 2;
			else
				input = (input * 3 + 1) / 2;
				
			count++;
		}
		System.out.println(count);
	}

}
