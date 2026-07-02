public class Cliente extends Pessoa {
    private String cpf;
    
    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone);
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("O CPF do cliente deve conter exatamente 11 dígitos numéricos");
        }
        this.cpf = cpf;        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("O CPF do cliente deve conter exatamente 11 dígitos numéricos");
        }
        this.cpf = cpf;   
    }
}
