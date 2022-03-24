import java.io.*;
import java.net.*;

/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 08-------------------------
/*
Leia duas strings sendo que a primeira é o nome de
uma página web e a segunda, seu endereço. Por exemplo, “Pontifı́cia Universidade Católica de
Minas Gerais” e “www.pucminas.br”. Em seguida, mostre na tela o número de vogais (sem e
com acento), consoantes e dos padrões “< br >” e “< table >” que aparecem no código dessa
página. A entrada padrão é composta por várias linhas. Cada uma contém várias strings sendo
que a primeira é um endereço web e as demais o nome dessa página web. A última linha da
entrada padrão contém a palavra “FIM”. A saı́da padrão contém várias linhas sendo que cada
uma apresenta o número de ocorrência (valor xi entre parênteses) de cada caractere ou string
solicitado. Cada linha de saı́da será da seguinte forma: a(x1 ) e(x2 ) i(x3 ) o(x4 ) u(x5 ) á(x6 ) é(x7 )
ı́(x8 ) ó(x9 ) ú(x10 ) à(x11 ) è(x12 ) ı̀(x13 ) ò(x14 ) ù(x15 ) ã(x16 ) õ(x17 ) â(x19 ) ê(x19 ) ı̂(x20 ) ô(x21 )
û(x22 ) consoante(x23 ) < br >(x24 ) < table >(x25 ) nomepágina(x26 ).
*/

class TP01Q08LeituraHtml{

    public static boolean isFim(String s){//retorna true se a string for igual a FIM

        boolean resp = false;

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){

            resp = true;
        }

