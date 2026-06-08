public int getPointsForRow(int targetRow) {
  int total = 0;
  int bonus = 0;

  for (int c = 0; i < board[targetRow].length; c++ {
      onBoard = board[targetRow][c];
      nextBoard = board[targetRow][c+1];
        
      total += newBoard.getPoints();

      if (onBoard.getColor().equals(nextBoard.getColor())) {
        bonus++;
      } 
    }
  }

  if (bonus == 5) {
    total *= 2;
  }

  return total;

}
