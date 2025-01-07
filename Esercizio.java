public static void main(String args[])
{
   Scanner in = new Scanner(System.in);
    
   int n;
   int duplicati;

   System.out.print("Inserire la granzedda del vettore: ");
   n = in.nextInt();
   int v[] = new int[n];
   for(int i = 0; i < n; i++){
    System.out.print("Inserire il " + (i+1) + " numero: ");
    v[i] = in.nextInt();
   }
   
   boolean visitato[] = new boolean[n];

   for(int i = 0; i < n; i++){
        if(!visitato[i]){
            duplicati = 1;
            for(int j = i+1; j < n; j++){
                if(v[i] == v[j]){
                    duplicati++;
                    visitato[j] = true;
                    System.out.println("Il valore " + v[i] + " occorre nelle posizioni " + i + "," + j );
                }
            }
            if(duplicati > 1){
                System.out.println("E' stato inserito " + duplicati + " volte");
            }
        }
    }

}


//LEGGERE LE ISTRUZIONI NEL FILE README.md