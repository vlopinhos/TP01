/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 03-------------------------
/*
O Imperador Júlio César foi um dos principais nomes do
Império Romano. Entre suas contribuições, temos um algoritmo de criptografia chamado “Cifra-
mento de César”. Segundo os historiadores, César utilizava esse algoritmo para criptografar as
mensagens que enviava aos seus generais durante as batalhas. A ideia básica é um simples deslo-
camento de caracteres. Assim, por exemplo, se a chave utilizada para criptografar as mensagens
for 3, todas as ocorrências do caractere ’a’ são substituı́das pelo caractere ’d’, as do ’b’ por ’e’,
e assim sucessivamente. Crie um método iterativo que recebe uma string como parâmetro e
retorna outra contendo a entrada de forma cifrada. Neste exercı́cio, suponha a chave de cifra-
mento três. Na saı́da padrão, para cada linha de entrada, escreva uma linha com a mensagem
criptografada.
*/

class TP01Q03CiframentoJava{

    public static boolean isFim(String s){//recebe uma string e verifica se ela é igual a FIM

        boolean resp = false;

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){//se o tamanho da string for 3 e seus caracteres forem respectivamente F, I e M é igual a FIM

            resp = true;
        }

        return resp;
    }

    public static String cifraCesar(String s){//recebe uma string e aplica a criptografia nela

        int k = 3;//chave de ciframento
        char[] newS = s.toCharArray();//transformar a string em char
        
        for(int i=0; i < s.length(); i++){//repetir ate percorrer a string toda

            newS[i] += k;//incrementar a chave na nova string 
        }

        return String.valueOf(newS);//retornar o valor da nova string que era um char agora em string
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