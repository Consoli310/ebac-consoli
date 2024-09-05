public class Main {
    public static void main(String[] args) {

        User user = new User();

        Class<?> obj = user.getClass();

        if(obj.isAnnotationPresent(Tabela.class)){
            Tabela tabela = obj.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela = " + tabela.name());
        }
    }
}
