package br.projetosuniso.minebank.api;

import br.projetosuniso.minebank.api.Model.Movimentacao;
import br.projetosuniso.minebank.api.Service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Autowired
    private MovimentacaoService _ms;

    @Override
    public void run(String... args) throws Exception {

        ArrayList<Movimentacao> list = new ArrayList<Movimentacao>() {
            {
                add(new Movimentacao(1, "SAQUE", "Realiza o saque da conta"));
            }
            {
                add(new Movimentacao(2, "DEPOSITO", "Realiza o deposito na conta"));
            }
            {
                add(new Movimentacao(3, "TRANSFERENCIA", "Realiza uma tranferência a outra conta"));
            }
            {
                add(new Movimentacao(4, "RESGPOUPANCA", "Realiza o resgate da poupança"));
            }
            {
                add(new Movimentacao(5, "DEPPOUPANCA", "Realiza o deposito na poupança"));
            }
        };

        for (Movimentacao movimentacao: list) {
            _ms.adicionarMovimentacao(movimentacao);
        }
    }
}
