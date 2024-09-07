# Bulls and Cows

1. descrizione in 🇮🇹
2. description in 🇺🇸


## Introduzione 🇮🇹

Questo programma implementa il classico gioco **Bulls and Cows**. Il gioco genera un codice segreto composto da simboli unici, e il giocatore deve indovinare il codice segreto facendo diversi tentativi. Dopo ogni tentativo, il programma fornisce un feedback sotto forma di "bulls" e "cows":

- **Bull**: Un simbolo nella posizione corretta.
- **Cow**: Un simbolo che è presente nel codice ma nella posizione sbagliata.

L'obiettivo del gioco è indovinare completamente il codice segreto, ovvero abbinare tutti i simboli nelle posizioni corrette.

## Come funziona il gioco

- Al giocatore viene chiesto di inserire due valori:
  1. La **lunghezza** del codice segreto.
  2. Il **numero di simboli possibili** nel codice.
  
- I simboli utilizzati possono includere cifre (`0-9`) e lettere minuscole (`a-z`), a seconda del numero di simboli scelto.

- Dopo ogni tentativo, il programma fornisce un feedback basato su quanti "bulls" (simboli corretti nelle posizioni corrette) e "cows" (simboli corretti ma nelle posizioni sbagliate) ci sono nel tentativo.

- Il giocatore continua a fare tentativi fino a quando non indovina completamente il codice (cioè quando il numero di bulls corrisponde alla lunghezza del codice).

## Istruzioni per giocare

1. **Passo 1**: Esegui il programma.
   
2. **Passo 2**: Il programma chiederà:

```Enter the secret code's length:```

Inserisci un numero positivo che rappresenta la lunghezza del codice (ad es. `4` per un codice con 4 simboli).

3. **Passo 3**: Successivamente, il programma chiederà:

```Enter the number of possible symbols in the code:```

Inserisci un numero compreso tra `1` e `36` che rappresenta l'intervallo di simboli (cifre e lettere). Ad esempio:

- `10` significa che il codice utilizzerà simboli da `0-9`.
- `16` significa che il codice utilizzerà simboli da `0-9` e `a-f`.

4. **Passo 4**: Se i valori inseriti sono validi, il gioco genererà un codice segreto. Vedrai:

```The secret is prepared: **** (0-9, a-f).```

I `****` rappresentano il codice segreto nascosto (la sua lunghezza è il numero che hai inserito), e l'intervallo `(0-9, a-f)` mostra quali simboli vengono utilizzati.

5. **Passo 5**: Inizia a indovinare il codice. Il programma ti chiederà di fare un tentativo in ogni turno:

```Turn 1:```

Inserisci un tentativo composto dal numero corretto di simboli (corrispondente alla lunghezza del codice).

6. **Passo 6**: Dopo ogni tentativo, il programma fornirà un feedback. Ad esempio:

```1 bull e 2 cows```

Questo significa che 1 simbolo è nella posizione corretta (**bull**), e 2 simboli sono corretti ma nelle posizioni sbagliate (**cows**).

7. **Passo 7**: Continua a indovinare fino a quando non avrai tutti i simboli corretti:

```Congratulations! You guessed the secret code.```

## Gestione degli errori

Il programma garantisce che l'input non valido non venga accettato. Si chiuderà se:

- Viene inserito un numero non numerico o non valido per la lunghezza del codice o il numero di simboli.
- Il numero di simboli inserito è maggiore di 36 (il massimo numero possibile di simboli unici è `0-9` e `a-z`).
- La lunghezza del codice segreto supera il numero di simboli disponibili.

Esempi di messaggi di errore:

- **Lunghezza non valida**:

```Error: abc isn't a valid number.```

- **Numero di simboli non valido**:

```Error: maximum number of possible symbols in the code is 36 (0-9, a-z).```

## Esempio di gioco

```
Enter the secret code's length:
> 4
Enter the number of possible symbols in the code:
> 6
The secret is prepared: **** (0-9, a-f).
Okay, let's start a game!

Turn 1:
> 1234
1 bull and 2 cows

Turn 2:
> 1325
Congratulations! You guessed the secret code.
```

