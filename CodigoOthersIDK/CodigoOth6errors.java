public class codigo6 {
	  
    int[] n = int[20];

    for (int i = 0; i < 20; i+) {
      n[i] = (int)(Math.random() * 381) + 20;
      System.print(n[i] + " ");
    }
    
    System.out.printl("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(System.console().readLine();

    int multiplo = (opcion == 1) : 5 ? 7;

    foreach (char e : n) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
       else {
        System.in.print(e + " ");
      }
    }
  
}