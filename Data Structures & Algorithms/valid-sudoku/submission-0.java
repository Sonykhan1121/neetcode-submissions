class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // each row 1- 9 no dublicate
        // each column 1 -9 no dublicate
        // device 9x9 into 9 3X3 box and check any dublicate
        HashMap<Integer,HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer,HashSet<Character>> columnMap = new HashMap<>();
        HashMap<Integer,HashSet<Character>> nineBox = new HashMap<>();
        for(int i =0;i<9;i++)
        {
            for(int j =0;j<9;j++)
            {
                if(board[i][j]=='.')
                    continue;
                
                if(rowMap.containsKey(i))
                {
                    if(rowMap.get(i).contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        rowMap.get(i).add(board[i][j]);
                    }
                }
                else
                {
                    HashSet<Character> temp = new HashSet<>();
                    temp.add(board[i][j]);
                    rowMap.put(i,temp);
                }


                 if(columnMap.containsKey(j))
                {
                    if(columnMap.get(j).contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        columnMap.get(j).add(board[i][j]);
                    }
                }
                else
                {
                    HashSet<Character> temp = new HashSet<>();
                    temp.add(board[i][j]);
                    columnMap.put(j,temp);
                }

                int index = (i/3)*3 +(j/3);

                if(nineBox.containsKey(index))
                {
                    if(nineBox.get(index).contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        nineBox.get(index).add(board[i][j]);
                    }
                }
                else
                {
                     HashSet<Character> temp = new HashSet<>();
                    temp.add(board[i][j]);
                    nineBox.put(index,temp);
                }

            

            }
        }



       return true;

        
    }
}