In questo esempio:
- Il codice è lungo 4 caratteri, utilizzando simboli da `0-9` e `a-f`.
- Il giocatore indovina per primo `1234`, il che produce "1 bull e 2 cows".
- Nel secondo tentativo `1325`, il giocatore indovina correttamente il codice.

## Come compilare ed eseguire il programma

1. **Compila** il programma usando un compilatore Java:

```javac -d . Main.java```

2. **Esegui** il programma:

```java bullscows.Main```

Divertiti con il gioco!




## Introduction 🇺🇸

This program implements the classic **Bulls and Cows** game. The game generates a secret code consisting of unique symbols, and the player has to guess the secret code by making several attempts. After each attempt, the program provides feedback in the form of "bulls" and "cows":

- **Bull**: A symbol in the correct position.
- **Cow**: A symbol that is present in the code but in the wrong position.

The goal of the game is to guess the secret code entirely, i.e., match all symbols in the correct positions.

## How the Game Works

- The player is prompted to input two values:
  1. The **length** of the secret code.
  2. The **number of possible symbols** in the code.
  
- The symbols used can include digits (`0-9`) and lowercase letters (`a-z`), depending on the number of possible symbols chosen.

- After each guess, the program gives feedback based on how many "bulls" (correct symbols in the correct positions) and "cows" (correct symbols but wrong positions) were in the guess.

- The player continues guessing until they correctly guess the entire code (i.e., when the number of bulls matches the length of the code).

## Instructions to Play

1. **Step 1**: Run the program.
   
2. **Step 2**: The program will prompt:

```Enter the secret code's length:```

Enter a positive number representing the length of the code (e.g., `4` for a code with 4 symbols).

3. **Step 3**: Next, the program will ask:

```Enter the number of possible symbols in the code:```

Enter a number between `1` and `36` that represents the range of symbols (digits and letters). For example:

- `10` means the code will use symbols from `0-9`.
- `16` means the code will use symbols from `0-9` and `a-f`.

4. **Step 4**: If the input values are valid, the game will generate a secret code. You will see:

```The secret is prepared: **** (0-9, a-f).```

The `****` represents the hidden secret code (its length is the number you entered), and the range `(0-9, a-f)` shows which symbols are being used.

5. **Step 5**: Start guessing the code. The program will prompt you for a guess on each turn:

```Turn 1:```

Enter a guess consisting of the correct number of symbols (matching the length of the code).

6. **Step 6**: After each guess, the program will give feedback. For example:

```1 bull and 2 cows```

This means 1 symbol is in the correct position (**bull**), and 2 symbols are correct but in the wrong positions (**cows**).

7. **Step 7**: Continue guessing until you get all symbols correct:

```Congratulations! You guessed the secret code.```

## Error Handling

The program ensures that invalid input is not accepted. It will terminate if:

- A non-numeric or invalid number is entered for the code length or number of symbols.
- The number of symbols entered is greater than 36 (the maximum possible unique symbols are `0-9` and `a-z`).
- The length of the secret code exceeds the number of available symbols.

Example error messages:

- **Invalid length**:

```Error: abc isn't a valid number.```

- **Invalid number of symbols**:

```Error: maximum number of possible symbols in the code is 36 (0-9, a-z).```

## Example Gameplay

```
Enter the secret code's length:
> 4
Enter the number of possible symbols in the code:
> 6
The secret is prepared: **** (0-9, a-f).
Okay, let's start a game!

Turn 1:
> 1234
1 bull and 2 cows

Turn 2:
> 1325
Congratulations! You guessed the secret code.
```

In this example:
- The code is 4 characters long, using symbols from `0-9` and `a-f`.
- The player first guesses `1234`, which results in "1 bull and 2 cows".
- In the second guess `1325`, the player correctly guesses the code.

## How to Compile and Run the Program

1. **Compile** the program using a Java compiler:

```javac -d . Main.java```

2. **Run** the program:

```java bullscows.Main```

Enjoy the game!
