import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        List<Integer> board = new ArrayList<Integer>();

        String point = "";

        for (char c: dartResult.toCharArray()) {
            if (Character.isDigit(c)) {
                point += c;
            } else {
                int index = board.size();

                switch (c) {
                    case 'S':
                        int s = Integer.parseInt(point);
                        board.add(s);
                        break;

                    case 'D':
                        int d = Integer.parseInt(point);
                        d = (int) Math.pow(d, 2);
                        board.add(d);
                        break;
                    case 'T':
                        int t = Integer.parseInt(point);
                        t = (int) Math.pow(t, 3);
                        board.add(t);
                        break;

                    case '*':
                        board.set(index - 1, board.get(index - 1) * 2);
                        if (index > 1) {
                            board.set(index - 2, board.get(index - 2) * 2);
                        }
                        break;

                    case '#':
                        board.set(index - 1, board.get(index - 1) * (-1));
                        break;
                }

                point = "";
            }
        }

        for (int data: board) {
            System.out.println(data);
            answer += data;
        }
        
        return answer;
    }
}