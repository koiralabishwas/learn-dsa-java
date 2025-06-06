package types;

public class StringType {
  public static void main(String[] args) {
    String message = "Hello world" + "boy";
    System.err.println(message);
    System.err.println(message.endsWith("y"));
    System.err.println(message.startsWith("a"));
    System.err.println(message.indexOf("w"));

    // this doesnot modifies original string , it returns a new string 
    System.err.println(message.replace("! ",",,"));
    System.err.println(message.toUpperCase());
    System.err.println(message.toLowerCase());

    // Escape Sequences
    String escaping = "Hello\"Mosh\"asdf\n";
    System.err.println(escaping);

  }
}
