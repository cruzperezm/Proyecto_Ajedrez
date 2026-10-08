public class Rank {
    private final int value;
    public Rank(int value){
        this.value = value;
    }
    // si es static pertenece a la clase, no al objeto. Se puede pedir a la clase directamente.
    public static final Rank R1 = new Rank(1);  
    
}