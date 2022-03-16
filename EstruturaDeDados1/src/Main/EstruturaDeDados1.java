/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import static estruturadedados1.Sorts.insertionSort;
import static estruturadedados1.Sorts.mergeSort;
import static estruturadedados1.Sorts.quickSort;
import static estruturadedados1.Sorts.quickSort2;
import static estruturadedados1.Sorts.selectionSort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static search.Busca.binarySearch;
import static search.Busca.linearSearch;

/**
 *
 * @author Sciencegamer
 */
public class EstruturaDeDados1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {

        try {      
                        
            int c1 = 0, c2 = 0, c3 = 0;
            Scanner sc = new Scanner(System.in);

            int loop = 1;
            while (loop == 1) {

                String entradaIdioma = mostrarIdiomas(sc);
                String entradaMenu = mostrarMenu(sc);

                if (entradaMenu.equals("2")) {
                    String entradaOrdenacao = mostrarOrdenacao(sc);
                    if (entradaOrdenacao.equals("1")) {
                        if (entradaIdioma.equals("1")) {
                            long tempoTotal=sort(1, 1);

                        }
                        if (entradaIdioma.equals("2")) {
                            long tempoTotal=sort(2, 1);

                        }
                        if (entradaIdioma.equals("3")) {
                            long tempoTotal=sort(3, 1);

                        }
                    } else if (entradaOrdenacao.equals("2")) {

                        if (entradaIdioma.equals("1")) {
                            long tempoTotal=sort(1, 2);

                        }
                        if (entradaIdioma.equals("2")) {
                            long tempoTotal=sort(2, 2);

                        }
                        if (entradaIdioma.equals("3")) {
                            long tempoTotal=sort(3, 2);

                        }
                    } else if (entradaOrdenacao.equals("3")) {
                        if (entradaIdioma.equals("1")) {
                            long tempoTotal=sort(1, 3);

                        }
                        if (entradaIdioma.equals("2")) {
                            long tempoTotal=sort(2, 3);

                        }
                        if (entradaIdioma.equals("3")) {
                            long tempoTotal=sort(3, 3);

                        }

                    } else if (entradaOrdenacao.equals("4")) {
                        if (entradaIdioma.equals("1")) {
                            long tempoTotal=sort(1, 4);

                        }
                        if (entradaIdioma.equals("2")) {
                            long tempoTotal=sort(2, 4);

                        }
                        if (entradaIdioma.equals("3")) {
                            long tempoTotal=sort(3, 4);

                        }
                    }

                } else if (entradaMenu.equals("3")) {
                    String entradaBusca = mostrarBusca(sc);
                    if (entradaBusca.equals("1")) {
                        if (entradaIdioma.equals("1")) {
                            long tempoTotal = busca(1, 1);
                            System.out.println("Duração da busca " + tempoTotal + " milésimos de segundo");
                        } else if (entradaIdioma.equals("2")) {
                            long tempoTotal = busca(2, 1);
                            System.out.println("Duração da busca " + tempoTotal + " milésimos de segundo");
                        } else if (entradaIdioma.equals("3")) {
                            long tempoTotal = busca(3, 1);
                            System.out.println("Duração da busca " + tempoTotal + " milésimos de segundo");
                        }
                    }
                    if (entradaBusca.equals("2")) {
                        if (entradaIdioma.equals("1")) {
                            if (c1 == 0) {
                                criarArquivoOrdenado(1);
                                c1++;
                            }
                            long tempoTotal = busca(1, 2);
                            System.out.println("Duração da busca " + tempoTotal + " milésimos de segundo");
                        } else if (entradaIdioma.equals("2")) {
                            if (c2 == 0) {
                                criarArquivoOrdenado(2);
                                c2++;
                            }
                            long tempoTotal = busca(2, 2);
                            System.out.println("Duração da busca " + tempoTotal + " milésimos de segundo");
                        } else if (entradaIdioma.equals("3")) {
                            if (c3 == 0) {
                                criarArquivoOrdenado(3);
                                c3++;
                            }
                            long tempoTotal = busca(3, 2);
                            System.out.println("Duração da busca " + tempoTotal + " milésimos de segundo");
                        }
                    }

                } else if (entradaMenu.equals("4")) {
                    if (entradaIdioma.equals("1")) {
                        long tempoInicial = System.currentTimeMillis();
                        long tempoTotal1= sort(1, 1);
                        long tempoTotal2=sort(1, 2);
                        long tempoTotal3=sort(1, 3);
                        long tempoTotal4=sort(1, 4);
                        long tempoFinal = System.currentTimeMillis();
                        long tempoTotal = tempoFinal - tempoInicial;
                        System.out.println("Duração total de todas as ordenações " + tempoTotal + " milésimos de segundo");

                    } else if (entradaIdioma.equals("2")) {
                        long tempoInicial = System.currentTimeMillis();
                        long tempoTotal1=sort(2, 1);
                        long tempoTotal2=sort(2, 2);
                        long tempoTotal3=sort(2, 3);
                        long tempoTotal4=sort(2, 4);
                        long tempoFinal = System.currentTimeMillis();
                        long tempoTotal = tempoFinal - tempoInicial;
                        System.out.println("Duração total de todas as ordenações " + tempoTotal + " milésimos de segundo");

                    } else if (entradaIdioma.equals("3")) {
                        long tempoInicial = System.currentTimeMillis();
                        long tempoTotal1=sort(3, 1);
                        long tempoTotal2=sort(3, 2);
                        long tempoTotal3=sort(3, 3);
                        long tempoTotal4=sort(3, 4);
                        long tempoFinal = System.currentTimeMillis();
                        long tempoTotal = tempoFinal - tempoInicial;
                        System.out.println("Duração total de todas as ordenações " + tempoTotal + " milésimos de segundo");

                    }

                }

            }
            sc.close();
        } catch (Exception erro) {
            throw erro;
        }

    }

    private static long sort(int idioma, int ordenacao) throws IOException, Exception {
        long tempoTotal = 0;
        if (ordenacao == 1) {
            System.out.println("---Selection Sort---");
            if (idioma == 1) {
                System.out.println("Idioma: português");
                long tempoInicial = System.currentTimeMillis();
                selectionSort(lerArquivo(1));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");

            } else if (idioma == 2) {
                System.out.println("Idioma: inglês");
                long tempoInicial = System.currentTimeMillis();
                selectionSort(lerArquivo(2));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");
            } else if (idioma == 3) {
                System.out.println("Idioma: eslovaco");
                long tempoInicial = System.currentTimeMillis();
                selectionSort(lerArquivo(3));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");

            }
        } else if (ordenacao == 2) {
            System.out.println("---Insertion Sort---");
            if (idioma == 1) {
                System.out.println("Idioma: português");
                long tempoInicial = System.currentTimeMillis();
                insertionSort(lerArquivo(1));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");
            } else if (idioma == 2) {
                System.out.println("Idioma: inglês");
                long tempoInicial = System.currentTimeMillis();
                insertionSort(lerArquivo(2));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");
            } else if (idioma == 3) {
                System.out.println("Idioma: eslovaco");
                long tempoInicial = System.currentTimeMillis();
                insertionSort(lerArquivo(3));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");
            }
        } else if (ordenacao == 3) {
            System.out.println("---Merge Sort---");
            if (idioma == 1) {
                System.out.println("Idioma: português");
                long tempoInicial = System.currentTimeMillis();
                mergeSort(lerArquivo(1));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");
            } else if (idioma == 2) {
                System.out.println("Idioma: inglês");
                long tempoInicial = System.currentTimeMillis();
                mergeSort(lerArquivo(2));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");
            } else if (idioma == 3) {
                System.out.println("Idioma: eslovaco");
                long tempoInicial = System.currentTimeMillis();
                mergeSort(lerArquivo(3));
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");

            }
        } else if (ordenacao == 4) {
            System.out.println("---Quick Sort---");
            if (idioma == 1) {
                System.out.println("Idioma: português");
                long tempoInicial = System.currentTimeMillis();
                quickSort(lerArquivo(1), 0, 307373);
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");

            } else if (idioma == 2) {
                System.out.println("Idioma: inglês");
                long tempoInicial = System.currentTimeMillis();
                quickSort(lerArquivo(2), 0, 48446);
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");
            } else if (idioma == 3) {
                System.out.println("Idioma: eslovaco");
                long tempoInicial = System.currentTimeMillis();
                quickSort(lerArquivo(3), 0, 264943);
                long tempoFinal = System.currentTimeMillis();
                tempoTotal = tempoFinal - tempoInicial;
                System.out.println("Duração da ordenação " + tempoTotal + " milésimos de segundo");

            }
        }

        return tempoTotal;
    }

    private static long busca(int idioma, int busca) throws Exception {

        long tempoTotal = 0;
        if (busca == 1) {
            System.out.println("Busca linear ou sequencial");
            if (idioma == 1) {
                System.out.println("Busca da palavra lagostim/B:");
                long tempoInicial = System.currentTimeMillis();
                int aux2= linearSearch(lerArquivo(1), "lagostim/B");
                long tempoFinal = System.currentTimeMillis();
                if(aux2>-1){
                    System.out.println("Posição da palavra procurada: "+aux2);
                }
                else{
                    System.out.println("Palavra não consta no dicionário");
                }
                tempoTotal = tempoFinal - tempoInicial;
            } else if (idioma == 2) {
                System.out.println("Busca da palavra timezone:");
                long tempoInicial = System.currentTimeMillis();
                int aux2= linearSearch(lerArquivo(2), "timezone");
                long tempoFinal = System.currentTimeMillis();
                if(aux2>-1){
                    System.out.println("Posição da palavra procurada: "+aux2);
                }
                else{
                    System.out.println("Palavra não consta no dicionário");
                }
                tempoTotal = tempoFinal - tempoInicial;

            } else if (idioma == 3) {
                System.out.println("Busca da palavra ocelenie:");
                long tempoInicial = System.currentTimeMillis();
                int aux2= linearSearch(lerArquivo(3), "ocelenie");
                long tempoFinal = System.currentTimeMillis();
                if(aux2>-1){
                    System.out.println("Posição da palavra procurada: "+aux2);
                }
                else{
                    System.out.println("Palavra não consta no dicionário");
                }
                tempoTotal = tempoFinal - tempoInicial;
            }
        } else {
            System.out.println("Busca binária em vetor ordenado");
            if (idioma == 1) {
                System.out.println("Busca da palavra lagostim/B:");
                String aux[] = retornaVetorOrdenado(1);
                long tempoInicial = System.currentTimeMillis();
                int aux2= binarySearch(aux, "lagostim/B");
                long tempoFinal = System.currentTimeMillis();
                if(aux2>-1){
                    System.out.println("Posição da palavra procurada: "+aux2);
                }
                else{
                    System.out.println("Palavra não consta no dicionário");
                }
                tempoTotal = tempoFinal - tempoInicial;

            } else if (idioma == 2) {

                System.out.println("Busca da palavra timezone:");
                String aux[] = retornaVetorOrdenado(2);
                long tempoInicial = System.currentTimeMillis();
                int aux2= binarySearch(aux, "timezone");
                long tempoFinal = System.currentTimeMillis();
                if(aux2>-1){
                    System.out.println("Posição da palavra procurada: "+aux2);
                }
                else{
                    System.out.println("Palavra não consta no dicionário");
                }
                tempoTotal = tempoFinal - tempoInicial;

            } else if (idioma == 3) {

                System.out.println("Busca da palavra ocelenie:");
                String aux[] = retornaVetorOrdenado(3);
                long tempoInicial = System.currentTimeMillis();
                int aux2= binarySearch(aux, "ocelenie");
                long tempoFinal = System.currentTimeMillis();
                if(aux2>-1){
                    System.out.println("Posição da palavra procurada: "+aux2);
                }
                else{
                    System.out.println("Palavra não consta no dicionário");
                }
                tempoTotal = tempoFinal - tempoInicial;

            }
        }

        return tempoTotal;
    }

    private static String mostrarIdiomas(Scanner sc) {
        System.out.println("-------------IDIOMAS-------------");
        System.out.println("Escolha o idioma:");
        System.out.println("1-Português");
        //307374
        System.out.println("2-Inglês");
        //48447
        System.out.println("3-Eslovaco");
        //264944
        String entradaIdioma = sc.nextLine();
        while (!entradaIdioma.equals("1") && !entradaIdioma.equals("2") && !entradaIdioma.equals("3")) {
            System.out.println("Digite 1, 2, ou 3 para selecionar um dos idiomas abaixo:");
            System.out.println("-------------IDIOMAS-------------");
            System.out.println("1-Português");
            System.out.println("2-Inglês");
            System.out.println("3-Eslovaco");
            entradaIdioma = sc.nextLine();
        }
        return entradaIdioma;
    }

    private static String mostrarBusca(Scanner sc) {
        System.out.println("-------------Buscas-------------");
        System.out.println("Escolha a busca:");
        System.out.println("1-Sequencial");
        System.out.println("2-Binária");
        String entradaBusca = sc.nextLine();

        while (!entradaBusca.equals("1") && !entradaBusca.equals("2")) {
            System.out.println("Digite 1 ou 2 para fazer uma das buscas abaixo:");
            System.out.println("-------------Buscas-------------");
            System.out.println("1-Sequencial");
            System.out.println("2-Binária");
            entradaBusca = sc.nextLine();
        }
        return entradaBusca;
    }

    private static String mostrarMenu(Scanner sc) {
        System.out.println("--------------MENU--------------");
        System.out.println("Escolha uma das opções:");
        System.out.println("1-Escolher outro idioma");
        System.out.println("2-Ordenação");
        System.out.println("3-Busca");
        System.out.println("4-Caso teste");
        String entradaMenu = sc.nextLine();

        while (!entradaMenu.equals("1") && !entradaMenu.equals("2") && !entradaMenu.equals("3") && !entradaMenu.equals("4")) {
            System.out.println("Digite 1, 2, 3 ou 4 para selecionar uma das opções abaixo:");
            System.out.println("--------------MENU--------------");
            System.out.println("Escolha uma das opções:");
            System.out.println("1-Escolher outro idioma");
            System.out.println("2-Ordenação");
            System.out.println("3-Busca");
            System.out.println("4-Caso teste");
            entradaMenu = sc.nextLine();
        }
        return entradaMenu;
    }

    private static String mostrarOrdenacao(Scanner sc) {
        System.out.println("------------Odenação------------");
        System.out.println("Escolha uma das opções:");
        System.out.println("1-Selection Sort");
        System.out.println("2-Insertion Sort");
        System.out.println("3-Merge Sort");
        System.out.println("4-Quick Sort");
        String entradaOrdenacao = sc.nextLine();

        while (!entradaOrdenacao.equals("1") && !entradaOrdenacao.equals("2") && !entradaOrdenacao.equals("3") && !entradaOrdenacao.equals("4")) {
            System.out.println("Digite 1, 2, 3 ou 4 para selecionar uma das opções abaixo:");
            System.out.println("------------Odenação------------");
            System.out.println("Escolha uma das opções:");
            System.out.println("1-Selection Sort");
            System.out.println("2-Insertion Sort");
            System.out.println("3-Merge Sort");
            System.out.println("4-Quick Sort");
            entradaOrdenacao = sc.nextLine();
        }
        return entradaOrdenacao;
    }

    private static String[] lerArquivo(int idioma) throws FileNotFoundException, Exception {
        try {

            if (idioma == 1) {
                String[] vetor = new String[307374];
                BufferedReader bfPort = new BufferedReader(new FileReader("C:\\Users\\Sciencegamer\\Sort\\Portugues.txt"));

                String line = bfPort.readLine();
                int c = 0;

                while (line != null) {
                    vetor[c] = line;
                    c++;
                    line = bfPort.readLine();
                }
                return vetor;
            } else if (idioma == 2) {
                String[] vetor = new String[48447];
                BufferedReader bfEn = new BufferedReader(new FileReader("C:\\Users\\Sciencegamer\\Sort\\Ingles.txt"));

                String line = bfEn.readLine();
                int c = 0;

                while (line != null) {
                    vetor[c] = line;
                    c++;
                    line = bfEn.readLine();
                }
                return vetor;
            } else if (idioma == 3) {
                String[] vetor = new String[264944];
                BufferedReader bfEsl = new BufferedReader(new FileReader("C:\\Users\\Sciencegamer\\Sort\\Eslovaco.txt"));

                String line = bfEsl.readLine();
                int c = 0;

                while (line != null) {
                    vetor[c] = line;
                    c++;
                    line = bfEsl.readLine();
                }
                return vetor;
            }
            return null;
        } catch (IOException erro) {
            throw erro;
        }
    }

    private static void criarArquivoOrdenado(int idioma) throws FileNotFoundException, Exception {

        if (idioma == 1) {
            //Criar o arquivo
            FileWriter fw = new FileWriter("C:\\Users\\Sciencegamer\\Sort\\PortuguesOrdenado.txt", true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            String[] aux = quickSort2(lerArquivo(1), 0, 307373);
            for (int i = 0; i < 307374; i++) {
                bw.write(aux[i] + "\n");
            }
            //fechar o arquivo
            bw.close();

        } else if (idioma == 2) {
            //Criar o arquivo
            FileWriter fw = new FileWriter("C:\\Users\\Sciencegamer\\Sort\\InglesOrdenado.txt", true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            String[] aux = quickSort2(lerArquivo(2), 0, 48446);
            for (int i = 0; i < 48447; i++) {
                bw.write(aux[i] + "\n");
            }
            //fechar o arquivo
            bw.close();
        } else if (idioma == 3) {
            //Criar o arquivo
            FileWriter fw = new FileWriter("C:\\Users\\Sciencegamer\\Sort\\EslavoOrdenado.txt", true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            String[] aux = quickSort2(lerArquivo(3), 0, 264943);
            for (int i = 0; i < 264944; i++) {
                bw.write(aux[i] + "\n");
            }
            //fechar o arquivo
            bw.close();
        }

    }

    private static String[] retornaVetorOrdenado(int idioma) throws Exception {
        try {

            if (idioma == 1) {
                String[] aux = quickSort2(lerArquivo(1), 0, 307373);
                return aux;
            } else if (idioma == 2) {
                String[] aux = quickSort2(lerArquivo(2), 0, 48446);
                return aux;
            } else if (idioma == 3) {
                String[] aux = quickSort2(lerArquivo(3), 0, 264943);
                return aux;
            } else {
                return null;
            }

        } catch (IOException erro) {
            throw erro;
        }
    }

}
