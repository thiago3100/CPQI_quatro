package serializacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class serializacao2 {
    
    
    
    
    public void armazenarContas(ArrayList<Conta> contas) throws IOException{   
        
       try(FileOutputStream fos = new FileOutputStream("C://CPQI_tres/objeto.ser")){
           try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
               oos.writeObject(contas);
               oos.writeObject(contas);
           }
       }
    }
    
    public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException{
        
        try(FileInputStream fis = new FileInputStream("C://CPQI_tres/objeto.ser")){
            try( ObjectInputStream ois = new ObjectInputStream(fis)){
                return(ArrayList<Conta>) ois.readObject();
            }
        }
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Ricardo", 12000.00));
        contas.add(new Conta("Thiago", 3900.00));
        contas.add(new Conta("Felipe", 45000.00));
        contas.add(new Conta("Santos", 98200.00));
        contas.add(new Conta("Bianca", 123200.00));
     
        serializa2 operacao = new serializa2();
        operacao.armazenarContas(contas);
         ArrayList<Conta> contas2 = operacao.recuperarContas();
         for(Conta conta : contas2){
             conta.exibeSaldo();
         }
    }
}

