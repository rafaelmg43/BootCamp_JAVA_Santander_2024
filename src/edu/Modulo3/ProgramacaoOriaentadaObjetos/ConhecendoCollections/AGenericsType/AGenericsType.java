package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.AGenericsType;

public class AGenericsType {
//    //A classe Box a seguir será modificada para demonstrar o conceito:
//    public class Box {
//
//        private Object object;
//
//        public void set(Object object) { this.object = object; }
//        public Object get() { return object; }
//    }
    /**
     Versão genérica da classe Box.
     @param <T> o tipo do valor sendo armazenado
     */
    public class Box<T> {
        // T representa "Type" (tipo)
        private T t;

        public void set(T t) { this.t = t; }
        public T get() { return t; }
    }
}
