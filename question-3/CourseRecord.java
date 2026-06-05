public int moreHistoryThanMathAbsences() {
  int count = 0;
  
  for (CourseRecord history : historyList) {
    
    for (CourseRecord math : mathList) {

      if math.getStudentID().equals(history.getStudentID()) {
        if (history.getAbsences() > math.getAbsences()) {
          count++
        }
      }
      
    }
    
  }
  
  return count;
}
