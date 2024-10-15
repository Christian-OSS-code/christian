public class GreatPyramidOfGiza{
 public static void main(String[] args){
  int numberOfStones = 2300000;
  double aveargeWeightOfEachStone = 2.5;
  double weightOfTotalStone = numberOfStones*aveargeWeightOfEachStone;
  int numberOfYears = 20;
  int daysInAYear = 365;
  int hoursInAYear = (daysInAYear)*24;
  int minutesInAYear = (hoursInAYear)*60;
  double averageWeightEachYear = weightOfTotalStone/numberOfYears;
  double averageWeightEachHour = averageWeightEachYear/hoursInAYear;
  double averageWeightEachMinute = averageWeightEachHour/60;
  System.out.printf("averageWeightEachYear is %.3f tonnes, averageWeightEachHour is %.3f tonnes and averageWeightEachMinute is %.3f tonnes", averageWeightEachYear, averageWeightEachHour, averageWeightEachMinute);
 }
} 
 PSEUDOCODE
Stage 1
calculate the estimate of how much by weight of the pyramid was built each, hour and minute
display the results
Stage2
-Enter average weight of each stone as 2.5
- Enter number of stones as 2300000
- Enter number of years as 20 years
- Calculate
- weight of total stones using; number of stones*avearge weight of each stone and save it as"weight of total stone"
- average weight each year using; (weight of total stone)/number of years
- store the result as "average weight each year"
- average weight each hour using; (average weight each year)/(365*24)
- Store the result as average weight each hour
- Average weight each minute using; (average weight each hour)/60
- Store the result as average weight each minute
- Display "average weight each year", "average weight each hour" and "average weight each minute" respectively in one line.

 
  