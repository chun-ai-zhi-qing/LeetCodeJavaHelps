public class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0,y = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]=='R'){
                    x = i;
                    y = j;
                }
            }
        }
        int tmp =x-1 ;
        int ans = 0;
        while(tmp != -1){
            if(board[tmp][y]=='B')
                break;
            if(board[tmp][y]=='p'){
                ans++;
                break;
            }
            tmp--;
        }
        tmp = x;
        while(tmp != 8){
            if(board[tmp][y]=='B')
                break;
            if(board[tmp][y]=='p'){
                ans++;
                break;
            }
            tmp++;
        }
        tmp = y;
        while(tmp != 8){
            if(board[x][tmp]=='B')
                break;
            if(board[x][tmp]=='p'){
                ans++;
                break;
            }
            tmp++;
        }
        tmp = y;
        while(tmp != -1){
            if(board[x][tmp]=='B')
                break;
            if(board[x][tmp]=='p'){
                ans++;
                break;
            }
            tmp--;
        }
        return ans;
    }
}