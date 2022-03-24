/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matrícula: 746030 
*/

//-------------------------Questão 06-------------------------
/*
Crie um método iterativo que recebe uma string e retorna true se a mesma é
composta somente por vogais. Crie outro método iterativo que recebe uma string e retorna
true se a mesma é composta somente por consoantes. Crie um terceiro método iterativo que
recebe uma string e retorna true se a mesma corresponde a um número inteiro. Crie um quarto
método iterativo que recebe uma string e retorna true se a mesma corresponde a um número
real. Na saı́da padrão, para cada linha de entrada, escreva outra de saı́da da seguinte forma X1
X2 X3 X4 onde cada Xi é um booleano indicando se a é entrada é: composta somente por vogais
(X1); composta somente somente por consoantes (X2); um número inteiro (X3); um número real
(X4). Se Xi for verdadeiro, seu valor será SIM, caso contrário, NÃO.
*/

class TP01Q06IsJava{

    public static boolean isFim(String s){//analisar se a string recebida é fim e retornar uma resposta
        
        boolean resp = false;

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){

            resp = true;
        }

       return resp;
    }

    public static boolean isVogal(String s){//recebe uma string e retorna true se ela for composta apenas por vogais

        boolean resp = false;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' ||
               s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){

                resp = true;
            }else{

                return false;
            }
        }

        return resp;
    }

    public static boolean isConsoante(String s){//recebe uma string e retorna true se ela for composta apenas por consoantes

        boolean resp = false;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'b' || s.charAt(i) == 'B' || s.charAt(i) == 'c' || s.charAt(i) == 'C' ||
               s.charAt(i) == 'd' || s.charAt(i) == 'D' || s.charAt(i) == 'f' || s.charAt(i) == 'F' ||
               s.charAt(i) == 'g' || s.charAt(i) == 'G' || s.charAt(i) == 'h' || s.charAt(i) == 'H' ||
               s.charAt(i) == 'j' || s.charAt(i) == 'J' || s.charAt(i) == 'k' || s.charAt(i) == 'K' ||
               s.charAt(i) == 'l' || s.charAt(i) == 'L' || s.charAt(i) == 'm' || s.charAt(i) == 'M' ||
               s.charAt(i) == 'n' || s.charAt(i) == 'N' || s.charAt(i) == 'p' || s.charAt(i) == 'P' ||
               s.charAt(i) == 'q' || s.charAt(i) == 'Q' || s.charAt(i) == 'r' || s.charAt(i) == 'R' ||
               s.charAt(i) == 's' || s.charAt(i) == 'S' || s.charAt(i) == 't' || s.charAt(i) == 'T' ||
               s.charAt(i) == 'v' || s.charAt(i) == 'V' || s.charAt(i) == 'w' || s.charAt(i) == 'W' ||
               s.charAt(i) == 'x' || s.charAt(i) == 'X' || s.charAt(i) == 'y' || s.charAt(i) == 'Y' ||
               s.charAt(i) == 'z' || s.charAt(i) == 'Z'){
                
                resp = true;

            }else{

                return false;
            }
        }

        return resp;
    }

    public static boolean isInt(String s){//recebe uma string e retorna true se todos os seus caracteres forem iguais a numeros inteiro

        boolean resp = false;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' ||
               s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9'){

                resp = true;
            }else{

                return false;
            }
        }

        return resp;
    }

    public static boolean isReal(String s){//recebe uma string e retorna true se for um numero e tiver uma virgula

        boolean resp = false;
        int count = 0;
        
        for(int i=0; i < s.length(); i++){

            if((s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' ||
                s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' ||
                s.charAt(i) == ',' || s.charAt(i) == '.')){
                
                resp = true;

                if(s.charAt(i) == ','|| s.charAt(i) == '.') {

                    count++;
                }
                if(count > 1){

                    return false;
                } 

            }else

                return false;
            }
        

        return resp;
    }

    public static void main(String[] args) {

        String entrada = new String();
        
        while(isFim(entrada) == false){

            entrada = MyIO.readLine();

            if(isVogal(entrada) == true){

                MyIO.print("SIM ");
            }else if(isVogal(entrada) == false){

                if(isFim(entrada) == true){

                    break;
                }

                MyIO.print("NAO ");
            }

            if(isConsoante(entrada) == true){

                 MyIO.print("SIM ");
            }else if(isConsoante(entrada) == false){

                if(isFim(entrada) == true){

                    break;
                }

                MyIO.print("NAO ");
            }

            if(isInt(entrada) == true){

                MyIO.print("SIM ");
            }else if(isInt(entrada) == false){

                if(isFim(entrada) == true){

                    break;
                }

                MyIO.print("NAO ");
            }

            if(isReal(entrada) == true){

                MyIO.println("SIM ");
            }else if(isReal(entrada) == false){

                if(isFim(entrada) == true){

                    break;
                }

                MyIO.println("NAO ");
            }
        }
    }
}