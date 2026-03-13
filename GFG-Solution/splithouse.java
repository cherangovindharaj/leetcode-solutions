class solution{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b = sc.next();
    if(b.contains("HH")) {
      System.out.println("NO");
    }
    else{
      System.out.println("YES");
      String t = b.replace(".","B");
      System.out.println(t);
    }
  }
}
