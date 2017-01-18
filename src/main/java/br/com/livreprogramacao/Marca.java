package br.com.livreprogramacao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
@Entity
public class Marca extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Basic
    private String nome;
    
    @Id
    private Long id;

    protected Marca() {}

    public Marca(final Long _id, final String nome) {
        super(_id);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Marca{" + "id=" + this.getId() + ", nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
