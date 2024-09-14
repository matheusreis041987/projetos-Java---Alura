public class Pessoa {
    public String nome;
    public String email;
    public String cpf;

        public Pessoa (String nome, String email, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
        }
        public String exibirDados() {
            return "=== Dados da Pessoa ===" + "\n" +
                    "Nome: " + this.nome + "\n" +
                    "Email: " + this.email + "\n" +
                    "CPF: " + this.cpf;
        }
    public static void main(String[] args) {

            Pessoa matheus = new Pessoa("Matheus Reis Costa","12896856730", "matheus.costa@serpro.gov.br");
            System.out.println(matheus.exibirDados());

    }
}
