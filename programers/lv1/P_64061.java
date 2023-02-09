package programers.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P_64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;


        List<Integer>[] list = new List[board.length];


        Stack<Integer>[] stack = new Stack[board.length];

        for (int i = 0; i < stack.length ; i++) {
            stack[i] = new Stack<>();
        }


        for (int i = board.length-1; i >= 0; i--) {
            for (int j = board.length-1; j >= 0 ; j--) {
                if(board[j][i] != 0){
                    stack[i].push(board[j][i]);
                }
            }
        }

        ArrayList<Integer> array = new ArrayList<>();

        array.add(stack[moves[0]-1].pop());

        for (int i = 1; i <moves.length ; i++) {
            if(!stack[moves[i]-1].isEmpty()) {
                if(stack[moves[i]-1].peek() == array.get(array.size()-1)){
                    stack[moves[i]-1].pop();
                    array.remove(array.size()-1);
                    answer = answer + 2;
                }else {
                    ;array.add(stack[moves[i]-1].pop());
                }
            }
        }

        return answer;

    }



    public static void main(String[] args) {
        P_64061 p = new P_64061();

        int[][] board = {{0,0,0,0},{0,0,0,0},{0,4,4,0},{1,2,2,1}};
        int[] moves = {2, 3, 1, 4, 2, 3};

        System.out.println(p.solution(board,moves));
    }
}
