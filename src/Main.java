//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pile<Integer> pila=new Pile<>(2);
        System.out.println(pila.toString());
        pila.push(4);
        pila.push(7);
        pila.push(11);


        System.out.println(pila.toString());

        try {
            Integer test=pila.pop();
            System.out.println(String.format("Rimosso: %s",test));
        } catch (Exception e) {
            System.out.println(pila.toString());
        }
        try {
            Integer test=pila.pop();
            System.out.println(String.format("Rimosso: %s",test));
        } catch (Exception e) {
            System.out.println(pila.toString());
        }


    }
}