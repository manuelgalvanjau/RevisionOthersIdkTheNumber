public class codigo6 {
    public static void main(String[] args) { // Agregue el método principal xD

        int[] n = new int[20]; // Le hacia falta "new" y se lo agregue pa' que estuviera ok

        for (int i = 0; i < 20; i++) { // Le agregue una + en el bucle for
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " "); // Se corrigió un error de sintaxis en la instrucción de impresión
        }
        
        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = Integer.parseInt(System.console().readLine()); // faltaban () al final en el método Integer.parseInt

        int multiplo = (opcion == 1) ? 5 : 7; // Inverti : y ? en el operador ternario para agregarle el valor.

        for (int e : n) { // cambie el forEach por un for solamente y el char por int
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " "); // Le faltaba la llave antes de el else.
            }
        }
    }
}
