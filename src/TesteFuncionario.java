public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario jenifer = new Gerente();

        jenifer.setNome("Jenifer Nakabar");
        jenifer.setCpf("223355646-9");
        jenifer.setSalario(2590.80);

        System.out.println(jenifer.getNome());
        System.out.println(jenifer.getBonificacao());

    }

}