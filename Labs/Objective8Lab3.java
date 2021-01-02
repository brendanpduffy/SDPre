public class Objective8Lab3 {
  public static void main(String[] args) {

    for (int i=1; i<=20; i+=1){

      int x = i % 2;
      if(x==0){
        System.out.println(i + " is even");
      }
      else if (x != 0){
        System.out.println(i + " is odd");
      }
    }
  }
}
