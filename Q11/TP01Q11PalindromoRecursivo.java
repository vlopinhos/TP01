/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 11-------------------------
/*
Refaça a questão Palı́ndromo de forma recursiva.
*/

class TP01Q11PalindromoRecursivo{

    public static boolean isFim(String s){//analisar se a string recebida é fim e retornar uma resposta

        boolean resp = false;

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){

            resp = true;
        }

       return resp;
    }

    public static String inverteString(String s){//inverte uma string de forma recursiva

        if(s.isEmpty()){
            return s;
        }
        
        return inverteString(s.substring(1)) + s.charAt(0);
    }

    public static boolean isPalindromo(String s){//confere a diferença entra duas strings, se for 0 elas são iguais

        boolean resp = false;
        String invertida = inverteString(s);

        int dif = s.compareTo(invertida);

        if(dif == 0){

            resp = true;
        }else{

            resp = false;
        }

        return resp;
    }

    public static void main(String[] args) {
        
        String entrada = new String();

        while(isFim(entrada) == false){

            entrada = MyIO.readLine();

            if(isPalindromo(entrada) == true){

                MyIO.println("SIM");
            }else if(isPalindromo(entrada) == false){

                if(isFim(entrada) == true){

                    break;
                }else{

                    MyIO.println("NAO");
                }
            }
        }   
    }
}