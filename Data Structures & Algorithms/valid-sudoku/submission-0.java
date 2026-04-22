class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> tracker = new HashSet<>();
        for(int i=0; i< board.length; i++){
            for(int j=0; j<board[i].length; j++){

                if (board[i][j] == '.') continue;
                
                String rowkey = board[i][j] + "in row" +i;
                String colkey = board[i][j] + "in col" +j;
                String sqKey = board[i][j] + "in sq" + i/3 + "-" +j/3;

                if(!tracker.add(rowkey) || 
                !tracker.add(colkey) ||
                !tracker.add(sqKey)){
                    return false;
                }

            }
        }
        return true;
    }
}
