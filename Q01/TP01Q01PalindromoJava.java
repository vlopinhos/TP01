/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matrícula: 746030 
*/

//-------------------------Questão 01-------------------------
/*
Palindromo em Java - Crie um método iterativo que recebe uma string como parâmetro e
retorna true se essa é um palı́ndromo. Na saı́da padrão, para cada linha de entrada, escreva
uma linha de saı́da com SIM/NÃO indicando se a linha é um palı́ndromo. Destaca-se que uma
linha de entrada pode ter caracteres não letras. A entrada termina com a leitura de FIM.
*/

class TP01Q01PalindromoJava{

    public static boolean isFim(String s){//analisar se a string recebida é fim e retornar uma resposta
        
        boolean resp = false;

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){

            resp = true;
        }

       return resp;
    }

    public static String inverteString(String s){//inverte uma string

        String sInvertida = new String();

        for(int i = s.length() - 1; i >= 0; i--){

            sInvertida += s.charAt(i);
        }

        return sInvertida;
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