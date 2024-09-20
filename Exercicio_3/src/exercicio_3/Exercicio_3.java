import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args)  {
  
  Scanner scanner = new Scanner(System.in);
  
  double N1 = scanner.nextDouble();
  double N2 = scanner.nextDouble();
  double N3 = scanner.nextDouble();
  double N4 = scanner.nextDouble();
  
   double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (2 + 3 + 4 + 1);
   
   System.out.printf("A media é:%.1f%n", media);
   
   if (media >= 7.0) {
   System.out.println("Aluno aprovado!");
   }else if (media < 5.0) {
   System.out.println("Aluno reprovado!");
   } else {
     System.out.println("Aluno em exame.");
   }
   double notaExame = scanner.nextDouble();
   System.out.printf("A nota do exame:%.1f%n", notaExame);
   
   double mediaFinal = (media + notaExame) / 2;
    
    if (mediaFinal >= 5.0) {
    System.out.println("Aluno aprovado!");
    } else  {
    System.out.println("Aluno reprovado");
    }
    System.out.printf("A media do aluno é:%.1f%n", mediaFinal);
    
    scanner.close();
    
    
    
  
  
    }
 