import java.io.*;

public class ReconhecedorPalavrasReservadas {
    
    private static BufferedReader bf;
    private static int proximoCaractere;
    private static int estadoAtual;

    public static void main(String[] args) {
        try {
            bf = new BufferedReader(new FileReader("entrada.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                if (reconhecerComentario(line)) {
                    System.out.println("Entrada válida: " + line);
                } else {
                    System.out.println("Entrada inválida: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static boolean reconhecerParenteses(String entrada){
        estadoAtual = 0;
        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            transicao(caractere);
        }
        return estadoAtual  == ; 
    }

    


    private static int transicao(char caractere) {
        switch (estadoAtual) {
            case 0:
                if (caractere == 'f') {
                    estadoAtual = 1;
                } else if(caractere == 'i'){
                    estadoAtual = 2;
                } else if(caractere == 'e'){
                    estadoAtual = 3;
                } else if(caractere == 'w'){
                    estadoAtual = 4;
                } else if(caractere == 'd'){
                    estadoAtual = 5;
                } else if (caractere == 's'){
                    estadoAtual = 6;
                }
                else {
                    estadoAtual = -1; 
                }
                break;
            case 1:
                if (caractere == 'o') {
                    estadoAtual = 7;
                } else if(caractere == 'l'){
                    estadoAtual = 8;
                }else{
                    return -1;
                }
                break;
            case 2:
                if (caractere == 'f'){
                    return 21;
                } else if(caractere == 'n'){
                    estadoAtual = 10;
                } 
                else{
                    return -1;
                }
            case 3:
                if(caractere == 'l'){
                    estadoAtual = 9;
                }else{
                    return -1;
                }
            case 4:
                if(caractere == 'h'){
                    estadoAtual = 11;
                }else{
                    return -1;
                }
            case 5:
                if(caractere == 'o'){
                    return 24;
                }
            case 6:
                if(caractere == 'w'){
                    estadoAtual = 14;
                }
            
            case 7:
                if(caractere == 'r'){
                    return 20;
                }else{
                    return -1;
                }

            
            case 9: 
                if(caractere == 's'){
                    estadoAtual = 10;
                }else{
                    return -1;
                }
            case 10:
                if(caractere == 'e'){
                    return 22;
                }else{
                    return -1;
                }
            case 11:
                if(caractere == 'i'){
                    estadoAtual = 12;
                }else{
                    return -1;
                }
            case 12:
                if (caractere == 'l'){
                    estadoAtual = 13;
                }
                else{
                    return -1;
                }
            case 13:
                if(caractere == 'e'){
                    return 23;
                }
                else{
                    return -1;
                }
            case 100: 
                break; 
        }
    }
}
