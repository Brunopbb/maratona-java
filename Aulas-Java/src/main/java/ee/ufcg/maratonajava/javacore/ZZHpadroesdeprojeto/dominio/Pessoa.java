package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class Pessoa {

    private String firstName;
    private String lastName;
    private String nickname;
    private String email;


    public static final class PessoaBuilder {
        private String firstName;
        private String lastName;
        private String nickname;
        private String email;

        private PessoaBuilder() {
        }

        public static PessoaBuilder builder() {
            return new PessoaBuilder();
        }

        public PessoaBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            Pessoa pessoa = new Pessoa();
            pessoa.lastName = this.lastName;
            pessoa.email = this.email;
            pessoa.nickname = this.nickname;
            pessoa.firstName = this.firstName;
            return pessoa;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }
}
