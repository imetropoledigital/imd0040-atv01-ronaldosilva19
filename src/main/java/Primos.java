
import java.util.ArrayList;
public class Primos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Você deve passar um parâmetro.");
            System.exit(0);
        }else{
            int qnt = Integer.parseInt(args[0]); //Converte para número a entrada
            int quant_divisores = 0;
            int cont = 1;
            //TODO Adicionar código aqui

            ArrayList<Integer> primos = new ArrayList<>();

            while(primos.size() < qnt){
                for(int j = 1; j <= cont; j++){
                    if(cont % j == 0){
                        quant_divisores++;
                    }
                }
                if(quant_divisores == 2){
                    primos.add(cont);
                }
                cont++;
                quant_divisores = 0;
            }

            for(int valor: primos){
                System.out.println(valor);
            }
        }
    }
}