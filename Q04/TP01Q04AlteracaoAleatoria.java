import java.util.Random;
/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 04-------------------------
/*
Crie um método iterativo que recebe uma string, sorteia
duas letras minúsculas aleatórias (código ASCII ≥ ’a’ e ≤ ’z’), substitui todas as ocorrências da
primeira letra na string pela segunda e retorna a string com as alterações efetuadas. Na saı́da
padrão, para cada linha de entrada, execute o método desenvolvido nesta questão e mostre a
string retornada como uma linha de saı́da. Abaixo, observamos um exemplo de entrada supondo
que para a primeira linha as letras sorteados foram o ’a’ e o ’q’. Para a segunda linha, foram o
’e’ e o ’k’.
*/

class TP01Q04AlteracaoAleatoria{

    public static boolean isFim(String s){//analisar se a string recebida é fim e retornar uma resposta
        
        boolean resp = false;

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){

            resp = true;
        }

       return resp;
    }

    public static void main(String[] args) {//troca dois caracteres sorteados aleatoriamente, alterando eles em uma nova string

        String entrada = new String();

        Random gerador = new Random();
        gerador.setSeed(4);

        while(isFim(entrada) == false){

            entrada = MyIO.readLine();

            String newS = new String();
            char antiga = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
            char nova = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

            for(int i=0; i < entrada.length(); i++){

                if(entrada.charAt(i) == antiga){
    
                    newS += nova;
                }else{
    
                    newS += entrada.charAt(i);
                }
            }

            if(isFim(entrada) == true){

                break;
            }

            MyIO.println(newS);
        }
    }
}