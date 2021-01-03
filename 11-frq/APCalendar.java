class APCalendar{
  public static void main(String[] args){
      System.out.println(numberOfLeapYears(2000,2020));
  }
  public static boolean isLeapYear(int year){
    if (year % 4 == 0){
      if (year % 100 == 0){
        if (year % 400 == 0){
          return true;
        }
        return false;
      }
      return true;
    }
    return false;
  }
  public static int numberOfLeapYears(int year1, int year2){
    int count = 0;
    for(int i = year1; i <= year2; i++){
      if(isLeapYear(i)){
        count++;
      }
    }
    return count;
  }
  public static firstDayOfYear(int year){
    return 0;
  }
  public static int dayOfYear(int month, int day, int year){
    return 0;
  }
  public static int dayOfWeek(int month int day, int year){
    int firstDay = firstDayOfYear(year);
    int day = dayOfYear(month, day, year);
    return (firstDay + day) % 7;
  }
}
