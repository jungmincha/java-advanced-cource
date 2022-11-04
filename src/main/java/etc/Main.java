package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();

    }
}


/*
 * 
 * 
 * int num = sc.nextInt();
 * 
 * int rstNum[] = new int[num];
 * 
 * for (int i = 0; i <= rstNum.length - 1; i++) {
 * 
 * int a = sc.nextInt();
 * 
 * int b = sc.nextInt();
 * 
 * rstNum[i] = a + b;
 * }
 * 
 * for (Integer i : rstNum) {
 * System.out.println(i);
 * }
 * 
 * for (int i = 1; i <= 9; i++) {
 * System.out.println(num + " * " + i + " = " + num * i);
 * }
 * 
 * 1차원 배열 문제
 * String limitstr = sc.nextLine();
 * int limitInt = Integer.parseInt(limitstr);
 * String str = sc.nextLine();
 * List<Integer> list = new ArrayList<>();
 * list.stream().limit(limitInt);
 * 
 * String[] strSpaceBar = str.split("\\s");
 * 
 * for (String s : strSpaceBar) {
 * list.add(Integer.parseInt(s));
 * }
 * 
 * int max = list.get(0);
 * int min = list.get(0);
 * for (Integer i : list) {
 * 
 * if (max < i) {
 * max = i;
 * 
 * } else if (min > i) {
 * min = i;
 * }
 * }
 * System.out.println(min + " " + max);
 * }
 * 
 * if (a == 0) {
 * a = 24;
 * if (b >= 45) {
 * a = 0;
 * }
 * }
 * int tempNum = b - 45;
 * if (tempNum < 0) {
 * b = tempNum + 60;
 * a = a - 1;
 * } else {
 * b = tempNum;
 * }
 * System.out.println(a + " " + b);
 * 4번 문제
 * 
 * // if (a > b) {
 * // System.out.println(">");
 * // } else if (a < b) {
 * // System.out.println("<");
 * // } else if (a == b) {
 * // System.out.println("==");
 * // }
 * // sc.close();
 * 
 * 1번문제
 * int varNumb = 10000000;
 * int tempNumb = 0;
 * 
 * System.out.println("==정답==");
 * for (int i = 1; i <= varNumb; i++) {
 * 
 * tempNumb = tempNumb + i;
 * 
 * }
 * System.out.println(tempNumb);
 * System.out.println(varNumb*(varNumb+1)/2);
 */

/*
 * 2번 문제
 * 17, 92, 18, 33, 58, 7, 33, 42와 같이 숫자가
 * 여덟 개가 있을 때 최댓값은 92입니다.
 */
// int numArrays[] = {17, 92, 18, 33, 58, 7, 33, 42};
// List<Integer> arrList = new ArrayList<>();
// arrList.add(17, 92);

// int maxValue = numArrays[0];

// for(int i : numArrays){
// if(maxValue < i){
// maxValue = i;
// }
// }
// System.out.println(maxValue);

/*
 * 3번 문제
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * 
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 */
