package javaSimpleProject.src;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Aluno: Thiago Mariano de Melo");
        System.out.println("Faculdade: PUC Minas");
        System.out.println("Curso: Engenharia de Software");
    }
}

//Simple Project run metrics:
//java -jar ckProject\CkJarProject.jar javaSimpleProject/ true 0 True SimpleProjectMetrics/
//Total LOC: 8 

//Complex Project run metrics:
//java -jar ckProject\CkJarProject.jar javaComplexProject/ true 0 True ComplexProjectMetrics/
//Total LOC: 32279

//Utilizado ReaderCSV para ler total de LOC por classe