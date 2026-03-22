# Ripasso veloce - Fondamenti di Informatica

## Struttura base
```java
import java.util.Scanner;
import java.util.Locale;

public class NomeClasse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        // codice qui

        scan.close();
    }
}
```

## Tipi di variabili
```
int = numeri interi
double = numeri con virgola
String = testo
char = singolo carattere
boolean = true o false
```

## Input da tastiera
```java
int n = scan.nextInt();
double d = scan.nextDouble();
String s = scan.next();         // una parola
String riga = scan.nextLine();  // riga intera
char c = scan.next().charAt(0); // un carattere
```

## Operatori
```
+  -  *  /  %              // aritmetici
==  !=  <  >  <=  >=       // confronto
&&  ||  !                   // logici (e, o, non)
+=  -=  *=  /=             // assegnamento composto
i++  i--                    // incremento / decremento
```

## If / else if / else
```java
if (condizione) {
    // codice
} else if (altra condizione) {
    // codice
} else {
    // codice
}
```

## Switch
```java
switch (variabile) {
    case valore1:
        // codice
        break;
    case valore2:
        // codice
        break;
    default:
        // codice
        break;
}
```

## While (non sai quanti giri)
```java
while (condizione) {
    // codice
}
```

## Do-While (almeno una volta)
```java
do {
    // codice
} while (condizione);
```

## For (sai quanti giri)
```java
for (int i = 0; i < n; i++) {
    // codice
}
```

## Array
```java
int[] numeri = new int[5];          // vuoto
int[] numeri = {10, 20, 30, 40};   // con valori
numeri[0]  // primo elemento
numeri.length  // lunghezza
```

## Scorrere un array
```java
for (int i = 0; i < numeri.length; i++) {
    // numeri[i] è l'elemento corrente
}
```

## Somma e media di un array
```java
double somma = 0;
for (int i = 0; i < numeri.length; i++) {
    somma += numeri[i];
}
double media = somma / numeri.length;
```

## Massimo di un array
```java
int max = numeri[0];
for (int i = 1; i < numeri.length; i++) {
    if (numeri[i] > max) {
        max = numeri[i];
    }
}
```

## Conta pari
```java
int contatore = 0;
for (int i = 0; i < numeri.length; i++) {
    if (numeri[i] % 2 == 0) {
        contatore++;
    }
}
```

## Shift a sinistra
```java
for (int i = 0; i < numeri.length - 1; i++) {
    numeri[i] = numeri[i + 1];
}
// il primo elemento si perde, l'ultimo si duplica
```

## Rotazione a sinistra (il primo va in fondo)
```java
int primo = numeri[0];
for (int i = 0; i < numeri.length - 1; i++) {
    numeri[i] = numeri[i + 1];
}
numeri[numeri.length - 1] = primo;
```

## Metodi
```java
// void: non ritorna niente
public static void saluta(String nome) {
    System.out.println("Ciao " + nome);
}

// con return: ritorna un valore
public static int somma(int a, int b) {
    return a + b;
}
```

## OOP - Classe
```java
public class Persona {
    private String nome;
    private int eta;

    // costruttore: stesso nome della classe, no tipo di ritorno
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // getter: legge un attributo
    public String getNome() { return nome; }

    // setter: modifica un attributo
    public void setEta(int eta) { this.eta = eta; }
}
```

## OOP - Creare un oggetto
```java
Persona p1 = new Persona("Mario", 25);
p1.getNome();    // legge il nome
p1.setEta(26);   // cambia l'età
```

## Errori comuni
- = assegna, == confronta
- for: usare < e non <= con array
- punto e virgola dopo for() = bug
- switch: non dimenticare break
- costruttore = stesso nome della classe
- attributi private, accesso con getter/setter
- String si confronta con .equals(), non ==
