package u08_a05;

public class Piano extends Instrumento {

    public Piano() {
        super(); 
    }

    @Override 
    public void interpretar() {
        for (Nota nota : melodia) {
            switch (nota) {
                case DO -> System.out.print("do ");
                case RE -> System.out.print("re ");
                case MI -> System.out.print("mi ");
                case FA -> System.out.print("fa ");
                case SOL -> System.out.print("sol ");
                case LA -> System.out.print("la ");
                case SI -> System.out.print("si ");
            }
        }
        System.out.println(""); // Salto de línea al final
    }
}
