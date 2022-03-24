/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 13-------------------------
/*
Refaça a questão Ciframento de César
de forma recursiva.
*/

class TP01Q13CiframentoRecursivo{

    public static boolean isFim(String s){//recebe uma string e verifica se ela é igual a FIM

        boolean resp = false;

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){//se o tamanho da string for 3 e seus caracteres forem respectivamente F, I e M é igual a FIM

            resp = true;
        }

        return resp;
    }

    public static String cifraCesar(String s){//chamada do valor de i na recursiva

        return cifraCesar(s, 0);
    }

    public static String cifraCesar(String s, int i){//recebe uma string e aplica a criptografia nela de forma recursiva

        String s2 = "";

        if(i < s.length()){

            s2 += (char)(s.charAt(i) + 3);
            s2 += cifraCesar(s, i + 1);
        }

        return s2;
    }

    public static void main(String[] args) {
        
        String entrada = new String();

        while(true){//repetir infinitamente

            entrada = MyIO.readLine();//ler as entradas

            if(isFim(entrada)){//parar quando for FIM

                break;
            }

            MyIO.println(cifraCesar(entrada));//imprimir a nova string ja criptografada
        }
    }
}