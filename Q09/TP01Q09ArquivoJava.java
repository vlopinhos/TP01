import java.io.RandomAccessFile;
import java.io.*;

/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 09-------------------------
/*
Faça um programa que leia um número inteiro n indicando o número de
valores reais que devem ser lidos e salvos sequencialmente em um arquivo texto. Após a leitura
dos valores, devemos fechar o arquivo. Em seguida, reabri-lo e fazer a leitura de trás para frente
usando os métodos getFilePointer e seek da classe RandomAccessFile e mostre todos os valores
lidos na tela. Nessa questão, você não pode usar, arrays, strings ou qualquer estrutura de dados.
A entrada padrão é composta por um número inteiro n e mais n números reais. A saı́da padrão
corresponde a n números reais mostrados um por linha de saı́da.
*/

class TP01Q09ArquivoJava{
    
    public static void main(String[] args) throws Exception{

        int n = MyIO.readInt();
        double r;

        RandomAccessFile raf = new RandomAccessFile("arq.txt", "rw");

        for(int i = 0; i < n; i++){

            r = MyIO.readDouble();
            raf.writeDouble(r);
        }

        raf.close();

        raf = new RandomAccessFile("arq.txt", "r");

        for(int i = n -1; i >=0; i--){

            raf.seek(i * 8);
            double num = raf.readDouble();

            if(num == (int)num){

                MyIO.println((int)num);
            }else{

                MyIO.println(num);
            }
        }

        raf.close();
    }
}