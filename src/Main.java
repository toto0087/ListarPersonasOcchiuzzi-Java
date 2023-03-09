import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        

        Personas persona1 = new Personas("toto","Occhiuzzi");
        Personas persona2 = new Personas("Lucas","popó");
        Personas persona3 = new Personas("morgan","jaja");
        Personas persona4 = new Personas("popo","tomas");
        Personas persona5 = new Personas("xd","jorge");

        List<Object> list= new ArrayList<Object>();

        //creo objeto con las 5 personas y agrego a array
        list.add(persona1);
        list.add(persona2);
        list.add(persona3);
        list.add(persona4);
        list.add(persona5);

        //agrego a arreglo los 5 nombres singularmente con get y luego le hago sort
        List<String> listaNomb = new ArrayList<String>();
        listaNomb.add(persona1.getNombre());
        listaNomb.add(persona2.getNombre());
        listaNomb.add(persona3.getNombre());
        listaNomb.add(persona4.getNombre());
        listaNomb.add(persona5.getNombre());

        listaNomb = listaNomb.stream().sorted().collect(Collectors.toList());
        System.out.println(listaNomb);

        //agrego a arreglo los 5 apellidos singularmente con get y luego le hago sort usando funciones de stream y metodos de collect
        List<String> listaApe = new ArrayList<String>();
        listaApe.add(persona1.getApelldio());
        listaApe.add(persona2.getApelldio());
        listaApe.add(persona3.getApelldio());
        listaApe.add(persona4.getApelldio());
        listaApe.add(persona5.getApelldio());

        List<String> listaSorteada = listaApe.stream().sorted().collect(Collectors.toList());
        System.out.println(listaSorteada);

        //hago lo mismo pero uso la funcion de reverseOrder en el sort con stream para reversar los apellidos
        List<String> listaApeRever = listaApe.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(listaApeRever);

    }
}
