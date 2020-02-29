package br.com.senac.aula1;

import br.com.senac.aula1.view.*;
import java.util.*;

public class Main {

    
    public static void main(String[] args) {
    Menu m = new Menu();
    m.setVisible(true);
        //pf.setVisible(true);
        /*
        Scanner i = new Scanner(System.in); 
        Fisica f = new Fisica();
        String opc = null;
        do {
            System.out.println("Digite 1 - inclusão 2 - alteração 3 - exclusão 4 - consulta 5 - listagem 0 - Sair");
            opc = i.nextLine();
            switch(opc) {
            case "1":
                System.out.println("CPF: ");
                f.setCpf(i.nextLine());
                System.out.println("Nome: ");
                f.setNome(i.nextLine());
                System.out.println("Idade: ");
                f.setIdade(i.nextInt());
                System.out.println("Altura: ");
                f.setAltura(i.nextDouble());
                System.out.println("Peso: ");
                f.setPeso(i.nextDouble());
                System.out.println("Sexo: ");
                int s1 = i.nextInt();
                if(s1 == 1) {
                    f.setSexo(TipoSexo.MASCULINO);
                } else if(s1 == 2) {
                    f.setSexo(TipoSexo.FEMININO);
                } else {
                    f.setSexo(TipoSexo.OUTROS);
                }
                f.inserir();
                break;
            case "2":
                System.out.println("ID: ");
                f.setId(i.nextInt());
                System.out.println("CPF: ");
                f.setCpf(i.nextLine());
                System.out.println("Nome: ");
                f.setNome(i.nextLine());
                System.out.println("Idade: ");
                f.setIdade(i.nextInt());
                System.out.println("Altura: ");
                f.setAltura(i.nextDouble());
                System.out.println("Peso: ");
                f.setPeso(i.nextDouble());
                System.out.println("Sexo: ");
                int s2 = i.nextInt();
                if(s2 == 1) {
                    f.setSexo(TipoSexo.MASCULINO);
                } else if(s2 == 2) {
                    f.setSexo(TipoSexo.FEMININO);
                } else {
                    f.setSexo(TipoSexo.OUTROS);
                }
                f.alterar();
                break;
            case "3":
                System.out.println("ID: ");
                f.setId(i.nextInt());
                f.excluir();
                break;
            case "4":
                System.out.println("ID: ");
                f.setId(i.nextInt());
                f.consultar();
                System.out.println("Nome: " + f.getNome());
                break;
            case "5":
                ArrayList<Fisica> lf = f.listar();
                for(Fisica fi : lf) {
                    System.out.println("ID: " + fi.getId() + " - Nome: " + fi.getNome() + " - CPF: " + fi.getCpf());
                }
                break;
            }
            
            
        } while (!opc.equals("0"));
                */
    }
    
}
