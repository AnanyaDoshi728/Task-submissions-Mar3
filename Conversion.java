class Convert
{  
   private int minutes;
   Convert(int minutes)
   {
       this.minutes = minutes;
   }
   void convertToYears()
   {
    int minutesInHour = 60;
    int minutesInDay = minutesInHour * 24;
    int minutesInYear = minutesInDay * 365;
    int minutes = 3456789;

    int numOfYears = minutes / minutesInYear;
    int numOfDays = (minutes % minutesInYear)/minutesInDay;

    System.out.println("3456789 minutes is approximately "+numOfYears+" years and "+numOfDays+" days");
    
   }
   
}

public class Conversion
{
  public static void main (String[]args)
  {
     int minutes = 3456789;
     Convert c1 = new Convert(minutes);
     c1.convertToYears();

  }

}
