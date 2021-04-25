package patyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author he ������(Callatz)���룺
 * 
 *         ���κ�һ�������� n���������ż������ô��������һ�룻���������������ô�� (3n+1)
 *         ����һ�롣����һֱ��������ȥ�����һ����ĳһ���õ� n=1���������� 1950
 *         ���������ѧ�Ҵ���Ϲ�����������룬��˵��ʱҮ³��ѧʦ���붯Ա��ƴ����֤�����ò�ƺ�ɵ����������⣬����ֵ�ѧ��������ѧҵ��һ��ֻ֤
 *         (3n+1)������������˵����һ����ı�����������������ӻ�������ѧ���ѧ����еĽ�չ����
 * 
 *         ���ǽ������Ŀ����֤�������Ȳ��룬���ǶԸ�������һ������ 1000 �������� n���򵥵���һ�£���Ҫ���ٲ��������£����ܵõ� n=1��
 * 
 *         �����ʽ�� ÿ������������� 1 ������������������������ n ��ֵ��
 * 
 *         �����ʽ�� ����� n ���㵽 1 ��Ҫ�Ĳ�����
 * 
 *         ���������� 3 ��������� 5
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
