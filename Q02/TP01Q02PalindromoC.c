#include <stdio.h>
#include <stdbool.h>
#include <string.h>

/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 02-------------------------
/*
Refaça em C a questão anterior.
*/

bool isFim(char *s){

    bool resp = false;

    if(s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){

        resp = true;
    }

    return resp;
}

void inverteString(char *s){

    char sInvertida[1000];
    int tam = strlen(s);

    strcpy(sInvertida, s);

    for(int i=0; i < tam; i++){

        s[i] = sInvertida[tam - i - 1];
    }
}

bool isPalindromo(char *s){

    bool resp = false;
    char sInvertida[1000];

    strcpy(sInvertida, s);

    inverteString(sInvertida);

    int dif = strcmp(s, sInvertida);

    if(dif == 0){

        resp = true;
    }else{

        resp = false;
    }

    return resp;
    }

int main(){

    char entrada[1000];

    while(isFim(entrada) == false){

        scanf(" %[^\n]s", entrada);

        if(isPalindromo(entrada) == true){

            printf("SIM\n");
        }else if(isPalindromo(entrada) == false){

            if(isFim(entrada) == true){

                break;
            }else{

                printf("NAO\n");
            }
        }
    }
}
