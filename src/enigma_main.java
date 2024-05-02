public class enigma_main {
    public static void main(String[] args){
        Plugboard plugboard = new Plugboard("ABCD");
        System.out.println(plugboard);
    }
}
class Plugboard {
    String wires;
    public Plugboard(String wires) throws InvalidPlugboardWiresException {
        this.wires = wires;
        if(wires.length() % 2 != 0) throw new  InvalidPlugboardWiresException("exc");
    }

    public String process(String wire) {
        // text
    }
}
class InvalidPlugboardWiresException extends Exception{

}

