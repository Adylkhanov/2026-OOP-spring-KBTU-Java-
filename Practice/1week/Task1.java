public static void main(String[] args) {

  String name = "Alisher";

  String borders = "+" + "-".repeat(name.length()) + "+";
  String full_name = "|" + name + "|";

  System.out.println(borders);
  System.out.println(full_name);
  System.out.println(borders);
}