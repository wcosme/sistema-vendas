package br.com.vendas.api.entity;

public enum Status {
	
	CONCLUIDO("Concluído"),
    CANCELADO("Cancelado"),
    EM_ANDAMENTO("Em Andamento");

    private String tipo;

    Status(String tipo) {
        this.tipo = tipo;
    }

    public static Status fromString(String value) {

        for (Status statusDePara : Status.values()) {
            if(statusDePara.tipo.equalsIgnoreCase(value)) {
                return statusDePara;
            }
        }
        return null;
    }
}