        return resp;
    }

    public static int contarA(String s){//retorna o valor da letra a

        int a = 0;
        boolean resp = false;
        int contador = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'a'){

                a++;
            }

            if(s.charAt(i) == '<' && s.charAt(i+1) == 't' && s.charAt(i+2) == 'a' &&
               s.charAt(i+3) == 'b' && s.charAt(i+4) == 'l' && s.charAt(i+5) == 'e' &&
               s.charAt(i+6) == '>'){

                contador++;
                resp = true;
            }

        }

        if(resp == true){

            a -= contador;
        }

        return a;
    }

    public static int contarE(String s){//retorna o valor da letra e

        int e = 0;
        boolean resp = false;
        int contador = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'e'){

                e++;
            }

            if(s.charAt(i) == '<' && s.charAt(i+1) == 't' && s.charAt(i+2) == 'a' &&
               s.charAt(i+3) == 'b' && s.charAt(i+4) == 'l' && s.charAt(i+5) == 'e' &&
               s.charAt(i+6) == '>'){

                contador++;
                resp = true;
            }
        }

        if(resp == true){

            e -= contador;
        }

        return e;
    }

    public static int contarI(String s){//retorna o valor da letra i

        int I = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'i'){

                I++;
            }
        }

        return I;
    }

    public static int contarO(String s){//retorna o valor da letra o

        int o = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'o'){

                o++;
            }
        }

        return o;
    }

    public static int contarU(String s){//retorna o valor da letra u

        int u = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'u'){

                u++;
            }
        }

        return u;
    }

    //--------------------------------------------------

    public static int contarAComAcento(String s){//retorna o valor da letra á

        int a = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'á'){

                a++;
            }
        }

        return a;
    }

    public static int contarEComAcento(String s){//retorna o valor da letra é

        int e = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'é'){

                e++;
            }
        }

        return e;
    }

    public static int contarIComAcento(String s){//retorna o valor da letra í

        int I = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'í'){

                I++;
            }
        }

        return I;
    }

    public static int contarOComAcento(String s){//retorna o valor da letra ó

        int o = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ó'){

                o++;
            }
        }

        return o;
    }

    public static int contarUComAcento(String s){//retorna o valor da letra ú

        int u = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ú'){

                u++;
            }
        }

        return u;
    }

    //--------------------------------------------------

    public static int contarACrase(String s){//retorna o valor da letra á

        int a = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'à'){

                a++;
            }
        }

        return a;
    }

    public static int contarECrase(String s){//retorna o valor da letra é

        int e = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'è'){

                e++;
            }
        }

        return e;
    }

    public static int contarICrase(String s){//retorna o valor da letra ì

        int I = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ì'){

                I++;
            }
        }

        return I;
    }

    public static int contarOCrase(String s){//retorna o valor da letra ò

        int o = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ò'){

                o++;
            }
        }

        return o;
    }

    public static int contarUCrase(String s){//retorna o valor da letra ù

        int u = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ù'){

                u++;
            }
        }

        return u;
    }

    //--------------------------------------------------

    public static int contarATil(String s){//retorna o valor da letra ã

        int a = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ã'){

                a++;
            }
        }

        return a;
    }

    public static int contarOTil(String s){//retorna o valor da letra õ

        int o = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'õ'){

                o++;
            }
        }

        return o;
    }

    //--------------------------------------------------

    public static int contarACirc(String s){//retorna o valor da letra â

        int a = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'â'){

                a++;
            }
        }

        return a;
    }

    public static int contarECirc(String s){//retorna o valor da letra ê

        int e = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ê'){

                e++;
            }
        }

        return e;
    }

    public static int contarICirc(String s){//retorna o valor da letra î

        int I = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'î'){

                I++;
            }
        }

        return I;
    }

    public static int contarOCirc(String s){//retorna o valor da letra ô

        int o = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'ô'){

                o++;
            }
        }

        return o;
    }

    public static int contarUCirc(String s){//retorna o valor da letra û

        int u = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'û'){

                u++;
            }
        }

        return u;
    }

    //--------------------------------------------------

    public static int contarConsoante(String s){//retorna o valor de todas as consoantes

        int c = 0;
        boolean resp = false;
        boolean resp2 = false;
        int contador = 0;
        int contador2 = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'b' || s.charAt(i) == 'c' || s.charAt(i) == 'd' || s.charAt(i) == 'f' ||
               s.charAt(i) == 'g' || s.charAt(i) == 'h' || s.charAt(i) == 'j' || s.charAt(i) == 'k' ||
               s.charAt(i) == 'l' || s.charAt(i) == 'm' || s.charAt(i) == 'n' || s.charAt(i) == 'p' ||
               s.charAt(i) == 'q' || s.charAt(i) == 'r' || s.charAt(i) == 's' || s.charAt(i) == 't' ||
               s.charAt(i) == 'v' || s.charAt(i) == 'w' || s.charAt(i) == 'x' || s.charAt(i) == 'y' ||
               s.charAt(i) == 'z' ){
                
                c++;

            }

            if(s.charAt(i) == '<' && s.charAt(i+1) == 't' && s.charAt(i+2) == 'a' &&
               s.charAt(i+3) == 'b' && s.charAt(i+4) == 'l' && s.charAt(i+5) == 'e' &&
               s.charAt(i+6) == '>'){

                contador++;
                resp = true;
            }

            if(s.charAt(i) == '<' && s.charAt(i+1) == 'b' && s.charAt(i+2) == 'r' && s.charAt(i+3) == '>'){

                contador2++;
                resp2 = true;
            }
        }

        if(resp == true){

            c -= (contador * 3);
        }

        if(resp2 == true){

            c -= (contador2 * 2);
        }

        return c;
    }

    //--------------------------------------------------

    public static int contarBr(String s){//retorna o valor de <br>

        int br = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == '<' && s.charAt(i+1) == 'b' && s.charAt(i+2) == 'r' && s.charAt(i+3) == '>'){

                br++;
            }
        }

        return br;
    }

    public static int contarTable(String s){//retorna o valor de <table>

        int table = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == '<' && s.charAt(i+1) == 't' && s.charAt(i+2) == 'a' &&
               s.charAt(i+3) == 'b' && s.charAt(i+4) == 'l' && s.charAt(i+5) == 'e' &&
               s.charAt(i+6) == '>'){

                table++;
            }
        }

        return table;
    }

    //--------------------------------------------------

    public static String getHtml(String endereco){//pegar um endereço da web e retornar uma string com o conteudo
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;
  
        try {
           url = new URL(endereco);
           is = url.openStream();  // throws an IOException
           br = new BufferedReader(new InputStreamReader(is));
  
           while ((line = br.readLine()) != null) {
              resp += line + "\n";
           }
        } catch (MalformedURLException mue) {
           mue.printStackTrace();
        } catch (IOException ioe) {
           ioe.printStackTrace();
        } 
  
        try {
           is.close();
        } catch (IOException ioe) {
           // nothing to see here
  
        }
  
        return resp;
    }

    //--------------------------------------------------

    public static void main(String[] args){
        MyIO.setCharset("utf-8");
        
        String nome = new String();
        String endereco = new String();
        String html = new String();
        
        while(isFim(nome) == false){

            nome = MyIO.readLine();

            if(isFim(nome) == true){

                break;
            }

            endereco = MyIO.readLine();
            html = getHtml(endereco);

            MyIO.println("a(" + contarA(html) + ") e(" + contarE(html) + ") i(" + contarI(html) + ") o(" + contarO(html) + ") u(" + contarU(html) + 
                         ") á(" + contarAComAcento(html) + ") é(" + contarEComAcento(html) + ") í(" + contarIComAcento(html) + ") ó(" + contarOComAcento(html) + ") ú(" + contarUComAcento(html) + 
                         ") à(" + contarACrase(html) + ") è(" + contarECrase(html) + ") ì(" + contarICrase(html) + ") ò(" + contarOCrase(html) + ") ù(" + contarUCrase(html) + 
                         ") ã(" + contarATil(html) + ") õ(" + contarOTil(html) + 
                         ") â(" + contarACirc(html) + ") ê(" + contarECirc(html) + ") î(" + contarICirc(html) + ") ô(" + contarOCirc(html) + ") û(" + contarUCirc(html) + 
                         ") consoante(" + contarConsoante(html) + 
                         ") <br>(" + contarBr(html) + ") <table>(" + contarTable(html) + ") " + nome);
        }
    }
}