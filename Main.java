class Main {
  public static void main(String[] args) {
    //This solves a problem
    int counter = 0;
    for(int x = 1; x < 10; x++){
      if(x % 3 == 0 || x % 5 == 0){
        counter -= -x;
      }
    }
    System.out.println("The sum of all numbers that are divisible by 3 and 5 and under 10 is " + counter);
  }
}