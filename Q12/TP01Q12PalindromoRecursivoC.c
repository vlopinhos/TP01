#include <stdio.h>
#include <stdbool.h>
#include <string.h>

/*
Aluno: Victor Lopes Azevedo Araujo
N⁰ de Matricula: 746030
*/

//-------------------------Questão 12-------------------------
/*
Refaça a questão anterior na linguagem C
*/

bool isFim(char *s){

    bool resp = false;

    if(s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){

        resp = true;
    }

    return resp;
}

void inverteString(char arr[], size_t iStart, size_t iLast){

    if( iStart < iLast ){
        //swap
        char temp = arr[iStart];
        arr[iStart] = arr[iLast];
        arr[iLast] = temp;

        inverteString(arr, ++iStart, --iLast);  
    }
}

bool isPalindromo(char *s){

    bool resp = false;
    char sInvertida[1000];

    strcpy(sInvertida, s);

    inverteString(sInvertida, 0, strlen(sInvertida)-1);

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
