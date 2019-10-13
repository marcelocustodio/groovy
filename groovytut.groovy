class GroovyTut {

  static void main(String[] args) {
    println("Hello World");
    def age="dog";
    age=40;

    println(5+4);

    def king = new Animal('King', 'Growl');

    println("$king.name says $king.sound");

    king.setSound('Grrrr');

    println("$king.name says $king.sound");

    king.run();

    def grover = new Dog('Grover', 'Grrrr', 'Derek');

    king.makeSound();
    grover.makeSound();

    print("Whats your name ");
    def fName = System.console().readLine();
    println("Hello " + fName);
  }

}
