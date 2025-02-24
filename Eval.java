public class Eval {
    String name;

    public Eval(String name) {
        // Call the eval method to validate and set the name
        this.eval(name);
    }

    public String eval(String name) { //constructor and method kinda in both
        if (name.matches(".*[123456789.].*")) { 
            throw new IllegalArgumentException("You've entered an incorrect datatype, please enter a String."); //my own exception
        }
        this.name = name;
        return name;
    }


    public String getName() {
        return name;
}
@Override public String toString()
    {
        return ("Name is: " + this.getName());
}

}


